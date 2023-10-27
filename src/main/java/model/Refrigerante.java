package model;

public class Refrigerante extends Produto{

    private boolean comAcucar;

    public Refrigerante(Long id, String descrição, String preço, boolean comAcucar) {
        super(id, descrição, preço);
        this.comAcucar = comAcucar;
    }

    public boolean isComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }
}
