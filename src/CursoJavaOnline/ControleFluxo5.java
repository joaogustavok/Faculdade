package CursoJavaOnline;

public class ControleFluxo5<parcela1> {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for(int parcela =1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela >=1000) {
                System.out.println("Parcela " + parcela + "R$ " + valorParcela);
            } else {
                System.out.println("=-=-=-=-=-=-=-=-=-=");
                break;
            }

        }

    double valorTo = 30000;
    for (int parcela1 = (int) valorTo; parcela1 >= 1; parcela1 --){
        double valorParcela1 = valorTo / parcela1;
        if (valorParcela1 <=1000){
            continue;
        }else {
            System.out.println("Parcela "+ parcela1 + "R$ "+ valorParcela1);
        }
      }
    }
}
