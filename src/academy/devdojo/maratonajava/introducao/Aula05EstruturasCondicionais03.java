package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String Doar = "Sim consigo ajudar ";
        String NaoDoar = "Infelizmente nao consigo ajudar ";
        //condicao ? true : false
        String resultado = salario > 5000 ? Doar : NaoDoar;
        System.out.println(resultado);

    }

}
