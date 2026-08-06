package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ExercicioListaParticipantes;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraParticipante;

public class ParticipanteEx {
    public static void main(String[] args) {
        ExercicioListaParticipantes participante01= new ExercicioListaParticipantes();
        ExercicioListaParticipantes participante02= new ExercicioListaParticipantes();
        ExercicioListaParticipantes participante03= new ExercicioListaParticipantes();
        ImpressoraParticipante impressora= new ImpressoraParticipante();

        participante01.nome = "Gustavo";
        participante01.idade = 21;
        participante01.sexo = 'M';
        participante01.turno = "Matutino";
        participante01.ano = 3;

        participante02.nome = "Lara";
        participante02.idade = 22;
        participante02.sexo = 'F';
        participante02.turno = "Matutino";
        participante02.ano = 4;

        participante03.nome = "Kamila";
        participante03.idade = 19;
        participante03.sexo = 'F';
        participante03.turno = "Vespertino";
        participante03.ano = 9;

        impressora.Imprime(participante01);
        impressora.Imprime(participante02);
        impressora.Imprime(participante03);
    }
}
