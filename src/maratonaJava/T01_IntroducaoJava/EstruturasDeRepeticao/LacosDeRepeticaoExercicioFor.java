package maratonaJava.T01_IntroducaoJava.EstruturasDeRepeticao;

public class LacosDeRepeticaoExercicioFor {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 a 1.000.000
        for (int i = 1; i <1000000; i++){
            if (i % 2 == 0) {
                System.out.println("O número " + i + " é par");
            }
        }
    }
}
