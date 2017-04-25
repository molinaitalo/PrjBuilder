/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosDAO;

import Utilitarios.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import objetos.Bolo;


/**
 *
 * @author Italo
 */
public class BoloDAO {
    Connection conn;
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;
    
    public BoloDAO()
    {
        conn = new Conexao().conectar(); //Conexão
    }
    
    public void salvar(Bolo bolo)
    {
        try
        {
            PreparedStatement ppStmt = conn.prepareStatement("INSERT INTO bolos (nome, tamanho, precoIngr, ingrediente,precoBolo) values (?, ?, ?, ?,?)");
            ppStmt.setString(1, bolo.getDescricao());
            ppStmt.setString(2, bolo.getTamanho());
            ppStmt.setDouble(3, bolo.getPrecoIngr());   
            ppStmt.setString(4, bolo.getIngrediente());
            ppStmt.setDouble(5, bolo.getPrecoBolo());
            ppStmt.execute();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }  
        
    }

   
    
public List<Bolo> buscarTodos()  {
       
		try 
                {
                    
			conn = new Conexao().conectar();
			st = conn.createStatement();
               
                        rs = st.executeQuery("SELECT * FROM bolos");
                        
                        List<Bolo> bolos = new ArrayList<>();
                 
                        while(rs.next()) {
                            Bolo bdir = new Bolo();
                            
                            
                            bdir.setId(rs.getInt("idBolo")); 
                            bdir.setDescricao(rs.getString("nome"));
                            bdir.setTamanho((rs.getString("tamanho")));
                            bdir.setPrecoIngr((rs.getDouble("precoIngr")));
                            bdir.setIngrediente(rs.getString("ingrediente"));
                            bdir.setPrecoBolo(rs.getDouble("precoBolo"));
                            bolos.add(bdir);
                            
                        }
                       
                        return bolos;
                        
                }
                catch (SQLException e)
                {
                    System.out.println("Não foi possivel salvar no banco " + e.getMessage());
                    return null;
                }
                finally 
                {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					System.out.println("Nao foi possivel fechar o Statement");
				}
			}
			if (conn != null) 
                        {
				try 
                                {
					conn.close();
                                }                                 
                                catch (SQLException e)
                                {
					System.out.println("Não foi possivel fechar a conexao");
				}
			}
		}
    }
  }
