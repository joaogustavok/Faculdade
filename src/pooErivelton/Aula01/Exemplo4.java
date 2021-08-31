package pooErivelton.Aula01;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float valor, dolar, real = (float) 5.32;
        System.out.println("Digite o valor em dolar:");
        dolar = ler.nextFloat();
        valor = dolar * real;
        System.out.println("O valor em real é R$: " + valor);
    }
}
