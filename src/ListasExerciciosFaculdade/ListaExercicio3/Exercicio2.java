package ListasExerciciosFaculdade.ListaExercicio3;

import java.math.BigInteger;

public class Exercicio2 {

    public static void main(String args[]) {
        double aux = 0;
        double graos;
        graos = 1;

        while (aux <= 63) {
            graos = graos*2;
            aux = aux + 1;

        }
        System.out.println("Quantidade de graos: "+(graos));
    }

}
