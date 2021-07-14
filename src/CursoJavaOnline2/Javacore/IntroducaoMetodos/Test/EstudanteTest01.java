package CursoJavaOnline2.Javacore.IntroducaoMetodos.Test;

import CursoJavaOnline2.Javacore.IntroducaoMetodos.Dominio.Estudante;
import CursoJavaOnline2.Javacore.IntroducaoMetodos.Dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Pedro";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Amanda";
        estudante02.idade = 22;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
