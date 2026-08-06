package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class Carro01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "fusca";
        carro.modelo = "Porch";
        carro.ano = 2010;

        System.out.println(carro.nome + " " + carro.modelo + " " + carro.ano);

        System.out.println("---------------------");

        carro2.nome = "algum carro ai";
        carro2.modelo = "Ferrari";
        carro2.ano = 2020;

        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);

    }
}
