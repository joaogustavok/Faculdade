package CursoJavaOnline2.Introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar =" Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar="Ainda nao tenho condicoes, mas vou ter!";
        // operador ternario
        String resultado = salario >5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
