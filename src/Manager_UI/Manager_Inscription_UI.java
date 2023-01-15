/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager_UI;

import Logic_UI.Classes;
import Logic_UI.Departement;
import Logic_UI.Etudiant;
import Logic_UI.Faculte;
import Logic_UI.Inscription;
import Logic_UI.departement_class;
import Model_Table.Model_Inscription;
import Window.DepartementUI;
import Window.InscriptionUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author utilisateur
 */
public class Manager_Inscription_UI implements ActionListener {

    private departement_class departClId;
    private Classes classe_Id;
    private Departement departId;
    private Etudiant etudID;
    private String annee_acad;
    private Window.InscriptionUI fen;
    
    public Manager_Inscription_UI(InscriptionUI el){
        this.fen=el;
 
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
       
        departId=(Departement)fen.getDep().getSelectedItem();
        classe_Id=(Classes)fen.getClas().getSelectedItem();
       departClId=departement_class.get_DepCl_A_Parti_DepID_et_ClassId(departId.getDepartID(), classe_Id.getClasseId());
        etudID=(Etudiant)fen.getEtud().getSelectedItem();
       this.annee_acad=(String) fen.getAc().getSelectedItem();
       
       if(departClId==null || etudID==null || this.annee_acad==null)
       {
           JOptionPane.showMessageDialog(null,"Désolé, l'echec de l'operation!!");
       }
       else
       {
       Inscription insc=new Inscription(etudID,departClId,this.annee_acad);
    
        insc.enregistrer_Inscription();
        
        //on actualise le tableau
        this.fen.getEtudInscTab().setModel(new Model_Inscription(Inscription.charger_Inscr_Tableau()));
        JOptionPane.showMessageDialog(null, insc.getInfo());
       }


    }
    
    
}
