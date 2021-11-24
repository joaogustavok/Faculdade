package pooErivelton.Aula09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {
    public static  int calculaQuociente(int numerador, int denomiador) throws ArithmeticException{
        return numerador/denomiador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean continua = true;
        do {
            try {
                System.out.println("Numerador: ");
                int numerador = sc.nextInt();

                System.out.println("Denominador: ");
                int denominador = sc.nextInt();

                int resultado = calculaQuociente(numerador,denominador);
                System.out.println("Resultado: "+resultado);
                continua = false;
            } catch (InputMismatchException erro1){
                System.out.println("Nao é permitido enserir letras, informe apenas numeros inteiros");
                sc.nextLine();
            }   catch (ArithmeticException erro2 ){
                System.out.println("O numero de divisor deve ser diferente de 0! ");

            }   finally {
                System.out.println("Execução do finally");
            }
        } while (continua);
    }
}
