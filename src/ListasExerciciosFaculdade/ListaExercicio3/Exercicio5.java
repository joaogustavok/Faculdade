package ListasExerciciosFaculdade.ListaExercicio3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.println("Informe o seu cpf: (somente numeros)");
            double cpf = ler.nextDouble();
            System.out.println("Informe a quantidade de dependentes: ");
            int dependentes = ler.nextInt();
            System.out.println("Informe o seu salario: ");
            double salario = ler.nextDouble();
            if (dependentes != 0){
                for (int j = 1; j <= dependentes ; j++) {
                    salario -= salario * 0.05;
                }
            }
            salario -= salario * 0.17;
            System.out.println(salario);
       }
    }
}
