package pooRoberto.Aula07.Heranca03;

import java.util.Date;

public class Aluno extends Pessoa{
    public Aluno(String nome, String cpf, Date dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public double tirarCopias(int quantidade){
        return 0.07*quantidade;
    }
}
