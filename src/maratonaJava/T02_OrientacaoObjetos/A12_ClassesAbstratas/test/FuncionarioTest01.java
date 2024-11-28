package maratonaJava.T02_OrientacaoObjetos.A12_ClassesAbstratas.test;

import maratonaJava.T02_OrientacaoObjetos.A12_ClassesAbstratas.domain.Desenvolvedor;
import maratonaJava.T02_OrientacaoObjetos.A12_ClassesAbstratas.domain.Funcionario;
import maratonaJava.T02_OrientacaoObjetos.A12_ClassesAbstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);

        Desenvolvedor dev = new Desenvolvedor("Caique", 3500);
        System.out.println(dev);
    }
}
