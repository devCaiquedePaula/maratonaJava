package maratonaJava.T02_OrientacaoObjetos.A08_Heranca.domain;

public class Funcionario extends Pessoa {
    private double salary;

    public double getSalary(int i) {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
