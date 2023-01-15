/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_Table;

import Logic_UI.Departement;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author utilisateur
 */
public class Model_Departement extends AbstractTableModel{

    
    private String[]titles=new String[]{"Id departement","Faculté","Nom de département"};
    private Departement [][] data;
    
    public String getColumnName(int col) {
         return titles[col];
    }
    public Model_Departement(Departement [][] el)
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
     if(data!=null)
     {if(columnIndex==0)
          return new Integer(data[rowIndex][columnIndex].getDepartID());
      else if(columnIndex==1)
          return data[rowIndex][columnIndex].getFaculID();
      else return data[rowIndex][columnIndex];
    }
     return null;
    }
    
}
