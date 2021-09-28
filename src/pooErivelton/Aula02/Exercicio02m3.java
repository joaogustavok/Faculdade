package pooErivelton.Aula02;

import java.util.Scanner;

public class Exercicio02m3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a temperatura: ");
        double grausfah = ler.nextDouble();
        Fah conta = new Fah();
        conta.imprime(grausfah);
    }



    public static class Fah{

        public void imprime(double graus){
            double result = (graus - 32) / 1.8;
            System.out.println(result);
        }
    }
    }

