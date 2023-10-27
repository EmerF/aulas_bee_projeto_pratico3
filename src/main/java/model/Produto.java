package model;

public class Produto {

    private Long id;
    private String descrição;
    private String preço;

    public Produto(Long id, String descrição, String preço) {
        this.id = id;
        this.descrição = descrição;
        this.preço = preço;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getPreço() {
        return preço;
    }

    public void setPreço(String preço) {
        this.preço = preço;
    }

    protected boolean getDescricao() {
        return false;
    }
}
