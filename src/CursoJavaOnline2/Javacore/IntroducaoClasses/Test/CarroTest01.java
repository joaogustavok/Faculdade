package CursoJavaOnline2.Javacore.IntroducaoClasses.Test;

import CursoJavaOnline2.Javacore.IntroducaoClasses.Dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Gol";
        carro.modelo = "G3";
        carro.ano = 2003;

        Carro carro2 = new Carro();
        carro2.nome = "Fusca";
        carro2.modelo = "Fuscao Bruto";
        carro2.ano = 1923;

        System.out.println(carro.nome);
        System.out.println(carro.ano);
        System.out.println(carro.modelo);
        System.out.println("-----");
        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);
    }
}
