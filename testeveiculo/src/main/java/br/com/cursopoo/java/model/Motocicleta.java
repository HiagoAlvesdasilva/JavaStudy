package br.com.cursopoo.java.model;

public class Motocicleta extends Veiculo{
    private int qantidadeDeRodas;
    private int cilindradas;

    public Motocicleta(String nome, String marca, String modelo, int ano, String cor, String placa, String tipoCombustivel,int qantidadeDeRodas, int cilindradas) {
        super(nome, marca, modelo, ano, cor, placa, tipoCombustivel);
        this.qantidadeDeRodas=qantidadeDeRodas;
        this.cilindradas=cilindradas;
    }

    public void imprimirInfoMotocicleta(){
        super.imprimirInfoVeiculo();
        System.out.println("Quantidades de Rodas: "+ qantidadeDeRodas);
        System.out.println("Cilindradas: "+ cilindradas);
    }
}
