package maratonaJava.T03_Excecoes.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static  void criarNovoArquivo(){
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException e) {
            System.err.println("Erro ao tentar criar o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
