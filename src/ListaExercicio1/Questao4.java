
package ListaExercicio1;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número real");
        float numero = ler.nextFloat();

        while(numero < 500.0F) {
            numero *= 2.0F;
            if (numero < 500.0F) {
                System.out.println(numero);
            }
        }

    }
}
