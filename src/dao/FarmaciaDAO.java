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
import modelo.FarmaciaVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Douglas, Josefa
 * @since 05/05/2018
 * @version 1.0
 */
public class FarmaciaDAO {
    public void cadastrarFarmacia(FarmaciaVO fVO) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "insert into farmacia(idfarmacia,cnpj,nome,telefone,endereço)"
                    + "values(null, '" + fVO.getCNPJFarmacia()+ "', '" + fVO.getNomeFarmacia()+ "', " + fVO.getTelFarmacia()+ ", '" +fVO.getEnderecoFarmacia() + "')";
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir farmacia ");
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
    
    public ArrayList<FarmaciaVO> buscarFarmacia() throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;      
            sql = "select * from farmacia";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<FarmaciaVO> farm = new ArrayList<>();
            while (rs.next()) {
                FarmaciaVO f = new FarmaciaVO();
                f.setIdFarmacia(rs.getLong("idfarmacia"));
                f.setCNPJFarmacia(rs.getString("cnpj"));
                f.setNomeFarmacia(rs.getString("nome"));
                f.setTelFarmacia(rs.getInt("telefone"));
                f.setEnderecoFarmacia(rs.getString("endereço"));
                farm.add(f);
            }//fecha while
            return farm;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar farmacia " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
    
    public ArrayList<FarmaciaVO> filtrar(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;           
            sql = "select * from farmacia "+query;
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<FarmaciaVO> farm = new ArrayList<>();
            while (rs.next()) {
                FarmaciaVO f = new FarmaciaVO();
                f.setIdFarmacia(rs.getLong("idfarmacia")); //arrumei
                f.setCNPJFarmacia(rs.getString("cnpj"));
                f.setNomeFarmacia(rs.getString("nome"));
                f.setTelFarmacia(rs.getInt("telefone"));
                f.setEnderecoFarmacia(rs.getString("endereço"));
                farm.add(f);
            }//fecha while
            return farm;
        } catch (SQLException e) {
            throw new SQLException("Erro ao filtrar farmacia " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
    
    public void deletarFarmacia(long id) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try{
            String sql = "delete from farmacia where idfarmacia = " +id;
            stat.execute(sql);
        } catch (Exception e){
            throw new SQLException("Erro ao deletar farmacia " +e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método deletar
    
    public void alterarFarmacia(FarmaciaVO fVO) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "update farmacia set nome='"+fVO.getNomeFarmacia()+"', cnpj='"+fVO.getCNPJFarmacia()+"', telefone"+fVO.getTelFarmacia()+", endereço"+fVO.getEnderecoFarmacia()+ " where idfarmacia = "+fVO.getIdFarmacia();
            stat.executeUpdate(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar farmacia " +e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método    
}//fecha classe
