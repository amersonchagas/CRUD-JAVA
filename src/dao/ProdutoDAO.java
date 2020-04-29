package dao;

import bean.ProdutoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProdutoDAO {
    
   

public static void adicionar(ProdutoBean produto){
        
        String sql = "INSERT INTO produto (descricao, preco, quantidade) VALUES (?, ?, ?)";
        
        try{
            Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.execute();
        }catch(Exception e){

        }    
    }
    

}
    
