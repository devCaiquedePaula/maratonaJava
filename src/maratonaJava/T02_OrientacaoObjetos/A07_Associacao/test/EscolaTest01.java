package maratonaJava.T02_OrientacaoObjetos.A07_Associacao.test;

import maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain.Escola;
import maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain.Professor;

//Associação unidirecional muitos para um ( N -> 1 )

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("kakashi");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Escola de Konoha", professores);

        escola.imprime();
    }
}
