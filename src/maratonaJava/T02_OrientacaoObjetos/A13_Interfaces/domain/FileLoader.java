package maratonaJava.T02_OrientacaoObjetos.A13_Interfaces.domain;

public class FileLoader implements DataLoader{
    @Override
    public void loadData() {
        System.out.println("Loading file data...");
    }
}
