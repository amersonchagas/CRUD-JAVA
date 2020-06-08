/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import static principal.IniciarAplicacao.centro;
import views.formularioProduto;
import views.listaProduto;

/**
 *
 * @author hitch
 */
public class Topo extends JPanel {
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;
    private JButton botao4;
    private JButton botao5;
    
    public Topo(){
        GridLayout layoutTopo = new GridLayout();        
        setLayout(layoutTopo);
        botao1 = new JButton("Produtos");
        botao1.addActionListener(
        
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    centro.removeAll();
                    centro.add(new listaProduto());   
                    centro.repaint();                 
                    centro.validate();
                }
            }
        );
        
        botao2 = new JButton("Clientes");
        botao2.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    centro.removeAll();
                    centro.add(new listaProduto());   
                    centro.repaint();                 
                    centro.validate();
                }
            });
        
        botao3 = new JButton("Vendas");
        botao3.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    centro.removeAll();
                    centro.add(new listaProduto());   
                    centro.repaint();                 
                    centro.validate();
                }
            });
        
        botao4 = new JButton("Funcionarios");
        botao4.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    centro.removeAll();
                    centro.add(new listaProduto());   
                    centro.repaint();                 
                    centro.validate();
                }
            });
        
        botao5 = new JButton("Setores");
        botao5.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    centro.removeAll();
                    centro.add(new listaProduto());   
                    centro.repaint();                 
                    centro.validate();
                }
            });
        
        add(botao1);
        add(botao2);
        add(botao3);
        add(botao4);
        add(botao5);
    }
    
}
