package pooErivelton.ListaExercicio1;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Double maior = Double.MIN_VALUE;

        Double menor = Double.MAX_VALUE;

        System.out.println("Informe a quantidade de valores: ");
        int vezes = ler.nextInt();

        Double[] preco = new Double[vezes];

        for (int i = 0; i < preco.length; i++) {

            System.out.printf("Informe o preço:\n");
            preco[i] = ler.nextDouble();
        }
        for (int i = 0; i < preco.length; i++) {

            for (int j = 0; j < preco.length; j++) {
                if (preco[i] > maior) {
                    maior = preco[i];
                } else if (preco[i] < menor) {
                    menor = preco[i];
                }
            }
        }

        double soma = 0;
        for (int i = 0; i < preco.length; i++) {
            soma += preco[i];
        }
        double total = soma / preco.length;

        System.out.println("A media dos precos e: " + total);
        System.out.println("O maior precos é: " + maior);
        System.out.println("O menor precos é: " + menor);
    }
}

