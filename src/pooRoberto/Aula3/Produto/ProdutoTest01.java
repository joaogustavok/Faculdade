package pooRoberto.Aula3.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome ="Limão";
        produto.valorOriginal= 2;
        produto.aumento=50;
        produto.calcular();
        produto.mostrar();
    }
}
