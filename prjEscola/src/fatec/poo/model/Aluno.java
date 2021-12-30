package fatec.poo.model;

public class Aluno extends Pessoa {

    private String escolaridade;
    private Matricula matricula;

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Aluno(String cpf, String nome) {
        super(cpf, nome);
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
        
        if(matricula != null)
            matricula.setAluno(this);
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public String getEscolaridade() {
        return escolaridade;
    }
}
