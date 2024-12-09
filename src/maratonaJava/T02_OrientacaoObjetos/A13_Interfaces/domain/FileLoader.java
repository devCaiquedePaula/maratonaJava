package maratonaJava.T02_OrientacaoObjetos.A13_Interfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void loadData() {
        System.out.println("Loading file data...");
    }

    @Override
    public void remove() {
        System.out.println("Removing file data...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions in the file...");
    }
}
