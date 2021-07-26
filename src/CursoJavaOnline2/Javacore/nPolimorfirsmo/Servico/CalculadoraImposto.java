package CursoJavaOnline2.Javacore.nPolimorfirsmo.Servico;

import CursoJavaOnline2.Javacore.nPolimorfirsmo.Dominio.Computador;
import CursoJavaOnline2.Javacore.nPolimorfirsmo.Dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println(imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println(imposto);
    }
}
