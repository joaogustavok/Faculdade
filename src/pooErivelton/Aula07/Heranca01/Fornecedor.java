package pooErivelton.Aula07.Heranca01;

public class Fornecedor extends Pessoa{
    String cnpj;

    @Override
    public void imprimeNome() {
        System.out.println("O nome do fornecedor é: "+nome +"\n CNPJ: "+cnpj);
    }
}
