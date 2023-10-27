package model;

public class Agua extends Produto {

    private boolean comGas;

    public Agua(Long id, String descrição, String preço, boolean comGas) {
        super(id, descrição, preço);
        this.comGas = comGas;
    }

    public boolean isComGas() {
        return comGas;
    }

    public void setComGas(boolean comGas) {
        this.comGas = comGas;
    }
}
