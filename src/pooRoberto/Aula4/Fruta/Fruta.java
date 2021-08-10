package pooRoberto.Aula4.Fruta;

import java.awt.*;

public class Fruta {
    private String nome;
    private double pesoAproximado;
    private Color corPredominante;
    private int tamanhoAproximado;

    public Fruta(String nome, double pesoAproximado, Color corPredominante, int tamanhoAproximado) {
        this.nome = nome;
        this.pesoAproximado = pesoAproximado;
        this.corPredominante = corPredominante;
        this.tamanhoAproximado = tamanhoAproximado;
    }

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Peso Aproximado: "+this.pesoAproximado);
        System.out.println("Cor predominante: "+nomeDaCor(this.corPredominante));
        System.out.println("Tamanho: "+this.tamanhoAproximado);

    }

    public  String nomeDaCor(Color cor){
        String nomeCor = "";
        if (cor == Color.BLACK)
            nomeCor = "Preto";
        if (cor == Color.BLUE)
            nomeCor = "Azul";
        if (cor == Color.green)
            nomeCor = "Verde";
        if (cor == Color.red)
            nomeCor = "Vermelho";
        if (cor == Color.YELLOW)
            nomeCor = "Amarelo";
        return nomeCor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPesoAproximado() {
        return pesoAproximado;
    }

    public void setPesoAproximado(double pesoAproximado) {
        this.pesoAproximado = pesoAproximado;
    }

    public Color getCorPredominante() {
        return corPredominante;
    }

    public void setCorPredominante(Color corPredominante) {
        this.corPredominante = corPredominante;
    }

    public int getTamanhoAproximado() {
        return tamanhoAproximado;
    }

    public void setTamanhoAproximado(int tamanhoAproximado) {
        this.tamanhoAproximado = tamanhoAproximado;
    }
}
