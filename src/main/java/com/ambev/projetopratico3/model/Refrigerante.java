package com.ambev.projetopratico3.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "refrigerantes")
public class Refrigerante extends Produto{
    private boolean comAcucar;

    public Refrigerante(String nome, String descricao, double preco, boolean comAcucar) {
        super(nome,descricao, preco);
        this.comAcucar = comAcucar;
    }

    public boolean ComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }

    @Override
    public String toString() {
        return "Refrigerante{" +
                "comAcucar=" + comAcucar +
                '}';
    }
}
