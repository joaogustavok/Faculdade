package QuestaoAvaliativaErivelton;

public class Main {
    public static void main(String[] args) {
        Bolo01 bolo01 = new Bolo01("Chocolate","Cereja",2,100.00);
        System.out.println(bolo01.toString());
        bolo01.comeBolo();
        Bolo02 bolo02 = new Bolo02("Pacoca","Manteiga",3,230.00);
        System.out.println(bolo02.toString());
        bolo02.comeBolo();
    }
}
