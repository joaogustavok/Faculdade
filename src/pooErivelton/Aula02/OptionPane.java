package pooErivelton.Aula02;

import javax.swing.JOptionPane;

public class OptionPane {
    public static void main(String[] args) {
        String nome = new String();
        String ender = new String();

        nome = JOptionPane.showInputDialog("Nome da pessoa: ");
        ender = JOptionPane.showInputDialog("Endereço da pessoa: ");
        JOptionPane.showMessageDialog(null,nome+" reside no endereço: "+ender);
    }
}
