package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    //imprima os primeiros 25 numero seguindo um tem terminado valor dado, ex 50
    public static void main(String[] args) {
        int valormaximo = 50;
        for (int i = 0; i < 50; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}