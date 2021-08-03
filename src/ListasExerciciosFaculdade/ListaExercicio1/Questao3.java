package ListasExerciciosFaculdade.ListaExercicio1;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        int idade;
        char grupo;
        String nome;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite a sua idade: ");
        idade = ler.nextInt();
        if (idade < 17 || idade > 70) {
            System.out.println("Digite uma idade valida");
            return;
        }
        System.out.println("* Grupo de Risco *");
        System.out.println("Digite B para baixo:");
        System.out.println("Digite M para medio:");
        System.out.println("Digite A para alto:");
        System.out.println("Digite o seu grupo de risco: ");
        grupo = ler.next().charAt(0);
        if (idade >= 17 && idade <= 20 && grupo == 'B') {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ",Codigo: 1");
        } else if (idade >= 17 && idade <= 20 && grupo == 'M') {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ",Codigo: 2");
        } else if (idade >= 17 && idade <= 20 && grupo == 'A') {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ",Codigo: 3");
        } else if (idade >= 21 && idade <= 24 && grupo == 'B') {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ",Codigo: 2");
        } else if (idade >= 21 && idade <= 24 && grupo == 'M') {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ",Codigo: 3");
        } else if (idade >= 21 && idade <= 24 && grupo == 'A') {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ",Codigo: 4");
        } else if (idade >= 25 && idade <= 34 && grupo == 'B') {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ",Codigo: 3");
        } else if (idade >= 25 && idade <= 34 && grupo == 'M') {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ",Codigo: 4");
        } else if (idade >= 25 && idade <= 34 && grupo == 'A') {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ",Codigo: 5");
        } else if (idade >= 35 && idade <= 64 && grupo == 'B') {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ",Codigo: 4");
        } else if (idade >= 35 && idade <= 64 && grupo == 'M') {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ",Codigo: 5");
        } else if (idade >= 35 && idade <= 64 && grupo == 'A') {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ",Codigo: 6");
        } else if (idade >= 65 && idade <= 70 && grupo == 'B') {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ",Codigo: 7");
        } else if (idade >= 65 && idade <= 70 && grupo == 'M') {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ",Codigo: 8");
        } else if (idade >= 65 && idade <= 70 && grupo == 'A') {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ",Codigo: 9");
        }
    }
}
