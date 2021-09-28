package pooRoberto.Aula07.Heranca05;

import javax.sound.midi.Soundbank;

public class CamaroteInferior extends Ingresso{

    private String localizacao;

    public void imprimirLocalizacao(){
        System.out.println("Localizacao: "+this.localizacao);
        System.out.println("Preco do ingresso: "+getValor());
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
