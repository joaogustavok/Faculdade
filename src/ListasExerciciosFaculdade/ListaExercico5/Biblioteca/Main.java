package ListasExerciciosFaculdade.ListaExercico5.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca01 = new Biblioteca("Municipal","America",100);
        Biblioteca biblioteca02 = new Biblioteca("Estadual","Avengers",200);
        Livro livro01 = new Livro("Java","Roger","Cultura",biblioteca01);
        Livro livro02 = new Livro("Phython","Pedro","UNC",biblioteca02);

        System.out.println(livro02.toString());
        System.out.println("--");
        System.out.println(livro01.toString());
    }
}
