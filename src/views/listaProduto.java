
package views;

import bean.ProdutoBean;
import dao.ProdutoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static principal.IniciarAplicacao.centro;


public class listaProduto extends JPanel {
      private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
    private static JTable tabela;
      private String[] colunas = {"ID", "DESCRICAO", "PRECO", "QUANTIDADE"};
      private Object[][] linhas;
      
    private static DefaultTableModel modelo ;
      
      public listaProduto(){
          
          modelo = new DefaultTableModel(linhas, colunas);
        
          botaoAdicionar = new JButton("Adicionar");
          botaoEditar = new JButton("Editar");
          botaoExcluir = new JButton("Excluir");          
          botaoAdicionar.addActionListener(new AdicionarListener());
          botaoEditar.addActionListener(new EditarListener());
          botaoExcluir.addActionListener(new ExcluirListener());
          
          
          tabela = new JTable(modelo);
          
          
          ArrayList<ProdutoBean> produtos = ProdutoDAO.listar();
          
          for(ProdutoBean produto: produtos){
            String id = Integer.toString(produto.getId());
            String descricao = produto.getDescricao();
            String preco = Double.toString(produto.getPreco());
            String quantidade = Integer.toString(produto.getQuantidade());

            String[] linha = new String[]{id, descricao, preco, quantidade};

               modelo.addRow(linha);       
          }
          
          add(tabela);
          
          add(botaoAdicionar);
          add(botaoEditar);
          add(botaoExcluir);
      }
     
      

    private static class AdicionarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            centro.removeAll();
            centro.add(new formularioProduto());   
            centro.repaint();                 
            centro.validate();
        }
    }
    
    private static class ExcluirListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {            
            int registroSelecionado = tabela.getSelectedRow();
            
            if(registroSelecionado >= 0){                   
                int idProduto = Integer.parseInt(tabela.getValueAt(registroSelecionado, 0).toString());
                String descricaoProduto = tabela.getValueAt(registroSelecionado, 1).toString();
 
                ProdutoDAO.excluir(idProduto);
                modelo.removeRow(registroSelecionado);      
                       
                JOptionPane.showMessageDialog(null, "o Registro "+descricaoProduto+" foi  excluido"); 
                    
            }else{
                JOptionPane.showMessageDialog(null, "Selecione um Registro");
            }
        }
    }
    
    
    private static class EditarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {            
            int registroSelecionado = tabela.getSelectedRow();
            
            if(registroSelecionado >= 0){
                int idProduto = Integer.parseInt(tabela.getValueAt(registroSelecionado, 0).toString());                 
                centro.removeAll();
                centro.add(new formularioProduto(idProduto));
                centro.repaint();
                centro.validate();                   
            }else{
                JOptionPane.showMessageDialog(null, "Selecione um Registro");
            }
        }
    }
    
    
}
