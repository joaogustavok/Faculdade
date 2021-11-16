package pooErivelton.Aula08;

public class Main {
    public static void main(String[] args) {
        System.out.println("Polimorfismo");
        Mamifero mamifero1 = new Elefante();
        System.out.println("Cota diaria de leite do elefante: "+mamifero1.obterCotaDiariaLeite());

        Mamifero mamifero2 = new Rato();

        System.out.println("Cota diaria de leite do rato: "+mamifero2.obterCotaDiariaLeite());
    }
}

