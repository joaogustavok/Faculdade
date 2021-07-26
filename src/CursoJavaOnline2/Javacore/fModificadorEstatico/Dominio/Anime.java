package CursoJavaOnline2.Javacore.fModificadorEstatico.Dominio;

public class Anime {
    private String nome;
    private static int [] episodios ;

   static {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i]= i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for(int episodios : Anime.episodios){
            System.out.print(episodios+" ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

