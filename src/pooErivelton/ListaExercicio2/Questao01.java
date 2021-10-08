package pooErivelton.ListaExercicio2;

import java.util.Scanner;

class Funcionarios {
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;

    public Funcionarios() {
    }

    public Funcionarios(String nome, String cpf, String endereco, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }

    public String calculaDesconto(double salario) {
        if (salario <= 1900) {
            return "Salario Total:" + this.salario + "\n" + "Salario Com Descontos: " + (salario - salario * 8 / 100);
        } else if (salario >= 1901 && salario <= 2700) {
            return "Salario Total:" + this.salario + "\n" + "Salario Com Descontos: " + (salario - salario * 17.5 / 100);
        } else if (salario >= 2701 && salario <= 4900) {
            return "Salario Total:" + this.salario + "\n" + "Salario Com Descontos: " + (salario - salario * 26 / 100);
        } else if (salario >= 4901 && salario <= 6200) {
            return "Salario Total:" + this.salario + "\n" + "Salario Com Descontos: " + (salario - salario * 34 / 100);
        } else if (salario >= 6201) {
            return "Salario Total:" + this.salario + "\n" + "Salario Com Descontos: " + (salario - salario * 39.5 / 100);
        }
        return "Não Foi possivel calcular";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

public class Questao01 {
    public static void main(String[] args) {
        Funcionarios funcionarios[] = new Funcionarios[10];
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Informe o salario do " + (1 + i)+" funcionario");
            funcionarios[i] = new Funcionarios();
            funcionarios[i].setSalario(ler.nextDouble());
        }
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Funcionario "+(i+1));
            System.out.println(funcionarios[i].calculaDesconto(funcionarios[i].getSalario()));
        }
    }
}
