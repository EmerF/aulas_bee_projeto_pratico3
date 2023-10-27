package com.ambev.projetopratico3.model;

import jakarta.persistence.Entity;

@Entity
public class Cerveja extends Produto {
    private boolean comAlcool;

    public Cerveja() {
        // Construtor vazio
    }

    public Cerveja(String descricao, double preco, boolean comAlcool) {
        super(descricao, preco);
        this.comAlcool = comAlcool;
    }

    public boolean isComAlcool() {
        return comAlcool;
    }

    public void setComAlcool(boolean comAlcool) {
        this.comAlcool = comAlcool;
    }
}