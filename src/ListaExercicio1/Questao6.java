//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ListaExercicio1;

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        float[] peso = new float[10];
        int[] idade = new int[10];
        int somaIdade = 0;
        int contaPessoas = 0;

        int i;
        for(i = 0; i < peso.length; ++i) {
            System.out.println("Informe o peso:");
            Scanner ler = new Scanner(System.in);
            peso[i] = ler.nextFloat();
            System.out.println("Informe a idade:");
            idade[i] = ler.nextInt();
            somaIdade += idade[i];
            if ((double)peso[i] > 80.0D) {
                ++contaPessoas;
            }
        }

        i = somaIdade / idade.length;
        System.out.println("A media de idade é: " + i);
        System.out.println("A quantidade de pessoas com mais de 80 kg é: " + contaPessoas);
    }
}
