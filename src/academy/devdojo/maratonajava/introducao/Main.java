package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreinoService01 service = new TreinoService01();

        while (true) {
            System.out.println("\n1 - Adicionar treino");
            System.out.println("2 - Listar treinos");
            System.out.println("3 - Concluir treino");
            System.out.println("4 - Remover treino");
            System.out.println("0 - Sair");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    service.adicionarTreino(nome);
                    break;

                case 2:
                    service.listarTreinos();
                    break;

                case 3:
                    int i = sc.nextInt ();
                    service.concluirTreino(i);
                    break;

                case 4:
                    int r = sc.nextInt();
                    service.removerTreino(r);
                    break;

                case 0:
                    return;
            }
        }
    }
}