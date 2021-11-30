package QuestaoAvaliativaErivelton;

public class Bolo01 extends BaseBolo{

    public Bolo01(String recheio, String cobertura, int camadas, double preco) {
        super(recheio, cobertura, camadas, preco);
    }



    @Override
    public void comeBolo() {
        System.out.println("Quentinho NhomNhomNhom");
    }
}
