package maratonaJava.T02_OrientacaoObjetos.A06_ModificadorStatic.domain;

public class Carro {
    private String name;
    private double maxVelocity;
    // modificador de acesso static faz o atributo pertencer a classe e todos os objetos vão compartilhar do mesmo valor
    private static double limitVelocity = 250;

    public Carro(String name, double maxVelocity) {
        this.name = name;
        this.maxVelocity = maxVelocity;
    }

    public void imprime(){
        System.out.println("---------------------");
        System.out.println("Nome: " + this.name);
        System.out.println("Velocidade máxima: " + this.maxVelocity);
        System.out.println("Velocidade limite: " + Carro.limitVelocity);
    }

    //Metodo estatico
    public static void setLimitVelocity(double limitVelocity){
        Carro.limitVelocity = limitVelocity;
    }

    public static double getLimitVelocity(){
        return Carro.limitVelocity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }
}
