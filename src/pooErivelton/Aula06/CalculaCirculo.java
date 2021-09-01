package pooErivelton.Aula06;

class Circulo{
    private double raio;
    private double aumenta;
    private static double pi = 3.14159;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAumenta() {
        return aumenta;
    }

    public void setAumenta(double aumenta) {
        this.aumenta = aumenta;
    }
    public double calcularArea(){
        return pi * (raio * raio);
    }
    public double calcularCircunferencia(){
        return 2 * pi * raio;
    }
    public void aumentar(){
        double area, circunferencia;
        area = calcularArea() + (calcularArea() * (aumenta /100));
        circunferencia = calcularCircunferencia() + (calcularCircunferencia() * (aumenta/100));
        System.out.println("Area depois de aumentar em: "+aumenta+ " % = "+area);
        System.out.println("Circunferencia depois de aumentar em: "+aumenta+" % = "+circunferencia);
    }
}

public class CalculaCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(10);
        circulo.setAumenta(10);
        System.out.println("A area do circulo é de: "+circulo.calcularArea());
        System.out.println("A circunferencia do circulo é de: "+ circulo.calcularCircunferencia());
        circulo.aumentar();
    }
}
