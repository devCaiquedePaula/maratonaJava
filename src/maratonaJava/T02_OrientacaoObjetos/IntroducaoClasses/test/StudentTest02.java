package maratonaJava.T02_OrientacaoObjetos.IntroducaoClasses.test;

import maratonaJava.T02_OrientacaoObjetos.IntroducaoClasses.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
        System.out.println(student.registration);

    }
}
