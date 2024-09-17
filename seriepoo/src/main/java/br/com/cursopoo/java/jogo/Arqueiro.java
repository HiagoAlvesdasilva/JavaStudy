package br.com.cursopoo.java.jogo;

public class Arqueiro extends Personagem {

    private String arma;


    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        setNivel(10);
        this.arma="Lança Longa";
    }

    @Override
    public String toString() {
        String informacoes = String.format("%s(Nivel: %d) - Classe: %s - Arma: %s",getNome() ,getNivel(), getClasse(), arma);
        return informacoes;
    }

    @Override
    public void atacar() {
        System.out.println("Arqueiro Atacando!!!");
    }
}
