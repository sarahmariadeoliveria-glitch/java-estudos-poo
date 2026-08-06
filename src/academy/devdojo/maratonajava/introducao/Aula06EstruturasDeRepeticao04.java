package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double ValorTotal = 30000;
        for (int parcela = 1; parcela <= ValorTotal; parcela++) {
            double ValorParcela = ValorTotal/parcela;
            if (ValorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+ parcela+ " R$ "+ValorParcela);
        }
    }

}
