package maratonaJava.T01_IntroducaoJava.Array;

public class ArraysPt03 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        int[] numbers3 = new int[]{1, 2, 3, 4, 5};

        //com indices
        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
        }
        //sem indices
        for(int num : numbers3){
            System.out.println(num);
        }
    }
}
