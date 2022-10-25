/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import enumvalue.RoleEnum;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Sumit
 */
public class HomePageFrame extends javax.swing.JFrame {

    /**
     * Creates new form HospitalMang
     */
    public HomePageFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRoleAsPatient = new javax.swing.JButton();
        btnRoleAsDoctor = new javax.swing.JButton();
        btnRoleAsSysAdmin = new javax.swing.JButton();
        btnHospitalAdmin = new javax.swing.JButton();
        btnCommunityAdmin = new javax.swing.JButton();
        HeaderPanel = new javax.swing.JPanel();
        lblSystemName = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Smart Medical Management System");
        setName("MainPage"); // NOI18N
        setResizable(false);

        btnRoleAsPatient.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRoleAsPatient.setForeground(new java.awt.Color(204, 51, 0));
        btnRoleAsPatient.setText("I am a Patient");
        btnRoleAsPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoleAsPatientActionPerformed(evt);
            }
        });

        btnRoleAsDoctor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRoleAsDoctor.setForeground(new java.awt.Color(153, 204, 0));
        btnRoleAsDoctor.setText("I am a Doctor");
        btnRoleAsDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoleAsDoctorActionPerformed(evt);
            }
        });

        btnRoleAsSysAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRoleAsSysAdmin.setForeground(new java.awt.Color(0, 153, 204));
        btnRoleAsSysAdmin.setText("System Admin");
        btnRoleAsSysAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoleAsSysAdminActionPerformed(evt);
            }
        });

        btnHospitalAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHospitalAdmin.setForeground(new java.awt.Color(0, 102, 255));
        btnHospitalAdmin.setText("Hospital Admin");
        btnHospitalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalAdminActionPerformed(evt);
            }
        });

        btnCommunityAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCommunityAdmin.setForeground(new java.awt.Color(204, 0, 204));
        btnCommunityAdmin.setText("Community Admin");
        btnCommunityAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityAdminActionPerformed(evt);
            }
        });

        HeaderPanel.setBackground(new java.awt.Color(0, 153, 153));

        lblSystemName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblSystemName.setForeground(new java.awt.Color(255, 255, 255));
        lblSystemName.setText("Smart Medical Management System");

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hospital.png"))); // NOI18N

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(lblIcon)
                .addGap(18, 18, 18)
                .addComponent(lblSystemName)
                .addGap(30, 30, 30))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSystemName)
                    .addComponent(lblIcon))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRoleAsPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnHospitalAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRoleAsSysAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCommunityAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRoleAsDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(HeaderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnRoleAsSysAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHospitalAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCommunityAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnRoleAsPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnRoleAsDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCommunityAdmin, btnHospitalAdmin, btnRoleAsDoctor, btnRoleAsPatient, btnRoleAsSysAdmin});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRoleAsPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoleAsPatientActionPerformed
        
        LoginFrame loginFrame = new LoginFrame(RoleEnum.PATIENT.getIndex());
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRoleAsPatientActionPerformed

    private void btnRoleAsDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoleAsDoctorActionPerformed
        
        LoginFrame loginFrame = new LoginFrame(RoleEnum.DOCTOR.getIndex());
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRoleAsDoctorActionPerformed

    private void btnRoleAsSysAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoleAsSysAdminActionPerformed

        LoginFrame loginFrame = new LoginFrame(RoleEnum.SYSTEM_ADMIN.getIndex());
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRoleAsSysAdminActionPerformed

    private void btnHospitalAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalAdminActionPerformed
        
        LoginFrame loginFrame = new LoginFrame(RoleEnum.HOSPITAL_ADMIN.getIndex());
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHospitalAdminActionPerformed

    private void btnCommunityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityAdminActionPerformed
        
        LoginFrame loginFrame = new LoginFrame(RoleEnum.COMMUNITY_ADMIN.getIndex());
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCommunityAdminActionPerformed

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
            java.util.logging.Logger.getLogger(HomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomePageFrame homePageFrame = new HomePageFrame();
                
                homePageFrame.setLocationRelativeTo(null);
                homePageFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton btnCommunityAdmin;
    private javax.swing.JButton btnHospitalAdmin;
    private javax.swing.JButton btnRoleAsDoctor;
    private javax.swing.JButton btnRoleAsPatient;
    private javax.swing.JButton btnRoleAsSysAdmin;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblSystemName;
    // End of variables declaration//GEN-END:variables
}
