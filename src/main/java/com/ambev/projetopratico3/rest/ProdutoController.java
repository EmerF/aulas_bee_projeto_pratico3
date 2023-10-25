package com.ambev.projetopratico3.rest;

import com.ambev.projetopratico3.message.MessageProducer;
import com.ambev.projetopratico3.model.Produto;
import com.ambev.projetopratico3.repository.ProdutoRepository;
import com.ambev.projetopratico3.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;
    private final MessageProducer messageProducer;

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoRepository produtoRepository, MessageProducer messageProducer) {
        this.produtoRepository = produtoRepository;
        this.messageProducer = messageProducer;
    }

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        messageProducer.sendMessage(String.format("Produto %s cadastrado com sucesso !",produto.toString()));
        return produtoRepository.save(produto);
    }
}
