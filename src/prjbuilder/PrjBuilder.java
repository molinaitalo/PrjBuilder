/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjbuilder;

import janelas.home;
import objetos.Bolo;
import objetos.BoloDiretor;


/**
 *
 * @author aluno
 */
public class PrjBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        home home = new home();
        home.setVisible(true);
        
        int i;
        
        BoloDiretor builder = new BoloDiretor();
        builder.id(0);
        builder.descricao("Bolo da Dinda");
        builder.tamanho("Grande");
        builder.ingrediente("Farinha");
        builder.precoBolo(Double.valueOf("3.00") + 15);
        
    
        Bolo bolo = builder.constroi();
        
        System.out.println("Id: " + bolo.getId());
        System.out.println("Descrição:" + bolo.getDescricao());
        System.out.println("Tamanho: " + bolo.getTamanho());
        System.out.println("Preço: " + bolo.getPrecoBolo());
        System.out.println("Ingrediente: " + bolo.getIngrediente());
        
        
         
	
    }
    
}
