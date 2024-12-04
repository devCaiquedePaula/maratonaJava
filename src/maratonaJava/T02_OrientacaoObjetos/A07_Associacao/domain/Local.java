package maratonaJava.T02_OrientacaoObjetos.A07_Associacao.domain;

public class Local {
    private String address;

    public Local(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
