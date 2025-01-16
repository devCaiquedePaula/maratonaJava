package maratonaJava.T03_Excecoes.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //CHECKED & UNCHECKED
        int[] array = {1, 2, 3};
        System.out.println(array[4]); // IndexOutOfBoundsException

        Object object = null;
        System.out.println(object.toString()); //NullPointerException

    }
}
