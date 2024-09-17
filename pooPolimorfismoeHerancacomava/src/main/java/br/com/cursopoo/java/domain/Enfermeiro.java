package br.com.cursopoo.java.domain;

import br.com.cursopoo.java.domain.model.Pessoa;

public class Enfermeiro extends Pessoa {
    int horasTrabalhadas;
    private String setor;
    private String numeroCadastro;


    public Enfermeiro (String nome, int idade, String documento,int horasTrabalhadas, String setor, String numeroCadastro){
        super(nome,idade,documento);
        this.horasTrabalhadas=horasTrabalhadas;
        this.setor=setor;
        this.numeroCadastro=numeroCadastro;
    }

    public void imprimirInfoEnfermeiro(){
        super.imprimirInfo();
        System.out.println("Horas Trabalhadas: "+ horasTrabalhadas);
        System.out.println("Setor: "+ setor);
        System.out.println("Numero de Cadastro: "+  numeroCadastro);
    }
}
