package com.ambev.projetopratico3.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambev.projetopratico3.model.TipoProduto;
import com.ambev.projetopratico3.repository.TipoProdutoRepository;

@Service
public class TipoProdutoService {
     private final TipoProdutoRepository tipoProdutoRepository;

    @Autowired
    public TipoProdutoService(TipoProdutoRepository tipotipoProdutoRepository) {
        this.tipoProdutoRepository = tipotipoProdutoRepository;
    }

    public TipoProduto salvarProduto(TipoProduto tipoProduto) {
        return tipoProdutoRepository.save(tipoProduto);
    }



    public Optional<TipoProduto> findById(String id) {
        return tipoProdutoRepository.findById(id);

    }

    public TipoProduto consultarPorNome(String nome) {
        return tipoProdutoRepository.findByDescricao(nome);
    }
}
