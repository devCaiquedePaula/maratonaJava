package maratonaJava.T02_OrientacaoObjetos.A12_ClassesAbstratas.domain;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
