package com.ambev.projetopratico3.repository;

import com.ambev.projetopratico3.model.Produto;
import com.ambev.projetopratico3.model.TipoProduto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TipoProdutoRepository extends MongoRepository <TipoProduto, String> {
    TipoProduto findByDescricao (String descricao);
}
