package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante Impressora = new ImpressoraEstudante();

        estudante1.nome = "Katrina";
        estudante1.idade = 23;
        estudante1.sexo = 'F';

        estudante2.nome = "Carlos";
        estudante2.idade = 16;
        estudante2.sexo = 'M';

        Impressora.Imprime(estudante1);

        Impressora.Imprime(estudante2);
    }
}
