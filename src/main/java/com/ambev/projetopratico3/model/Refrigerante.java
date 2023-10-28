package com.ambev.projetopratico3.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "refrigerantes")
public class Refrigerante extends Produto{
    
    private boolean temAcucar;
    private boolean semAcucar;
    
    public boolean isTemAcucar() {
        return temAcucar;
    }
    public void setTemAcucar(boolean temAcucar) {
        this.temAcucar = temAcucar;
    }
    public boolean isSemAcucar() {
        return semAcucar;
    }
    public void setSemAcucar(boolean semAcucar) {
        this.semAcucar = semAcucar;
    }

}
