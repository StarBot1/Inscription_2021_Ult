/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic_UI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author utilisateur
 */
public class Inscription {
   
    private int inscrID;
    private Etudiant etudID;
    private departement_class departClId;
    private String annee_acad,info;

    public Inscription(int inscrID, Etudiant etudID, departement_class departClId, String année_acad) {
        this.inscrID = inscrID;
        this.departClId = departClId;
        this.etudID = etudID;
        this.annee_acad = année_acad;
    }

    
    
  public static Inscription[][] charger_Inscr_Tableau(){
      List<Inscription> el=null;
      departement_class depCl=null;
      Etudiant etud=null;
      /*ResultSet result=db_Mysql.interrogerBD("select inscrID,etudID,departID,annee_acad from inscription order by etudID");*/
       ResultSet result=db_Mysql.interrogerBD("select * from inscription order by etudID");       
    
      if(result!=null)
      {   el=new ArrayList<Inscription>();
          try {
              while(result.next()){
                  //eviter le gaspillage de la memoire
                  //on va réutiliser l'object precedent
                if(depCl==null || etud==null){
                    depCl=departement_class.get_DepCl_A_Parti_ID(result.getInt("departClID"));
                    etud=Etudiant.get_Etud_A_Parti_ID(result.getInt("etudID"));
                }
                else  if(depCl.getDepart_clId()!=result.getInt("departClID") || etud.getEtudID()!=result.getInt("etudID")){
                        depCl=departement_class.get_DepCl_A_Parti_ID(result.getInt("departClID"));
                        etud=Etudiant.get_Etud_A_Parti_ID(result.getInt("etudID"));
                }
                
                 el.add(new Inscription(result.getInt("inscrID"),etud,depCl,result.getString("annee_acad")));
                
                  
              }
          } catch (SQLException ex) {
              Logger.getLogger(Inscription.class.getName()).log(Level.SEVERE, null, ex);
          }
               
          }
      
      Inscription [][]data=null;
      
      if(el!=null &&el.size()>0){
      
          data=new Inscription[el.size()][7];
          int  j=0;
          for(Inscription d:el){
             
              for(int i=0;i<7;i++)
                  data[j][i]=d;
              j++;
          
          }
          
      }
      
      
      return data;
  }  
    
    /*
    
  public String toString(){
        
      if(nom==null||nom.trim().equalsIgnoreCase(""))
          return "Select les départements";
      return nom;    
  }
    public Inscription(){}

    public Faculte getFaculID() {
        return faculID;
    }
    
    
    public static void Loading_Departemnt(JComboBox dest,int facID){
    
        dest.removeAllItems();
        dest.addItem(new Inscription());
        
        ResultSet result=db_Mysql.interrogerBD("select * from departement where faculID="+facID);
         //
        // System.out.println("select * from departement where faculID="+facID);
        if(result!=null)
        try {
            
            while(result.next()){
                   dest.addItem(new Inscription(result.getInt("departID"),result.getString("nom")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inscription.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
*/

    public int getInscrID() {
        return inscrID;
    }

    public String getAnnée_acad() {
        return annee_acad;
    }

    public departement_class getDepartClId() {
        return departClId;
    }

    public Etudiant getEtudID() {
        return etudID;
    }
    
    

    public Inscription(int inscrID, String année_acad) {
        this.inscrID = inscrID;
        this.annee_acad = année_acad;
    }

    public Inscription(Etudiant etudID, departement_class departClId, String année_acad) {
        this.departClId = departClId;
        this.etudID = etudID;
        this.annee_acad = année_acad;
    }
    
    

    public String getInfo() {
        return info;
    }
    
  public void enregistrer_Inscription(){
     
      if(db_Mysql.updateBD("insert into inscription(etudID,departClID,annee_acad) values('"+this.etudID.getEtudID()+"',"+this.departClId.getDepart_clId()+",'"+this.annee_acad+"')")>0)
          this.info="Felicitation, l'operation effectuée avec succes";
      else 
          this.info="Désolé, l'echec de l'operation!!";
  }
  
  public void Modifier_Inscription(String inscrID){
     
      if(db_Mysql.updateBD("Update inscription set etudID="+this.etudID.getEtudID()+",departClID="+this.departClId.getDepart_clId()+",annee_acad='"+this.annee_acad+"'"+"where inscrID="+inscrID)>0)
          this.info="Felicitation, l'operation effectuée avec succes";
      else 
          this.info="Désolé, l'echec de l'operation!!";
  }

    
}
