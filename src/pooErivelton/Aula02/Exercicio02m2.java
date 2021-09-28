package pooErivelton.Aula02;

import java.util.Scanner;

public class Exercicio02m2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe os graus fah");
        double fah = ler.nextDouble();
        double resultado = calcular(fah);
        System.out.println(resultado);
    }

    public static double calcular(double a){
        double result = (a - 32) / 1.8;
        return result;
    }
}
