package ListasExerciciosFaculdade.ListarExercicio6.Questao01;

public class Enfermeiro extends Profissional {
    private int coren;

    @Override
    public String toString() {
        return "Enfermeiro: " + getNome() +
                " COREN: " + coren;
    }

    public int getCoren() {
        return coren;
    }

    public void setCoren(int coren) {
        this.coren = coren;
    }
}
