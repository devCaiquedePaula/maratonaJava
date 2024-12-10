package maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.test;

import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.domain.Computador;
import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.domain.Produto;
import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("MacBook", 12000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calculateTax());

        System.out.println("--------------------------------");

        Produto produto2 =  new Tomate("Americano", 9.50);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calculateTax());
    }
}
