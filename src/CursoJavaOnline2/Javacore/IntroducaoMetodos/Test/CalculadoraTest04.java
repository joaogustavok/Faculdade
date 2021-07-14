package CursoJavaOnline2.Javacore.IntroducaoMetodos.Test;

import CursoJavaOnline2.Javacore.IntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calc.alteraDoisNumeros(num1,num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
