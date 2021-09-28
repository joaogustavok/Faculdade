package ListasExerciciosFaculdade.ListaExercico5.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso(3);
        curso.setNome("Adm");
        curso.setDuracao(5);
        curso.setProfessor("Roberto");
        Aluno aluno01 = new Aluno("João","41999399918",294949293);
        Aluno aluno02 = new Aluno("Pedro","848482949",94394939);
        Aluno aluno03 = new Aluno("Cassio", "8382934958",838385959);

        curso.matricular(aluno01);
        curso.matricular(aluno02);
        System.out.println("---------");
        curso.listarAlunos();
        System.out.println("---------");
        curso.procurarAluno(aluno03);


    }
}
