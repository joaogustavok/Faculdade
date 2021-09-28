package pooRoberto.Aula07.Heranca05;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();
        System.out.println("Ingresso: "+ingresso.imprimeValor());

        Vip vip = new Vip();
        System.out.println("Ingresso VIP: "+vip.imprimeValor());

        Normal normal = new Normal();
        normal.imprime();

        CamaroteInferior camaroteInferior = new CamaroteInferior();
        camaroteInferior.setLocalizacao("Parte inferior");
        camaroteInferior.imprimirLocalizacao();

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
        System.out.println("Ingresso VIP Camarote Superior: "+camaroteSuperior.imprimeValor());
    }
}
