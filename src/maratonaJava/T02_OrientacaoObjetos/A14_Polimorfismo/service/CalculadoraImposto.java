package maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.service;

import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.domain.Computador;
import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.domain.Produto;
import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calculateTax();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidation());

            /*
            Segunda opção
            * Tomate tomate = (Tomate) produto;
            * System.out.println(((Tomate) produto).getDataValidation());
            *  */
        }
    }
}
