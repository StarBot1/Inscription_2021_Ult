/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_Table;

import Logic_UI.Classes;
import Logic_UI.Inscription;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author utilisateur
 */
public class Model_Inscription extends AbstractTableModel{

    
    /*private String[]titles=new String[]{"InscrID","Etudiant","Faculté","Departement","Classe","Année_Acad"};*/
    private String[]titles=new String[]{"InscrID","Nom","Prénom","Faculté","Departement","Classe","Année_Acad"};
    private Inscription [][] data;
    
    public String getColumnName(int col) {
         return titles[col];
    }
    public Model_Inscription(Inscription [][] el)
    {
        data=el;
      
    }
            @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(data!=null)
           return data.length;
       else return -1;
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(titles==null)
            return -1;
        return titles.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     /*if(data!=null)
     {if(columnIndex==0)
          return new Integer(data[rowIndex][columnIndex].getInscrID());
      else if(columnIndex==1)
          return data[rowIndex][columnIndex].getEtudID();
      else if(columnIndex==2)
          return data[rowIndex][columnIndex].getDepartId().getFaculID();
      else if(columnIndex==3)
          return data[rowIndex][columnIndex].getDepartId();
      else if(columnIndex==4)
          return data[rowIndex][columnIndex].getDepartId().getClass();
      else return data[rowIndex][columnIndex];
    }*/
     if(data!=null)
     {  
      if(columnIndex==0)
          return new Integer(data[rowIndex][columnIndex].getInscrID());
      else if(columnIndex==1)
          return data[rowIndex][columnIndex].getEtudID().getNom();
      else if(columnIndex==2)
          return data[rowIndex][columnIndex].getEtudID().getPrenom();
      else if(columnIndex==3)
          return data[rowIndex][columnIndex].getDepartClId().getDepart_Id().getFaculID().getNom();
      else if(columnIndex==4)
          return data[rowIndex][columnIndex].getDepartClId().getDepart_Id().getNom();
      else if(columnIndex==5)
          return data[rowIndex][columnIndex].getDepartClId().getClasse_Id().getNom();
      else if(columnIndex==6)
          return data[rowIndex][columnIndex].getAnnée_acad();
      /*else return data[rowIndex][columnIndex];*/
    }
     return null;
    }
   
    
}
