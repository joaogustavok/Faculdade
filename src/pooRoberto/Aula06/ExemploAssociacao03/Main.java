package pooRoberto.Aula06.ExemploAssociacao03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com o nome do curso:");
        String nome = ler.nextLine();

        System.out.println("Entre com o horario do curso:");
        String horario = ler.nextLine();

        System.out.println("Entre com o departamento: ");
        String departamento = ler.nextLine();

        System.out.println("Entre com o nome do professor: ");
        String nomeProf = ler.nextLine();

        System.out.println("Entre com o email do professor");
        String emailProf = ler.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(departamento);
        professor.setEmail(emailProf);

        curso.setProfessor(professor);

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Entre com o nome do aluno: ");
            String nomeAluno = ler.nextLine();
            System.out.println("Entre com a matricula do aluno: ");
            String matAluno = ler.nextLine();

            double[] notas = new double[4];
            for (int j = 0; j < notas.length; j++) {
                System.out.println("Entre com a nota :"+(i+1));
                notas[j] = ler.nextDouble();

            }
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);

            alunos [i] = aluno;
        }
        curso.setAlunos(alunos);
        System.out.println(curso.obterInfo());
    }

}
