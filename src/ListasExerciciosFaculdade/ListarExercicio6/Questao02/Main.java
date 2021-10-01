package ListasExerciciosFaculdade.ListarExercicio6.Questao02;

import java.util.Scanner;
// João Gustavo Kmiecik e Daniel Kondlatsch
public class Main {
    public static void main(String[] args) {
        Estacionamento[] estacionamento = new  Estacionamento[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < estacionamento.length; i++) {
            estacionamento[i] = new Estacionamento();
            System.out.println("Informe a hora de entrada do carro "+(i+1));
            estacionamento[i].setHoraEntrada(scanner.nextInt());
            System.out.println("Informe a hora de saida "+(i+1));
            estacionamento[i].setHoraSaida(scanner.nextInt());
        }
        for (int i = 0; i < estacionamento.length; i++) {
            System.out.println("Carro: "+(i+1)+" Pagou: "+estacionamento[i].calculaValor());
        }
    }
}
