package com.ambev.projetopratico3.model;


import jakarta.persistence.Entity;

@Entity
public class Refrigerante extends Produto {
    private boolean comAcucar;

    public Refrigerante() {
        // Construtor vazio
    }

    public Refrigerante(String descricao, double preco, boolean comAcucar) {
        super(descricao, preco);
        this.comAcucar = comAcucar;
    }

    public boolean isComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }
}
