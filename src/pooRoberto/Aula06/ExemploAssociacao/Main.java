package pooRoberto.Aula06.ExemploAssociacao;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Roberto");

        Endereco endereco = new Endereco();
        endereco.setNomeRua("Av. Fernandes");
        endereco.setNumero("123");
        endereco.setComplemento("Casa Azul");
        endereco.setCep("845832-22");
        endereco.setCidade("Mafra");
        endereco.setEstado("Sc");

        Telefone telefone = new Telefone();
        telefone.setTipo("Residencial");
        telefone.setDdd("47");
        telefone.setNumero("9992938923");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Empresarial");
        telefone2.setDdd("47");
        telefone2.setNumero("29291923997");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        contato.setEndereco(endereco);
        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        if (contato!=null && contato.getTelefones()!=null){
            for (Telefone t :
                    contato.getTelefones()) {
                System.out.println(t.getDdd() + " "+t.getNumero());
            }
        }
    }
}
