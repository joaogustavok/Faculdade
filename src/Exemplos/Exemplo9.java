package Exemplos;

import javax.swing.*;
import java.awt.*;

public class Exemplo9 {
    public static void main(String[] args) {
        String aux = "";
        aux = JOptionPane.showInputDialog((Component)null, "Digite o valor de A: ");
        int a = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog((Component)null, "Digite o valor de B; ");
        int b = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog((Component)null, "Digite o valor de C: ");
        int c = Integer.parseInt(aux);
        double delta = Math.pow((double)b, 2.0D) - (double)(4 * a * c);
        if (delta >= 0.0D) {
            double x1 = ((double)(-b) + Math.sqrt(delta)) / 2.0D * (double)a;
            double x2 = ((double)(-b) - Math.sqrt(delta)) / 2.0D * (double)a;
            JOptionPane.showInputDialog((Component)null, "Delta: " + delta + "\nx1: " + x1 + "\nx2: " + x2);
        } else {
            JOptionPane.showMessageDialog((Component)null, "Delta não possuí raiz!");
        }

    }
}
