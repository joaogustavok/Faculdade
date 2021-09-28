package ListasExerciciosFaculdade.ListaExercico5.Biblioteca;

public class Livro {
    private String nome;
    private String autor;
    private String editora;
    private Biblioteca biblioteca;

    public Livro(String nome, String autor, String editora, Biblioteca biblioteca) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.biblioteca = biblioteca;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", biblioteca=" + biblioteca.getNome() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
}
