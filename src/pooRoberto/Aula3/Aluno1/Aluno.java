package pooRoberto.Aula3.Aluno1;

public class Aluno {
    double n1, n2, n3, n4;

    public double media() {
        return (n1 + n2 + n3 + n4) / 4;
    }

    public boolean aprovado() {
        if (media() >= 7) {
            return true;
        }
        return false;
    }
}
