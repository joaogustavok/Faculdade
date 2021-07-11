package CursoJavaOnline;

public class ControleFluxoExercicio3 {
    public static void main(String[] args) {
        //imprimindo numeros pares de 0 ate 100000
        int valor= 100000;
        for(int i=0; i<= valor; i++){
            if (i%2==0){ //para numeros impares e se trocar o == para !=
                System.out.println(i);
            }
        }
    }
}
