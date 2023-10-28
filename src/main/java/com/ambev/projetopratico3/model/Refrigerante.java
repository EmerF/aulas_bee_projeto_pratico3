package com.ambev.projetopratico3.model;

public class Refrigerante extends Produto{

    private boolean comAcucar;

    private boolean semAcucar;

    public boolean isComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(final boolean comAcucar) {
        this.comAcucar = comAcucar;
    }

    public boolean isSemAcucar() {
        return semAcucar;
    }

    public void setSemAcucar(final boolean semAcucar) {
        this.semAcucar = semAcucar;
    }
}
