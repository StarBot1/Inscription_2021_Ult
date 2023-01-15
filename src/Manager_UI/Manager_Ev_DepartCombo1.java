/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager_UI;

import Logic_UI.Classes;
import Logic_UI.Departement;
import Window.Dep_Classes;
import Window.InscriptionUI;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author utilisateur
 */
public class Manager_Ev_DepartCombo1 implements ItemListener {

    InscriptionUI win=null;
    public Manager_Ev_DepartCombo1(InscriptionUI w){
        this.win=w;
        
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(e==null) return;
       Departement dep=(Departement)this.win.getDep().getSelectedItem();
       if(dep==null) return;
       Classes.loading_classes(win.getClas(), dep.getDepartID());
    }
    
    /*InscriptionUI winIns=null;
    public Manager_Ev_DepartCombo(InscriptionUI w){
        this.winIns=w;
        
    }
    @Override
    public void insitemStateChanged(ItemEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(e==null) return;
       Departement dep=(Departement)this.winIns.getDep().getSelectedItem();
       if(dep==null) return;
       Classes.loading_classes(winIns.getClas(), dep.getDepartID());
    }*/
    
}
