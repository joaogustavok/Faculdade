package CursoJavaOnline2.Javacore.aIntroducaoClasses.Test;

import CursoJavaOnline2.Javacore.aIntroducaoClasses.Dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Carlos";
        professor.idade = 34;
        professor.sexo = 'M';

        System.out.println("Nome: "+professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
