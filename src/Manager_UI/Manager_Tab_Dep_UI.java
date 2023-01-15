/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager_UI;

import Logic_UI.Departement;
import Logic_UI.Faculte;
import Window.DepartementUI;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author utilisateur
 */
public class Manager_Tab_Dep_UI implements ListSelectionListener {

    DepartementUI win=null;
    public Manager_Tab_Dep_UI(DepartementUI w){
       this.win=w;
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Departement d=(Departement)win.getTab_Dep().getValueAt(win.getTab_Dep().getSelectedRow(),2);
       /*----------*/
       /*St c=(Faculte)win.getTab_Dep().getValueAt(win.getTab_Dep().getSelectedRow(),1);*/
       /*Faculte c=(Faculte)win.getTab_Dep().getValueAt(win.getTab_Dep().getSelectedRow(),1);*/
       
       
       /*------------*/
       DepartementUI.depID=d;
       win.getBt_dep_enre().setEnabled(false);
       win.getBt_mod_dep().setEnabled(true);
       if(d!=null)
           win.getNom_dep().setText(d.getNom());
       System.out.println("Data selectionnée:"+d);
    }
    
}
