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
import Model_Table.Model_Departement;
import Model_Table.Model_Inscription;
import Window.DepartementUI;
import Window.InscriptionUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author utilisateur
 */
public class Manager_Tab_Inscr_UI implements ListSelectionListener {

    InscriptionUI win=null;
    public Manager_Tab_Inscr_UI(InscriptionUI w){
       this.win=w;
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            win.getBtn_Enregistrer().setEnabled(false);
            win.getBtn_Modifier().setEnabled(true);
            Model_Inscription model=(Model_Inscription)win.getEtudInscTab().getModel();
            int Myindex = win.getEtudInscTab().getSelectedRow();
            win.getRecup_id().setText(model.getValueAt(Myindex, 0).toString());
            ResultSet rs = db_Mysql.interrogerBD("select * from inscription where inscrID="+win.getRecup_id().getText());
            rs.next();
            ResultSet rs1 = db_Mysql.interrogerBD("select * from departement_classes where departClID="+rs.getInt("departClID"));
            rs1.next();
            ResultSet rs2 = db_Mysql.interrogerBD("select * from departement where departId="+rs1.getInt("departID"));
            rs2.next();
            Etudiant etud=Etudiant.get_Etud_A_Parti_ID(rs.getInt("etudID"));
            Departement dep=Departement.get_Dep_A_Parti_ID(rs1.getInt("departID"));
            Classes clas=Classes.get_Class_A_Parti_ID(rs1.getInt("classeID"));
            Faculte fac=Faculte.get_Fac_A_Parti_ID(rs2.getInt("faculID"));
            String anc=rs.getString("annee_acad");
            int i;
            int f=0;
            int d=0;
            int c=0;
            DefaultComboBoxModel facul=(DefaultComboBoxModel)win.getFac().getModel();
            int sizefac=win.getFac().getItemCount();
            for(i=0;i<sizefac;i++){
                Faculte recfac=(Faculte) facul.getElementAt(i);
                if(fac.getFaculID()==recfac.getFaculID()){
                    win.getFac().setSelectedItem(recfac);
                    break;
                }
                
            }
            
            DefaultComboBoxModel depar=(DefaultComboBoxModel)win.getDep().getModel();
            int sizedep=win.getDep().getItemCount();
            for(i=0;i<sizedep;i++){
                Departement recdep=(Departement) depar.getElementAt(i);
                if(dep.getDepartID()==recdep.getDepartID()){
                    win.getDep().setSelectedItem(recdep);
                    break;
                }
                
            }
            
            
            DefaultComboBoxModel clase=(DefaultComboBoxModel)win.getClas().getModel();
            int sizeclas=win.getClas().getItemCount();
            for(i=0;i<sizeclas;i++){
                Classes recclas=(Classes) clase.getElementAt(i);
                if(clas.getClasseId()==recclas.getClasseId()){
                    win.getClas().setSelectedItem(recclas);
                    break;
                }
                
            }
            
        
        DefaultComboBoxModel ac=(DefaultComboBoxModel)win.getAc().getModel();
            int sizeac=win.getAc().getItemCount();
            for(i=0;i<sizeac;i++){
                String recac=(String)ac.getElementAt(i);
                if(anc.equals(recac)){
                    win.getAc().setSelectedItem(recac);
                    break;
                }
                
            }
        
        /*win.getAc().setEditable(true);
        win.getAc().setSelectedItem(model.getValueAt(Myindex,6).toString());*/
        
        } catch (SQLException ex) {
            Logger.getLogger(Manager_Tab_Inscr_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
}
