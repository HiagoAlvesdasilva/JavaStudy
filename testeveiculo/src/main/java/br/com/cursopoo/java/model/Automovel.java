package br.com.cursopoo.java.model;

public class Automovel extends Veiculo {
    private int qantidadeDePortas;
    private String tipoDeDirecao;

    public Automovel(String nome,String marca,String modelo,int ano,String cor,String placa,String tipoCombustivel, int qantidadeDePortas, String tipoDeDirecao){
        super(nome,marca,modelo,ano,cor,placa,tipoCombustivel);
        this.qantidadeDePortas=qantidadeDePortas;
        this.tipoDeDirecao=tipoDeDirecao;
    }

    public void imprimirAutomovel(){
        super.imprimirInfoVeiculo();
        System.out.println("Quantidade de Portas: "+qantidadeDePortas);
        System.out.println("Tipo de Direçao: "+ tipoDeDirecao);
    }

}
