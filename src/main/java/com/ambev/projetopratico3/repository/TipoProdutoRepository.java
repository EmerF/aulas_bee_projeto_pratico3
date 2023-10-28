package com.ambev.projetopratico3.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ambev.projetopratico3.model.TipoProduto;

public interface TipoProdutoRepository extends MongoRepository<TipoProduto, String> {
    TipoProduto findByDescricao(String descricao);
}
