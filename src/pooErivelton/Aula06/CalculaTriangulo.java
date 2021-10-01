package pooErivelton.Aula06;



import javax.swing.*;

class Triangulo {
    private double base;
    private double altura;

     public Triangulo() {
         this.base = 0.0;
         this.altura = 0.0;
     }

     public Triangulo(double base, double altura) {
         this.base = base;
         this.altura = altura;
     }

     public double caulcularArea(){
         return (base *altura)/2;
     }

     public double getBase() {
         return base;
     }

     public void setBase(double base) {
         this.base = base;
     }

     public double getAltura() {
         return altura;
     }

     public void setAltura(double altura) {
         this.altura = altura;
     }
 }
public class CalculaTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        Triangulo t[] = new Triangulo[2];
        ler(t);

        triangulo.setAltura(10);
        triangulo.setBase(10);
        System.out.println(triangulo.caulcularArea());
    }
    public static void ler(Triangulo t[]){
        for (int i = 0; i < t.length; i++) {
            t[i] = new Triangulo();
            t[i].setBase(Double.parseDouble(JOptionPane.showInputDialog("Entre com o numero da base: ")));
            t[i].setAltura(Double.parseDouble(JOptionPane.showInputDialog("Entre com o numero da altura: ")));
            JOptionPane.showMessageDialog(null,t[i].caulcularArea());
        }
    }
}
