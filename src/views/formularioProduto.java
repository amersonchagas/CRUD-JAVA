
package views;

import bean.ProdutoBean;
import dao.ProdutoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class formularioProduto extends JPanel implements ActionListener {
      JLabel label_nome;
      JTextField campo_descricao;
      
      JLabel label_preco;
      JTextField campo_preco;
      
      JLabel label_quantidade;
      JTextField campo_quantidade;
      
      JButton botao_salvar;
    
    public formularioProduto(){
        label_nome = new JLabel("Nome: ");
        campo_descricao = new JTextField(20);
        label_preco = new JLabel("Preço: ");
        campo_preco = new JTextField(20);
        label_quantidade = new JLabel("Quantidade:");
        campo_quantidade = new JTextField(20);
        
        botao_salvar = new JButton("Salvar");
        botao_salvar.addActionListener(this);
        
        add(label_nome);
        add(campo_descricao);
        add(label_preco);
        add(campo_preco);
        add(label_quantidade);
        add(campo_quantidade);
        add(botao_salvar);
        
    
    }

    formularioProduto(int idProduto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String descricao_digitado = campo_descricao.getText();
       double preco_digitado = Double.parseDouble(campo_preco.getText());
       int qnt_digitada  = Integer.parseInt(campo_quantidade.getText());
       
       ProdutoBean p = new ProdutoBean();
       p.setDescricao(descricao_digitado);
       p.setPreco(preco_digitado);
       p.setQuantidade(qnt_digitada);
       
      
       ProdutoDAO.adicionar(p);
       
    }

   

    
}
