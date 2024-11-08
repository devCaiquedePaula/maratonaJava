package maratonaJava.T02_OrientacaoObjetos.A04_Construtores.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String gender;
    private String studio;

    //CONSTRUCTOR - Necessario um constructor para dar origem a um object
    // Não existe construtor com VOID, se tiver é metodo
    public Anime(String name, String type, int episodes, String gender){
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }

    public Anime(String name, String type, int episodes, String gender, String studio){
        // THIS sempre deve ser a primeira linha de comando no construtor
        this(name, type, episodes, gender);
        this.studio = studio;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime(){
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
