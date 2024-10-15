package maratonaJava.T02_OrientacaoObjetos.IntroducaoClasses.test;

import maratonaJava.T02_OrientacaoObjetos.IntroducaoClasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carOne = new Carro();
        Carro carTwo = new Carro();

        carOne.name = "Mustang";
        carOne.model = "GT FastBack";
        carOne.year = 1968;
        System.out.println(carOne.name + "\n" + carOne.model + "\n" + carOne.year);

        System.out.println("--------------------------------");

        carTwo.name = "Chevrolet";
        carTwo.model = "Corvette";
        carTwo.year = 1965;
        System.out.println(carTwo.name + "\n" + carTwo.model + "\n" + carTwo.year);

        System.out.println("--------------------------------");


    }
}
