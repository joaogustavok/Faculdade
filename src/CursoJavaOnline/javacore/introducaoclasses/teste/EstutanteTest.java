package CursoJavaOnline.javacore.introducaoclasses.teste;
import javacore.introducaoclasses.classes.Estudante;

public class EstutanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.nome = "joao";
        joao.matricula = "1212";
        joao.idade = 15;

        System.out.println(joao.nome);
        System.out.println(joao.idade);
        System.out.println(joao.matricula);
    }
}
