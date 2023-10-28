package com.ambev.projetopratico3.Service;

import com.ambev.projetopratico3.Model.Produto;
import com.ambev.projetopratico3.Repository.ProdutoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Optional<Produto> findByDescricaoContainingIgnoreCase(String descricao) {
        return produtoRepository.findByDescricaoContainingIgnoreCase(descricao);
    }

}
