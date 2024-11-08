package maratonaJava.T02_OrientacaoObjetos.A02_Metodos.test;

import maratonaJava.T02_OrientacaoObjetos.A02_Metodos.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        Calculadora cal2 = new Calculadora();

        int result = (int) cal.divideTwoNumbers(20, 2);
        System.out.println(result);

        int result2 = (int) cal2.divideTwoNumbers02(20, 2);
        System.out.println(result2);

        cal.imprimeDivisaoDoisNumeros(55,0F);
    }
}
