package CursoJavaOnline.javacore.introducaometodos.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;

    public void imprime(){
        System.out.println("=-=-=-=-=-");
        System.out.println(this.matricula);
        System.out.println(this.rg);
        System.out.println(this.nome);
    }
}
