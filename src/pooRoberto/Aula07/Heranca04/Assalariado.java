package pooRoberto.Aula07.Heranca04;

public class Assalariado extends  Empregado{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double vencimento( ){
        return this.salario;

    }}
