/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import javax.swing.JPanel;
import views.listaProduto;

/**
 *
 * @author hitch
 */
public class Centro extends JPanel {
    public Centro(){     
        add(new listaProduto());
    }
}
