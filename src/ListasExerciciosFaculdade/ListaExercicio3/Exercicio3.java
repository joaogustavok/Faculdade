package ListasExerciciosFaculdade.ListaExercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira um número para fatorar");
        double numero = ler.nextDouble();
        double resultado = numero;

        while (numero > 1) {

            resultado = resultado * (numero - 1);
            numero--;

        }
        System.out.println("O fatorial é: " + resultado);
    }
}