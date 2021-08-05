package pooErivelton.Aula2;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a temperatura em fahrenheith");
        double fah = ler.nextDouble();
        double resultado = (fah - 32) / 1.8;
        System.out.println(resultado);
    }
}
