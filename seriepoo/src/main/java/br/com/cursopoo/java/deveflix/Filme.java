package br.com.cursopoo.java.deveflix;

public class Filme extends Video {
    private String dublagem;
    public String legenda;

    public Filme(String nome) {
        super(nome);
        this.dublagem = "Portugues";
        this.legenda = "Sem Legenda";
    }

    @Override
    public void player() {
        System.out.println("Player Filme: " + getNome());
    }

    public void player(String dublagem,String legenda) {
        this.dublagem = dublagem;
        this.legenda =legenda;
        System.out.println("Player Filme: " + toString());
    }

    @Override
    public String toString() {
        String informacoes = String.format("Filme %s (Dublagem: %s, Legenda: %s)", getNome(), dublagem, legenda);
        return informacoes;
    }
}
