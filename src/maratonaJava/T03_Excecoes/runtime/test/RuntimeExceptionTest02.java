package maratonaJava.T03_Excecoes.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(2, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param a qualquer numero positivo 
     * @param b não pode ser Zero
     * @throws IllegalArgumentException caso B seja Zero
     */

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida!");
        }
        return a/b;
    }
}
