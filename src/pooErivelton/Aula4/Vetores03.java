package pooErivelton.Aula4;

import javax.swing.*;
import java.util.Arrays;

public class Vetores03 {
    float [] precos;

    public void intanciaVetor(){
        int quant;
        quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos preços serão lidos: "));
        precos = new float[quant];
    }
    public void lePrecos(){
        for (int i = 0; i < precos.length; i++) {
            precos[i] = Float.parseFloat(JOptionPane.showInputDialog("Preço do produto: "));
        }
    }
    public void exibePrecos(){
        JOptionPane.showMessageDialog(null,"Preços fornecidos: \n"+ Arrays.toString(precos));

    }

    public static void main(String[] args) {
        Vetores03 vetor3 = new Vetores03();
        vetor3.intanciaVetor();
        vetor3.lePrecos();
        vetor3.exibePrecos();
    }

}
