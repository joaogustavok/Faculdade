package pooErivelton.Aula2;

import java.util.Scanner;

public class ExemploScanner {
    public static boolean ehPar(int value){
        if (value % 2 == 0) return true; //verificar se é par
        else return false;

    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Forceça um numero inteiro: ");
        int num = ler.nextInt();

        if (ehPar(num)){
            System.out.println("Numero fornecido é par");
        } else {
            System.out.println("Numero fornecido e impar");
        }
    }
}
