package ListasExerciciosFaculdade.ListaExercico5.Biblioteca;

public class Biblioteca {
    private String nome;
    private String rua;
    private int numeroRua;

    public Biblioteca(String nome, String rua, int numeroRua) {
        this.nome = nome;
        this.rua = rua;
        this.numeroRua = numeroRua;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroRua() {
        return numeroRua;
    }

    public void setNumeroRua(int numeroRua) {
        this.numeroRua = numeroRua;
    }
}
