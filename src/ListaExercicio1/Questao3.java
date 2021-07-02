
package ListaExercicio1;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Digite o saldo atual: ");
        float saldoAtual = ler.nextFloat();
        System.out.println("Escolha uma das opções: ");

        while(opcao != 3) {
            System.out.println("1 - Crédito");
            System.out.println("2 - Débito");
            System.out.println("3 - Fechar caixa e sair");
            opcao = ler.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("Digite o valor:");
                    float soma = ler.nextFloat();
                    saldoAtual += soma;
                    break;
                case 2:
                    System.out.println("Digite o valor:");
                    float subtrai = ler.nextFloat();
                    saldoAtual -= subtrai;
                    break;
                case 3:
                    System.out.println("O seu saldo atual é de R$" + saldoAtual);
                    System.out.println("Você saiu!!!");
                    break;
                default:
                    System.out.println("Digite um valor válido!");
            }
        }

    }
}
