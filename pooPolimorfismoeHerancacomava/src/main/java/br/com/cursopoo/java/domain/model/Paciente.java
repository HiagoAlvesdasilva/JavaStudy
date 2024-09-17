package br.com.cursopoo.java.domain.model;

public class Paciente extends Pessoa {
    private String matricula;
    private String planoDeSaude;

    public Paciente(String nome, int idade, String documento,String matricula,String planoDeSaude){
        super(nome,idade,documento);
        this.matricula=matricula;
        this.planoDeSaude=planoDeSaude;
    }

    public void imprimirInfoPaciente(){
        super.imprimirInfo();
        System.out.println("Matricula: "+ matricula);
        System.out.println("Plano De Saude: "+ planoDeSaude);
    }
}
