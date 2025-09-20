package model;

public class Batalha {
    private Treinador treinador1;
    private Treinador treinador2;

    public Batalha(Treinador treinador1, Treinador treinador2) {
        this.treinador1 = treinador1;
        this.treinador2 = treinador2;
    }

    public void iniciar() {
        System.out.println("=========================================");
        System.out.println("A BATALHA VAI COMEÇAR!");
        System.out.println(treinador1.getNome() + " VS " + treinador2.getNome());
        System.out.println("=========================================");

        Pokemon p1 = treinador1.getPokemons().get(0);
        Pokemon p2 = treinador2.getPokemons().get(0);

        System.out.println(treinador1.getNome() + " escolhe " + p1.getNome() + "!");
        System.out.println(treinador2.getNome() + " escolhe " + p2.getNome() + "!");

        int turno = 1;
        while (p1.getVida() > 0 && p2.getVida() > 0) {
            registrarTurno(turno, p1, p2);
            turno++;
        }

        if (p1.getVida() <= 0) {
            System.out.println(p1.getNome() + " desmaiou! " + treinador2.getNome() + " é o vencedor!");
        } else {
            System.out.println(p2.getNome() + " desmaiou! " + treinador1.getNome() + " é o vencedor!");
        }
    }

    public void registrarTurno(int turno, Pokemon p1, Pokemon p2) {
        System.out.println("\n----- Turno " + turno + " -----");
        if (p1.getVida() > 0) {
            Habilidade hab1 = p1.getHabilidades().get(0);
            p1.atacar(p2, hab1);
        }

        if (p2.getVida() > 0) {
            Habilidade hab2 = p2.getHabilidades().get(0);
            p2.atacar(p1, hab2);
        }
    }
}