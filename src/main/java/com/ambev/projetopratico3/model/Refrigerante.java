package com.ambev.projetopratico3.model;

public class Refrigerante extends Produto{

    private boolean comAcucar;

    public Refrigerante(String id, String descricao, double preco, boolean comAcucar){
        super(id, descricao, preco);
        this.comAcucar = comAcucar;
    }

    public boolean isComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }
}
