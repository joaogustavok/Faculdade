package pooRoberto.Aula3.Vetor;

public class Vetor {
    String nome;
    double nota1,nota2,nota3,trabalho;

    public  double calcularMedia(){

        return (((nota1+nota2+nota3)/3)*0.7)+(trabalho*0.3);
    }
    public void aprovado(){
        if (this.calcularMedia()>=6){
            System.out.println("Aprovado");
        } else{
            System.out.println("Reprovado");
        }
    }
}
