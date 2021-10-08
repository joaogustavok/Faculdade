package pooErivelton.ListaExercicio2;

import javax.swing.*;

class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    private String calcularTriangulo() {
        if (this.ladoA != this.ladoB && this.ladoA != ladoC && this.ladoB != ladoC) {
            return "Triângulo Escaleno ";
        } else if (this.ladoA == this.ladoB && this.ladoA == this.ladoC) {
            return "Triângulo Equilatero";
        } else if (this.ladoA == this.ladoB || this.ladoB == this.ladoC) {
            return "Triângulo Isósceles";
        }
        return "Erro ao identificar triangulo";
    }
    public void ler() {
        Triangulo triangulo = new Triangulo();
        triangulo.setLadoA(Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do lado A: ")));
        triangulo.setLadoB(Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do lado B: ")));
        triangulo.setLadoC(Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do lado C: ")));
        JOptionPane.showMessageDialog(null, triangulo.calcularTriangulo());
    }

}

public class Questao02 {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.ler();
    }
}
