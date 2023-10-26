package com.ambev.projetopratico3.rest;

import com.ambev.projetopratico3.message.MessageProducer;
import com.ambev.projetopratico3.model.Produto;
import com.ambev.projetopratico3.repository.ProdutoRepository;
import com.ambev.projetopratico3.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.SimpleTimeZoneAwareLocaleContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // Indica que esta classe é um controlador REST.
@RequestMapping("/api/produtos")  // Define o mapeamento de URL base para todos os métodos neste controlador.
public class ProdutoController {
    private final ProdutoRepository produtoRepository;
    private final MessageProducer messageProducer;

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoRepository produtoRepository, MessageProducer messageProducer, ProdutoService produtoService) {
        // Injeção de dependência dos objetos necessários.
        this.produtoRepository = produtoRepository;
        this.messageProducer = messageProducer;
        this.produtoService = produtoService;
    }

    @PostMapping
    // Este método lida com solicitações POST para cadastrar um novo produto.
    public Produto cadastrarProduto(@RequestBody Produto produto){
        // Envio de uma mensagem para um serviço de mensagens e salvamento do produto no repositório.
        messageProducer.sendMessage(String.format("Produto %s cadastrado !", produto.toString()));
        return produtoRepository.save(produto);
    }

    @GetMapping("/consultar/{nome}")
    // Este método lida com solicitações GET para consultar produtos por nome.
    public ResponseEntity<List<Produto>> consultarProdutos(@PathVariable String nome){
        // Consulta produtos com base no nome e retorna uma resposta ResponseEntity.
        List<Produto> produtos = produtoService.consultarPorNome(nome);
        if (produtos != null) {
            return ResponseEntity.ok(produtos);
        }
        return ResponseEntity.notFound().build(); // Se não encontrou produtos, retorna NOT FOUND.
    }

    @GetMapping("/error")
    // Este método lida com solicitações GET para retornar um erro no produto.
    public ResponseEntity erroNoProduto() {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Retorna uma resposta NOT FOUND.
    }
}

