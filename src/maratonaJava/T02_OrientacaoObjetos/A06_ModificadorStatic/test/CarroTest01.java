package maratonaJava.T02_OrientacaoObjetos.A06_ModificadorStatic.test;

import maratonaJava.T02_OrientacaoObjetos.A06_ModificadorStatic.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setLimitVelocity(180);

        Carro carro1 = new Carro("BMW M3 Competition", 280);
        Carro carro2 = new Carro("Mercedes S-Class", 340);
        Carro carro3 = new Carro("Audi RS6", 350);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
