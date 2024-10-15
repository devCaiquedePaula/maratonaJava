package maratonaJava.T01_IntroducaoJava.EstruturasDeRepeticao;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        // Laço For - É ideal quando você sabe de antemão quantas vezes o laço deve ser executado.
        // Para cada iteração, incrementa o contador e imprime o valor.
        // Inicializa-o em 0, verifica se é menor que 10, e se for verdade, incrementa-o.
        // Quando o contador chega a 10, o laço é encerrado.
        for (int i = 0; i < 10; i++) {
            System.out.println("Laço For: " + i);
        }

        // Laço While - Executa o comando e continuará rodando enquanto uma condição for verdadeira.
        // A condição é verificada antes de cada iteração.
        // Se a condição for falsa, o laço é encerrado.
        int l = 0;
        while (l < 10) {
            System.out.println("Laço While: " + l);
            l++;
        }

        // Laço Do-While - Executa pelo menos uma vez, mesmo que a condição seja falsa
        // A condição é verificada antes de cada iteração.
        // Se a condição for falsa, o laço é encerrado.
        int m = 0;
        do {
            System.out.println("Laço Do-While: " + m);
            m++;
        } while (m < 10);
    }
}
