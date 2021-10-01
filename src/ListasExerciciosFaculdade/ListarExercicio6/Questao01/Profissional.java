package ListasExerciciosFaculdade.ListarExercicio6.Questao01;

public class Profissional {
    private String nome;
    private String telefone;

    @Override
    public String toString() {
        return "Profissional{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
