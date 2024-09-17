package br.com.cursopoo.java.jogo;

public class Personagem {
    private String nome;
    private String classe;
    private int nivel;

    public Personagem(String nome) {
        this.nome = nome;
        this.classe = "Nenhuma";
        this.nivel = 0;
    }

    @Override
    public String toString() {
        String informacoes = String.format("%s(Nivel: %d) - Classe: %s",nome ,nivel , classe);
                return informacoes;
    }

    public void atacar(){
        System.out.println("O Personagem Atacou!!! ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
