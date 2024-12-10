package maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.test;

import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.repository.Repository;
import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.service.RepositoryDataBase;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repository repository = new RepositoryDataBase();
        repository.save();
    }
}
