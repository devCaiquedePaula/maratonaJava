package maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.test;

import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.domain.Computador;
import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.domain.Televisao;
import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.domain.Tomate;
import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Avell ION a70", 8100);
        Tomate tomate = new Tomate("Tomate Cereja", 3);
        Televisao tv = new Televisao("Samsung UHD 50\" ", 6000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
