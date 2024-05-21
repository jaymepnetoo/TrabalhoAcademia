package model;
import java.util.Date;

public class Manutencao {
    private String descricao;
    private Date data;
    private String status;

    public Manutencao(String descricao, Date data, String status) {
        this.descricao = descricao;
        this.data = data;
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void programarManutencao() {
        System.out.println("Manutenção programada.");
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status da manutenção atualizado.");
    }
}

