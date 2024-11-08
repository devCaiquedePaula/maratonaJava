package maratonaJava.T02_OrientacaoObjetos.A01_IntroducaoClasses.test;

import maratonaJava.T02_OrientacaoObjetos.A01_IntroducaoClasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();

        //Atributos
        student.name = "Luffy";
        student.age = 20;
        student.gender = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
