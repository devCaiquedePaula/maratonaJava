package maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.service;

import maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.repository.Repository;

public class RepositoryDataBase implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in the database");
    }
}
