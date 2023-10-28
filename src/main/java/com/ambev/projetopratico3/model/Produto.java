package com.ambev.projetopratico3.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public class Produto {
   
    @Id
    private String id;
    private String descricao;
    private Double preco;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
