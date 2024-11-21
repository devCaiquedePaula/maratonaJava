package maratonaJava.T02_OrientacaoObjetos.A07_Associacao.test;

import maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain.Jogador;
import maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain.Time;

//Associação Unidirecional um para muitos ( 1 -> N )

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar Jr.");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
