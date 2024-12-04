package maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain;

public class Professor {
    private String name;
    private String specialized;
    private Seminario[] seminarios;

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, String specialized) {
        this.name = name;
        this.specialized = specialized;
    }

    public Professor(String name, String specialized, Seminario[] seminarios) {
        this.name = name;
        this.specialized = specialized;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("---------------");
        System.out.println("Professor: " + this.name);
        System.out.println("---------------");
        if (this.seminarios == null) return;
        System.out.println("## Seminarios cadastrado ##");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitle());
            System.out.println(seminario.getLocal().getAddress());
            if (seminario.getAlunos() == null) continue;
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getName() + "\nIdade: " + aluno.getAge());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
