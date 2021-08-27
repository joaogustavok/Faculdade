package pooErivelton.ListaExercicio1;

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio01C {

    double fah;


    public static void tempetura(double fah){
        double celcius;

        celcius = (fah - 32)/1.8;

        DecimalFormat fmt = new DecimalFormat("0.0");

        JOptionPane.showMessageDialog(null, fah+" equivale a "+fmt.format(celcius)+ " celcius");
    }

    public static void main(String[] args) {
        Exercicio01C graus = new Exercicio01C();
        graus.fah = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em fah, para ser convertida: "));
        tempetura(graus.fah);
    }
}
