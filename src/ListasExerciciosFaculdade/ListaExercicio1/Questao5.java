package ListasExerciciosFaculdade.ListaExercicio1;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade de mercadorias: ");
        int produto = ler.nextInt();
        double valorMercadoria = 0;
        for (int i = 1; i <= produto; i++) {
            System.out.println("Informe o valor de cada mercadoria: ");
            valorMercadoria += ler.nextDouble();
        }
        System.out.println("Valor total: " + valorMercadoria);
        System.out.println("Valor media mercadorias:" + valorMercadoria / produto);
    }
}
