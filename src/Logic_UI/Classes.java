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

/**
 *
 * @author utilisateur
 */
public class Classes {
    
    private int classeId;
    private String info, nom;
    
    public Classes(int id,String nom){
      this.classeId=id;
      this.nom=nom;
    }
  public String toString(){
      if(nom==null||nom.trim().equalsIgnoreCase(""))
          return "select les classes";
      return nom;    
  }
    public Classes(){
    }
    
    public static void loading_classes(JComboBox dest,int depID){
    
        dest.removeAllItems();
        dest.addItem(new Classes());
        
        /*ResultSet result=db_Mysql.interrogerBD("select * from classes where classeID not in (select classeID FROM departement_classes where departID="+depID+")");*/
        ResultSet result=db_Mysql.interrogerBD("select * from classes where classeID in (select classeID FROM departement_classes where departID="+depID+")");
        if(result!=null)
            try {
                while(result.next())
                    dest.addItem(new Classes(result.getInt("classeID"),result.getString("nom")));
                    
                    } catch (SQLException ex) {
            Logger.getLogger(Classes.class.getName()).log(Level.SEVERE, null, ex);
        }}
    
    
    public static Classes get_Class_A_Parti_ID(int classID){
      
       ResultSet result=db_Mysql.interrogerBD("select * from classes where classeId="+classID);
       
       if(result!=null)
           try {
               if(result.next())
                   return new Classes(result.getInt("classeId"),result.getString("nom"));
       } catch (SQLException ex) {
           Logger.getLogger(Classes.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
   }
    
    
    
    
    public String getInfo() {
        return info;
    }
    
public void enregistrer_Classes(){

    if(this.nom!=null && !this.nom.trim().equalsIgnoreCase(""))
    {
        if(db_Mysql.updateBD("insert into classes(nom) values('"+this.nom+"')")>0)
         this.info="F??licitation,l'operation reussie";
        else this.info="D??sol??, il y a eu echec pendant l'enregistrement de classe";
    }
    else this.info="D??sol??, le nom de classe est vide";
        }
    
    public int getClasseId() {
        return classeId;
    }

    public String getNom() {
        return nom;
    }

    public void setClasseId(int classeId) {
        this.classeId = classeId;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
    
}
