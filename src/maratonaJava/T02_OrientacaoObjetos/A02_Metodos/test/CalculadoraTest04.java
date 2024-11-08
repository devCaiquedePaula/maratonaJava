package maratonaJava.T02_OrientacaoObjetos.A02_Metodos.test;

import maratonaJava.T02_OrientacaoObjetos.A02_Metodos.domain.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculator = new Calculadora();
        int[] numbers = {1,2,3,4,5};
        calculator.sumArrays(numbers);
        calculator.sumVarArgs(1,2,3,4,5,6);
    }
}
