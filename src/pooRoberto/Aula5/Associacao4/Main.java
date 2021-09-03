package pooRoberto.Aula5.Associacao4;

public class Main {
    public static void main(String[] args) {
        Departamento departamento1 = new Departamento("Adm");
        System.out.println(departamento1);
        Funcionario chinelo = new Funcionario("Erasmo",19,departamento1);
        Funcionario chinelo2 = new Funcionario("Roberto",16,departamento1);

        departamento1.addFuncionarios(chinelo);
        departamento1.addFuncionarios(chinelo2);

        System.out.println(departamento1.getFuncionarios());
    }
}
