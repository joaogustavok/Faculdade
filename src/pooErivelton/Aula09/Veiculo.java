package pooErivelton.Aula09;

public class Veiculo {
    private String modelo;
    private float velocidade;
    private int passageiros;
    private float combustivel;

    public Veiculo(String modelo, float velocidade, int passageiros, float combustivel) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.passageiros = passageiros;
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public float getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(float combustivel) {
        this.combustivel = combustivel;
    }

    public void acelera(){
        System.out.println("acelerando");
    }

    public  void freia(){
        System.out.println("Freiando");
    }}

class Carro extends Veiculo{
    private int marcha;

    public Carro(String modelo, float velocidade, int passageiros, float combustivel, int marcha) {
        super(modelo, velocidade, passageiros, combustivel);
        this.marcha = marcha;
    }

    public void setVelocidade(float velocidade) {
        velocidade = velocidade;
        if ( velocidade<20){
            marcha = 1;
        }
        if (velocidade >20 && velocidade<40){
            marcha = 2;
        }
        if (velocidade >40 && velocidade<60){
            marcha = 3;
        }
        if (velocidade >60 ){
            marcha = 4;
        }}

    public static void main(String[] args) {
        Carro carro = new Carro("Corsa",60,2,10,2);

    }
}