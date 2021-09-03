package pooRoberto.Aula5.Associacao;

public class Mulher {
    private String nome;
    private Marido marido;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marido getMarido() {
        return marido;
    }

    public void setMarido(Marido marido) {
        this.marido = marido;
    }

    public String toString() {
        return "Olá me chamo "+this.getNome()+" sou casada com "+this.getMarido().getNome();
    }



}
