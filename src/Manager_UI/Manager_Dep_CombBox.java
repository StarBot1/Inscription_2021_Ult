/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager_UI;

import Window.DepartementUI;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import Logic_UI.*;

/**
 *
 * @author utilisateur
 */
public class Manager_Dep_CombBox implements ItemListener{

    
    DepartementUI win=null;
    
    
    public Manager_Dep_CombBox( DepartementUI el){
       this.win=el;
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if(e==null ||e.getItem()==null||e.getItem().toString().trim().equalsIgnoreCase("select Faculte"))
        {
            DepartementUI.setChoix_fac(new Faculte());
            return;
        }
        System.out.println(e.getItem().getClass()+" "+e.getItem());
       
       DepartementUI.setChoix_fac((Faculte)e.getItem());
        // if()
//     System.out.println(DepartementUI.getChoix_fac().getFaculID()+" "+DepartementUI.getChoix_fac().getNom());
    }
   
    
    
}
