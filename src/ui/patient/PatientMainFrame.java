/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.patient;

import dao.PatientDao;
import model.Patient;
import tool.DateUtils;
import ui.HomePageFrame;

/**
 *
 * @author limingxia
 */
public class PatientMainFrame extends javax.swing.JFrame {

    public String userName;
    public Patient patient;

    /**
     * Creates new form SystemAdminFrame
     */
    public PatientMainFrame() {
        initComponents();
    }

    public PatientMainFrame(String userName) {
        this.userName = userName;
        patient = PatientDao.queryPatientByUName(userName);

        initComponents();

        // patient tend to use appointment func first
        btnAppointment.doClick();
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
        btnPatientProfile = new javax.swing.JButton();
        btnAppointment = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        lblLogout = new javax.swing.JLabel();
        lblGreeting = new javax.swing.JLabel();
        contentPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        funcitonPane.setBackground(new java.awt.Color(0, 153, 153));

        btnPatientProfile.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnPatientProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/person.png"))); // NOI18N
        btnPatientProfile.setText("Profile");
        btnPatientProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientProfileActionPerformed(evt);
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

        btnHistory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/encounter.png"))); // NOI18N
        btnHistory.setText("Encounter");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
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
            .addGroup(funcitonPaneLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(funcitonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnHistory)
                    .addComponent(btnPatientProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAppointment))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(funcitonPaneLayout.createSequentialGroup()
                .addGroup(funcitonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGreeting, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        funcitonPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAppointment, btnHistory, btnPatientProfile});

        funcitonPaneLayout.setVerticalGroup(
            funcitonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcitonPaneLayout.createSequentialGroup()
                .addComponent(lblGreeting, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAppointment)
                .addGap(18, 18, 18)
                .addComponent(btnHistory)
                .addGap(18, 18, 18)
                .addComponent(btnPatientProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        funcitonPaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAppointment, btnHistory, btnPatientProfile});

        splitPane.setLeftComponent(funcitonPane);

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
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

    private void btnPatientProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientProfileActionPerformed

        SearchDoctorPane patientAppointmentPane = new SearchDoctorPane(patient);
        splitPane.setRightComponent(patientAppointmentPane);
    }//GEN-LAST:event_btnPatientProfileActionPerformed

    private void btnAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentActionPerformed

        SearchDoctorPane patientAppointmentPane = new SearchDoctorPane(patient);
        splitPane.setRightComponent(patientAppointmentPane);
    }//GEN-LAST:event_btnAppointmentActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed

        EncounterHistoryPane patientEncounterHistoryPane = new EncounterHistoryPane(patient);
        splitPane.setRightComponent(patientEncounterHistoryPane);
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked

        HomePageFrame homePageFrame = new HomePageFrame();
        homePageFrame.setLocationRelativeTo(null);
        homePageFrame.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(PatientMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new PatientMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointment;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnPatientProfile;
    private javax.swing.JPanel contentPane;
    private javax.swing.JPanel funcitonPane;
    private javax.swing.JLabel lblGreeting;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
