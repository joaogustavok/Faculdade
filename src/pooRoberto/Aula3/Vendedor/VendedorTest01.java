package pooRoberto.Aula3.Vendedor;

public class VendedorTest01 {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        vendedor.nome="Pedro";
        vendedor.valorVenda=50000;
        vendedor.comissao = 10;
        System.out.println("A comiçao do vendedor: "+vendedor.nome+" é de: "+vendedor.liquido());
    }
}
