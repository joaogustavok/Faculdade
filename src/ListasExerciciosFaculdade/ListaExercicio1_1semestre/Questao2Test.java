package ListasExerciciosFaculdade.ListaExercicio1_1semestre;

import java.util.Scanner;

public class Questao2Test {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Questao2Switch escolha = new Questao2Switch();
        System.out.println("Escolha uma das opções");
        System.out.println("");
        System.out.println("1 - Solteiro(a)");
        System.out.println("2 - Desquitado(a)");
        System.out.println("3 - Casado(a)");
        System.out.println("4 - Divorciado(a)");
        System.out.println("5 - Viúvo(a)");
        int opcao = ler.nextInt();
        escolha.escolhe(opcao);
    }
}
