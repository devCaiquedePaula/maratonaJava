package maratonaJava.T02_OrientacaoObjetos.A13_Interfaces.domain;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;
    void loadData();

    default void checkPermission() {
        System.out.println("Checking permission...");
    }

    static void retrieveMaxDataSize(){
        System.out.println("Retrieving max data size in DataLoader interface...");
    }
}
