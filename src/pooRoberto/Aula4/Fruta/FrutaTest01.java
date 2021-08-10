package pooRoberto.Aula4.Fruta;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FrutaTest01 {
    public static void main(String[] args) {
        Fruta fruta01 = new Fruta("Abacaxi",100, Color.BLACK,10);
        Fruta fruta02 = new Fruta("Laranja",100, Color.BLACK,10);


        ArrayList<Fruta> saladaFrutas = new ArrayList<>();
        saladaFrutas.add(fruta01);
        saladaFrutas.add(fruta02);

        System.out.println("Imprimindo o ArrayList: ");
        for (int i = 0; i < saladaFrutas.size(); i++) {
            saladaFrutas.get(i).imprime();
        }

    }
}
