package br.com.cursopoo.java.jogo;

public class JogoMain {
    public static void main(String[] args) {
        Personagem player01 = new Personagem("João");
        System.out.println(player01);
        player01.atacar();

        Arqueiro player02 = new Arqueiro("Palladin");
        System.out.println(player02);
        player02.atacar();
    }
}
