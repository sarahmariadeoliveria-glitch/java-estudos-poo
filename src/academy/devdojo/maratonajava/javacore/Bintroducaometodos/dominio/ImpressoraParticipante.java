package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraParticipante {
    public void Imprime (ExercicioListaParticipantes participante){
        System.out.println("-------------------");

        System.out.println(participante.nome);
        System.out.println(participante.idade);
        System.out.println(participante.sexo);
        System.out.println(participante.turno);
        System.out.println(participante.ano);
    }
}
