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
import Logic_UI.db_Mysql;
import Logic_UI.departement_class;
import Model_Table.Model_Inscription;
import Window.DepartementUI;
import Window.InscriptionUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author utilisateur
 */
public class Manager_Inscription_UI1 implements ActionListener {

    private departement_class departClId;
    private Classes classe_Id;
    private Departement departId;
    private Etudiant etudID;
    private String annee_acad;
    private Window.InscriptionUI fen;
    
    public Manager_Inscription_UI1(InscriptionUI el){
        this.fen=el;
 
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
       
        try {
            ResultSet rs = db_Mysql.interrogerBD("select * from inscription where inscrID="+fen.getRecup_id().getText());
            rs.next();
            departId=(Departement)fen.getDep().getSelectedItem();
            classe_Id=(Classes)fen.getClas().getSelectedItem();
            departClId=departement_class.get_DepCl_A_Parti_DepID_et_ClassId(departId.getDepartID(), classe_Id.getClasseId());
            etudID=(Etudiant)fen.getEtud().getSelectedItem();
            this.annee_acad=(String) fen.getAc().getSelectedItem();
            Etudiant test=Etudiant.get_Etud_A_Parti_ID(rs.getInt("etudID"));
            
            if(fen.getEtud().getSelectedItem().toString().equals("select les Etudiants")){
            Inscription insc=new Inscription(test,departClId,this.annee_acad);
            String recupID=fen.getRecup_id().getText();
            insc.Modifier_Inscription(recupID);
            /*this.fen.getBtn_Modifier().setEnabled(false);
            this.fen.getBtn_Enregistrer().setEnabled(true);
            
            //on actualise le tableau
            this.fen.getEtudInscTab().setModel(new Model_Inscription(Inscription.charger_Inscr_Tableau()));
            JOptionPane.showMessageDialog(null, insc.getInfo());*/
            InscriptionUI ins=new InscriptionUI();
            ins.setVisible(true);
            ins.pack();
            ins.setLocationRelativeTo(null);
            ins.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fen.dispose();
            JOptionPane.showMessageDialog(fen,"Modification reussi!!!");
            }
            else{
                Inscription insc=new Inscription(etudID,departClId,this.annee_acad);
            String recupID=fen.getRecup_id().getText();
            insc.Modifier_Inscription(recupID);
            /*this.fen.getBtn_Modifier().setEnabled(false);
            this.fen.getBtn_Enregistrer().setEnabled(true);
            
            //on actualise le tableau
            this.fen.getEtudInscTab().setModel(new Model_Inscription(Inscription.charger_Inscr_Tableau()));
            JOptionPane.showMessageDialog(null, insc.getInfo());*/
            InscriptionUI ins=new InscriptionUI();
            ins.setVisible(true);
            ins.pack();
            ins.setLocationRelativeTo(null);
            ins.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fen.dispose();
            JOptionPane.showMessageDialog(fen,"Modification reussi!!!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Manager_Inscription_UI1.class.getName()).log(Level.SEVERE, null, ex);
        }
    


    }
    
    
}
