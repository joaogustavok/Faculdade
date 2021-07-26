package CursoJavaOnline2.Javacore.jModificadorFinal.Test;

import CursoJavaOnline2.Javacore.jModificadorFinal.Dominio.Carro;
import CursoJavaOnline2.Javacore.jModificadorFinal.Dominio.Comprador;
import CursoJavaOnline2.Javacore.jModificadorFinal.Dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("AnaLu");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Amanda");
        ferrari.imprime();
    }

}
