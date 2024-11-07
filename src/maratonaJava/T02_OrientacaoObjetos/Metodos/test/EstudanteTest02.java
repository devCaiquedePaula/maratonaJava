package maratonaJava.T02_OrientacaoObjetos.Metodos.test;

import maratonaJava.T02_OrientacaoObjetos.Metodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.name = "João";
        estudante01.age = 18;
        estudante01.gender = 'M';

        estudante02.name = "Maria";
        estudante02.age = 18;
        estudante02.gender = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
