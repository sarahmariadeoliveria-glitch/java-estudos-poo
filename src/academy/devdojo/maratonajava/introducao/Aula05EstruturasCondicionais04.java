package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    //euro 0 euro 34,712 9.70%
    //euro 34,713 euro 68,507 37.35%
    //euro 68,508   49.50%
    public static void main(String[] args) {
       double salario = 70000;
       double primeiraFaixa = 9.70/100;
       double segundaFaixa = 37.35/100;
       double terceiraFaixa = 49.50/100;
       double Imposto;
       if (salario <= 34712 ) {
           Imposto = salario * primeiraFaixa;
       }else if (salario >= 34713 && salario <= 68507) {
           Imposto = salario * segundaFaixa;
       }else {
           Imposto = salario * terceiraFaixa;
       }
        System.out.println(Imposto);
    }
}
