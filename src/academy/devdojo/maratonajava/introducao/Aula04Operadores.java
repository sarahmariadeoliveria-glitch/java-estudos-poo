package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - / *
        int numero10 = 10;
        int numero20 = 20;
        double resultado = (double) numero10 / numero20;
        System.out.println(resultado);

        //%
        int resto = 20 % 2;
        System.out.println(resto);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezDiferenteDeVinte "+isDezDiferenteDeVinte);

        // && (AND) || (or) ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta);

        double ValorTotalDaContaCorrente = 2000;
        double ValorTotalContaPoupanca = 10000;
        float ValorPlaystation = 5000F;
        boolean isPlaystationCompravel = ValorTotalDaContaCorrente > ValorPlaystation || ValorTotalContaPoupanca > ValorPlaystation;
        System.out.println("isPlaystationCompravel "+isPlaystationCompravel);

        //= += -= *= /= %=
        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 4; //900
        bonus %= 10; //0
        System.out.println(bonus);

        //++ --
        int contador = 0;
        contador += 1; //contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);


    }
}
