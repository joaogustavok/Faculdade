package ListasExerciciosFaculdade.ListaExercicio3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Informe o valor gasto no restaurante:");
        Scanner ler = new Scanner(System.in);
        double despesas = ler.nextDouble();
        double gorjeta = despesas * 0.10;
        double total = gorjeta + despesas;
        System.out.println("Valor da gorjeta: "+gorjeta);
        System.out.println("Valor total: "+total);
    }
}
