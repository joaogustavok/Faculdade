package pooErivelton.Aula2;

import java.util.Scanner;

public class ExemploScanner2 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int n1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Informe o segundo número: ");
        int n2 = Integer.parseInt(entrada.nextLine());

        int resultado = somar(n1,n2);

        System.out.println("A soma dos dois números é: "+resultado);

    }

    public static int somar(int a, int b){

        int soma = a + b;
        return soma;

    }
}

