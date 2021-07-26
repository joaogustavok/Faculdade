package CursoJavaOnline2.Javacore.gAssociacao.Test;

import CursoJavaOnline2.Javacore.gAssociacao.Dominio.Aluno;
import CursoJavaOnline2.Javacore.gAssociacao.Dominio.Local;
import CursoJavaOnline2.Javacore.gAssociacao.Dominio.Professor;
import CursoJavaOnline2.Javacore.gAssociacao.Dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Av Fernandes de andrade");
        Aluno aluno = new Aluno("Amanda", 23);
        Professor professor = new Professor("Analu", "Fodona");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("TCC", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
