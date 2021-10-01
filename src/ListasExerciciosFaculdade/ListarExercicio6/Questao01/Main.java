package ListasExerciciosFaculdade.ListarExercicio6.Questao01;


import java.util.Scanner;
// João Gustavo Kmiecik e Daniel Kondlatsch
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        EquipeSaude equipeSaude = new EquipeSaude();
        System.out.println("Informe o nome do municipio: ");
        equipeSaude.setMunicipio(ler.nextLine());
        Endereco endereco = new Endereco();
        System.out.println("Informe o bairro:");
        endereco.setBairro(ler.nextLine());

        System.out.println("Informe o codigo CNES");
        equipeSaude.setCnes(ler.nextInt());

        equipeSaude.setEndereco(endereco);


        System.out.println("Informe o crm do medico:");
        Medico medico = new Medico();
        medico.setCrm(ler.nextInt());
        Enfermeiro enfermeiro = new Enfermeiro();
        System.out.println("Informe o coren do enfermeiro:");
        enfermeiro.setCoren(ler.nextInt());
        Odontologo odontologo = new Odontologo();
        System.out.println("Informe o cro do odontologo:");
        odontologo.setCro(ler.nextInt());

        medico.setNome("Carlos");
        odontologo.setNome("Artemis");
        enfermeiro.setNome("Pedro");

        equipeSaude.setProfissionais(medico);
        equipeSaude.setProfissionais(odontologo);
        equipeSaude.setProfissionais(enfermeiro);


        System.out.println(equipeSaude.toString());
        System.out.println(medico.toString());
        System.out.println(odontologo.toString());
        System.out.println(enfermeiro.toString());

    }
}
