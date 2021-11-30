package QuestaoAvaliativaErivelton;

public class BaseBolo {
    private String recheio;
    private String cobertura;
    private int camadas;
    double preco;

    public BaseBolo() {
    }

    public BaseBolo(String recheio, String cobertura, int camadas, double preco) {
        this.recheio = recheio;
        this.cobertura = cobertura;
        this.camadas = camadas;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "BaseBolo{" +
                "recheio='" + recheio + '\'' +
                ", cobertura='" + cobertura + '\'' +
                ", camadas=" + camadas +
                ", preco=" + preco +
                '}';
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public int getCamadas() {
        return camadas;
    }

    public void setCamadas(int camadas) {
        this.camadas = camadas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void comeBolo(){

    }
}
