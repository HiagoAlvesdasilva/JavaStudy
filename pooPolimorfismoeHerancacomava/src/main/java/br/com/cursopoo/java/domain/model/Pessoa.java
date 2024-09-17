package br.com.cursopoo.java.domain.model;

public class Pessoa {
    private String nome;
    private int idade;
    private String documento;


    public Pessoa(String nome, int idade, String documento){
        this.nome=nome;
        this.idade=idade;
        this.documento=documento;
    }

    public void imprimirInfo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Documento: "+ documento);
    }
}
