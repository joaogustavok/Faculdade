package ListasExerciciosFaculdade.ListarExercicio6.Questao01;

public class Medico extends Profissional {
    private int crm;

    @Override
    public String toString() {
        return "Medico: " + getNome() +
                " CRM: " + crm;

    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }
}
