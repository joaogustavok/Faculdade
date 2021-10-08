package pooErivelton.ListaExercicio2;

import java.util.Scanner;

class Lutador{
    private String nome;
    private double peso;

    public Lutador() {
    }

    public Lutador(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String retornaPeso(){
        if (peso<=56.7){
            return "Lutador: "+nome + "\n Peso Mosca: "+peso +"kg";
        } else if (){

        }
        return "Resultado Incerto";
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

public class Questao03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade: ");
        int quantidade = ler.nextInt();
    }
}
