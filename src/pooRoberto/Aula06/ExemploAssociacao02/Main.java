package pooRoberto.Aula06.ExemploAssociacao02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda:");
        String nome = ler.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Entre com as informacoes de contato: "+(i+1));
            Contato c = new Contato();
            System.out.println("Entre com o nome: ");
            String nomeAngenda = ler.nextLine();
            c.setNome(nomeAngenda);
            System.out.println("Entre com o telefone: ");
            String telefone = ler.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o email: ");
            String email = ler.nextLine();
            c.setEmail(email);
            contatos[i] = c;
        }
        agenda.setContatos(contatos);

        if (agenda != null) {
            System.out.println(agenda.obterInfo());

        }
    }
}
