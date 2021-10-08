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
        } else if (peso>56.7 && peso<=61.2){
            return "Lutador: "+nome + "\n Peso Galo: "+peso +"kg";
        }else if (peso>61.7 && peso<=65.7){
            return "Lutador: "+nome + "\n Peso Pena: "+peso +"kg";
        } else if (peso>65.7 && peso<=70.3){
            return "Lutador: "+nome + "\n Peso Leve: "+peso +"kg";
        } else if (peso>70.3 && peso<=77.1){
            return "Lutador: "+nome + "\n Peso Meio-Médio: "+peso +"kg";
        } else if (peso>77.1 && peso<=83.9){
            return "Lutador: "+nome + "\n Peso Médio: "+peso +"kg";
        } else if (peso>83.9 && peso<=92.9){
            return "Lutador: "+nome + "\n Peso Meio-Pesado: "+peso +"kg";
        } else if (peso>92.9 && peso<=120.2){
            return "Lutador: "+nome + "\n Peso Pesado: "+peso +"kg";
        } else if (peso>120.2){
            return "Lutador: "+nome + "\n Peso Superpesado: "+peso +"kg";
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
        Lutador lutador[] = new Lutador[quantidade];

        for (int i = 0; i < lutador.length; i++) {
            lutador[i] = new Lutador();
            System.out.println("Informe o nome do lutador "+(i+1));
            lutador[i].setNome(ler.next());
            System.out.println("Informe o peso do lutador "+(i+1)+ " em kg");
            lutador[i].setPeso(ler.nextDouble());

        }
        for (int i = 0; i < lutador.length; i++) {
            System.out.println(lutador[i].retornaPeso());
        }
    }
}
