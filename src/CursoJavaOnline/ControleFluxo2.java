package CursoJavaOnline;

public class ControleFluxo2 {
    // idade <15 categoria infantil
    // idade >=15 && idade <18 juvenil
    // idade >=18 adulto
    public static void main(String[] args) {
        int idade = 15;
        String status;
        status = idade < 15 ? "infantil" : idade >= 15 && idade <18? "juvenil" : "adulto";

        System.out.println(status);
    }
}
