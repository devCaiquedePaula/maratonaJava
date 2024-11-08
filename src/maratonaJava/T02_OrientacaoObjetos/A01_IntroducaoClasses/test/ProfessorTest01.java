package maratonaJava.T02_OrientacaoObjetos.A01_IntroducaoClasses.test;

import maratonaJava.T02_OrientacaoObjetos.A01_IntroducaoClasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Mr Thomas";
        professor.age = 45;
        professor.gender = 'M';
        professor.subject = "Mathematics";
        professor.salary = 5000.0;

        System.out.println("Nome: " + professor.name + "\nIdade: " + professor.age + "\nSexo: " + professor.gender + "\nMatéria: " + professor.subject + "\nSalario: " + professor.salary);
    }
}
