package com.ambev.projetopratico3.model;

import jakarta.persistence.Id;

public class Produto {

    @Id
    private String id;
    private String descricao;
    private double preco;


    public String toString() {
        return "Produto{" +
                "id ='" + getId() + '\'' +
                ", descrição = " + descricao + '\'' +
                ", preço = R$" + preco +
                '}';
    }

    public Produto(){

    }

    public Produto(String id, String descricao, double preco){
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
