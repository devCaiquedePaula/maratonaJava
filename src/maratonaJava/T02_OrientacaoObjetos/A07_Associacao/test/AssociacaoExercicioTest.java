package maratonaJava.T02_OrientacaoObjetos.A07_Associacao.test;

import maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain.Aluno;
import maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain.Local;
import maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain.Professor;
import maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain.Seminario;

public class AssociacaoExercicioTest {
    public static void main(String[] args) {
        Local local = new Local("Rua Victor Brecheret");
        Aluno aluno = new Aluno("Caique", 26);
        Professor professor = new Professor("Nino", "Cachorro");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Como ser dog", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
