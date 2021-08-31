package pooErivelton.Aula02;


import javax.swing.*;

public class OptionPane2 {
    String cpf ;
    String nome ;
    String fone ;
    String email ;


public void cadastrar(){
    cpf = JOptionPane.showInputDialog("Informe o CPF do cliente:");
    nome= JOptionPane.showInputDialog("Informe o nome do cliente:");
    email = JOptionPane.showInputDialog("Informe o email do cliente:");
    fone = JOptionPane.showInputDialog("Informe o fone do cliente:");
}

public void imprime(){
    JOptionPane.showMessageDialog(null,"Dados do cliente: \n"+cpf +" - "+nome+" - "+email+" - "+fone);
}

    public static void main(String[] args) {
        OptionPane2 cliente = new OptionPane2();
        cliente.cadastrar();
        cliente.imprime();
    }
}



