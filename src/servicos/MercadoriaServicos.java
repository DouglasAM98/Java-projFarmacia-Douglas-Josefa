/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.MercadoriaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.MercadoriaVO;

/**
 *
 * @author Douglas, Josefa
 * @since 05/05/2018
 * @version 1.0
 */
public class MercadoriaServicos {
    public void cadastrarMercadoria(MercadoriaVO mVO) throws SQLException {
        MercadoriaDAO mDAO = DAOFactory.getMercadoriaDAO();
        mDAO.cadastrarMercadoria(mVO);
    }//fecha método

    public ArrayList<MercadoriaVO> buscarMercadoria() throws SQLException {
        MercadoriaDAO mDAO = DAOFactory.getMercadoriaDAO();
        return mDAO.buscarMercadoria();
    }//fecha método
    
    public ArrayList<MercadoriaVO> filtrar(String query) throws SQLException {
        MercadoriaDAO mDAO = DAOFactory.getMercadoriaDAO();
        return mDAO.filtrar(query);
    }//fecha método
    
    public void deletarMercadoria(long id) throws SQLException{
        MercadoriaDAO mDAO = DAOFactory.getMercadoriaDAO();
        mDAO.deletarMercadoria(id);
    }//fecha método deletarProduto
    
    public void alterarMercadoria(MercadoriaVO mVO) throws SQLException {
        MercadoriaDAO mDAO = DAOFactory.getMercadoriaDAO();
        mDAO.alterarMercadoria(mVO);
    }//fecha método alterarMercadoria
}
