package ListasExerciciosFaculdade.ListarExercicio6.Questao02;

public class Estacionamento {
    private String placa;
    private String modelo;
    private int horaEntrada;
    private int horaSaida;

    public Estacionamento() {
        this.placa = " ";
        this.modelo = " ";
        this.horaEntrada = 0;
        this.horaSaida = 0;
    }

    public double calculaValor() {
        int horas;
        if (horaEntrada == horaSaida) {
            horas = 24;
        } else if (horaEntrada > horaSaida) {
            horas = 24 - horaEntrada + horaSaida;
        } else {
            horas = 24 - horaEntrada + horaSaida - 24;
        }
        return horas * 1.5;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }
}
