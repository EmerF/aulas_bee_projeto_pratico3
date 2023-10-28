package com.ambev.projetopratico3.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "aguas")
public class Agua extends Produto{
    
     private boolean temGas;
     private boolean semGas;

    public boolean isTemGas() {
        return temGas;
    }

    public void setTemGas(boolean temGas) {
        this.temGas = temGas;
    }

    public boolean isSemGas() {
        return semGas;
    }

    public void setSemGas(boolean semGas) {
        this.semGas = semGas;
    }


}
