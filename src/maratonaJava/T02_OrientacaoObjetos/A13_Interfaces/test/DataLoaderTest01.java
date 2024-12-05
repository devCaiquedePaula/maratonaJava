package maratonaJava.T02_OrientacaoObjetos.A13_Interfaces.test;

import maratonaJava.T02_OrientacaoObjetos.A13_Interfaces.domain.DataBaseLoader;
import maratonaJava.T02_OrientacaoObjetos.A13_Interfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.loadData();
        fileLoader.loadData();
    }
}
