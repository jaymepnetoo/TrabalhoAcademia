package model;
import java.util.Date;

public class Agenda {
    private String hora;
    private Date data;
    private String tipoAtividade;

    public Agenda(String hora, Date data, String tipoAtividade) {
        this.hora = hora;
        this.data = data;
        this.tipoAtividade = tipoAtividade;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public void agendar() {
        System.out.println("Atividade agendada.");
    }

    public void cancelar() {
        System.out.println("Atividade cancelada.");
    }

    public void reagendar(Date novaData, String novaHora) {
        this.data = novaData;
        this.hora = novaHora;
        System.out.println("Atividade reagendada.");
    }
}

