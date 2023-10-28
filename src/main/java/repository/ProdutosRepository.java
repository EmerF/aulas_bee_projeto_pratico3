package repository;

import models.Produtos;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProdutosRepository  extends MongoRepository<Produtos, String> {
    List<Produtos> findByNome (String nome);
}