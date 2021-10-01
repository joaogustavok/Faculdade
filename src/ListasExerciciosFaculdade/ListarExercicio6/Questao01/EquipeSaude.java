package ListasExerciciosFaculdade.ListarExercicio6.Questao01;

public class EquipeSaude {
    private int cnes;
    private String municipio;
    private Endereco endereco;
    private Profissional profissionais;

    @Override
    public String toString() {
        return "Equipe" +
                "Cnes: " + cnes +
                " - Localizada em: " + municipio +
                " - no bairro " + endereco.getBairro();
    }

    public EquipeSaude() {
        Profissional[] profissionais = new Profissional[3];
    }

    public EquipeSaude(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Profissional getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(Profissional profissionais) {
        this.profissionais = profissionais;
    }

    public int getCnes() {
        return cnes;
    }

    public void setCnes(int cnes) {
        this.cnes = cnes;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}
