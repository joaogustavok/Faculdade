package ListasExerciciosFaculdade.ListaExercico5.Curso;

import java.util.Arrays;
import java.util.List;

public class Curso {
    private int vagas;
    private String nome;
    private String professor;
    private int duracao;
    private Aluno alunos[];

    public Curso(int vagas) {
        this.vagas = vagas;
        alunos = new Aluno[vagas];
    }

    public void matricular(Aluno novo) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = novo;
                System.out.println("Aluno :"+novo.getNome()+" Matriculado");
                return;
            }
        }
    }
  public void listarAlunos() {
      System.out.println("Curso: " + this.getNome());
      for (int i = 0; i < alunos.length; i++) {
          if (alunos[i] != null)
              System.out.println("Aluno " + (i + 1) + " " + alunos[i].getNome());
      }
  }

  public void procurarAluno(Aluno aluno){
        List<Aluno> listadealunos = Arrays.asList(alunos);
        if (listadealunos.contains(aluno)){
            System.out.println("Aluno Encontrado na lista");
        }
      System.out.println("Aluno Não Encontrado na lista");

  }
    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
