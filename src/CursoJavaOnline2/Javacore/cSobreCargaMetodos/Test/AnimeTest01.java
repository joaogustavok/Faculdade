package CursoJavaOnline2.Javacore.cSobreCargaMetodos.Test;

import CursoJavaOnline2.Javacore.cSobreCargaMetodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "Manga",23,"Acao");
        anime.imprime();
    }
}
