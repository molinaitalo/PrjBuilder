/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosBO;

import java.util.List;
import objetos.Bolo;
import objetos.BoloDiretor;

import objetosDAO.BoloDAO;

/**
 *
 * @author Italo
 */
public class BoloBO {
    BoloDAO boloDAO;

    public BoloBO()
    {
        boloDAO = new BoloDAO();
    }
    
    public void salvar(Bolo bolo)
            
    {
        
        boloDAO.salvar(bolo);
    }
    
    
    public List<Bolo> buscarTodos()
    {
       return boloDAO.buscarTodos();
    }
    
}
