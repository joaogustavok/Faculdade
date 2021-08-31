package pooErivelton.Aula03;

public class CachorroTest02 {
    public static void main(String[] args) {
        Cachorro01 cachorro01 = new Cachorro01();
        cachorro01.nome ="Tony";
        cachorro01.tamanho = 70;

        Cachorro01 cachorro02 = new Cachorro01();
        cachorro02.nome ="Boyyy";
        cachorro02.tamanho = 50;


        cachorro02.latir();
        cachorro01.latir();
    }
}
