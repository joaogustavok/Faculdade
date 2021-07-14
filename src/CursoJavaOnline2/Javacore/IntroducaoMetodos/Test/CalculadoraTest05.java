package CursoJavaOnline2.Javacore.IntroducaoMetodos.Test;

import CursoJavaOnline2.Javacore.IntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int [] numeros  = {1, 2, 3, 4, 5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
    }
}
