package maratonaJava.T02_OrientacaoObjetos.A02_Metodos.test;

import maratonaJava.T02_OrientacaoObjetos.A02_Metodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(60);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
