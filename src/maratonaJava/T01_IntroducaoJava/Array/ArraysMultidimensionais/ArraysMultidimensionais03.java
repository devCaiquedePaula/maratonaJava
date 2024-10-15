package maratonaJava.T01_IntroducaoJava.Array.ArraysMultidimensionais;

public class ArraysMultidimensionais03 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] intArray = {0, 1, 2, 3, 4};

        // Alocando espaço para cada sub-array
        arrayInt[0] = new int[2];
        arrayInt[1] = intArray;
        arrayInt[2] = new int[6];

        // Atribuindo valores aos elementos
        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-------------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n-------------");
    }
}
