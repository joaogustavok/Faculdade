package ListasExerciciosFaculdade.ListaExercicio2;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade a ser pesada: ");
        double quilosPesados = ler.nextDouble();
        double excesso = 0;
        double valorMulta = 0;

        if (quilosPesados > 50 ){
            excesso = (quilosPesados - 50);
            valorMulta = excesso * 4;
            System.out.println("O peso excedeu a quantidade permitida");
            System.out.println("------------");
        }
        System.out.println("Quantidade pesada: "+quilosPesados);
        System.out.println("Quantidade excedida: "+excesso);
        System.out.println("Valor multa: R$ "+valorMulta);

    }
}
