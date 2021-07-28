package pooErivelton.Aula1;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        float nota;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a sua nota [0.0]-[10.0]: ");
        nota = ler.nextFloat();
        if (nota <= 10.0 && nota >= 0.0) {
            if (nota >= 7.0) {
                System.out.println("Parabens, voce passou direto. Por acaso voce programa em java?");
            } else if (nota >= 5) {
                System.out.println("Vai ter quer fazer recuperaçao");
            } else {
                System.out.println("Reprovado");
            }
        } else {
            System.out.println("Nota invalida, Fechando aplicativo");
        }
    }
}
