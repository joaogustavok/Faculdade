package pooErivelton.Aula06.Exercicio02;

import javax.swing.*;

class Produto{
    private String descricao;
    private double valorCusto;
    private double valorVenda;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        if (valorCusto <= this.valorVenda){
            System.out.println("Preco de venda nao pode ser menor q o preco de custo");

        } else {
            this.valorVenda = valorVenda;
        }
    }

    public String imprimirRelatorio(){
        if (valorVenda <= valorCusto){
            return "O preço de venda nao pode ser menor que o preco de custo!!! \n" + "Valor Custo: "+valorCusto + " Valor Venda: "+valorVenda;

        }
        return descricao + "\n Preço Venda: " + valorVenda + "\n Preço Custo: "+ valorCusto + "\nO percentual de lucro é:"+ (valorVenda/valorCusto *100 - 100);
    }


}
public class CalculaProduto {
    public static void main(String[] args) {
        int quant = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos produtos quer cadastrar: "));
        Produto produto[] = new Produto[quant];
        ler(produto);
    }

        public static void ler (Produto produto[]){
            for (int i = 0; i < produto.length; i++) {
                produto[i] = new Produto();
                produto[i].setDescricao(JOptionPane.showInputDialog("Informe uma descricao:"));
                produto[i].setValorCusto(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço de custo")));
                produto[i].setValorVenda(Double.parseDouble(JOptionPane.showInputDialog("Informe o preco de Venda")));
                JOptionPane.showMessageDialog(null,produto[i].imprimirRelatorio());
            }
        }
    }

