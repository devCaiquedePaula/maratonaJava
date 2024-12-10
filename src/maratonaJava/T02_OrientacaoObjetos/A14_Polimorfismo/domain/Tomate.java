package maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.domain;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String dataValidation;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidation() {
        return dataValidation;
    }

    public void setDataValidation(String dataValidation) {
        this.dataValidation = dataValidation;
    }
}
