package maratonaJava.T02_OrientacaoObjetos.A07_Associacao.test;

import maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain.Jogador;
import maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Messi");
        Jogador jogador2= new Jogador("Emiliano Martinez");
        Time time = new Time("Argentina");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
