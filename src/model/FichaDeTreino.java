package model;
import java.util.Date;

public class FichaDeTreino {
    private int id;
    private Date dataDeInicio;
    private String modalidade;
    private String[] exercicios;

    public FichaDeTreino(int id, Date dataDeInicio, String modalidade, String[] exercicios) {
        this.id = id;
        this.dataDeInicio = dataDeInicio;
        this.modalidade = modalidade;
        this.exercicios = exercicios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(Date dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String[] getExercicios() {
        return exercicios;
    }

    public void setExercicios(String[] exercicios) {
        this.exercicios = exercicios;
    }

    public void definirTreinador(Funcionario treinador) {
        System.out.println("Treinador " + treinador.getNome() + " definido para a ficha de treino.");
    }

    public void adicionarAluno(Aluno aluno) {
        System.out.println("Aluno " + aluno.getNome() + " adicionado à ficha de treino.");
    }
}

