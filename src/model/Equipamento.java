package model;

public class Equipamento {
    private String modalidade;
    private boolean estaDisponivel;
    private int quantidade;

    public Equipamento(String modalidade, boolean estaDisponivel, int quantidade) {
        this.modalidade = modalidade;
        this.estaDisponivel = estaDisponivel;
        this.quantidade = quantidade;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public boolean isEstaDisponivel() {
        return estaDisponivel;
    }

    public void setEstaDisponivel(boolean estaDisponivel) {
        this.estaDisponivel = estaDisponivel;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void reservar() {
        if (estaDisponivel && quantidade > 0) {
            quantidade--;
            if (quantidade == 0) {
                estaDisponivel = false;
            }
            System.out.println("Equipamento reservado.");
        } else {
            System.out.println("Equipamento não disponível.");
        }
    }

    public void verificarEstado() {
        if (estaDisponivel) {
            System.out.println("Equipamento disponível.");
        } else {
            System.out.println("Equipamento não disponível.");
        }
    }
}

