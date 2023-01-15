/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager_UI;

import Logic_UI.Faculte;
import Window.FaculteUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author utilisateur
 */
public class Manager_Faculte_UI  implements ActionListener{

    private FaculteUI win=null;
    
    public Manager_Faculte_UI(FaculteUI el){
        this.win=el;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       System.out.println("Que dois-je faire????");
       
       Faculte el=new Faculte(win.getTap_nom().getText(),win.getTap_code().getText());
       el.enregistrer_Fac_DB();
       System.out.println(el.getInfo());
    }
    
    
}
