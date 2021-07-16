package CursoJavaOnline2.Javacore.aIntroducaoClasses.Test;

import CursoJavaOnline2.Javacore.aIntroducaoClasses.Dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); //variavel de referencia do tipo estutante
        estudante.nome = "joao";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
