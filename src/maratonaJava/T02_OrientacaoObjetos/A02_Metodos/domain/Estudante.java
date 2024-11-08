package maratonaJava.T02_OrientacaoObjetos.A02_Metodos.domain;

public class Estudante {
    public String name;
    public int age;
    public char gender;

    public  void imprime(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
}
