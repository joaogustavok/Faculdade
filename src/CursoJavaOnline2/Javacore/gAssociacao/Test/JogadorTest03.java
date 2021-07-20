package CursoJavaOnline2.Javacore.gAssociacao.Test;

import CursoJavaOnline2.Javacore.gAssociacao.Dominio.Jogador;
import CursoJavaOnline2.Javacore.gAssociacao.Dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Amnanda");
        Jogador jogador2 = new Jogador("Pedraa");
        Time time = new Time("Argentina");
        jogador.setTime(time);
        jogador2.setTime(time);

        Jogador [] jogadores = {jogador,jogador2};
        time.setJogadores(jogadores);
        System.out.println("--- Jogador ---");
        jogador.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
