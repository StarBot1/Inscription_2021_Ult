/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager_UI;

import Logic_UI.Departement;
import Logic_UI.Faculte;
import Window.Classe_UI;
import Window.Dep_Classes;
import Window.Depart_classesUI;
import Window.DepartementUI;
import Window.EtudiantUI;
import Window.FaculteUI;
import Window.InscriptionUI;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;

/**
 *
 * @author utilisateur
 */
public class Manager_Ev_MenuInscr implements ActionListener{

    InscriptionUI win;
    
    public Manager_Ev_MenuInscr(InscriptionUI w){
        this.win=w;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if("Faculté".equals(e.getActionCommand())){
            
        FaculteUI fac=new FaculteUI();
        fac.setVisible(true);
        fac.pack();
        fac.setLocationRelativeTo(null);
        fac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.dispose();
        }
        
        else if("Département".equals(e.getActionCommand())){
            
        DepartementUI dep=new DepartementUI();
        dep.setVisible(true);
        dep.pack();
        dep.setLocationRelativeTo(null);
        dep.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
