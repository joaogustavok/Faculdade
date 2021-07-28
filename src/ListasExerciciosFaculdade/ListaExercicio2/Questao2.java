package ListasExerciciosFaculdade.ListaExercicio2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe 4 numeros:");
        double n1 = ler.nextDouble();
        double n2 = ler.nextDouble();
        double n3 = ler.nextDouble();
        double n4 = ler.nextDouble();

        if (n3 * n3 >=1000){
            System.out.println(n3 * n3);
            System.out.println("Encerrando programa");
            return;
        }
        System.out.println(n1 * n1);
        System.out.println(n2 * n2);
        System.out.println(n3 * n3);
        System.out.println(n4 * n4);
    }
}
