package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 25;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebidas ");
        }else{
            System.out.println("Nao autorizado a comprar bebidas ");
        }
        //instrucoes independentes
        if (!isAutorizadoComprarBebida){
            System.out.println("Nao autorizado a comprar bebidas ");
        }
        boolean c = false;
        if (c == true);{
            System.out.println("Algo que nunca deve ser feito ");

        }
    }
}
