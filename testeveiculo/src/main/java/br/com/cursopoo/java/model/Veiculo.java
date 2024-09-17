package br.com.cursopoo.java.model;

public class Veiculo {

    private String nome;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private String tipoCombustivel;

    public Veiculo( String nome,String marca,String modelo,int ano,String cor,String placa,String tipoCombustivel){
        this.nome=nome;
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.cor=cor;
        this.placa=placa;
        this.tipoCombustivel=tipoCombustivel;
    }

    public void imprimirInfoVeiculo(){
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Placa: " + placa);
        System.out.println("Tipo De Combustivel: " + tipoCombustivel);
    }
}
