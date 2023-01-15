/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager_UI;

import Window.Classe_UI;
import Logic_UI.Classes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author utilisateur
 */
public class Manager_Classe_UI implements ActionListener{

    private Classe_UI win=null;
    public Manager_Classe_UI(Classe_UI el){
      win=el;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(e!=null){
        Classes cl=new Classes(-1,win.getNom_clas().getText());
         cl.enregistrer_Classes();
         JOptionPane.showMessageDialog(null, cl.getInfo());
    
         
       }
    }
    
}
