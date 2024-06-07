package br.unifor.trabalhoacademianovo.model;
import java.util.Date;
public class Funcionario extends Usuario {
    private static int idCounter = 0;
    private int id;
    private String cargo;
    private String diasDisponiveis;

    public Funcionario(String nome, String cpf, Date dataDeNascimento, String cargo, String diasDisponiveis) {
        super(nome, cpf, dataDeNascimento);
        this.id = ++idCounter;
        this.cargo = cargo;
        this.diasDisponiveis = diasDisponiveis;
    }

    public int getId() {
        return id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDiasDisponiveis() {
        return diasDisponiveis;
    }

    public void setDiasDisponiveis(String diasDisponiveis) {
        this.diasDisponiveis = diasDisponiveis;
    }

    public void registrarEntrada() {
        System.out.println("Entrada registrada.");
    }

    public void registrarSaida() {
        System.out.println("Saída registrada.");
    }
}
