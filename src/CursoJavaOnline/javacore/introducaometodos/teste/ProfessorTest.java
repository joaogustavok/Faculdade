package CursoJavaOnline.javacore.introducaometodos.teste;


import CursoJavaOnline.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.rg = "23012302";
        prof.matricula = "384934";
        prof.nome = "Pedro";


        Professor prof2 = new Professor();
        prof2.rg = "2301243302";
        prof2.matricula = "34123934";
        prof2.nome = "Maria";

        prof.imprime();
        prof2.imprime();
    }
}
