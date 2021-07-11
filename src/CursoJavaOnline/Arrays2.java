package CursoJavaOnline;

public class Arrays2 {
    public static void main(String[] args) {
        //byte,short,int, long, float,double =0
        //char = espaco em branco
        //bolean = false
        //reference = null
        String[] nomes = new String[3];

        nomes[0] = "Maria";
        nomes[1] = "Pedro";
        nomes[2] = "Carlos";

        for(int i=0; i<nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
