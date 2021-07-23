package CursoJavaOnline2.Javacore.nPolimorfirsmo.Test;

import CursoJavaOnline2.Javacore.nPolimorfirsmo.Dominio.Computador;
import CursoJavaOnline2.Javacore.nPolimorfirsmo.Dominio.Tomate;
import CursoJavaOnline2.Javacore.nPolimorfirsmo.Servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("I7 bom",1000);
        Tomate tomate = new Tomate("Tomate vermeio", 20);
        CalculadoraImposto.calcularImpostoComputador(computador);
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
