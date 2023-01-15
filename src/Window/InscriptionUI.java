/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Window;

import Logic_UI.Classes;
import Logic_UI.Departement;
import Logic_UI.Etudiant;
import Logic_UI.Faculte;
import Logic_UI.Inscription;
import Manager_UI.Manager_Ev_DepartCombo1;
import Manager_UI.Manager_Ev_EtudCombo;
import Manager_UI.Manager_Ev_FaculteUI1;
import Manager_UI.Manager_Ev_MenuInscr;
import Manager_UI.Manager_Inscription_UI;
import Manager_UI.Manager_Inscription_UI1;
import Manager_UI.Manager_Tab_Dep_UI;
import Manager_UI.Manager_Tab_Inscr_UI;
import Model_Table.Model_Inscription;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;

/**
 *
 * @author HP
 */
public class InscriptionUI extends javax.swing.JFrame {

    /**
     * Creates new form EtudiantUI
     */
    
    public static Inscription InscrID=null;
    public InscriptionUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        Faculte.Loading_Faculty(fac);
        Departement.Loading_Departemnt(dep, -1);
        Classes.loading_classes(clas, -1);
        Etudiant.loading_etudiant(etud,"");
        fac.addItemListener(new Manager_Ev_FaculteUI1(this));
        dep.addItemListener(new Manager_Ev_DepartCombo1(this));
        ac.addItemListener(new Manager_Ev_EtudCombo(this));
        btn_Enregistrer.addActionListener(new Manager_Inscription_UI(this));
        btn_Modifier.addActionListener(new Manager_Inscription_UI1(this));
        etudInscTab.setModel(new Model_Inscription(Inscription.charger_Inscr_Tableau()));
        etudInscTab.getSelectionModel().addListSelectionListener(new Manager_Tab_Inscr_UI(this));
        facMen.addActionListener(new Manager_Ev_MenuInscr(this));
        depMen.addActionListener(new Manager_Ev_MenuInscr(this));
        clasMen.addActionListener(new Manager_Ev_MenuInscr(this));
        depClMen.addActionListener(new Manager_Ev_MenuInscr(this));
        etudMen.addActionListener(new Manager_Ev_MenuInscr(this));
        /*AfficherTable();*/
        btn_Enregistrer.setEnabled(true);
        btn_Modifier.setEnabled(false);
    }

    public JComboBox<String> getClas() {
        return clas;
    }

    public JComboBox<String> getDep() {
        return dep;
    }

    public JComboBox<String> getEtud() {
        return etud;
    }

    public JComboBox<String> getFac() {
        return fac;
    }

    public JComboBox<String> getAc() {
        return ac;
    }

    public JTable getEtudInscTab() {
        return etudInscTab;
    }

    public JButton getBtn_Enregistrer() {
        return btn_Enregistrer;
    }

    public JButton getBtn_Modifier() {
        return btn_Modifier;
    }

    public JLabel getRecup_id() {
        return recup_id;
    }

    public JMenu getNavMenu() {
        return navMenu;
    }

    public JMenuItem getFacMen() {
        return facMen;
    }
    
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    /* ResultSet Rs=null;
public void AfficherTable(){
    
    Rs=db_Mysql.interrogerBD("select * from etudiantinsc");
    etudInscTab.setModel(DbUtils.resultSetToTableModel(Rs));
}*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Enregistrer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fac = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        dep = new javax.swing.JComboBox<>();
        etud = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ac = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        clas = new javax.swing.JComboBox<>();
        btn_Modifier = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        etudInscTab = new javax.swing.JTable();
        recup_id = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        navMenu = new javax.swing.JMenu();
        facMen = new javax.swing.JMenuItem();
        depMen = new javax.swing.JMenuItem();
        clasMen = new javax.swing.JMenuItem();
        depClMen = new javax.swing.JMenuItem();
        etudMen = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_Enregistrer.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        btn_Enregistrer.setText("Enregistrer");
        btn_Enregistrer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EnregistrerMouseClicked(evt);
            }
        });
        btn_Enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnregistrerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel1.setText("Faculté");

        fac.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel2.setText("Département");

        dep.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        etud.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel3.setText("Etudiant");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel4.setText("Année Acad");

        ac.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        ac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select l'Année Acad", "2019-2020", "2020-2021", "2021-2022" }));
        ac.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel5.setText("Classe");

        clas.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        clas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item1", "Item2", "Item3" }));

        btn_Modifier.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        btn_Modifier.setText("Modifier");
        btn_Modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ModifierMouseClicked(evt);
            }
        });
        btn_Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModifierActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel6.setText("Page gérant les inscription des étudiants");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        etudInscTab.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        etudInscTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Inscription ID", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        etudInscTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etudInscTabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(etudInscTab);

        recup_id.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        recup_id.setForeground(new java.awt.Color(240, 240, 240));
        recup_id.setText("recup");

        navMenu.setText("Navigation_Menu");
        navMenu.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        facMen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        facMen.setText("Faculté");
        facMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facMenActionPerformed(evt);
            }
        });
        navMenu.add(facMen);

        depMen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        depMen.setText("Département");
        navMenu.add(depMen);

        clasMen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        clasMen.setText("Classe");
        navMenu.add(clasMen);

        depClMen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        depClMen.setText("Département_Classe");
        depClMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depClMenActionPerformed(evt);
            }
        });
        navMenu.add(depClMen);

        etudMen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        etudMen.setText("Etudiant");
        etudMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etudMenActionPerformed(evt);
            }
        });
        navMenu.add(etudMen);

        jMenuBar1.add(navMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(208, 208, 208))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fac, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(etud, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(clas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(434, 434, 434))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Enregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btn_Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(397, 397, 397)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dep, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(recup_id))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(clas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(dep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(etud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Enregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(recup_id, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EnregistrerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EnregistrerMouseClicked
        // TODO add your handling code here:
     /*etud.getSelectedItem();
     fac.getSelectedItem();
     dep.getSelectedItem();
     clas.getSelectedItem();
     ac.getSelectedItem();
        db_Mysql.updateBD("insert into etudiantinsc(etudiant,faculte,departement,classe,anneeAc)"
             + "values('"+etud.getSelectedItem()+"','"+fac.getSelectedItem()+"','"+dep.getSelectedItem()
            +"','"+clas.getSelectedItem()+"','"+ac.getSelectedItem()+"')");
        AfficherTable();*/
     etudInscTab.setModel(new Model_Inscription(Inscription.charger_Inscr_Tableau()));
    }//GEN-LAST:event_btn_EnregistrerMouseClicked

    private void btn_ModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ModifierMouseClicked
        // TODO add your handling code here:
        /*String Query="Update etudiantinsc set etudiant='"+etud.getSelectedItem()+"'"+",faculte='"+fac.getSelectedItem()+"'"+",departement='"+dep.getSelectedItem()+"'"+",classe='"+clas.getSelectedItem()+"'"+",anneeAc='"+ac.getSelectedItem()+"'"+"where etud_InscrID="+recup_id.getText();
        db_Mysql.updateBD(Query);
        AfficherTable();
        btn_Enregistrer.setEnabled(true);
        btn_Modifier.setEnabled(false);
        JOptionPane.showMessageDialog(this,"Modification reussi!!!");*/
        /*etudInscTab.setModel(new Model_Inscription(Inscription.charger_Inscr_Tableau()));*/
    }//GEN-LAST:event_btn_ModifierMouseClicked

    private void etudInscTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etudInscTabMouseClicked
        // TODO add your handling code here:
        /*btn_Enregistrer.setEnabled(false);
        btn_Modifier.setEnabled(true);
        DefaultTableModel model=(DefaultTableModel)etudInscTab.getModel();
        int Myindex = etudInscTab.getSelectedRow();
        etud.setEditable(true);
        etud.setSelectedItem(model.getValueAt(Myindex,1).toString());
        fac.setEditable(true);
        fac.setSelectedItem(model.getValueAt(Myindex,2).toString());
        dep.setEditable(true);
        dep.setSelectedItem(model.getValueAt(Myindex,3).toString());
        clas.setEditable(true);
        clas.setSelectedItem(model.getValueAt(Myindex,4).toString());
        ac.setEditable(true);
        ac.setSelectedItem(model.getValueAt(Myindex,5).toString());
        recup_id.setText(model.getValueAt(Myindex,0).toString());*/
    }//GEN-LAST:event_etudInscTabMouseClicked

    private void btn_EnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnregistrerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EnregistrerActionPerformed

    private void btn_ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ModifierActionPerformed

    private void depClMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depClMenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depClMenActionPerformed

    private void facMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facMenActionPerformed
        // TODO add your handling code here:
        /*FaculteUI fac=new FaculteUI();
        fac.setVisible(true);
        fac.pack();
        fac.setLocationRelativeTo(null);
        fac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();*/
    }//GEN-LAST:event_facMenActionPerformed

    private void facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facActionPerformed

    private void etudMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etudMenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etudMenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InscriptionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InscriptionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InscriptionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InscriptionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InscriptionUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ac;
    private javax.swing.JButton btn_Enregistrer;
    private javax.swing.JButton btn_Modifier;
    private javax.swing.JComboBox<String> clas;
    private javax.swing.JMenuItem clasMen;
    private javax.swing.JComboBox<String> dep;
    private javax.swing.JMenuItem depClMen;
    private javax.swing.JMenuItem depMen;
    private javax.swing.JComboBox<String> etud;
    private javax.swing.JTable etudInscTab;
    private javax.swing.JMenuItem etudMen;
    private javax.swing.JComboBox<String> fac;
    private javax.swing.JMenuItem facMen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu navMenu;
    private javax.swing.JLabel recup_id;
    // End of variables declaration//GEN-END:variables
}
