/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager_UI;

import Logic_UI.Departement;
import Logic_UI.Faculte;
import Model_Table.Model_Departement;
import Window.DepartementUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author utilisateur
 */
public class Manager_Departement_UI implements ActionListener {

     
    private Faculte facultID;
    private String nom_dep;
    private Window.DepartementUI fen;
    
    public Manager_Departement_UI(DepartementUI el){
        this.fen=el;
 
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
       
        facultID=(Faculte)fen.getFac().getSelectedItem();
       this.nom_dep=fen.getNom_dep().getText();
       Departement dep_=new Departement(facultID,this.nom_dep);
    
        dep_.enregistrer_Departement();
        
        //on actualise le tableau
        this.fen.getTab_Dep().setModel(new Model_Departement(Departement.charger_Depart_Tableau()));
        JOptionPane.showMessageDialog(null, dep_.getInfo());
    


    }
    
    
}
