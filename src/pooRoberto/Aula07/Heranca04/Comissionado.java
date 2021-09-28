package pooRoberto.Aula07.Heranca04;

public class Comissionado extends Empregado{
    private double totalVenda;
    private int taxaComissao;

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public int getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(int taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double vencimento(){
        return (this.taxaComissao*100) /totalVenda;
    }

}
