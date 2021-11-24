package pooErivelton.Aula10.Interfaces;

public class Quandrado implements FiguraGeometrica{

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return "quadrado";
    }

    @Override
    public int getArea() {
        int area =0;
        area = lado * lado;
        return area;
    }

    @Override
    public int getPerimentro() {
       int perimetro =0;
       perimetro = lado *4;
       return  perimetro;
    }
}
