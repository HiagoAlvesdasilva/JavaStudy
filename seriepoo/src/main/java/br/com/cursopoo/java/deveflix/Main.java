package br.com.cursopoo.java.deveflix;

public class Main {
    public static void main(String[] args) {
        Video plataforma01 = new Video("Video Qualquer");
        plataforma01.player();

        Filme player02 = new Filme("Liga Da Justiça");
        player02.player();
        player02.player("Ingles","Portugues");

        Anime player03 = new Anime("Naruto");
        player03.player();

    }
}
