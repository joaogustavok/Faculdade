package pooRoberto.Aula5.Associacao;

import pooRoberto.Aula5.Associacao.Mulher;

public class Marido {
    private String nome;
    private Mulher mulher;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Mulher getMulher() {
        return mulher;
    }

    public void setMulher(Mulher mulher) {
        this.mulher = mulher;
    }

    public String toString() {
        return "Olá me chamo "+this.getNome()+" sou casada com "+this.getMulher().getNome();
    }

}
