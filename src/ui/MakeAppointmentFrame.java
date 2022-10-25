/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dao.AppointmentDao;
import dao.DoctorDao;
import java.util.List;
import javax.swing.JOptionPane;
import model.AppointmentModel;
import model.NearDoctorModel;
import tool.DateUtils;

/**
 *
 * @author limingxia
 */
public class MakeAppointmentFrame extends javax.swing.JFrame {
    
    public NearDoctorModel doctor;
    public String userName;
    public List<String> availableDate;
    
    private AppointmentDao appointmentDao = new AppointmentDao();
    private DoctorDao doctorDao = new DoctorDao();
            
    /**
     * Creates new form AppointmentFrame
     */
    public MakeAppointmentFrame() {
        initComponents();
    }

    MakeAppointmentFrame(NearDoctorModel selectedDoctor, String userName) {
        this.doctor = selectedDoctor;
        this.userName = userName;
        availableDate = DateUtils.getDateViaWeek(this.doctor.getAvailableTime());
        
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

        lblHospital = new javax.swing.JLabel();
        lblDoctorNameTitle = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        lblHospitalName = new javax.swing.JLabel();
        lblDepartmentName = new javax.swing.JLabel();
        lblDoctorName = new javax.swing.JLabel();
        lblAppointmentTime = new javax.swing.JLabel();
        btnSubmitAppointment = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        cbcAvailableTime = new javax.swing.JComboBox<>();
        iconDoctor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblHospital.setText("Hospital:");

        lblDoctorNameTitle.setText("Doctor Name:");

        lblDepartment.setText("Department：");

        lblHospitalName.setText(doctor.getHospital());

        lblDepartmentName.setText(doctor.getDepartment());

        lblDoctorName.setText(doctor.getName());

        lblAppointmentTime.setText("Appointment Time:");

        btnSubmitAppointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/modify.png"))); // NOI18N
        btnSubmitAppointment.setText("Submit");
        btnSubmitAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitAppointmentActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/NavBack.png"))); // NOI18N
        btnBack.setText(" Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        availableDate.forEach(o -> {
            cbcAvailableTime.addItem(o);
        });

        iconDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/doctor.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(iconDoctor)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHospital)
                            .addComponent(lblDepartment)
                            .addComponent(lblDoctorNameTitle)
                            .addComponent(lblAppointmentTime))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDepartmentName)
                            .addComponent(lblHospitalName)
                            .addComponent(lblDoctorName)
                            .addComponent(cbcAvailableTime, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(100, 100, 100)
                        .addComponent(btnSubmitAppointment)
                        .addGap(129, 129, 129))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconDoctor)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHospital)
                            .addComponent(lblHospitalName))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDepartmentName)
                            .addComponent(lblDepartment))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorNameTitle)
                            .addComponent(lblDoctorName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAppointmentTime)
                            .addComponent(cbcAvailableTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmitAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitAppointmentActionPerformed
        
        AppointmentModel appointmentModel = new AppointmentModel();
       
        String appDate = (String)cbcAvailableTime.getSelectedItem(); // default
        appointmentModel.setDatetime(appDate);
        appointmentModel.setdName(doctor.getName());
        appointmentModel.setpName(userName);
        
        appointmentDao.insertNewAppointment(appointmentModel);
        
        JOptionPane.showMessageDialog(this, "Successfully!");
        
        this.dispose();
    }//GEN-LAST:event_btnSubmitAppointmentActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(MakeAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakeAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakeAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeAppointmentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmitAppointment;
    private javax.swing.JComboBox<String> cbcAvailableTime;
    private javax.swing.JLabel iconDoctor;
    private javax.swing.JLabel lblAppointmentTime;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblDepartmentName;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblDoctorNameTitle;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblHospitalName;
    // End of variables declaration//GEN-END:variables
}
