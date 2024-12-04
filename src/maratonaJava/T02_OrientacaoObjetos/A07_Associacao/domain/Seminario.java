package maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain;

public class Seminario {
    private String title;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String title) {
        this.title = title;
    }

    public Seminario(String title, Aluno[] alunos) {
        this.title = title;
        this.alunos = alunos;
    }

    public Seminario(String title, Aluno[] alunos, Local local) {
        this.title = title;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
