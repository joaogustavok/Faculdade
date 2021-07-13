package CursoJavaOnline2.Introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long , float e double = 0
        // char '\u0000' = ' '
        // bolean = false
        // String = null
        String [] nomes = new String[3];

        nomes[0] = "Maria";
        nomes[1] = "Pedro";
        nomes[2] = "Amanda";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
