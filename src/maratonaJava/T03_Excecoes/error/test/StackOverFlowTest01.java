package maratonaJava.T03_Excecoes.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursiveMethod();
    }

    public static void recursiveMethod() {
        recursiveMethod();
    }
}
