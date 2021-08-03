package ListasExerciciosFaculdade.ListaExercicio1;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        int idade = ler.nextInt();
        if (idade < 16){
            System.out.println("Não eleitor");
        } else if (idade > 18 &&  idade <= 65){
            System.out.println("Eleitor obrigatorio");
        } else if ((idade >= 16 && idade < 18) || idade > 65) {
            System.out.println("Eleitor Facultativo");
        }
    }
}
