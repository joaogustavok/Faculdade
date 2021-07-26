package CursoJavaOnline2.Javacore.bIntroducaoMetodos.Test;

import CursoJavaOnline2.Javacore.bIntroducaoMetodos.Dominio.Funcionario;


public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario func1= new Funcionario();

        func1.setNome("Amanda");
        func1.setIdade(25);
        func1.setSalarios(new double []{1200,964.65,2000});

        func1.imprime();
    }
}
