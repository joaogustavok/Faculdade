package ListasExerciciosFaculdade.ListaExercicio4.Questao01;

import ListasExerciciosFaculdade.ListaExercicio4.Questao01.Cliente;

public class ClienteMain {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Pedrão",13245678910L);
        Cliente cliente02 = new Cliente("Daniel", 98765432101L);
        Cliente cliente03 = new Cliente("João",18495938385L);
        Cliente cliente04 = new Cliente("Jorge",83858769275L);

        System.out.println(cliente01.toString());
        System.out.println(cliente02.toString());
        System.out.println(cliente03.toString());
        System.out.println(cliente04.toString());

    }
}
