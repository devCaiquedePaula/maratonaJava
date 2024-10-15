package maratonaJava.T02_OrientacaoObjetos.Metodos.domain;

//Class
public class Calculadora {
    //Methods
    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void minusTwoNumbers() {
        System.out.println(21 - 7);
    }

    public void plusTwoNumbers(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    public double divideTwoNumbers(double number01, double number02) {
        if (number02 == 0) {
            return 0;
        }
        return number01 / number02;
    }

    public double divideTwoNumbers02(double number01, double number02) {
        if (number02 != 0) {
            return number01 / number02;
        }
        return 0;
    }

    public void imprimeDivisaoDoisNumeros(double number01, double number02) {
        if (number02 == 0) {
            System.out.println("Não é possível dividir por zero.");
            return;
        }
        System.out.println(number01 / number02);
    }

    public void changeTwoNumbers(int number1, int number2) {
        number1 = 99;
        number2 = 88;
        System.out.println("Dentro do changeTwoNumbers");
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
    }
}
