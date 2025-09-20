package model;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String nome;
    private String tipo;
    private int nivel;
    private int vida;
    private List<Habilidade> habilidades;

    public Pokemon(String nome, String tipo, int nivel, int vida) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.vida = vida;
        this.habilidades = new ArrayList<>();
    }

    public void atacar(Pokemon alvo, Habilidade habilidade) {
        if (this.habilidades.contains(habilidade)) {
            habilidade.usar();
            System.out.println(this.nome + " ataca " + alvo.getNome() + " com " + habilidade.getNome() + "!");
            alvo.receberDano((int) habilidade.getPoder());
        } else {
            System.out.println(this.nome + " não conhece a habilidade " + habilidade.getNome() + ".");
        }
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) {
            this.vida = 0;
        }
        System.out.println(this.nome + " recebeu " + dano + " de dano. Vida restante: " + this.vida);
    }

    public void evoluir(boolean porItem) {
        if (porItem || this.nivel >= 30) {
            System.out.println("O que? " + this.nome + " está evoluindo!");
            this.nome = "Super " + this.nome;
            this.nivel++;
            this.vida += 50;
            System.out.println("Parabéns! Seu Pokémon evoluiu para " + this.nome + "!");
        } else {
            System.out.println(this.nome + " ainda não está pronto para evoluir.");
        }
    }

    public void adicionarHabilidade(Habilidade habilidade) {
        this.habilidades.add(habilidade);
        System.out.println(this.nome + " aprendeu a habilidade " + habilidade.getNome() + "!");
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public int getNivel() {
        return nivel;
    }
}