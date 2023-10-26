package com.ambev.projetopratico3.model;

public class Agua extends Produto{

    private boolean comGas;

    public Agua (String id, String descricao, double preco, boolean comGas){
        super(id, descricao, preco);
        this.comGas = comGas;
    }

    public boolean isComGas() {
        return comGas;
    }

    public void setComGas(boolean comGas) {
        this.comGas = comGas;
    }
}
