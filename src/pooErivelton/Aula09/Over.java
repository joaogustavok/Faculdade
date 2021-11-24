package pooErivelton.Aula09;

public class Over {
    public void fazAlgo() {
        System.out.println("Este é o metodo da super classe");
    }
}

class NovoOver extends Over {
    @Override
    public void fazAlgo() {
        System.out.println("Este metodo foi sobrescrito");

    }

    public static void main(String[] args) {
        Over O = new Over();
        O.fazAlgo();

        NovoOver NO = new NovoOver();
        NO.fazAlgo();
    }
}