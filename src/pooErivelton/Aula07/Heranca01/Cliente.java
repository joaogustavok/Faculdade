package pooErivelton.Aula07.Heranca01;

public class Cliente extends Pessoa{
    String cpf;
    @Override
    public void imprimeNome() {
        System.out.println("O nome do Cliente é: "+nome +"\n CPF: "+cpf +"\n e seu endereco é: "+endereco);
    }


}
