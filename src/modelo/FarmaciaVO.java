
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
public class FarmaciaVO {
    //Atributos
    private long idFarmacia; //adicionei esse
    private String CNPJFarmacia;
    private String NomeFarmacia;
    private int telFarmacia;
    private String enderecoFarmacia;

    public FarmaciaVO() {
    }

    /**
     * @param idFarmacia recebe o Numero de indentificação da farmacia
     * @param CNPJFarmacia recebe o CNPJ da farmácia
     * @param NomeFarmacia recebe o nome da farmácia
     * @param telFarmacia recebe o telefone da farmácia
     * @param enderecoFarmacia recebe o endereço da farmácia
     */
    
    public FarmaciaVO(long idFarmacia ,String CNPJFarmacia, String NomeFarmacia, int telFarmacia, String enderecoFarmacia) {
        this.idFarmacia = idFarmacia;
        this.CNPJFarmacia = CNPJFarmacia;
        this.NomeFarmacia = NomeFarmacia;
        this.telFarmacia = telFarmacia;
        this.enderecoFarmacia = enderecoFarmacia;
    }

    public long getIdFarmacia() {
        return idFarmacia;
    }

    public void setIdFarmacia(long idFarmacia) {
        this.idFarmacia = idFarmacia;
    }
    
    public String getCNPJFarmacia() {
        return CNPJFarmacia;
    }

    public void setCNPJFarmacia(String CNPJFarmacia) {
        this.CNPJFarmacia = CNPJFarmacia;
    }

    public String getNomeFarmacia() {
        return NomeFarmacia;
    }

    public void setNomeFarmacia(String NomeFarmacia) {
        this.NomeFarmacia = NomeFarmacia;
    }

    public int getTelFarmacia() {
        return telFarmacia;
    }

    public void setTelFarmacia(int telFarmacia) {
        this.telFarmacia = telFarmacia;
    }

    public String getEnderecoFarmacia() {
        return enderecoFarmacia;
    }

    public void setEnderecoFarmacia(String enderecoFarmacia) {
        this.enderecoFarmacia = enderecoFarmacia;
    }

    @Override
    public String toString() {
        return "\nID: " + idFarmacia
                + "\nCNPJ: " +CNPJFarmacia
                + "\nNome: " + NomeFarmacia 
                + "\nTelefone: " + telFarmacia 
                + "\nEndereço: " + enderecoFarmacia;
    }//fecha toString  
}//fecha classe
