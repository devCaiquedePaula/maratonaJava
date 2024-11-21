package maratonaJava.T02_OrientacaoObjetos.A07_Associacao.test;

import maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("CR7");
        Jogador jogador3 = new Jogador("Vini Jr.");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for ( Jogador jogador : jogadores ) {
            jogador.imprime();
        }
    }
}
