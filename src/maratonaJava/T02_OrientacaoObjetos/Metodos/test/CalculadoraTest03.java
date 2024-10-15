package maratonaJava.T02_OrientacaoObjetos.Metodos.test;

import maratonaJava.T02_OrientacaoObjetos.Metodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        int number1 = 1;
        int number2 = 2;

        cal.changeTwoNumbers(number1, number2);

        System.out.println("Dentro do CalculadoraTest03");
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
    }
}
