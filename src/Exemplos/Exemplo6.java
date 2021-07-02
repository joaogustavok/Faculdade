package Exemplos;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva 2 numeros inteiros");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int soma = a + b;
        System.out.println("A soma dos numeros é " + soma);
    }
}
