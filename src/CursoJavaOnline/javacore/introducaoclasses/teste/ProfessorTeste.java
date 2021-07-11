package CursoJavaOnline.javacore.introducaoclasses.teste;

import javacore.introducaoclasses.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome ="Joao";
        prof.matricula ="381023";
        prof.rg = "10233002";
        Professor prof2 = new Professor();
        prof2.matricula = "392192";
        prof2.nome = "pedro";
        prof2.rg = "cuzao";

        System.out.println(prof.matricula);
        System.out.println(prof.nome);
        System.out.println(prof.rg);
        System.out.println("-=-=-=-=-=-=-=-");
        System.out.println(prof2.matricula);
        System.out.println(prof2.nome);
        System.out.println(prof2.rg);
    }
}
