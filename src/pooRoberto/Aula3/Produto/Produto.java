package pooRoberto.Aula3.Produto;

import javax.swing.*;

public class Produto {
    String nome;
    double valorOriginal;
    double aumento;
    double valorAumento;



    public double calcular(){
        valorAumento = valorOriginal + valorOriginal*(aumento/100);
        return valorAumento;
    }
    public void mostrar(){
        JOptionPane.showMessageDialog(null,"Valor do produto: "+this.nome+" é de: "+valorAumento);
    }
}
