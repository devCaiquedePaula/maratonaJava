package maratonaJava.T02_OrientacaoObjetos.A09_Sobrescrita.domain;

public class Anime {
    private String name;

    @Override
    public String toString() {
        return "Anime: " + this.name;
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
