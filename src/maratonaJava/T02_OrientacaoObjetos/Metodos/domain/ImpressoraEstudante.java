package maratonaJava.T02_OrientacaoObjetos.Metodos.domain;

public class ImpressoraEstudante {
    public void imprimirEstudante(Estudante estudante) {
        System.out.println("--------------------------------");
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
    }
}
