package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

import java.sql.SQLOutput;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Ellie";
        professor.idade = 21;
        professor.sexo = 'F';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
