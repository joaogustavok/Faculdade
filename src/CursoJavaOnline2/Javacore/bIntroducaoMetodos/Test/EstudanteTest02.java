package CursoJavaOnline2.Javacore.bIntroducaoMetodos.Test;

import CursoJavaOnline2.Javacore.bIntroducaoMetodos.Dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Pedro";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Amanda";
        estudante02.idade = 22;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
