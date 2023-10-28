package services;

import models.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProdutosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutosService {
    private final ProdutosRepository produtosRepository;

    @Autowired
    public ProdutosService(ProdutosRepository produtosRepository) {
        this.produtosRepository = produtosRepository;
    }

    public Produtos salvarProduto(Produtos produto) {
        return produtosRepository.save(produto);
    }



    public Optional<Produtos> findById(String id) {
        return produtosRepository.findById(id);

    }

    public List<Produtos> consultarPorNome(String nome) {
        return produtosRepository.findByNome(nome);
    }

    // Outros métodos de serviço, como buscar, atualizar e excluir produtos
}
