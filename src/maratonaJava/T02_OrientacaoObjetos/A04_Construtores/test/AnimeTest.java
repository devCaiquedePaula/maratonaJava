package maratonaJava.T02_OrientacaoObjetos.A04_Construtores.test;


import maratonaJava.T02_OrientacaoObjetos.A04_Construtores.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Goku", "Cyber", 12, "A", "FOX");
        anime.imprime();

    }
}
