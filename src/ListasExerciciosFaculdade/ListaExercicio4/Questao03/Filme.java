package ListasExerciciosFaculdade.ListaExercicio4.Questao03;

public class Filme {
    private String diretor;
    private String titulo;
    private double valorIngresso;

    public Filme(String diretor, String titulo, double valorIngresso) {
        this.diretor = diretor;
        this.titulo = titulo;
        this.valorIngresso = valorIngresso;
    }


    @Override
    public String toString() {
        return "Filme{" +
                "diretor='" + diretor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", valorIngresso=" + valorIngresso +
                '}';
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
}
