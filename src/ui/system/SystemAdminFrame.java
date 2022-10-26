/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.system;

import tool.DateUtils;
import ui.HomePageFrame;
import ui.hospital.ManageDoctorPane;
import ui.hospital.ManageEncounterPane;
import ui.hospital.ManagePatientPane;

/**
 *
 * @author limingxia
 */
public class SystemAdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminFrame
     */
    public SystemAdminFrame() {
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

        splitPane = new javax.swing.JSplitPane();
        funcitonPane = new javax.swing.JPanel();
        btnHospital = new javax.swing.JButton();
        btnCommunity = new javax.swing.JButton();
        btnPatientManagement1 = new javax.swing.JButton();
        lblLogout = new javax.swing.JLabel();
        btnAppointment = new javax.swing.JButton();
        btnManageDoctor = new javax.swing.JButton();
        btnDoctorManagement1 = new javax.swing.JButton();
        btnAppointment1 = new javax.swing.JButton();
        lblGreeting = new javax.swing.JLabel();
        contentPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        funcitonPane.setBackground(new java.awt.Color(0, 153, 153));
        funcitonPane.setPreferredSize(new java.awt.Dimension(200, 600));

        btnHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnHospital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hospital_admin.png"))); // NOI18N
        btnHospital.setText("Hospital ");
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });

        btnCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnCommunity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/community_admin.png"))); // NOI18N
        btnCommunity.setText("Community");
        btnCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityActionPerformed(evt);
            }
        });

        btnPatientManagement1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnPatientManagement1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/encounter.png"))); // NOI18N
        btnPatientManagement1.setText("Encounter");
        btnPatientManagement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientManagement1ActionPerformed(evt);
            }
        });

        lblLogout.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logout.png"))); // NOI18N
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        btnAppointment.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAppointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/appointment.png"))); // NOI18N
        btnAppointment.setText("Appointment");
        btnAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentActionPerformed(evt);
            }
        });

        btnManageDoctor.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnManageDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/doctor.png"))); // NOI18N
        btnManageDoctor.setText("Doctor");
        btnManageDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDoctorActionPerformed(evt);
            }
        });

        btnDoctorManagement1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnDoctorManagement1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/patient.png"))); // NOI18N
        btnDoctorManagement1.setText("Patient");
        btnDoctorManagement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorManagement1ActionPerformed(evt);
            }
        });

        btnAppointment1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAppointment1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/key_36.png"))); // NOI18N
        btnAppointment1.setText("Password");
        btnAppointment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointment1ActionPerformed(evt);
            }
        });

        lblGreeting.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        lblGreeting.setForeground(new java.awt.Color(255, 255, 255));
        lblGreeting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGreeting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/greeting.png"))); // NOI18N
        String greeting = "Good " + DateUtils.checkNowTime();
        lblGreeting.setText(greeting);

        javax.swing.GroupLayout funcitonPaneLayout = new javax.swing.GroupLayout(funcitonPane);
        funcitonPane.setLayout(funcitonPaneLayout);
        funcitonPaneLayout.setHorizontalGroup(
            funcitonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGreeting, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(funcitonPaneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(funcitonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAppointment1)
                    .addComponent(btnAppointment)
                    .addComponent(btnPatientManagement1)
                    .addComponent(btnDoctorManagement1)
                    .addComponent(btnHospital)
                    .addComponent(btnManageDoctor)
                    .addComponent(btnCommunity)))
        );

        funcitonPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAppointment, btnAppointment1, btnCommunity, btnDoctorManagement1, btnHospital, btnManageDoctor, btnPatientManagement1});

        funcitonPaneLayout.setVerticalGroup(
            funcitonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcitonPaneLayout.createSequentialGroup()
                .addComponent(lblGreeting, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCommunity)
                .addGap(18, 18, 18)
                .addComponent(btnManageDoctor)
                .addGap(18, 18, 18)
                .addComponent(btnHospital)
                .addGap(18, 18, 18)
                .addComponent(btnDoctorManagement1)
                .addGap(18, 18, 18)
                .addComponent(btnPatientManagement1)
                .addGap(18, 18, 18)
                .addComponent(btnAppointment)
                .addGap(18, 18, 18)
                .addComponent(btnAppointment1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        funcitonPaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAppointment, btnAppointment1, btnCommunity, btnDoctorManagement1, btnHospital, btnManageDoctor, btnPatientManagement1});

        splitPane.setLeftComponent(funcitonPane);

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(contentPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed

        ManageHospitalPane hospitalManagementPane = new ManageHospitalPane();
        splitPane.setRightComponent(hospitalManagementPane);
    }//GEN-LAST:event_btnHospitalActionPerformed

    private void btnCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityActionPerformed

        ManageCommunityPane communityManagementPane = new ManageCommunityPane();
        splitPane.setRightComponent(communityManagementPane);
    }//GEN-LAST:event_btnCommunityActionPerformed

    private void btnPatientManagement1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientManagement1ActionPerformed

        ManageEncounterPane manageEncounterPane = new ManageEncounterPane();
        splitPane.setRightComponent(manageEncounterPane);
    }//GEN-LAST:event_btnPatientManagement1ActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked

        HomePageFrame homePageFrame = new HomePageFrame();
        homePageFrame.setLocationRelativeTo(null);
        homePageFrame.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void btnAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentActionPerformed

//        SearchDoctorPane patientAppointmentPane = new SearchDoctorPane(patient);
//        splitPane.setRightComponent(patientAppointmentPane);
    }//GEN-LAST:event_btnAppointmentActionPerformed

    private void btnManageDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDoctorActionPerformed

        ManageDoctorPane doctorManagementPane = new ManageDoctorPane();
        splitPane.setRightComponent(doctorManagementPane);
    }//GEN-LAST:event_btnManageDoctorActionPerformed

    private void btnDoctorManagement1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorManagement1ActionPerformed

        ManagePatientPane managePatientPane = new ManagePatientPane();
        splitPane.setRightComponent(managePatientPane);
    }//GEN-LAST:event_btnDoctorManagement1ActionPerformed

    private void btnAppointment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointment1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAppointment1ActionPerformed

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
            java.util.logging.Logger.getLogger(SystemAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SystemAdminFrame systemAdminFrame = new SystemAdminFrame();
                systemAdminFrame.setLocationRelativeTo(null);
                systemAdminFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointment;
    private javax.swing.JButton btnAppointment1;
    private javax.swing.JButton btnCommunity;
    private javax.swing.JButton btnDoctorManagement1;
    private javax.swing.JButton btnHospital;
    private javax.swing.JButton btnManageDoctor;
    private javax.swing.JButton btnPatientManagement1;
    private javax.swing.JPanel contentPane;
    private javax.swing.JPanel funcitonPane;
    private javax.swing.JLabel lblGreeting;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
