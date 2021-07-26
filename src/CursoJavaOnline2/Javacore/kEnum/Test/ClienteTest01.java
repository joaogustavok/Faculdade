package CursoJavaOnline2.Javacore.kEnum.Test;

import CursoJavaOnline2.Javacore.kEnum.Dominio.Cliente;
import CursoJavaOnline2.Javacore.kEnum.Dominio.TipoCliente;

import static CursoJavaOnline2.Javacore.kEnum.Dominio.TipoPagamento.CREDITO;
import static CursoJavaOnline2.Javacore.kEnum.Dominio.TipoPagamento.DEBITO;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Analu", TipoCliente.PESSOA_FISICA, DEBITO);
        Cliente cliente2 = new Cliente("Amanda", TipoCliente.PESSOA_JURIDICA, CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(DEBITO.calcularDesconto(100));
        System.out.println(CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
