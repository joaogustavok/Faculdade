package CursoJavaOnline2.Javacore.hHeranca.Test;

import CursoJavaOnline2.Javacore.hHeranca.Dominio.Endereco;
import CursoJavaOnline2.Javacore.hHeranca.Dominio.Funcionario;
import CursoJavaOnline2.Javacore.hHeranca.Dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Av Fernandes");
        endereco.setCep("12321-22");
        Pessoa pessoa = new Pessoa("Analu");

        pessoa.setCpf("11111111-22");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario("Amanda");

        funcionario.setCpf("123422123-23");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20003);
        funcionario.imprime();
    }
}
