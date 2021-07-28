package ListasExerciciosFaculdade.ListaExercicio1_1semestre;

public class Questao2Switch {
    public void escolhe(int opcao){
        switch (opcao) {
            case 1 -> System.out.println("Você é Solteiro(a)");
            case 2 -> System.out.println("Você é Desquitado(a)");
            case 3 -> System.out.println("Você é Casado(a)");
            case 4 -> System.out.println("Você é Divorciado(a)");
            case 5 -> System.out.println("Você é Viúvo");
            default -> System.out.println("Digite um número válido!");
        }
    }
}
