package CursoJavaOnline2.Javacore.bIntroducaoMetodos.Test;

import CursoJavaOnline2.Javacore.bIntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double result = calc.divideDoisNumeros(20,2);
        System.out.println(result);
        System.out.println("---------");
        calc.imprimeDivisaoDeDoisNumeros(86,0);
    }
}
