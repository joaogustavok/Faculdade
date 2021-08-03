

package ListasExerciciosFaculdade.ListaExercicio1_1semestre;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Double[] preco = new Double[10];

        for(int i = 0; i < preco.length; ++i) {
            Scanner ler = new Scanner(System.in);
            System.out.printf("Informe o numero:\n");
            preco[i] = ler.nextDouble();
        }

        double total = 0.0D;

        for(int i = 0; i < preco.length; ++i) {
            total += preco[i];
        }

        double media = total / (double)preco.length;
        System.out.println("A media aritmetica dos numeros informados foi de: " + media);
    }
}
