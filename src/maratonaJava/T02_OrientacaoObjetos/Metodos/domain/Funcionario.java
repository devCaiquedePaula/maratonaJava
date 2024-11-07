package maratonaJava.T02_OrientacaoObjetos.Metodos.domain;

public class Funcionario {
    private String name;
    private int age;
    private double[] salarys;
    private double media;

    public void imprimeDados() {
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        if (salarys != null) {
            for (double salary : salarys) {
                System.out.print(salary + " ");
            }
        }
        mediaDados();
    }

    public void mediaDados() {
        if (salarys == null) {
            return;
        }

        for (double salary : salarys) {
            media += salary;
        }
        media /= salarys.length;
        System.out.println("\nMédia salarial: " + media);
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalarys() {
        return salarys;
    }

    public void setSalarys(double[] salarys) {
        this.salarys = salarys;
    }

    public double getMedia() {
        return media;
    }
}
