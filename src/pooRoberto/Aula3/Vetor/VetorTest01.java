package pooRoberto.Aula3.Vetor;

import javax.swing.*;
import java.text.DecimalFormat;

public class VetorTest01 {
    public static void main(String[] args) {
        int num = 2;
        Vetor turma[] = new Vetor[num];
        for (int i = 0; i < num; i++) {
            turma[i] = new Vetor();
        }
        for (int i = 0; i < num; i++) {
            turma[i].nome = JOptionPane.showInputDialog("Digite o nome do aluno: "+(i+1));
            turma[i].nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 do aluno: "+(i+1)));
            turma[i].nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2 do aluno: "+(i+1)));
            turma[i].nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3 do aluno: "+(i+1)));
            turma[i].trabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho do aluno: "+(i+1)));

        }
        DecimalFormat df = new DecimalFormat("##,##");
        double media = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Aluno: "+turma[i].nome+" Media: "+turma[i].calcularMedia());
            turma[i].aprovado();

            double soma = 0;

            soma += turma[i].calcularMedia();
            media = soma / num;
        }
        System.out.println("Media geral: "+df.format(media));
    }
}
