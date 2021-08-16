package ListasExerciciosFaculdade.ListaExercicio4.Questao02;

public class RelogioMain {
    public static void main(String[] args) {
        Relogio relogio01 = new Relogio(10,30,"Hugo Boss","Stinger",699);
        Relogio relogio02 = new Relogio(12,45,"Rolex","Swift",1000);
        System.out.println(relogio01.toString());
        System.out.println(relogio02.toString());
        relogio01.setHora(8);
        relogio01.setMinutos(10);
        relogio02.setPreco(599);
        relogio02.setModelo("Spring");
        System.out.println("========Modificando=========");
        System.out.println(relogio01.toString());
        System.out.println(relogio02.toString());
    }
}
