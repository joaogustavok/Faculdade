package pooErivelton.Aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite a idade: ");
            int idade = sc.nextInt();
            System.out.println(idade);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
