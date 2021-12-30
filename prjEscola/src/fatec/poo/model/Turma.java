package fatec.poo.model;

import java.util.ArrayList;

public class Turma {
    
    private String nomeTurma;
    private String siglaTurma;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private String periodo;
    private int qtdVagas;
    private String observacoes;
    private Curso curso;
    private Instrutor instrutor;
    private ArrayList<Matricula> matriculas;

    public String getNomeTurma() {
        return nomeTurma;
    }
    
    public String getSiglaTurma() {
        return siglaTurma;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public String getPeriodo() {
        return periodo;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Curso getCurso() {
        return curso;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }    
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Turma(String siglaTurma, String descricao) {
        this.siglaTurma = siglaTurma;
        this.descricao = descricao;
        matriculas = new ArrayList<Matricula>();
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void addMatricula(Matricula m) {
        matriculas.add(m);
        m.setTurma(this);
    }
    
    public void removeMatricula(Matricula m) {
        matriculas.remove(m);
        m.setTurma(null);
    }

    public void emitiListaFrequencia() {
    }
     
    public int getCountMatricula(){
        return matriculas.size();
    }
}
