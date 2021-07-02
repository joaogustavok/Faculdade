package Exemplos;

import java.util.Scanner;

public class Exemplo7 {
    static int somatoria(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Informe 3 numeros");
        Scanner numero = new Scanner(System.in);
        int a = numero.nextInt();
        int b = numero.nextInt();
        int c = numero.nextInt();
        int soma = somatoria(a, b, c);
        System.out.println("O total somado foi de " + soma);
    }
}
