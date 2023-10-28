package com.ambev.projetopratico3.Repository;

import com.ambev.projetopratico3.Model.Produto;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, Long> {

    Optional<Produto> findByDescricaoContainingIgnoreCase(String descricao);

}
