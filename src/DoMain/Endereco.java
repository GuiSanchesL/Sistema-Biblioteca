package DoMain;

public class Endereco {
    private String rua;
    private String cidade;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Endereco(String cidade, String rua) {
        this.cidade = cidade;
        this.rua = rua;
    }
}
