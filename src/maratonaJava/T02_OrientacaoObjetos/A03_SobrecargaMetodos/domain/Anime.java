package maratonaJava.T02_OrientacaoObjetos.A03_SobrecargaMetodos.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String gender;

    public void init(String name, String type, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    public void init2(String name, String type, int episodes, String gender) {
        this.init(name, type, episodes);
        this.gender = gender;
    }

    public void imprime() {
        System.out.println("Nome: " + this.name);
        System.out.println("Tipo: " + this.type);
        System.out.println("Episódios: " + this.episodes);
        System.out.println("Gênero: " + this.gender);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return this.episodes;
    }
}
