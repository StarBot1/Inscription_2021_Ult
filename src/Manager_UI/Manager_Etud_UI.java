/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager_UI;

import Logic_UI.Etudiant;
import Window.EtudiantUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author utilisateur
 */
public class Manager_Etud_UI  implements ActionListener{

    private EtudiantUI win=null;
    
    public Manager_Etud_UI(EtudiantUI el){
        this.win=el;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       System.out.println("Que dois-je faire????");
       
       Etudiant el=new Etudiant(win.getNomArea().getText(),win.getPrenomArea().getText(),win.getMatriculeArea().getText(),win.getTelArea().getText());
       el.enregistrer_Etud_DB();
       System.out.println(el.getInfo());
    }

    
    
}
