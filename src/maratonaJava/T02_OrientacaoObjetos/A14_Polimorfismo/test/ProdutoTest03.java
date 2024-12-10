package maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.test;

import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.domain.Computador;
import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.domain.Produto;
import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.domain.Tomate;
import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("MacBook", 12000);

        Tomate tomate = new Tomate("Americano", 9.50);
        tomate.setDataValidation("11/12/2024");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
