package maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain;

public class Jogador {
    private String name;

    //CONSTRUCTOR
    public Jogador(String name) {
        this.name = name;
    }

    //GETTER and SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
