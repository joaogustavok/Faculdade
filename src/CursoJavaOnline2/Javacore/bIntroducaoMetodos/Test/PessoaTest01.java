package CursoJavaOnline2.Javacore.bIntroducaoMetodos.Test;

import CursoJavaOnline2.Javacore.bIntroducaoMetodos.Dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Amanda");
        pessoa.setIdade(23);

        pessoa.imprime();

        System.out.println("---------");
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());
    }
}
