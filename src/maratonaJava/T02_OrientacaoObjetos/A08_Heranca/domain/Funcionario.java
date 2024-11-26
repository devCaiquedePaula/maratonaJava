package maratonaJava.T02_OrientacaoObjetos.A08_Heranca.domain;

public class Funcionario extends Pessoa {
    private double salary;

    static {
        System.out.println("Dentro do bloco de inicialização estatico de funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + salary);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
