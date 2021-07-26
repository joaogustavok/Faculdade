package CursoJavaOnline;

public class ControleFluxo1 {
    public static void main(String[] args) {
        int idade = 19;
       // idade <15 categoria infantil
        // idade >=15 && idade <18 juvenil
        // idade >=18 adulto
        String caregoria;

        if(idade <15){
            caregoria=("categoria infantil");
        } else if(idade >=15 && idade <=18){
            caregoria = ("categoria juvenil");
        } else{
            caregoria= ("categoria adulta");
        }
        System.out.println(caregoria);
    }
}
