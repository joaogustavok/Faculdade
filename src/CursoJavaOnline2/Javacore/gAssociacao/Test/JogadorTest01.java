package CursoJavaOnline2.Javacore.gAssociacao.Test;

import CursoJavaOnline2.Javacore.gAssociacao.Dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Amanda");
        Jogador jogador3 = new Jogador("jao");
        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
