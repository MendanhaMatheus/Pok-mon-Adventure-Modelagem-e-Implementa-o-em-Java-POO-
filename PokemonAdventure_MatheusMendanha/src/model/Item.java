package model;

public abstract class Item {
    private String nome;
    private String efeito;

    public Item(String nome, String efeito) {
        this.nome = nome;
        this.efeito = efeito;
    }

    public abstract void aplicar(Pokemon p);

    public String getNome() {
        return nome;
    }

    public String getEfeito() {
        return efeito;
    }
}