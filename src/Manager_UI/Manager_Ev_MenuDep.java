/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager_UI;

import Window.Classe_UI;
import Window.Depart_classesUI;
import Window.DepartementUI;
import Window.EtudiantUI;
import Window.FaculteUI;
import Window.InscriptionUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author utilisateur
 */
public class Manager_Ev_MenuDep implements ActionListener{

    DepartementUI win;
    
    public Manager_Ev_MenuDep(DepartementUI w){
        this.win=w;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if("Inscription".equals(e.getActionCommand())){
            
        InscriptionUI inscr=new InscriptionUI();
        inscr.setVisible(true);
        inscr.pack();
        inscr.setLocationRelativeTo(null);
        inscr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.dispose();
        }
        
        else if("Faculté".equals(e.getActionCommand())){
            
        FaculteUI fac=new FaculteUI();
        fac.setVisible(true);
        fac.pack();
        fac.setLocationRelativeTo(null);
        fac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.dispose();
        }
        
        else if("Classe".equals(e.getActionCommand())){
            
        Classe_UI clas=new Classe_UI();
        clas.setVisible(true);
        clas.pack();
        clas.setLocationRelativeTo(null);
        clas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.dispose();
        }
        
        else if("Département_Classe".equals(e.getActionCommand())){
            
        Depart_classesUI depCl=new Depart_classesUI();
        depCl.setVisible(true);
        depCl.pack();
        depCl.setLocationRelativeTo(null);
        depCl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.dispose();
        }
        
        else if("Etudiant".equals(e.getActionCommand())){
            
        EtudiantUI etud=new EtudiantUI();
        etud.setVisible(true);
        etud.pack();
        etud.setLocationRelativeTo(null);
        etud.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.dispose();
        }
        
    }
    
    
}
