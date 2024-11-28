package maratonaJava.T02_OrientacaoObjetos.A11_Enum.test;

import maratonaJava.T02_OrientacaoObjetos.A11_Enum.domain.Cliente;
import maratonaJava.T02_OrientacaoObjetos.A11_Enum.domain.TipoCliente;
import maratonaJava.T02_OrientacaoObjetos.A11_Enum.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Caique", TipoCliente.PESSOA_FISICA, TipoPagamento.PIX);
        Cliente cliente4 = new Cliente("Danniella", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CARTAO_CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente4);

        System.out.println("Valor do desconto: R$ " + TipoPagamento.PIX.calculateDiscont(100));
        System.out.println("Valor do desconto: R$ " + TipoPagamento.CARTAO_CREDITO.calculateDiscont(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
