package Exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um valor");
        int x = ler.nextInt();
        switch(x) {
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("Dois");
                break;
            default:
                System.out.println("Desconhecido");
        }

    }
}
