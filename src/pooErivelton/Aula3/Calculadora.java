package pooErivelton.Aula3;

import javax.swing.*;

public class Calculadora {
    public void le() {
        int num1, num2, op;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1 numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2 numero: "));
        op = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação matematica: 1 - soma, 2 - subtração, 3 - multiplicacao e 4 - divisao"));
        JOptionPane.showMessageDialog(null, "resultado: " + this.calcula(num1, num2, op));


    }

    public static double calcula(int num1, int num2, int op) {
        if (op ==1)
            return num1 + num2;
        if (op ==2)
            return num1 - num2;
        if (op ==3)
            return num1 * num2;
        else
            return num1 / num2;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.le();
    }
}
