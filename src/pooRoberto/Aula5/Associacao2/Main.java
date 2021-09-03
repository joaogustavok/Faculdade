package pooRoberto.Aula5.Associacao2;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("João"), b = new Aluno("Maria"),c = new Aluno("Cleber");
        Curso d = new Curso();
        d.setNome("Adm");
        d.adicionaAluno(a);
        d.adicionaAluno(b);
        d.adicionaAluno(c);
        d.exibeAlunos();
    }
}
