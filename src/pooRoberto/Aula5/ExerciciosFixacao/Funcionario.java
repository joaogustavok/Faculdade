package pooRoberto.Aula5.ExerciciosFixacao;

public class Funcionario {
    private int matricula;
    private String nome;
    private Departamento departamento;

    public Funcionario(int matricula, String nome, Departamento departamento) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
    }

    public Funcionario() {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;

    }

    public void imprimir2() {
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}