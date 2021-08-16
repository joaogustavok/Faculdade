package ListasExerciciosFaculdade.ListaExercicio4.Questao01;

public class Cliente {
    private String nome;
    private Long cpf;
    private static int contador =0;

    public Cliente(String nome, Long cpf) {
        contador++;
        this.nome = nome;
        this.cpf = cpf;
        if (contador == 4){
            System.out.println("-----Numero Maximo de Clientes-------");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}
