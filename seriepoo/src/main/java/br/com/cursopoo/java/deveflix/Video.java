package br.com.cursopoo.java.deveflix;

public class Video {
    private String nome;

    public Video(String nome) {
        this.nome = nome;
    }

    public void player(){
        System.out.println("Play: Player Ativo");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
