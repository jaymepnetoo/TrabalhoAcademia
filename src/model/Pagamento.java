package model;
import java.util.Date;

public class Pagamento {
    private double valor;
    private Date data;
    private String metodoDePagamento;

    public Pagamento(double valor, Date data, String metodoDePagamento) {
        this.valor = valor;
        this.data = data;
        this.metodoDePagamento = metodoDePagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMetodoDePagamento() {
        return metodoDePagamento;
    }

    public void setMetodoDePagamento(String metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public void processarPagamento() {
        System.out.println("Pagamento processado.");
    }

    public void emitirRecibo() {
        System.out.println("Recibo emitido.");
    }
}

