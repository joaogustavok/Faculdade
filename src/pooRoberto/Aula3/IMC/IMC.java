package pooRoberto.Aula3.IMC;

public class IMC {
    double peso,altura;


    public double ValorIMC(){

        return peso/(Math.pow(altura,2));

    }

    public String resultado(){
        if (this.ValorIMC()< 20){
            return "Abaixo do Normal";
        } else if (this.ValorIMC()<25){
            return "Normal";
        } else if (this.ValorIMC()<30){
            return "Obesidade Leve";
        }else if (this.ValorIMC()<40){
            return "Obesidade Moderada";
        }else {
            return "Obesidade Morbita";
        }
    }
}
