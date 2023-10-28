package com.ambev.projetopratico3.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_refrigerante")
public class Refrigerante extends Produto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean comAcucar;

    public Refrigerante(int id, String descricao, double preco, boolean comAcucar) {
        super(id, descricao, preco);
        this.comAcucar = comAcucar;
    }

    public Refrigerante() {

    }

    public boolean isComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
