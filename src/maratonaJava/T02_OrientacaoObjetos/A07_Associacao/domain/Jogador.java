package maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain;

public class Jogador {
    private String name;
    private Time time;

    public void imprime() {
        System.out.println(this.name);
        if (time != null){
            System.out.println(time.getName());
        }
    }

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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
