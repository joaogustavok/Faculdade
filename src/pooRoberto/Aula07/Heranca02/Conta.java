package pooRoberto.Aula07.Heranca02;

public class Conta {
    private double saldo;
    private String nome;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void saque(double valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        }
    }
}
