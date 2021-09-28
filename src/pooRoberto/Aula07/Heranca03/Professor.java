package pooRoberto.Aula07.Heranca03;

import java.util.Date;

public class Professor extends Pessoa{
    public Professor(String nome, String cpf, Date dataNascimento) {
        super(nome, cpf, dataNascimento);
    }
    private double salario;
    private String disciplina;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
