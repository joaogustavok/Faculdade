package CursoJavaOnline.javacore.introducaometodos.teste;
import CursoJavaOnline.javacore.introducaometodos.classes.Calculadora;


public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc= new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5,6);
        double result = calc.divideDoisNumeros(20,2);
        System.out.println(result);
        calc.imprimeDoisNumerosDividos(20,5);
        System.out.println("Continuando execucao");

    }
}
