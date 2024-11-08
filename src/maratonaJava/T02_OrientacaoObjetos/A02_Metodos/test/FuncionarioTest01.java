package maratonaJava.T02_OrientacaoObjetos.A02_Metodos.test;

import maratonaJava.T02_OrientacaoObjetos.A02_Metodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setName("Luffy");
        funcionario.setAge(20);
        funcionario.setSalarys(new double[]{10500.0, 15150.30, 21000.0});

        funcionario.imprimeDados();
    }
}
