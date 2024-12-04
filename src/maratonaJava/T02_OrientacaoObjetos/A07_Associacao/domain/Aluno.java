package maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain;

public class Aluno {
    private String name;
    private int age;
    private Seminario seminario;

    public Aluno(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
