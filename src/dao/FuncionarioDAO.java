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
import modelo.FuncionarioVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Douglas, Josefa
 * @since 05/05/2018
 * @version 1.0
 */
public class FuncionarioDAO {
    public void cadastrarFuncionario(FuncionarioVO fcVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();

        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "insert into funcionario(idfuncionario,nome,idade,telefone,cpf,cnpj,rg)"
                    + "values(null, '" + fcVO.getNome() + "', " + fcVO.getIdade() + ", " + fcVO.getTelefone() + ", " + fcVO.getCpf() + ", " + fcVO.getCnpj()+ ", " +fcVO.getRg() + ")";
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir funcionario");
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

    public ArrayList<FuncionarioVO> buscarFuncionario() throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
        
            sql = "select * from funcionario";

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<FuncionarioVO> func = new ArrayList<>();

            while (rs.next()) {
                FuncionarioVO fc = new FuncionarioVO();
                fc.setIdFuncionario(rs.getLong("idfuncionario"));
                fc.setNome(rs.getString("nome"));
                fc.setIdade(rs.getInt("idade"));
                fc.setTelefone(rs.getInt("telefone"));
                fc.setCpf(rs.getLong("cpf"));
                fc.setCnpj(rs.getLong("cnpj"));
                fc.setRg(rs.getLong("rg"));
                func.add(fc);
            }//fecha while
            return func;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar funcionario " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
    
    public ArrayList<FuncionarioVO> filtrar(String query) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "select * from funcionario "+query;

            ResultSet rs = stat.executeQuery(sql);

            ArrayList<FuncionarioVO> func = new ArrayList<>();

            while (rs.next()) {
                FuncionarioVO fc = new FuncionarioVO();
                fc.setIdFuncionario(rs.getLong("idfuncionario"));
                fc.setNome(rs.getString("nome"));
                fc.setIdade(rs.getInt("idade"));
                fc.setTelefone(rs.getInt("telefone"));
                fc.setCpf(rs.getLong("cpf"));
                fc.setCnpj(rs.getLong("cnpj"));
                fc.setRg(rs.getLong("rg"));
                func.add(fc);
            }//fecha while

            return func;

        } catch (SQLException e) {
            throw new SQLException("Erro ao filtrar funcionario " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
    
    public void deletarFuncionario(long id) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql = "delete from funcionario where idfuncionario = " +id;
            stat.execute(sql);
        } catch (Exception e){
            throw new SQLException("Erro ao deletar funcionario " +e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método deletar
    
    public void alterarFuncionario(FuncionarioVO fcVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "update funcionario set nome='"+fcVO.getNome()+"', idade="+fcVO.getIdade()+", telefone="+fcVO.getTelefone()+", cpf="+fcVO.getCpf()+", cnpj="+fcVO.getCnpj()+", rg="+fcVO.getRg()+" where idproduto = "+fcVO.getIdFuncionario();
            stat.executeUpdate(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar funcionario"+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método    
}//fecha classe
