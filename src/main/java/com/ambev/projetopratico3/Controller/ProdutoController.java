package com.ambev.projetopratico3.Controller;

import com.ambev.projetopratico3.Model.Produto;
import com.ambev.projetopratico3.Repository.ProdutoRepository;
import com.ambev.projetopratico3.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping("/produtos")
    public ResponseEntity <Produto> salvarProduto(Produto produto) {

        Produto produtoSalvo = produtoService.salvarProduto(produto);
        return ResponseEntity.ok(produtoSalvo);
    }


    //TODO criar metodo GET para buscar todos os produtos pela descricao
}
