package CursoJavaOnline2;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int contador = 0;
        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }
        contador =0;
        do {
            System.out.println("Dentro do do while " + contador);
            contador++;
        } while (contador < 10);

        for (int i=0; i < 10; i++) {
            System.out.println("For "+i);
        }
    }
}
