package model;

public class Habilidade {
    private String nome;
    private double poder;
    private String tipo;

    public Habilidade(String nome, double poder, String tipo) {
        this.nome = nome;
        this.poder = poder;
        this.tipo = tipo;
    }

    public void usar() {
        System.out.println("Usando habilidade: " + this.nome + "!");
    }

    public String getNome() {
        return nome;
    }

    public double getPoder() {
        return poder;
    }

    public String getTipo() {
        return tipo;
    }
}