package Exemplos;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um valor");
        int numero = ler.nextInt();
        if (numero >= 1 && numero <= 10) {
            System.out.println("Numero pertence ao intervalo");
        } else {
            System.out.println("Numero nao pertence ao intervalo");
        }

    }
}

