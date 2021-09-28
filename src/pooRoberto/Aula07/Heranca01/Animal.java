package pooRoberto.Aula07.Heranca01;

public class Animal {
    private String raca;
    private String peso;

    public void dormir(){
        System.out.println("ZZZzzzZZZZ");
    }

    public void fazerBarulho(){
        System.out.println("kkk");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}
