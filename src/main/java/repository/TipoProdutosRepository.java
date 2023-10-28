package repository;

import models.TipoProdutos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TipoProdutosRepository extends MongoRepository<TipoProdutos, String> {
    TipoProdutos findByDescricao(String descricao);
}