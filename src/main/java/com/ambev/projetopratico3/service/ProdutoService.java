package com.ambev.projetopratico3.service;

import com.ambev.projetopratico3.model.Produto;
import com.ambev.projetopratico3.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public Produto create(Produto produto) {
        return this.produtoRepository.save(produto);
    }

    public List<Produto> getAll() {
        return this.produtoRepository.findAll();
    }
}
