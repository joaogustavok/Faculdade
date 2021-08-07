package pooRoberto.Aula3.Vendedor;

public class Vendedor {
    String nome;
    double valorVenda,comissao;

    public double valorComissao(){
        return this.valorVenda * (this.comissao /100);
    }
    public double irrf() {
        if (this.valorComissao() <= 1700) {
            return 0;
        } else if (this.valorComissao() <= 3000) {
            return this.valorComissao() * 0.15;
        } else if (this.valorComissao()<=5000){
            return this.valorComissao()*0.2;
        } else {
            return this.valorComissao()*0.275;
        }
    }

    public double liquido(){
        return this.valorComissao()-this.irrf();
    }
}
