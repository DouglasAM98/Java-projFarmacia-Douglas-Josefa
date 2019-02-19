/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author Douglas, Josefa
 * @since 05/05/2018
 * @version 1.0
 */
public class ServicosFactory {

    private static FarmaciaServicos farmaciaServicos = new FarmaciaServicos();

    public static FarmaciaServicos getFarmaciaServicos() {
        return farmaciaServicos;
    }//fecha metodo

    private static FuncionarioServicos funcionarioServicos = new FuncionarioServicos();

    public static FuncionarioServicos getFuncionarioServicos() {
        return funcionarioServicos;
        
    }//fecha método    
    
    
    private static MercadoriaServicos mercadoraServicos = new MercadoriaServicos();

    public static MercadoriaServicos getMercadoriaServicos() {
        return mercadoraServicos;
    }//fecha método
}//fecha classe  
