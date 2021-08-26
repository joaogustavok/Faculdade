package pooErivelton.Aula4;

import pooRoberto.Aula3.Vetor.Vetor;

import javax.swing.*;

public class Vetores01 {
     int vetor [];

     public void leDados(){
         int tamVetor;
         String tam = new String();
         tam = JOptionPane.showInputDialog("Quantos elementos tera o vetor ?");

         tamVetor = Integer.parseInt(tam);

         vetor = new int[tamVetor];

         for (int i = 0; i < tamVetor; i++) {
             String elem = JOptionPane.showInputDialog("Elemento do vetor: ");
             vetor[i] = Integer.parseInt(elem);
         }
     }
     public void listaDados(){
         String elementos = new String();
         for (int i = 0; i < vetor.length; i++) {
             elementos = elementos + "-" + vetor[i];
         }
         JOptionPane.showMessageDialog(null,elementos);
     }

    public static void main(String[] args) {
        Vetores01 v1 = new Vetores01();
        v1.leDados();
        v1.listaDados();
    }
}
