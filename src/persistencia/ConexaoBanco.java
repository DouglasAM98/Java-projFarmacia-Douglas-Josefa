/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Douglas, Josefa
 * @since 05/05/2018
 * @version  1.0
 */
public class ConexaoBanco {
    //Atributos
    private static final String URL = "jdbc:mysql://localhost:3306/farmacia";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    //Método para efetuar conexão com o MySql
    public static Connection getConexao() throws SQLException {
        Connection c = null;
        try {
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException se) {
            throw new SQLException("Erro ao conectar " + se.getMessage());
        }//fecha catch
        return c;
    }//fecha método
}//fecha classe
