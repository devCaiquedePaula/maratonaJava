package maratonaJava.T02_OrientacaoObjetos.A11_Enum.domain;

public enum TipoPagamento {
    CARTAO_CREDITO {
        @Override
        public double calculateDiscont(double valor) {
            return valor * 0.05;
        }
    },
    PIX {
        @Override
        public double calculateDiscont(double valor) {
            return valor * 0.1;
        }
    };

    public abstract double calculateDiscont(double valor);
}
