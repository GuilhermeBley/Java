package fatec.poo.model;

import java.util.ArrayList;

public class Curso {

    private String sigla;
    private String nome;
    private int cargaHorario;
    private double valor;
    private String dataVigencia;
    private double valorHoraInstrutor;
    private String programa;
    private ArrayList<Turma> turmas;
    private String tipo;

    public Curso(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        turmas = new ArrayList<Turma>();
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    public double getValor() {
        return valor;
    }

    public String getDataVigencia() {
        return dataVigencia;
    }

    public double getValorHoraInstrutor() {
        return valorHoraInstrutor;
    }

    public String getPrograma() {
        return programa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDataVigencia(String dataVigencia) {
        this.dataVigencia = dataVigencia;
    }

    public void setValorHoraInstrutor(double valorHoraInstrutor) {
        this.valorHoraInstrutor = valorHoraInstrutor;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public void addTurma(Turma t) {
        turmas.add(t);
        t.setCurso(this);
    }
    
    public void removeTurma(Turma t){
        turmas.remove(t);
        t.setCurso(null);
    }
    
    public ArrayList<Turma> getTurmas(){
        return turmas;
    }
    
    public static ArrayList<String> listarSiglas(ArrayList<Curso> cursos){
        ArrayList<String> cursosString = new ArrayList<>();
        for (Curso curso : cursos)
            cursosString.add(curso.getSigla());
        
        return cursosString;
    }
    
    // -> Tipo

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
