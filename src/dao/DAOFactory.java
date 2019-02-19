/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Douglas, Josefa
 * @since 05/05/2018
 * @version 1.0
 */
public class DAOFactory {

    private static FarmaciaDAO FarmaciaDAO = new FarmaciaDAO();
    public static FarmaciaDAO getFarmaciaDAO() {
        return FarmaciaDAO;
    }//fecha método

    private static MercadoriaDAO MercadoriaDAO = new MercadoriaDAO();
    public static MercadoriaDAO getMercadoriaDAO() {
        return MercadoriaDAO;
    }//fecha método
    
    private static FuncionarioDAO FuncionarioDAO = new FuncionarioDAO();
    public static FuncionarioDAO getFuncionarioDAO() {
        return FuncionarioDAO;
    }
}
