package pooRoberto.Aula4.Pessoa;

import javax.swing.*;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa multidao[] = new Pessoa[10];

        for (int i = 0; i <10 ; i++) {
            multidao[i] = new Pessoa();

        }
//        multidao[1].nome = "Maria";
//        System.out.println(multidao[1].nome);
        for (int i = 0; i < multidao.length; i++) {
            multidao[i].nome = JOptionPane.showInputDialog("Nome: "+(i+1));
        }
        for (int i = 0; i < multidao.length; i++) {
            JOptionPane.showMessageDialog(null,multidao[i].nome);
        }

    }
}
