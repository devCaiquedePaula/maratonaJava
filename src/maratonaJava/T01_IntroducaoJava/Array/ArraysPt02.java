package maratonaJava.T01_IntroducaoJava.Array;

public class ArraysPt02 {
    public static void main(String[] args) {
        // boot pattern:
        // byte, short, int, long, float & double -> 0
        // char '\u0000' -> represent a blank character
        // boolean -> false
        // string -> null

        // iteration over arrays:
        String[] names = new String[3];
        names[0] = "Sita Tesfaye";
        names[1] = "Elisabeth Hamid";
        names[2] = "Hector Ramadan";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
