
package ListasExerciciosFaculdade.ListaExercicio1;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int a = ler.nextInt();
        System.out.println("Digite outro numero inteiro");
        int b = ler.nextInt();
        if (a < b) {
            System.out.println("O menor numero informado foi " + a + " e o maior numero informado foi " + b);
        } else if (b < a) {
            System.out.println("O menor numero informado foi " + b + " e o maior numero informado foi " + a);
        } else if (b == a) {
            System.out.println("Os numeros são iguais");
        }

    }
}
