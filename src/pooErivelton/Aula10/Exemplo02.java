package pooErivelton.Aula10;

public class Exemplo02 {
    public static void main(String[] args) {
        try {
            int [] numero = new int[5];
            for (int i = 0; i < 10; i++) {
                numero[i] = i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array fora do indice: "+e.getMessage());
        }
    }
}
