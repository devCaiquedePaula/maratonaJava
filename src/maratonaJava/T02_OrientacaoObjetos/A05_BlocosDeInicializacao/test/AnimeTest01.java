package maratonaJava.T02_OrientacaoObjetos.A05_BlocosDeInicializacao.test;

import maratonaJava.T02_OrientacaoObjetos.A05_BlocosDeInicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        for (int episodio : anime.getEpisodes()) {
            System.out.print(episodio + " ");

        }
    }
}
