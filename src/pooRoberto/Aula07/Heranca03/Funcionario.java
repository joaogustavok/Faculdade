package pooRoberto.Aula07.Heranca03;

import java.util.Date;

public class Funcionario extends Pessoa{
    public Funcionario(String nome, String cpf, Date dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    private double salario;
    private Date dataAdmissao;
    private String cargo;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
