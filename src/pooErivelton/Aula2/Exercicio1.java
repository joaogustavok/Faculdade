package pooErivelton.Aula2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        leitura();
    }
    public static void leitura(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o primeiro numero:");
        int n1 = ler.nextInt();
        System.out.println("Informe o segundo numero");
        int n2 = ler.nextInt();

        int resultado = somar(n1,n2);
        System.out.println("A soma dos 2 numeros é: "+resultado);
    }

    public static int somar(int a,int b){
        int soma = a+b;
        return soma;
    }

}
