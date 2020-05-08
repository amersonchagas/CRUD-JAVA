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

    public static ArrayList<ProdutoBean> listar(){
        
        ArrayList<ProdutoBean> produtos = new ArrayList<>();
                
        String sql = "SELECT * FROM produto";
        
        try{
            Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            ResultSet dados = stmt.executeQuery();
            
            while(dados.next()){
                ProdutoBean temporario = new ProdutoBean();
                temporario.setId(dados.getInt("id"));
                temporario.setDescricao(dados.getString("descricao"));
                temporario.setPreco(dados.getDouble("preco"));
                temporario.setQuantidade(dados.getInt("quantidade"));
                
                produtos.add(temporario);
            }
            
        }catch(Exception e){} 
        
        return produtos;
    }   
    

    public static void excluir() { }
    
    
    public static void atualizar() { }

}
    
