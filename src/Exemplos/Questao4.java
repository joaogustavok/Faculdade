package Exemplos;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        System.out.println("Informe o turno que voce trabalha: ");
        System.out.println("M - Manha");
        System.out.println("T - Tarde");
        System.out.println("N - Noite");
        Scanner ler = new Scanner(System.in);
        String opcao = ler.nextLine();
        switch (opcao){
            case "M":
                System.out.println("Bom dia!");
                break;
            case "T":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Digite uma opção valida");

        }
    }
}
