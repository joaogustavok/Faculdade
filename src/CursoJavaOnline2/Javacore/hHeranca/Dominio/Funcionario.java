package CursoJavaOnline2.Javacore.hHeranca.Dominio;

public class Funcionario extends Pessoa {
    private double salario;
    public Funcionario(String nome) {
        super(nome);
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }
    public void relatorioPagamento(){
        System.out.println("Eu "+ this.nome+" recebi o sario de "+this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
