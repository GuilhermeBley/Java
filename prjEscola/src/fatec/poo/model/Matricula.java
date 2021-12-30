package fatec.poo.model;

public class Matricula {

    private String data;
    private int qtdeFaltas;
    private double nota;
    private AVista aVista;
    private APrazo aPrazo;
    private Aluno aluno;
    private Turma turma;

    public Matricula(String data) {
        this.data = data;
    }

    public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void emitirCarne() {
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void setaVista(AVista aVista) {
        this.aVista = aVista;
    }

    public void setaPrazo(APrazo aPrazo) {
        this.aPrazo = aPrazo;
    }

    public AVista getaVista() {
        return aVista;
    }

    public APrazo getaPrazo() {
        return aPrazo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Turma getTurma() {
        return turma;
    }

}
