package model;

public class ItemCura extends Item {
    private int quantidadeCura;

    public ItemCura(String nome, String efeito, int quantidadeCura) {
        super(nome, efeito);
        this.quantidadeCura = quantidadeCura;
    }

    @Override
    public void aplicar(Pokemon p) {
        System.out.println("Usando item '" + getNome() + "' em " + p.getNome() + ".");
        p.setVida(p.getVida() + this.quantidadeCura);
        System.out.println(p.getNome() + " recuperou " + this.quantidadeCura + " de vida. Vida atual: " + p.getVida());
    }
}