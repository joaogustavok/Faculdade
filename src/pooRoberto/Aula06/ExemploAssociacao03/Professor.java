package pooRoberto.Aula06.ExemploAssociacao03;

public class Professor {
    private String nome;
    private String departamento;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
