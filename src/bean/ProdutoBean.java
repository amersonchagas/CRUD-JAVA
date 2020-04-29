package bean;

public class ProdutoBean {
    private String descricao;
    private double preco;
    private int quantidade;
    
    public ProdutoBean(){}

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setQuantidade(int qnt){
        this.quantidade = qnt;
    }
       
    public String getDescricao(){
        return this.descricao;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }    
    
}
