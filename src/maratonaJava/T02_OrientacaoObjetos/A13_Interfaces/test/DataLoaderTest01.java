package maratonaJava.T02_OrientacaoObjetos.A13_Interfaces.test;

import maratonaJava.T02_OrientacaoObjetos.A13_Interfaces.domain.DataBaseLoader;
import maratonaJava.T02_OrientacaoObjetos.A13_Interfaces.domain.DataLoader;
import maratonaJava.T02_OrientacaoObjetos.A13_Interfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.loadData();
        fileLoader.loadData();
        System.out.println("--------------------------------");
        dataBaseLoader.remove();
        fileLoader.remove();
        System.out.println("--------------------------------");
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
        System.out.println("--------------------------------");
        DataBaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();
    }
}
