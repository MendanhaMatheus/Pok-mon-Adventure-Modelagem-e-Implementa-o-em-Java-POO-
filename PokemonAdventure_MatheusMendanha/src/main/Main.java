package main;

import model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- CRIAÇÃO DOS TREINADORES E POKÉMONS ---");
        Treinador ash = new Treinador("Ash", 10);
        Treinador matheus = new Treinador("Matheus", 10);

        Habilidade choqueDoTrovao = new Habilidade("Choque do Trovão", 40, "Elétrico");
        Habilidade investida = new Habilidade("Investida", 35, "Normal");

        Pokemon pikachu = new Pokemon("Pikachu", "Elétrico", 25, 100);
        Pokemon eevee = new Pokemon("Eevee", "Normal", 28, 95);

        pikachu.adicionarHabilidade(choqueDoTrovao);
        eevee.adicionarHabilidade(investida);

        ash.capturarPokemon(pikachu);
        matheus.capturarPokemon(eevee);

        System.out.println();
        ash.listarPokemons();
        System.out.println();
        matheus.listarPokemons();
        System.out.println();

        Batalha batalha = new Batalha(ash, matheus);
        batalha.iniciar();

        System.out.println("\n\n--- PÓS-BATALHA E USO DE ITENS ---");

        ItemCura pocao = new ItemCura("Poção", "Cura 20 de vida", 20);
        ItemEvolucao pedraDoTrovao = new ItemEvolucao("Pedra do Trovão", "Evolui um Pokémon elétrico");

        pocao.aplicar(pikachu);

        System.out.println();

        pedraDoTrovao.aplicar(pikachu);

        System.out.println();

        eevee.evoluir(false);
    }
}