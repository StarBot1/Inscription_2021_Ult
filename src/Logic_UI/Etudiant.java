/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic_UI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author utilisateur
 */
public class Etudiant {

   private int etudID;
   private String nom,prenom,matricule,tel,info;
   
   public Etudiant(String nom,String prenom,String matricule,String tel){
       this.nom=nom;
       this.prenom=prenom;
       this.matricule=matricule;
       this.tel=tel;
   }

    public Etudiant(int etudID, String nom, String prenom, String matricule, String tel) {
        this.etudID = etudID;
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.tel = tel;
    }
   

    
   
   public void enregistrer_Etud_DB(){
     
       if(nom==null||nom.trim().equalsIgnoreCase(""))
       {
         this.info="Tapez s'il vous plait le nom de l'étudiant";
         return;
       }
       if(prenom==null||prenom.trim().equalsIgnoreCase(""))
       {
         this.info="Tapez s'il vous plait le prenom de l'étudiant";
         return;
       }
       if(matricule==null||matricule.trim().equalsIgnoreCase(""))
       {
         this.info="Tapez s'il vous plait le N°matricule de l'étudiant";
         return;
       }
       if(tel==null||tel.trim().equalsIgnoreCase(""))
       {
         this.info="Tapez s'il vous plait le N° de Téléphone de l'étudiant";
         return;
       }
       
       if(db_Mysql.updateBD("insert into etudiant(nom,prenom,matricule,tel) values('"+this.nom+"','"+this.prenom+"','"+this.matricule+"','"+this.tel+"')")>0)
         this.info="Félicition,enregistrement a reussi";
       else this.info="Désolé, l'operation a échoué";
   }
       
    public String toString(){
      if(nom==null||nom.trim().equalsIgnoreCase(""))
          return "select les Etudiants";
      return nom+" "+prenom;    
  }
    public Etudiant(){
    }
    
    public static void loading_etudiant(JComboBox dest,String annee_acad){
    
        dest.removeAllItems();
        dest.addItem(new Etudiant());
        
        /*ResultSet result=db_Mysql.interrogerBD("select * from classes where classeID not in (select classeID FROM departement_classes where departID="+depID+")");*/
        /*ResultSet result=db_Mysql.interrogerBD("select etudiant from etudiantinsc where anneeAc='"+annee_acad+"'");*/
        /*ResultSet result=db_Mysql.interrogerBD("select concat(nom,' ',prenom) as etudiant from etudiant where etudiant not in(select etudiant from etudiantinsc where anneeAc='"+annee_acad+"'");*/
        /*ResultSet result=db_Mysql.interrogerBD("select * from etudiantinsc");*/
        /*ResultSet result=db_Mysql.interrogerBD("select * from etudiant where concat(nom,' ',prenom) not in(select etudiant from etudiantinsc where anneeAc='"+annee_acad+"')");*/
        ResultSet result=db_Mysql.interrogerBD("select * from etudiant where etudID not in(select etudID from inscription where annee_acad='"+annee_acad+"')");
        if(result!=null)
            try {
                while(result.next())
                    dest.addItem(new Etudiant(result.getInt("etudID"),result.getString("nom"),result.getString("prenom"),result.getString("matricule"),result.getString("tel")));
                    
                    } catch (SQLException ex) {
            Logger.getLogger(Etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }}
   
    public static Etudiant get_Etud_A_Parti_ID(int etudID){
      
       ResultSet result=db_Mysql.interrogerBD("select * from etudiant where etudID="+etudID);
       
       if(result!=null)
           try {
               if(result.next())
                   return new Etudiant(result.getInt("etudID"),result.getString("nom"),result.getString("prenom"),result.getString("matricule"),result.getString("tel"));
       } catch (SQLException ex) {
           Logger.getLogger(Etudiant.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
   }
   
   

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getTel() {
        return tel;
    }

    public String getInfo() {
        return info;
    }

    public int getEtudID() {
        return etudID;
    }
    
    

    
   
   
   
   
   
}
