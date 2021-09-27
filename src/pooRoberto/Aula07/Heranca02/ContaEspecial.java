package pooRoberto.Aula07.Heranca02;

public class ContaEspecial extends Conta {
    private double limiteespecial = this.getSaldo() * 2;

    public double getLimiteespecial() {
        return limiteespecial;
    }

}
