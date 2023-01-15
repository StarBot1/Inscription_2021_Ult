/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager_UI;

import Logic_UI.Classes;
import Logic_UI.Departement;
import Logic_UI.departement_class;
import Window.Depart_classesUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author utilisateur
 */
public class Manager_Bt_Dep_Cl implements ActionListener{
    Depart_classesUI win;
    
    public Manager_Bt_Dep_Cl(Depart_classesUI w)
    {
        this.win=w;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e==null)
            return;
        Departement dep=(Departement)this.win.getDepart().getSelectedItem();
       Classes cl=(Classes)this.win.getClass_().getSelectedItem();
       if(dep==null || cl==null)
       { 
           JOptionPane.showMessageDialog(null, "Selectionnez le departement ou la classe!!!");
    
           return;
       }
       
       departement_class dcl=new departement_class(dep,cl);
       dcl.Enregistrer();
       JOptionPane.showMessageDialog(null, dcl.getInfo());
    
    
    }
    
}
