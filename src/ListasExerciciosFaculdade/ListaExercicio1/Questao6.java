package ListasExerciciosFaculdade.ListaExercicio1;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = ler.nextInt();
        System.out.println("Digite o seu sexo: ");
        System.out.println("Digite M para Masculino");
        System.out.println("Digite F para Feminino");
        char sexo = ler.next().charAt(0);
        System.out.println("Digite a sua altura : ");
        float altura = ler.nextFloat();
        if (sexo == 'M' && altura > 1.70 && idade <= 20) {
            System.out.println(nome + " seu peso ideal: 58.0kg");
        } else if (sexo == 'M' && altura > 1.70 && idade > 21 && idade <= 39) {
            System.out.println(nome + " seu peso ideal: 53.0kg");
        } else if (sexo == 'M' && altura > 1.70 && idade >= 40) {
            System.out.println(nome + " seu peso ideal: 45.0kg");
        } else if (sexo == 'M' && altura < 1.70 && idade <= 40) {
            System.out.println(nome + " seu peso ideal: 50.0kg");
        } else if (sexo == 'M' && altura < 1.70 && idade > 40) {
            System.out.println(nome + " seu peso ideal: 58.0kg");
        } else if (sexo == 'F' && altura > 1.50) {
            System.out.println(nome + " seu peso ideal: 44.7kg");
        } else if (sexo == 'F' && altura <= 1.50 && idade >= 35) {
            System.out.println(nome + " seu peso ideal: 45.0kg");
        } else if (sexo == 'F' && altura <= 1.50 && idade < 35) {
            System.out.println(nome + " seu peso ideal: 49.0kg");
        }
    }
}
