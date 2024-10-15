package maratonaJava.T01_IntroducaoJava.EstruturasDeRepeticao;

public class EstruturasDeRepeticaoContinue {
    public static void main(String[] args) {
        // Imprima os primeiros 25 números ímpares de 0 a 1.000.000
        for (int i = 1; i < 1000000; i++) {
            if (i % 2 == 0) {
                continue; // Pula para o próximo número caso seja par
            }
            if (i > 25) {
                break; // Encerra o laço quando atingimos o valor máximo
            }
            System.out.println("i = " + i);
        }
    }
}
