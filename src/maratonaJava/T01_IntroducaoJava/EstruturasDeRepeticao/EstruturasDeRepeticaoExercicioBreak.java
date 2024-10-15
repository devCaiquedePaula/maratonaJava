package maratonaJava.T01_IntroducaoJava.EstruturasDeRepeticao;

public class EstruturasDeRepeticaoExercicioBreak {
    // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            } else {
                break; // Encerra o laço quando o valor da parcela é menor que 1000
            }
        }
    }
}
