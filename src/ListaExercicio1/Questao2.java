
package ListaExercicio1;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha uma das opções");
        System.out.println("");
        System.out.println("1 - Solteiro(a)");
        System.out.println("2 - Desquitado(a)");
        System.out.println("3 - Casado(a)");
        System.out.println("4 - Divorciado(a)");
        System.out.println("5 - Viúvo(a)");
        int opcao = ler.nextInt();
        switch(opcao) {
            case 1:
                System.out.println("Você é Solteiro(a)");
                break;
            case 2:
                System.out.println("Você é Desquitado(a)");
                break;
            case 3:
                System.out.println("Você é Casado(a)");
                break;
            case 4:
                System.out.println("Você é Divorciado(a)");
                break;
            case 5:
                System.out.println("Você é Viúvo");
                break;
            default:
                System.out.println("Digite um número válido!");
        }

    }
}
