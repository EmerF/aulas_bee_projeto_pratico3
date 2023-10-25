package com.ambev.projetopratico3.model;

package com.ambev.techempowers.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cervejas")
public class Cerveja extends Produto {

    private boolean temAlcool;

    public boolean isTemAlcool() {
        return temAlcool;
    }

    public void setTemAlcool(boolean temAlcool) {
        this.temAlcool = temAlcool;
    }
}
