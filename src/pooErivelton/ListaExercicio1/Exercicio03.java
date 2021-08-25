package pooErivelton.ListaExercicio1;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio03 {

    String fones[];

    public void iniciaVetor(){
        int quantidade;
       quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos telefones serao lidos? "));
      fones = new String[quantidade];
    }
    public void leFones(){
        for (int i = 0; i < fones.length; i++) {
            fones[i] = JOptionPane.showInputDialog("Informe o numero de telefone "+(i+1)+" :");
        }
    }

    public void exibeFonesSC(){
        System.out.println(" ----- Os Telefones de SC: ---------");
        System.out.println( Arrays.stream(fones).filter(i ->(i.charAt(0) == '4') && i.charAt(1) == '7' || i.charAt(1) == '8' || i.charAt(1) == '9' ).collect(Collectors.toList()));
        JOptionPane.showMessageDialog(null,"Telefones de SC: \n" +  Arrays.stream(fones).filter(i ->(i.charAt(0) == '4') && i.charAt(1) == '7' || i.charAt(1) == '8' || i.charAt(1) == '9' ).collect(Collectors.toList()));
    }


    public static void main(String[] args) {
        Exercicio03 fones = new Exercicio03();
        fones.iniciaVetor();
        fones.leFones();
        fones.exibeFonesSC();
    }
}



