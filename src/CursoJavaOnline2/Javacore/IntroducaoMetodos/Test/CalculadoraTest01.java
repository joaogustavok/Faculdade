package CursoJavaOnline2.Javacore.IntroducaoMetodos.Test;

import CursoJavaOnline2.Javacore.IntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        System.out.println("Finalizando calculadoratest01");
        calc.subtraiDoisNumeros();

    }
}
