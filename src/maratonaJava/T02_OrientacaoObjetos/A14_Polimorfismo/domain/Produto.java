package maratonaJava.T02_OrientacaoObjetos.A14_Polimorfismo.domain;

public abstract class Produto implements Tax {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
