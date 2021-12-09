/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DrugSupplier;

import Business.Chemical.Chemical;
import Business.Drug.Drug;
import Business.Drug.DrugList;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Gene.Gene;
import Business.Network.Network;
import Business.Organization.DrugOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author venu0
 */
public class AddChemicalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddChemicalsJPanel
     */
    private Drug drug;
    private DrugList drugList;
     private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private DrugOrganization drugOrganization ;
    private Enterprise enterprise;
    private Object e;
    private static Logger log = Logger.getLogger(AddChemicalsJPanel.class);
    private static final String CLASS_NAME = AddChemicalsJPanel.class.getName();
    
    private Network network;
    public AddChemicalsJPanel(JPanel userProcessContainer,EcoSystem business,UserAccount userAccount,DrugOrganization organization,Enterprise enterprise,Network network,Drug drug) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.enterprise = enterprise;
        this.network = network;
        this.drug = drug;
        this.drugOrganization = (DrugOrganization)organization;
        populateTable();
    }
    
    public void populateTable(){
         DefaultTableModel model = (DefaultTableModel)chemicalGeneTbl.getModel();
        
        model.setRowCount(0);
        Object[] row = new Object[2];
        int i = 0;
            for(Chemical c : drug.getChemicalList().getChemList()){
                 
                 row[0] = c.getChemicalName();
                 
                    
                    Gene g=  drug.getGeneHistory().getGeneHistory().get(i);
                      
                      row[1] = g.getGeneName();
                      model.addRow(row);
                     i++;
                 }
                 
            
         
        
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        chemicalGeneTbl = new javax.swing.JTable();
        chemicalTxt = new javax.swing.JTextField();
        GeneTextField = new javax.swing.JTextField();
        chemicalLabel = new javax.swing.JLabel();
        geneLabel = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        processlbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chemicalGeneTbl.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        chemicalGeneTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ChemicalName", "GeneName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        chemicalGeneTbl.setRowHeight(30);
        chemicalGeneTbl.getTableHeader().setResizingAllowed(false);
        chemicalGeneTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(chemicalGeneTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 139, 630, 150));

        chemicalTxt.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 20)); // NOI18N
        chemicalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chemicalTxtActionPerformed(evt);
            }
        });
        add(chemicalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 357, 200, -1));

        GeneTextField.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 20)); // NOI18N
        add(GeneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 423, 200, -1));

        chemicalLabel.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 20)); // NOI18N
        chemicalLabel.setForeground(new java.awt.Color(0, 0, 102));
        chemicalLabel.setText("ChemicalName");
        add(chemicalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 361, -1, -1));

        geneLabel.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 20)); // NOI18N
        geneLabel.setForeground(new java.awt.Color(0, 0, 102));
        geneLabel.setText("GeneName");
        add(geneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 427, 150, -1));

        addBtn.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 0, 102));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 524, 110, -1));

        backBtn.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 0, 102));
        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\vgout\\AED_ASSIGNMENT\\AED_ASSIGNMENT_LAB\\biogen_finalproject\\BioGen_FinalProject\\src\\Image\\backbtn")); // NOI18N
        backBtn.setText(" Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 524, -1, -1));

        processlbl.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 48)); // NOI18N
        processlbl.setForeground(new java.awt.Color(0, 0, 102));
        processlbl.setText("Chemical and Gene Names");
        add(processlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, 53));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Gene.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, -1, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void chemicalTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chemicalTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chemicalTxtActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
         String chemicalName = chemicalTxt.getText().trim();
         String geneName = GeneTextField.getText().trim();
         if(chemicalName.isEmpty())
         {
             JOptionPane.showMessageDialog(null,"Please enter the chemical name");
             return;
         }
         if(geneName.isEmpty())
         {
             JOptionPane.showMessageDialog(null, "please enter the gene name ");
             return;
         }
         ArrayList<String> chemicalCheck = new ArrayList<>();
         for(Chemical c : drug.getChemicalList().getChemList())
         {
             chemicalCheck.add(c.getChemicalName().toLowerCase());
             
         }
         ArrayList<String>genecheck= new ArrayList<>();
         for(Gene g:drug.getGeneHistory().getGeneHistory())
         {
             genecheck.add(g.getGeneName().toLowerCase());
         }
         if(chemicalCheck.contains(chemicalName.toLowerCase()))
         {
             JOptionPane.showMessageDialog(null,"Chemical already exists in the drug ");
             return;
             
         }
         if(genecheck.contains(geneName.toLowerCase()))
         {
          JOptionPane.showMessageDialog(null,"Gene already exists in the drug ");
             return;   
         }
        drug.getChemicalList().addChemicalList().setChemicalName(chemicalName);
        drug.getGeneHistory().addGeneList().setGeneName(geneName);
       
        populateTable();
        log.debug(userAccount+" "+"added chemicals and genes to drug"+" "+drug);
        chemicalTxt.setText("");
        GeneTextField.setText("");
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AddDrugJPanel dwjp = (AddDrugJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GeneTextField;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable chemicalGeneTbl;
    private javax.swing.JLabel chemicalLabel;
    private javax.swing.JTextField chemicalTxt;
    private javax.swing.JLabel geneLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel processlbl;
    // End of variables declaration//GEN-END:variables
}
