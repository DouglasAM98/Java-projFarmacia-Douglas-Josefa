/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.MercadoriaVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Douglas
 */
public class MercadoriaDAO {
    public void cadastrarMercadoria(MercadoriaVO mVO) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "insert into mercadoria(idmercadoria,nome,fabricante,origem,preço,quantidade)"
                    + "values(null, '" + mVO.getNome()+ "', '" +mVO.getFabricante()+ "', '" +mVO.getOrigem()+ "', " + mVO.getPreco()+ ", " + mVO.getQuantidade() + ")";
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir mercadoria");
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

    public ArrayList<MercadoriaVO> buscarMercadoria() throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
        
            sql = "select * from mercadoria";

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<MercadoriaVO> merc = new ArrayList<>();


            while (rs.next()) {

                MercadoriaVO m = new MercadoriaVO();

                m.setIdMercadoria(rs.getLong("idmercadoria"));
                m.setNome(rs.getString("nome"));
                m.setFabricante(rs.getString("Fabricante"));
                m.setOrigem(rs.getString("Origem"));
                m.setPreco(rs.getDouble("preço"));
                m.setQuantidade(rs.getInt("quantidade"));
                merc.add(m);
            }//fecha while
            return merc;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar mercadoria " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
    
    public ArrayList<MercadoriaVO> filtrar(String query) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
    
            sql = "select * from mercadoria "+query;

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<MercadoriaVO> merc = new ArrayList<>();

            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                MercadoriaVO m = new MercadoriaVO();

                m.setIdMercadoria(rs.getLong("idmercadoria"));
                m.setNome(rs.getString("nome"));
                m.setFabricante(rs.getString("Fabricante"));
                m.setOrigem(rs.getString("Origem"));
                m.setPreco(rs.getDouble("preço"));
                m.setQuantidade(rs.getInt("quantidade"));
                merc.add(m);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return merc;

        } catch (SQLException e) {
            throw new SQLException("Erro ao filtrar mercadoria " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
    
    public void deletarMercadoria(long id) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql = "delete from produto where idmercadoria = " +id;
            stat.execute(sql);
        } catch (Exception e){
            throw new SQLException("Erro ao deletar mercadoria " +e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método deletar
    
    public void alterarMercadoria(MercadoriaVO mVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "update mercadoria set nome='"+mVO.getNome()+"', fabricante="+mVO.getFabricante()+"', origem="+mVO.getOrigem()+"', preço="+mVO.getPreco()+", quantidade="+mVO.getQuantidade()+" where idmercadoria = "+mVO.getIdMercadoria();
            stat.executeUpdate(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar mercadoria"+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método    
}//fecha classe

