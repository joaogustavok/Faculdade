package ListasExerciciosFaculdade.ListaExercicio4.Questao02;

public class Relogio {
    private int hora;
    private int minutos;
    private String marca;
    private String modelo;
    private double preco;

    public Relogio(int hora, int minutos, String marca, String modelo, double preco) {
        this.hora = hora;
        this.minutos = minutos;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Relogio{" +
                "hora=" + hora +
                ", minutos=" + minutos +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                '}';
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
