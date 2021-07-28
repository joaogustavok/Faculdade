

package ListasExerciciosFaculdade.ListaExercicio1_1semestre;

import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        System.out.println("Informe o preço de fabrica de um carro: ");
        Scanner ler = new Scanner(System.in);
        double preco = ler.nextDouble();
        double imposto = preco * 0.45D;
        double distribuidor = imposto * 0.28D;
        double somatoria = preco + distribuidor + imposto;
        System.out.println("O imposto é de: " + imposto);
        System.out.println("O lucro do distribuidor é de: " + distribuidor);
        System.out.println("O preco total de um carro ao consumidor é de: " + somatoria);
    }
}
