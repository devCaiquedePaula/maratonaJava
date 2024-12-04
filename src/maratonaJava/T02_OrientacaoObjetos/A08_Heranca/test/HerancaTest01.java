package maratonaJava.T02_OrientacaoObjetos.A08_Heranca.test;

import maratonaJava.T02_OrientacaoObjetos.A08_Heranca.domain.Endereco;
import maratonaJava.T02_OrientacaoObjetos.A08_Heranca.domain.Funcionario;
import maratonaJava.T02_OrientacaoObjetos.A08_Heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 7");
        endereco.setCep("\nCEP: 06026000");

        Pessoa pessoa = new Pessoa("Jiraya");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("-----------------");

        Funcionario funcionario = new Funcionario("Naruto");
        funcionario.setCpf("22222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalary(20000);

        funcionario.imprime();
        funcionario.relatorioPagamento();
        System.out.println("-----------------");
    }
}
