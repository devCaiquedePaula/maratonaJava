package maratonaJava.T02_OrientacaoObjetos.A03_SobrecargaMetodos.test;

import maratonaJava.T02_OrientacaoObjetos.A03_SobrecargaMetodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init2("Akudama Driver", "TV", 12, "Ação");
        anime.imprime();
    }
}
