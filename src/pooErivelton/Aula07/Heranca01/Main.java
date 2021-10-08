package pooErivelton.Aula07.Heranca01;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome="Pedro";
        cliente.cpf="848383295-22";
        cliente.imprimeNome();

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.nome="Deltranic";
        fornecedor.cnpj="8484823893";
        fornecedor.imprimeNome();
    }
}
