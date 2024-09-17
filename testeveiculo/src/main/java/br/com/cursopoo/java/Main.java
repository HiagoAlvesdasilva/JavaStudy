package br.com.cursopoo.java;

import br.com.cursopoo.java.model.Automovel;
import br.com.cursopoo.java.model.Motocicleta;

public class Main {
    public static void main(String[] args) {

        System.out.println("Informaçoes do Automovel");
        Automovel carro01 = new Automovel("HB20","HYUNDAY","HATCH",2023,"BRANCO","ABC 1234","FLEX",4,"HIDRAULICA");
        carro01.imprimirAutomovel();
        System.out.println(" ");
        System.out.println("Informaçoes da Motocicleta");
        Motocicleta moto1 = new Motocicleta("HONDA TITAN","HONDA","TITAN",2024,"PRETA","KRL 123","FLEX",2,160);
        moto1.imprimirInfoMotocicleta();
    }
}