package pooErivelton.Aula05.Exemplo01;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();

        empregado.adress.estado = JOptionPane.showInputDialog("Entre com o Estado: ");
        empregado.adress.cep = JOptionPane.showInputDialog("Entre com o CEP: ");
        empregado.adress.cidade = JOptionPane.showInputDialog("Entre com a Cidade: ");
        empregado.adress.rua = JOptionPane.showInputDialog("Entre com a Rua: ");

        empregado.name.nome_ini = JOptionPane.showInputDialog("Entre com o 1 Nome: ");
        empregado.name.nome_meio = JOptionPane.showInputDialog("Entre com o 2 Nome: ");
        empregado.name.sobrenome = JOptionPane.showInputDialog("Entre com o 3 Nome: ");

        JOptionPane.showMessageDialog(null,"Estado: "+empregado.adress.estado);
        JOptionPane.showMessageDialog(null,"Cep: "+empregado.adress.cep);
        JOptionPane.showMessageDialog(null,"Cidade: "+empregado.adress.cidade);
        JOptionPane.showMessageDialog(null,"Rua: "+empregado.adress.rua);

        JOptionPane.showMessageDialog(null,"1 Nome: "+empregado.name.nome_ini);
        JOptionPane.showMessageDialog(null,"2 Nome: "+empregado.name.nome_meio);
        JOptionPane.showMessageDialog(null,"3 Nome: "+empregado.name.sobrenome);

    }
}
