package maratonaJava.T02_OrientacaoObjetos.A07_Associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        System.out.println("Você digitou o número: " + numero);
        input.close();
        System.out.println("--------------------------------");
    }
}
