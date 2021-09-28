package pooRoberto.Aula5.Associacao4;

import java.util.ArrayList;

public class Departamento {
    private String descricao;
    private ArrayList<Funcionario> funcionarios;

    public Departamento() {
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public Departamento(String descricao) {
        this.funcionarios = new ArrayList<Funcionario>();
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public void addFuncionarios(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public String getFuncionarios(){
        String retorno = "";
        for (int i = 0; i < this.funcionarios.size(); i++) {
            retorno += this.funcionarios.get(i)+"\n";
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
