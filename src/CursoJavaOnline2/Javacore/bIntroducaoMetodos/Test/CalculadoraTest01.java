package CursoJavaOnline2.Javacore.bIntroducaoMetodos.Test;

import CursoJavaOnline2.Javacore.bIntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        System.out.println("Finalizando calculadoratest01");
        calc.subtraiDoisNumeros();

    }
}
