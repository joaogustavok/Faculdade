package pooErivelton.ListaExercicio1;

import CursoJavaOnline2.Javacore.gAssociacao.Dominio.Jogador;

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio01B {

    static double fah;

    public static void tempetura(){
        double celcius;

        celcius = (fah - 32)/1.8;

        DecimalFormat fmt = new DecimalFormat("0.0");

        JOptionPane.showMessageDialog(null, fah+" equivale a "+fmt.format(celcius)+ " celcius");
    }

    public static void main(String[] args) {
        fah = Double.parseDouble(JOptionPane.showInputDialog("Informe os o graus em Fah: "));
        tempetura();
    }
}
