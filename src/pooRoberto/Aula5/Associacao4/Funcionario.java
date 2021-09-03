package pooRoberto.Aula5.Associacao4;

public class Funcionario {
    private String nome;
    private int idade;
    private Departamento departamento;

    public Funcionario() {

    }

    public Funcionario(String nome, int idade, Departamento departamento) {
        this.nome = nome;
        this.idade = idade;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", departamento=" + this.departamento.getDescricao() +
                '}';
    }
}
