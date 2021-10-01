package pooRoberto.Aula07.Heranca05;

public class Ingresso {

    private static double valor = 250;

    public static double getValor() {
        return valor;
    }

    public static void setValor(double valor) {
        Ingresso.valor = valor;
    }

    public double imprimeValor(){
        return valor;
    }
}
