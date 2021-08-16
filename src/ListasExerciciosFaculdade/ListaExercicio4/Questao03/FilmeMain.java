package ListasExerciciosFaculdade.ListaExercicio4.Questao03;

import javax.swing.*;
import java.util.Scanner;

public class FilmeMain {
    public static void main(String[] args) {
        Filme [] filmes = new Filme[2];
        for (int i = 0; i < filmes.length ; i++) {
            filmes[i] = new Filme(JOptionPane.showInputDialog("Informe o nome do diretor: "),JOptionPane.showInputDialog("Informe o nome do filme: "), Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do ingresso: ")));

        }

        filmes[1].setDiretor("Zack Snyder");
        filmes[1].setTitulo("Batman vs Superman: A Origem da Justiça");
        filmes[1].setValorIngresso(47);

        for (int i = 0; i < filmes.length; i++) {
            System.out.println(filmes[i].toString());
        }
    }
}
