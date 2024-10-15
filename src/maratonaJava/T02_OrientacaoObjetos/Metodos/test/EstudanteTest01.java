package maratonaJava.T02_OrientacaoObjetos.Metodos.test;

import maratonaJava.T02_OrientacaoObjetos.Metodos.domain.Estudante;
import maratonaJava.T02_OrientacaoObjetos.Metodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impress = new ImpressoraEstudante();

        estudante01.name = "João";
        estudante01.age = 18;
        estudante01.gender = 'M';

        estudante02.name = "Maria";
        estudante02.age = 18;
        estudante02.gender = 'F';

        impress.imprimirEstudante(estudante01);
        impress.imprimirEstudante(estudante02);
    }
}
