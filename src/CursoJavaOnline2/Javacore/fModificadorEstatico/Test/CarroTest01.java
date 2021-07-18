package CursoJavaOnline2.Javacore.fModificadorEstatico.Test;


import CursoJavaOnline2.Javacore.fModificadorEstatico.Dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Bmw",280);
        Carro carro2 = new Carro("Fuscao",280);
        Carro carro3 = new Carro("Marea",300);

        carro1.imprimeCarro();
        carro2.imprimeCarro();
        carro3.imprimeCarro();
    }
}
