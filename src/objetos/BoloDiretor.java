/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Italo
 */
public class BoloDiretor {
    private int id;
    private String tamanho;
    private double precoIngr;
    private String descricao;
    public String ingrediente;
    public double precoBolo;
    
    public void id(int id)
    {
        this.id = id;
    }
    
    public void tamanho(String tamanho)
    {
        this.tamanho = tamanho;
    }
    
    public void precoIngr(double precoIngr)
    {
        this.precoIngr = precoIngr;
    }
    
    public void descricao(String descricao)
    {
        this.descricao = descricao;
    }
    
    public void ingrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }
    public void precoBolo(double precoBolo)
    {
        this.precoBolo = precoBolo;
    }
    public Bolo constroi()
    {
        return new Bolo(id, tamanho, precoIngr, descricao, ingrediente,precoBolo);
    }
}
