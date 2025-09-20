package model;

import java.util.ArrayList;
import java.util.List;

public class Treinador {
    private String nome;
    private int idade;
    private List<Pokemon> pokemons;

    public Treinador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.pokemons = new ArrayList<>();
    }

    public void capturarPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
        System.out.println(this.nome + " capturou " + pokemon.getNome() + "!");
    }

    public void listarPokemons() {
        System.out.println("Pokémons de " + this.nome + ":");
        for (Pokemon p : this.pokemons) {
            System.out.println("- " + p.getNome() + " (Nível: " + p.getNivel() + ", Vida: " + p.getVida() + ")");
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}