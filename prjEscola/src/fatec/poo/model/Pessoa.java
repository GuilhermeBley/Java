package fatec.poo.model;

import java.util.ArrayList;

public class Pessoa {

    private String nome;
    private String dataNasc;
    private String Endereco;
    private int numero;
    private String bairro;
    private String Cidade;
    private String Estado;
    private String cep;
    private String telefone;
    private String celular;
    private String sexo;
    private String estadoCivil;
    private String rg;
    private String cpf;
    private String email;

    public Pessoa(String cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getEndereco() {
        return Endereco;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getRg() {
        return rg;
    }

    public String getEmail() {
        return email;
    }
    
    

    public static boolean validarCpf(String cpf){
        cpf = cpf.replace(".", "").replace("-", "");
        
        // Caso nao tenha todos os digítos retorna false
        if (cpf.contains(" "))
            return false;
        
        // Transformando digitos em inteiros para a operação
        ArrayList<Integer> digitos = new ArrayList<>();
        for (char digito : cpf.toCharArray()){
            digitos.add(Integer.parseInt(String.valueOf(digito)));
        }
        
        // Verificação primeiro digíto verificador
        int somaDigitos = 0;
        for (int posicao = 0; posicao < digitos.size() - 2; posicao++){
            somaDigitos += digitos.get(posicao) * (posicao + 1);
        }
        
        int verificacao1 = somaDigitos % 11;
        if (verificacao1 == 10)
            verificacao1 = 0;
        
        if (verificacao1 != digitos.get(digitos.size() - 2))
            return false;
                    
        // Verificação segundo digíto verificador
        int somaDigitos2 = 0;
        for (int posicao = 0; posicao < digitos.size() - 1; posicao++){
            int multiplicacao = (digitos.size() - posicao);
            somaDigitos2 += digitos.get(posicao) * multiplicacao;
        }
        
        int verificacao2 = (somaDigitos2 + 10) % 11;
        if (verificacao2 == 10)
            verificacao2 = 0;
        
        return verificacao2 == digitos.get(digitos.size() - 1);
    }
}
