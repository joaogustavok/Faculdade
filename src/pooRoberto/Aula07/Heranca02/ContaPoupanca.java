package pooRoberto.Aula07.Heranca02;

public class ContaPoupanca extends Conta{
    private float taxadesaque;


    private float getTaxadesaque(){
        return taxadesaque;
    }

    public void setTaxadesaque(float taxadesaque){
        this.taxadesaque = taxadesaque;
    }

    @Override
    public void saque(double valor){
        super.saque(valor+this.taxadesaque);
    }
}
