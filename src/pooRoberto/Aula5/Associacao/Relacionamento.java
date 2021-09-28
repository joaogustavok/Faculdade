package pooRoberto.Aula5.Associacao;

public class Relacionamento {
    public static void main(String[] args) {
        Marido marido = new Marido();
        Mulher mulher = new Mulher();

        marido.setNome("João");
        mulher.setNome("Cleusa");

        marido.setMulher(mulher);
        mulher.setMarido(marido);

        System.out.println(mulher);
        System.out.println(marido);
    }
}
