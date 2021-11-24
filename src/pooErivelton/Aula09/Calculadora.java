package pooErivelton.Aula09;

public class Calculadora {
    private String modelo;
    private String marca;
    private String uso;

    public Calculadora() {
    }

    public Calculadora(String modelo, String marca, String uso) {
        this.modelo = modelo;
        this.marca = marca;
        this.uso = uso;
    }

    public int calcula(int a, int b ){
        return a + b;
    }
    public double calcula(double a, double b ){
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.calcula(100,200));

    }


}
