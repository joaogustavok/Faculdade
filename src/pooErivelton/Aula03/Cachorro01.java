package pooErivelton.Aula03;

public class Cachorro01 {
    public int tamanho;
    public String nome;


    public void latir(){
        if (this.tamanho > 60){
            System.out.println("Latido Grosso");
        } else if (this.tamanho > 14){
            System.out.println("Latido Medio");
        } else {
            System.out.println("Latido Fino");
        }
    }
}
