package com.ambev.projetopratico3.controller;

import com.ambev.projetopratico3.message.MessageProducer;
import com.ambev.projetopratico3.model.Produto;
import com.ambev.projetopratico3.repository.ProdutoRepository;
import com.ambev.projetopratico3.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/produtos")
public class ProdutoController {

    private final ProdutoRepository produtosRepository;

    private final MessageProducer messageProducer;

    @Autowired
    private ProdutoService produtosService;

    @Autowired
    public ProdutoController(ProdutoRepository produtosRepository, MessageProducer messageProducer, ProdutoService produtosService) {
        this.produtosRepository = produtosRepository;
        this.messageProducer = messageProducer;
        this.produtosService = produtosService;
    }

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        messageProducer.send(String.format("Produto %s cadastrado com sucesso!",produto.toString()));
        return produtosRepository.save(produto);
    }

    @GetMapping("/consultar/{nome}")
    public ResponseEntity<List<Produto>> consultarProdutos(@PathVariable String nome) {
        List<Produto> produto = produtosService.buscarProdutoPorNome(nome);
        if (produto != null) {
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/error")
    public ResponseEntity errorProduto() {
        return new ResponseEntity<>( HttpStatus.NOT_FOUND);
    }
}
