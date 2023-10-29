package com.ambev.projetopratico3.Controller;

import com.ambev.projetopratico3.Model.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProdutoControllerInterface {

    @PostMapping("/cadastrar")
    ResponseEntity<Produto> salvarProduto(@RequestBody Produto produto);
}
