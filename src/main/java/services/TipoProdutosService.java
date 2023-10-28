package services;

import models.TipoProdutos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TipoProdutosRepository;

import java.util.Optional;

@Service
public class TipoProdutosService {
    private final TipoProdutosRepository tipoProdutosRepository;

    @Autowired
    public TipoProdutosService(TipoProdutosRepository tipoProdutosRepository) {
        this.tipoProdutosRepository = tipoProdutosRepository;
    }

    public TipoProdutos salvarProduto(TipoProdutos tipoProduto) {
        return tipoProdutosRepository.save(tipoProduto);
    }



    public Optional<TipoProdutos> findById(String id) {
        return tipoProdutosRepository.findById(id);

    }

    public TipoProdutos consultarPorNome(String nome) {
        return tipoProdutosRepository.findByDescricao(nome);
    }
}
