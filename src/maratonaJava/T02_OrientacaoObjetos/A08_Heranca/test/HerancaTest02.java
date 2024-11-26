package maratonaJava.T02_OrientacaoObjetos.A08_Heranca.test;

import maratonaJava.T02_OrientacaoObjetos.A08_Heranca.domain.Funcionario;

public class HerancaTest02 {
    /*
    * 0 - Bloco de inicialização estatico da super classe é executado quando a JVM carregar a classe pai
    * 1 - Bloco de inicialização estatico da sub classe é executado quando a JVM carregar classe filha
    * 2 - Alocado espaço em memoria pro objeto da classe pai (superclasse)
    * 3 - Cada atributo da superclasse é criado e inicializado com valorers default ou o que for passado da classe pai
    * 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    * 5 - Construtor é executado da superclasse
    * 6 - Alocado espaço de memoria pro objeto da subclasse
    * 7 - Cada atributo da subclasse é criado e inicializado com valorers default ou o que for passado da classe pai
    * 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    * 9 - Construtor é executado da subclasse
    * */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("test");
    }
}
