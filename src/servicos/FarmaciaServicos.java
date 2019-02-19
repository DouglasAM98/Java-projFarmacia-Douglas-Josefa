/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.FarmaciaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.FarmaciaVO;

/**
 *
 * @author Douglas, Josefa
 * @since 05/05/2018
 * @version 1.0
 */
public class FarmaciaServicos {
    public void cadastrarFarmacia(FarmaciaVO pVO) throws SQLException {
        FarmaciaDAO pDAO = DAOFactory.getFarmaciaDAO();
        pDAO.cadastrarFarmacia(pVO);
    }//fecha método

    public ArrayList<FarmaciaVO> buscarFarmacia() throws SQLException {
        FarmaciaDAO fDAO = DAOFactory.getFarmaciaDAO();
        return fDAO.buscarFarmacia();
    }//fecha método
    
    public ArrayList<FarmaciaVO> filtrar(String query) throws SQLException {
        FarmaciaDAO fDAO = DAOFactory.getFarmaciaDAO();
        return fDAO.filtrar(query);
    }//fecha método
    
    public void deletarFarmacia(long id) throws SQLException{
        FarmaciaDAO fDAO = DAOFactory.getFarmaciaDAO();
        fDAO.deletarFarmacia(id);
    }//fecha método deletarFarmacia
    
    public void alterarFarmacia(FarmaciaVO fVO) throws SQLException {
        FarmaciaDAO fDAO = DAOFactory.getFarmaciaDAO();
        fDAO.alterarFarmacia(fVO);
    }//fecha método alterarFarmacia
}//fecha classe
