package pooErivelton.ListaExercicio1;

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio01A {
    public static void tempetura(double fah){
        double celcius;

        celcius = (fah - 32)/1.8;

        DecimalFormat fmt = new DecimalFormat("0.0");

        JOptionPane.showMessageDialog(null, fah+" equivale a "+fmt.format(celcius)+ " celcius");
    }

    public static void main(String[] args) {
       double fah = Double.parseDouble(JOptionPane.showInputDialog("Entre com uma temperatura em Fahrenheit: "));
        tempetura(fah);
    }
}


