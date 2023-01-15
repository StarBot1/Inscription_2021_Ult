/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager_UI;

import Logic_UI.Departement;
import Logic_UI.Faculte;
import Window.Dep_Classes;
import Window.InscriptionUI;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author utilisateur
 */
public class Manager_Ev_FaculteUI1 implements ItemListener{

    InscriptionUI win;
    
    public Manager_Ev_FaculteUI1(InscriptionUI w){
        this.win=w;
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(e==null) return;
       Faculte fac=(Faculte)this.win.getFac().getSelectedItem();
       if(fac==null)return;
       
       Departement.Loading_Departemnt(this.win.getDep(), fac.getFaculID());
       
    }
    
    /*InscriptionUI winIns;
    
    public Manager_Ev_FaculteUI(InscriptionUI w){
        this.winIns=w;
    }
    @Override
    public void inscitemStateChanged(ItemEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(e==null) return;
       Faculte fac=(Faculte)this.winIns.getFac().getSelectedItem();
       if(fac==null)return;
       
       Departement.Loading_Departemnt(this.win.getDep(), fac.getFaculID());
       
    }*/
    
    
}
