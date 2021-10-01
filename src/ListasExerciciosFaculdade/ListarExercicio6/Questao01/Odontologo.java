package ListasExerciciosFaculdade.ListarExercicio6.Questao01;

public class Odontologo extends Profissional {
    private int cro;

    @Override
    public String toString() {
        return "Odontologo: " + getNome() +
                " CRO: " + cro
                ;
    }

    public int getCro() {
        return cro;
    }

    public void setCro(int cro) {
        this.cro = cro;
    }
}
