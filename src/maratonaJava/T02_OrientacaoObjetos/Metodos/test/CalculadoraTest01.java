package maratonaJava.T02_OrientacaoObjetos.Metodos.test;

import maratonaJava.T02_OrientacaoObjetos.Metodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.sumTwoNumbers();
        System.out.println("--------------------------------");
        calculadora.minusTwoNumbers();
        System.out.println("--------------------------------");
        calculadora.plusTwoNumbers(85,54);

    }
}
