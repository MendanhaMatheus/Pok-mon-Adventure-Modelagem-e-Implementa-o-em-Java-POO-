package model;

public class ItemEvolucao extends Item {

    public ItemEvolucao(String nome, String efeito) {
        super(nome, efeito);
    }

    @Override
    public void aplicar(Pokemon p) {
        System.out.println("Usando item '" + getNome() + "' em " + p.getNome() + ".");
        p.evoluir(true);
    }
}