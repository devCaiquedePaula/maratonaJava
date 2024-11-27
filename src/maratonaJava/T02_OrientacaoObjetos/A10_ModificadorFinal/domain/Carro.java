package maratonaJava.T02_OrientacaoObjetos.A10_ModificadorFinal.domain;

public class Carro {
    private String name;
    //CONSTANTE
    public static final double LIMIT_VELOCITY = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
