
package principal;

import bean.ProdutoBean;
import dao.ProdutoDAO;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import layout.Centro;
import layout.Direita;
import layout.Esquerda;
import layout.Rodape;
import layout.Topo;
import views.formularioProduto;


public class IniciarAplicacao {
    public static Centro centro = new Centro();
    
    public static void main(String[] args){       
        
        BorderLayout layout_janela = new BorderLayout();
        
        JFrame janela = new JFrame();
        janela.setLayout(layout_janela);
        janela.add(centro, BorderLayout.CENTER);
        janela.add(new Topo(), BorderLayout.NORTH);
        janela.add(new Rodape(), BorderLayout.SOUTH);
        janela.add(new Esquerda(), BorderLayout.EAST);
        janela.add(new Direita(), BorderLayout.WEST);   
        janela.pack();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }    
}
