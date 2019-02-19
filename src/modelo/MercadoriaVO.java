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
public class MercadoriaVO {
    private long idMercadoria;
    private String nome;
    private String fabricante;
    private String origem;
    private double preco;
    private int quantidade;

    public MercadoriaVO() {
    }

    /**
     * 
     * @param idMercadoria recebe o id da mercadoria
     * @param nome recebe o nome da mercadoria
     * @param fabricante  recebe o n nome do frabricante
     * @param  origem recebe a origem da mercadoria
     * @param preco recebe o preço da mercadoria
     * @param quantidade recebe a quantidade da mercadoria
     */
    
    public MercadoriaVO(long idMercadoria, String nome, String fabricante, String origem, double preco, int quantidade) {
        this.idMercadoria = idMercadoria;
        this.nome = nome;
        this.fabricante = fabricante;
        this.origem = origem;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getIdMercadoria() {
        return idMercadoria;
    }

    public void setIdMercadoria(long idMercadoria) {
        this.idMercadoria = idMercadoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return  "ID: " + idMercadoria 
                + "Nome: " + nome 
                 + "Fabricnate: " + fabricante
                + "Origem: " + origem
                + "Preço: " + preco 
                + "Quantidade: " + quantidade;
    }//fecha ToStirng
}//fecha classe
