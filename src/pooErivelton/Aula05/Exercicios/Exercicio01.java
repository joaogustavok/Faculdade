package pooErivelton.Aula05.Exercicios;

import javax.swing.*;

public class Exercicio01 {

    class concurso{
        int inscricao;
        float altura;
        float peso;
    }

    private concurso[] concurso1 = new concurso[20];
    private int qtde = 0;

    public void leitura(){
        if (qtde == 20) return;
        do {
            concurso1[qtde] = new concurso();
            concurso1[qtde].inscricao = Integer.parseInt(JOptionPane.showInputDialog("-1 Para encerrar \n Digite a inscrição da canditada: "));

        } while (qtde < 20);
    }


}
