package maratonaJava.T02_OrientacaoObjetos.A13_Interfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void loadData() {
        System.out.println("Loading database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing database...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions in the database...");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Retrieving max data size in DataBaseLoader class...");
    }
}
