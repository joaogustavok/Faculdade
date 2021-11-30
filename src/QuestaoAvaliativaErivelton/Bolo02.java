package QuestaoAvaliativaErivelton;

public class Bolo02 extends BaseBolo{

    public Bolo02(String recheio, String cobertura, int camadas, double preco) {
        super(recheio, cobertura, camadas, preco);
    }

    @Override
    public void comeBolo() {
        System.out.println("Bolo estava maravilhoso");
    }
}
