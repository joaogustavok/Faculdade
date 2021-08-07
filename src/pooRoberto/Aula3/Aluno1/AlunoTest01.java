package pooRoberto.Aula3.Aluno1;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.n1 = 7;
        aluno.n2 = 8;
        aluno.n3 = 5;
        aluno.n4 = 9;


        System.out.println("Media: " + aluno.media());


        if (aluno.aprovado()) {
            System.out.println("Aprovado");
        }
        System.out.println("Reprovado");
    }
}
