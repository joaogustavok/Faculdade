package pooErivelton.Aula06;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String dataNasc;
    private String rg;
    private String [] telefones;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String[] getTelefones() {
        return telefones;
    }

    public void setTelefones(String[] telefones) {
        this.telefones = telefones;
    }
}
