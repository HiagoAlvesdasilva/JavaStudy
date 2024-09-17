package br.com.cursopoo.java.model;

public class Serie {

    private String nome;
    private int temporadas;
    private int ano;

    public Serie(String nome, int temporadas, int ano) {
        this.nome = nome;
        this.temporadas = temporadas;
        this.ano = ano;
    }
    public String pegarinfo(){
        String informacoes = String.format("Nome: %s -d Temporadas(s)-", nome, ano, temporadas );
        return informacoes;
    }

    @Override
    public String toString(){
        String informacoes = String.format("Nome : %s (%d)  %d Temporadas(s).", nome, ano, temporadas );
        return informacoes;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
