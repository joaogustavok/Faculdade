package CursoJavaOnline2.Javacore.gAssociacao.Test;

import CursoJavaOnline2.Javacore.gAssociacao.Dominio.Jogador;
import CursoJavaOnline2.Javacore.gAssociacao.Dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Amanda");
        Time time = new Time("Imundinhos");
        jogador.setTime(time);
        jogador.imprime();
    }
}
