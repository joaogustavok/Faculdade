package CursoJavaOnline2.Javacore.nPolimorfirsmo.Dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.22;
    public Tomate(String nome, double valor) {
        super(nome, valor);


    }

    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }
    }

