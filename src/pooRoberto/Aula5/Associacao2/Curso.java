package pooRoberto.Aula5.Associacao2;

public class Curso {
    private String nome;
    private Aluno alunos[];

    public Curso() {
        alunos = new Aluno[10];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void adicionaAluno(Aluno a) {
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i]==null) {
                alunos[i]=a;
                return;
            }
        }
    }

    public void exibeAlunos() {
        System.out.println("Curso: "+this.getNome());
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i]!=null)
                System.out.println("Aluno "+(i+i)+" "+alunos[i].getNome());
        }
    }

}
