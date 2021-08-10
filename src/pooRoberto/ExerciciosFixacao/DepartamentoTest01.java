package pooRoberto.ExerciciosFixacao;

import javax.swing.*;
import java.util.Scanner;

public class DepartamentoTest01 {
    public static void main(String[] args) {
        Departamento departamento[] = new Departamento[2];

        Funcionario funcionarios[] = new Funcionario[10];

        for (int i = 0; i < departamento.length; i++) {
            departamento[i] = new Departamento();
        }
        for (int i = 0; i < departamento.length; i++) {
            departamento[i].setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o código: ")));
            departamento[i].setNome(JOptionPane.showInputDialog("Insira o nome: "));
        }

        for (int i = 0; i < departamento.length; i++) {
            departamento[i].imprimir();
        }
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = new Funcionario();
        }
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Insira o código: ")));
            funcionarios[i].setNome(JOptionPane.showInputDialog("Insira o nome: "));
        }

        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].imprimir2();
        }

    }
}
