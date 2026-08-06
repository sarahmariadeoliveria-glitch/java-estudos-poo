package academy.devdojo.maratonajava.introducao;

import java.net.SocketOption;

public class Aula02Tiposprimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 155.23D;
        double salarioDouble = 2000.20D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 10;

        String nome = "sarah";
        System.out.println("A idade e "+idade+ " anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(numeroGrande);
        System.out.println(salarioFloat);
        System.out.println("oi meu nome e "+nome);
    }
}
