package maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.domain;

public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando imposto da Televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
