/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Douglas, Josefa
 * @since 05/05/2018
 * @version 1.0
 */
public class FuncionarioVO {
    private long idFuncionario;
    private String Nome;
    private int idade;
    private int telefone;
    private long cpf;
    private long cnpj;
    private long rg;

    public FuncionarioVO() {
    }

    /**
     * 
     * @param idFuncionario recebe o id do funcionario
     * @param Nome recebe o nome do funcionario
     * @param idade recebe a idade do funcionario
     * @param telefone recebe o telefone do funcionario
     * @param cpf recebe o cpf do funcionario
     * @param cnpj recebe o cnpj do funcionario
     * @param rg recebe o rg do funcionario
     */
    
    public FuncionarioVO(long idFuncionario, String Nome, int idade, int telefone, long cpf, long cnpj, long rg) {
        this.idFuncionario = idFuncionario;
        this.Nome = Nome;
        this.idade = idade;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.rg = rg;
    }

    public long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "\nID: " + idFuncionario 
                + "\nNome: " + Nome 
                + "\nIdade: " + idade 
                + "\nTelefone:" + telefone 
                + "\nCPF: " + cpf 
                + "\nCNPJ: " + cnpj 
                + "\nRG: " + rg;
    }//fecha toString
}//fecha classe
