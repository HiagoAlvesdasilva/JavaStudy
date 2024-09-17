package br.com.cursopoo.java;


import br.com.cursopoo.java.domain.Enfermeiro;
import br.com.cursopoo.java.domain.model.Paciente;

public class Main {
    public static void main(String[] args) {

        System.out.println("INFORMAÇOES DO PACIENTE");
        Paciente paciente = new Paciente("Silva",28,"123.123.123.12","123.a","APVIDA");
        paciente.imprimirInfo();

        System.out.println("INFORMAÇOES DO INFERMEIRO");
        Enfermeiro enfermeiro01 = new Enfermeiro("Arthur",18,"321.654.789",42,"Triagem","CAD321654789");
        enfermeiro01.imprimirInfoEnfermeiro();

    }
}