package CursoJavaOnline2.Javacore.eBlocosInicializacao.Test;

import CursoJavaOnline2.Javacore.eBlocosInicializacao.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio+" ");
        }

    }
}
