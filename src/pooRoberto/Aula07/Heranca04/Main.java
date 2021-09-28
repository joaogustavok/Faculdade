package pooRoberto.Aula07.Heranca04;

public class Main {
    public static void main(String[] args) {
        Assalariado assalariado = new Assalariado();
        assalariado.setSalario(1000);
        System.out.println("Salario do Assalariado é de: "+assalariado.vencimento());

        Comissionado comissionado = new Comissionado();
        comissionado.setTaxaComissao(10);
        comissionado.setTotalVenda(100);
        System.out.println("Salario do Comissionado é de: "+comissionado.vencimento());

        Horista horista = new Horista();
        horista.setPrecoHora(10);
        horista.setHorasTrabalhadas(20);
        System.out.println("Salario do Horista é de: "+horista.vencimento());
    }
}
