/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Magic.Design.*;
import Magic.Design.MyJButton;
import Magic.Design.MyTableFormat;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JKU
 */
public class ManageDoctorRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientListJPanel
     */
    private EcoSystem system;
    private UserAccount userAccount;
    private DoctorOrganization doctorOrganization;
    private Enterprise enterprise;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
    public ManageDoctorRequestJPanel(EcoSystem system, UserAccount userAccount, DoctorOrganization doctorOrganization, Enterprise enterprise) {
        initComponents();
        this.system = system;
        this.userAccount = userAccount;
        this.doctorOrganization = doctorOrganization;
        this.enterprise = enterprise;
        
    
        tblDoctorOrganisation.getTableHeader().setDefaultRenderer(new MyTableFormat());
        tblDoctor.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populateOrganisationpatientTable();
        populateDoctorPatientTable();
        
        
    }

    public void populateOrganisationpatientTable(){
        DefaultTableModel model = (DefaultTableModel)tblDoctorOrganisation.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : doctorOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSummary();
            row[2] = request.getPatient();
            row[3] = request.getPatient().getName();
          //  row[4] = request.getPatient().getContact();
            row[4] = request.getStatus();
            
            model.addRow(row);
        }
    }

    
     public void populateDoctorPatientTable(){
        DefaultTableModel model = (DefaultTableModel)tblDoctor.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getPatient();
            row[2] = request.getPatient().getName();
        //    row[3] = request.getPatient().getContact();
            row[3] = request.getUserAccount().getUsername();
            row[4] = request.getStatus();
             
            model.addRow(row);
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAssignToMe = new javax.swing.JButton();
        btnTreatmentDone = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDoctorOrganisation = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(241, 250, 238));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List of Patients in need of Cancer Treatment");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 560, -1));

        btnAssignToMe.setBackground(new java.awt.Color(255, 255, 255));
        btnAssignToMe.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnAssignToMe.setText("Assign To Me");
        btnAssignToMe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });
        add(btnAssignToMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 170, 40));

        btnTreatmentDone.setBackground(new java.awt.Color(255, 255, 255));
        btnTreatmentDone.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnTreatmentDone.setText("Treatment Done");
        btnTreatmentDone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTreatmentDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreatmentDoneActionPerformed(evt);
            }
        });
        add(btnTreatmentDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, 180, 40));

        tblDoctorOrganisation.setBackground(new java.awt.Color(0, 0, 0));
        tblDoctorOrganisation.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblDoctorOrganisation.setForeground(new java.awt.Color(255, 255, 255));
        tblDoctorOrganisation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Summary", "Patient UID", "Patient Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDoctorOrganisation.setGridColor(new java.awt.Color(0, 0, 0));
        tblDoctorOrganisation.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblDoctorOrganisation.setRowHeight(30);
        tblDoctorOrganisation.setShowVerticalLines(false);
        jScrollPane4.setViewportView(tblDoctorOrganisation);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 910, 180));

        tblDoctor.setBackground(new java.awt.Color(0, 0, 0));
        tblDoctor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblDoctor.setForeground(new java.awt.Color(255, 255, 255));
        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Patient UID", "Patient Name", "Assigned to", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDoctor.setGridColor(new java.awt.Color(0, 0, 0));
        tblDoctor.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblDoctor.setRowHeight(30);
        tblDoctor.setShowVerticalLines(false);
        jScrollPane5.setViewportView(tblDoctor);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 910, 180));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Manage Request");
        jPanel3.add(jLabel25);

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblDoctorOrganisation.getSelectedRow();
        
        if (selectedRow < 0){
        
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Please select a<font color='red'> request number</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
            //JOptionPane.showMessageDialog(null, "Please select a row first" );
            return;
        }
        else {
        WorkRequest request = (WorkRequest)tblDoctorOrganisation.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equals("Assigned to Hospital"))
        {
        request.setStatus("Assign to Doctor " + userAccount.getUsername());
        request.setUserAccount(userAccount);
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        else{
         JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                
            
        //JOptionPane.showMessageDialog(null, "Work Request is already assigned!" );
        }
        dB4OUtil.storeSystem(system);
        
        populateOrganisationpatientTable();
        populateDoctorPatientTable();
        }
        
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnTreatmentDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreatmentDoneActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDoctor.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Please select a<font color='red'> request number</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
           // JOptionPane.showMessageDialog(null, "Please select a row" );
            return;
        }
        
        else{
        WorkRequest request = (WorkRequest)tblDoctor.getValueAt(selectedRow, 0);
        request.setStatus("Treatment Done");
        request.getPatient().setState("Treatment Done");
        
        dB4OUtil.storeSystem(system);
        populateOrganisationpatientTable();
        populateDoctorPatientTable();
        
        JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Congratulations for saving a life!!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
        
        }
        
    }//GEN-LAST:event_btnTreatmentDoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnTreatmentDone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTable tblDoctorOrganisation;
    // End of variables declaration//GEN-END:variables
}
