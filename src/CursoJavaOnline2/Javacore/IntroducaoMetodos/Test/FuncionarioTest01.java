package CursoJavaOnline2.Javacore.IntroducaoMetodos.Test;

import CursoJavaOnline2.Javacore.IntroducaoMetodos.Dominio.Funcionario;


public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario func1= new Funcionario();

        func1.nome = "Amanda";
        func1.idade = 25;
        func1.salarios = new double []{1200,964.65,2000};

        func1.imprime();
    }
}
