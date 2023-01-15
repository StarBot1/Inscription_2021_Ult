/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager_UI;

import Logic_UI.Departement;
import Logic_UI.Faculte;
import Window.Depart_classesUI;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author utilisateur
 */
public class Manager_Fac_Ev implements ItemListener
{

    Depart_classesUI win;

    public Manager_Fac_Ev(Depart_classesUI w) {
        this.win=w;
    }
    
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         if(e==null) return;
         
        Faculte fac=(Faculte)this.win.getFac().getSelectedItem();
          if(fac==null) return;
      Departement.Loading_Departemnt(win.getDepart(), fac.getFaculID());
      
        
    
    }
    
}
