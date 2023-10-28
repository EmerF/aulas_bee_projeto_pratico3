package com.ambev.projetopratico3.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ambev.projetopratico3.model.Produto;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
    List<Produto> findByNome(String nome);
}
