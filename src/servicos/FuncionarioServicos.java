/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.FuncionarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.FuncionarioVO;

/**
 *
 * @author Douglas, Josefa
 * @since 05/05/2018
 * @version 1.0
 */
public class FuncionarioServicos {
    public void cadastrarFuncionario(FuncionarioVO fcVO) throws SQLException {
        FuncionarioDAO fcDAO = DAOFactory.getFuncionarioDAO();
        fcDAO.cadastrarFuncionario(fcVO);
    }//fecha método

    public ArrayList<FuncionarioVO> buscarFuncionario() throws SQLException {
        FuncionarioDAO fcDAO = DAOFactory.getFuncionarioDAO();
        return fcDAO.buscarFuncionario();
    }//fecha método
    
    public ArrayList<FuncionarioVO> filtrar(String query) throws SQLException {
        FuncionarioDAO fcDAO = DAOFactory.getFuncionarioDAO();
        return fcDAO.filtrar(query);
    }//fecha método
    
    public void deletarFuncionario(long id) throws SQLException{
        FuncionarioDAO fcDAO = DAOFactory.getFuncionarioDAO();
        fcDAO.deletarFuncionario(id);
    }//fecha método deletarProduto
    
    public void alterarFuncionario(FuncionarioVO fcVO) throws SQLException {
        FuncionarioDAO fcDAO = DAOFactory.getFuncionarioDAO();
        fcDAO.alterarFuncionario(fcVO);
    }//fecha método alterarProduto
}//fecha classe
