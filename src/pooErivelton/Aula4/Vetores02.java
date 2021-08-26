package pooErivelton.Aula4;

import javax.swing.*;

class empregado {

    String nome;
    float salario;

}


public class Vetores02 {
    public static void main(String[] args) {

        empregado e[] = new empregado[2];
        ler(e);

        for (int i = 0; i < e.length; i++) {
            JOptionPane.showMessageDialog(null, "Nome: " + e[i].nome);
            JOptionPane.showMessageDialog(null, "Salario: " + e[i].salario);
        }
    }

    public static void ler(empregado e[]) {
        for (int i = 0; i < e.length; i++) {
            e[i] = new empregado();
            e[i].nome = JOptionPane.showInputDialog("Entre com o nome: ");
            e[i].salario = Float.parseFloat(JOptionPane.showInputDialog("Entre com o salario: "));
        }
    }
}
