package CursoJavaOnline2.Javacore.gAssociacao.Test;

import CursoJavaOnline2.Javacore.gAssociacao.Dominio.Escola;
import CursoJavaOnline2.Javacore.gAssociacao.Dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor2 = new Professor("Amanda");
        Professor professor1 = new Professor("AnaLu");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Sesi", professores);

        escola.imprime();
    }
}
