package com.ambev.projetopratico3.model;

public class Agua extends  Produto{

    private boolean comGas;

    private boolean semGas;

    public boolean isComGas() {
        return comGas;
    }

    public void setComGas(final boolean comGas) {
        this.comGas = comGas;
    }

    public boolean isSemGas() {
        return semGas;
    }

    public void setSemGas(final boolean semGas) {
        this.semGas = semGas;
    }
}
