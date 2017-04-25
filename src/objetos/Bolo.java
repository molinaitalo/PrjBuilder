/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.List;

/**
 *
 * @author lenovo
 */
public class Bolo {
    
    private int id;
    private String tamanho;
    private double precoIngr;
    private String descricao;
    private String ingrediente;
    private double precoBolo;
    public Bolo(int id, String tamanho, double precoIngr, String descricao, String ingrediente,double precoBolo)
    {
        this.id = id;
        this.tamanho = tamanho;
        this.precoIngr = precoIngr;
        this.descricao = descricao;
        this.ingrediente = ingrediente;
        this.precoBolo = precoBolo;
    }
    public Bolo()
    {
        
    }
    public int getId() {
        return id;
    }


    public String getTamanho() {
        return tamanho;
    }


    public double getPrecoIngr() {
        return precoIngr;
    }


    public String getDescricao() {
        return descricao;
    }


    public String getIngrediente() {
        return ingrediente;
    }
    
    public double getPrecoBolo()
    {
        return precoBolo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setPrecoIngr(double precoIngr) {
        this.precoIngr = precoIngr;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setPrecoBolo(double precoBolo) {
        this.precoBolo = precoBolo;
    }
    
    
}
