package Exemplos;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        int idades[] = new int[10];
        double sub14 = 0, sub29 = 0, sub44 = 0, sub59 = 0, sub60 = 0;
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Informe a idade: ");
            idades[i] = ler.nextInt();

            if (idades[i] <= 14) {
                sub14++;
            } else if (idades[i] >= 15 && idades[i] <= 29)
                sub29++;
            else if (idades[i] >= 30 && idades[i] <= 44)
                sub44++;
            else if (idades[i] >= 45 && idades[i] <= 59)
                sub59++;
            else if (idades[i] > 60)
                sub60++;
        }
        System.out.println("Pessoas ate 14:"+sub14);
        System.out.println("Pessoas de 15 ate 20:"+sub29);
        System.out.println("Pessoas de 30 ate 44:"+sub44);
        System.out.println("Pessoas de 45 ate 59:"+sub59);
        System.out.println("Pessoas acima de 60:"+sub60);

        System.out.println("% de pessoas na primeira faixa etaria: "+((sub14* idades.length)/100));
        System.out.println("% de pessoas na ultima faixa etaria: "+((sub60* idades.length)/100));


    }
}
