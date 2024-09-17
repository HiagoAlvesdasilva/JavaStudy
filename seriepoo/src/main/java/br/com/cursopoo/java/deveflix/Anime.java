package br.com.cursopoo.java.deveflix;

public class Anime extends Video{
    private int episodio;

    public Anime(String nome) {
        super(nome);
        this.episodio=100;
    }

    @Override
    public void player() {
        System.out.println("Player Anime: "+ getNome()  + "Episodio: "+ episodio);
    }
}
