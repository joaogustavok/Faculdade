package CursoJavaOnline2.Introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >=18;
        // !
        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoolica");
        } else{
            System.out.println(" Não autorizado a comprar bebida alcoolica");
        }

        if (!isAutorizadoComprarBebida){
            System.out.println(" Não autorizado a comprar bebida alcoolica");
        }
    }
}
