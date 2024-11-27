package maratonaJava.T02_OrientacaoObjetos.A10_ModificadorFinal.test;

import maratonaJava.T02_OrientacaoObjetos.A10_ModificadorFinal.domain.Carro;
import maratonaJava.T02_OrientacaoObjetos.A10_ModificadorFinal.domain.Civic;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro car = new Carro();

        System.out.println(Carro.LIMIT_VELOCITY);
        System.out.println(car.COMPRADOR);
        car.COMPRADOR.setName("test");
        System.out.println(car.COMPRADOR);

        Civic civic = new Civic();
        civic.setName("test2");
        civic.imprime();
    }
}
