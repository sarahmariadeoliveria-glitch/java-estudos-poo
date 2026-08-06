package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 5);
    }

    public void MultipliqueDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double DivideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;

        }
        return num1 / num2;
    }

    public double DivideDoisNumeros2(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;

        }
        return 0;
    }

    public void ImprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Nao existe resultado para esta divisao");
        }else {
            System.out.println(num1 / num2);
        }

    }

    public void alteraDoisNumeros (int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 "+ num1);
        System.out.println("num1 "+ num2);
    }
}
