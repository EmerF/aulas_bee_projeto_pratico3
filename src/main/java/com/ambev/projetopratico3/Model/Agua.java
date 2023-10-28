package com.ambev.projetopratico3.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_agua")
public class Agua extends Produto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Agua() {

    }

    private boolean comGas;

    public Agua(int id, String descricao, double preco, boolean comGas) {
        super(id, descricao, preco);
        this.comGas = comGas;
    }

    public boolean isComGas() {
        return comGas;
    }

    public void setComGas(boolean comGas) {
        this.comGas = comGas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
