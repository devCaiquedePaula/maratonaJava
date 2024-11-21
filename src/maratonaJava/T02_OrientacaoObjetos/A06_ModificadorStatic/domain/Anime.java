package maratonaJava.T02_OrientacaoObjetos.A06_ModificadorStatic.domain;

/**
 * 0) Bloco de inicialização é executado quando a JVM carregar a classe <br>
 * 1) Alocado espaço em memória para o objeto <br>
 * 2) Cada atributo da classe é criado e inicializado com valores default ou o que for passado <br>
 * 3) Bloco de inicialização é executado <br>
 * 4) Construtor é executado <br>
 * */

public class Anime {
    private String name;
    private static int[] episodes;

    //bloco de inicialização estatico
    static {
        System.out.println("Bloco de inicialização da classe Anime");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
