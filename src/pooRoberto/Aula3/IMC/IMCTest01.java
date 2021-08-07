package pooRoberto.Aula3.IMC;

public class IMCTest01 {
    public static void main(String[] args) {
        IMC joao = new IMC();

        joao.altura=1.72;
        joao.peso= 68;

        System.out.println("IMC Calculado: "+ joao.ValorIMC());
        System.out.println(joao.resultado());
    }
}
