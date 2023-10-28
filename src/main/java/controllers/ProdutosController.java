package controllers;

import message.MessageProducer;
import models.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.ProdutosRepository;
import services.ProdutosService;

import java.util.List;
/*curl -X POST -H "Content-Type: application/json" -d '{
         "nome": "Produto de Exemplo",
         "descricao": "desc de exemplo",
         "preco": 29.99
         }' http://localhost:8080/api/produtos*/

@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {

    private final ProdutosRepository produtosRepository;

    private final MessageProducer messageProducer;

    @Autowired
    private ProdutosService produtosService;

    @Autowired
    public ProdutosController(ProdutosRepository produtosRepository, MessageProducer messageProducer, ProdutosService produtosService) {
        this.produtosRepository = produtosRepository;
        this.messageProducer = messageProducer;
        this.produtosService = produtosService;
    }

    @PostMapping
    public Produtos cadastrarProduto(@RequestBody Produtos produto) {
        messageProducer.sendMessage(String.format("Produto %s cadastrado com sucesso!",produto.toString()));
        return produtosRepository.save(produto);
    }

    @GetMapping("/consultar/{nome}")
    public ResponseEntity<List<Produtos>> consultarProdutos(@PathVariable String nome) {
        List<Produtos> produto = produtosService.consultarPorNome(nome);
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
