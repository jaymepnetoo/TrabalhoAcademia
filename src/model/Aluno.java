package model;
import java.util.Date;
public class Aluno extends Usuario {
    private static int idCounter = 0;
    private int id;
    private String tipoMatricula;
    private boolean isMatriculado;

    public Aluno(String nome, String cpf, Date dataDeNascimento, String tipoMatricula) {
        super(nome, cpf, dataDeNascimento);
        this.id = ++idCounter;
        this.tipoMatricula = tipoMatricula;
        this.isMatriculado = false;
    }

    public int getId() {
        return id;
    }

    public String getTipoMatricula() {
        return tipoMatricula;
    }

    public void setTipoMatricula(String tipoMatricula) {
        this.tipoMatricula = tipoMatricula;
    }

    public boolean isMatriculado() {
        return isMatriculado;
    }

    public void setMatriculado(boolean matriculado) {
        isMatriculado = matriculado;
    }

    public void matricular() {
        if (!isMatriculado) {
            isMatriculado = true;
            System.out.println("Aluno matriculado com sucesso.");
        } else {
            System.out.println("Aluno já está matriculado.");
        }
    }

    public void renovarMatricula() {
        if (isMatriculado) {
            System.out.println("Matrícula renovada com sucesso.");
        } else {
            System.out.println("Aluno não está matriculado.");
        }
    }

    public void cancelarMatricula() {
        if (isMatriculado) {
            isMatriculado = false;
            System.out.println("Matrícula cancelada com sucesso.");
        } else {
            System.out.println("Aluno não está matriculado.");
        }
    }
}


