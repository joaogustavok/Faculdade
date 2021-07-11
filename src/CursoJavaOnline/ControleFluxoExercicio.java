package CursoJavaOnline;

public class ControleFluxoExercicio {
    public static void main(String[] args) {

        double salario = 900;
        double imposto;

        if (salario < 1000) {
            imposto = salario * 0.05;
        } else if (salario >= 1000 && salario < 2000) {
            imposto = salario * 0.10;
        } else if (salario >= 2000 && salario < 4000) {
            imposto = salario * 0.15;
        } else {
            imposto = salario * 0.20;
        }
        System.out.println("O total de imposto é " + imposto);
    }
}


