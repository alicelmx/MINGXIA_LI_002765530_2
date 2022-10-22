/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dao.DoctorDao;
import dao.EncounterDao;
import dao.HospitalDao;
import model.AppointmentModel;
import model.Doctor;
import model.Encounter;
import model.Hospital;
import model.VitalSign;
import tool.DateUtils;

/**
 *
 * @author limingxia
 */
public class DiagnoseFrame extends javax.swing.JFrame {

    private DoctorDao doctorDao = new DoctorDao();
    private HospitalDao hospitalDao = new HospitalDao();
    private EncounterDao encounterDao = new EncounterDao();

    public AppointmentModel selectedAppointment;
    public String pName;
    public String dName;
    public String deptment;
    public String hName;

    /**
     * Creates new form DiagnoseFrame
     */
    public DiagnoseFrame() {
        initComponents();
    }

    DiagnoseFrame(AppointmentModel selectedAppointment, String pName, String dName) {

        // initalize data
        this.selectedAppointment = selectedAppointment;
        this.pName = pName;
        this.dName = dName;

        Doctor doctor = doctorDao.findDoctorByDid(this.selectedAppointment.getDid());
        this.deptment = doctor.getDepartment();
        Hospital hospital = hospitalDao.queryHospitalByHID(doctor.getHid());
        this.hName = hospital.gethName();

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

        lblAppointmentID = new javax.swing.JLabel();
        lblAppointmentID1 = new javax.swing.JLabel();
        lblAppointmentID2 = new javax.swing.JLabel();
        lblAppointmentID3 = new javax.swing.JLabel();
        lblAppointmentID4 = new javax.swing.JLabel();
        lblVitalSign = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        lblPulseRate = new javax.swing.JLabel();
        lblRespirationRate = new javax.swing.JLabel();
        lblBodyTemperature = new javax.swing.JLabel();
        txtRespirationRate = new javax.swing.JFormattedTextField();
        txtBodyTemperature = new javax.swing.JFormattedTextField();
        lblVitalSign1 = new javax.swing.JLabel();
        lblVitalSign2 = new javax.swing.JLabel();
        txtPrescription = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaRemark = new javax.swing.JTextArea();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtBloodPressure = new javax.swing.JFormattedTextField();
        txtPulseRate = new javax.swing.JFormattedTextField();
        txtAppointmentID = new javax.swing.JTextField();
        txtDeptment = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAppointmentID.setText("AppointmentID:");

        lblAppointmentID1.setText("Patient Name:");

        lblAppointmentID3.setText("Doctor Name:");

        lblAppointmentID4.setText("Deptment:");

        lblVitalSign.setText("Vital Sign:");

        lblBloodPressure.setText("Blood Pressure:");

        lblPulseRate.setText("Pulse Rate:");

        lblRespirationRate.setText("Respiration Rate:");

        lblBodyTemperature.setText("Body Temperature:");

        txtRespirationRate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtRespirationRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespirationRateActionPerformed(evt);
            }
        });

        txtBodyTemperature.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtBodyTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBodyTemperatureActionPerformed(evt);
            }
        });

        lblVitalSign1.setText("Prescription:");

        lblVitalSign2.setText("remark:");

        txtPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrescriptionActionPerformed(evt);
            }
        });

        txtaRemark.setColumns(20);
        txtaRemark.setRows(5);
        jScrollPane1.setViewportView(txtaRemark);

        btnSave.setText("save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("<<< back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtBloodPressure.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodPressureActionPerformed(evt);
            }
        });

        txtPulseRate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPulseRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseRateActionPerformed(evt);
            }
        });

        txtAppointmentID.setText(this.selectedAppointment.getAid());

        txtDeptment.setText(this.deptment);

        txtPatientName.setText(this.pName);

        txtDoctorName.setText(this.dName);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAppointmentID2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblVitalSign))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblVitalSign2)
                                    .addComponent(lblVitalSign1))))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                .addComponent(txtPrescription, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBodyTemperature)
                                    .addComponent(lblRespirationRate)
                                    .addComponent(lblPulseRate)
                                    .addComponent(lblBloodPressure))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtAppointmentID, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAppointmentID)
                            .addComponent(lblAppointmentID3)
                            .addComponent(lblAppointmentID1)
                            .addComponent(lblAppointmentID4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDeptment, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(180, 180, 180))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(118, 118, 118)
                .addComponent(btnSave)
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAppointmentID)
                    .addComponent(txtAppointmentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAppointmentID4)
                    .addComponent(txtDeptment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAppointmentID1)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAppointmentID3)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblAppointmentID2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVitalSign)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBloodPressure)
                                .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPulseRate)
                            .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRespirationRate)
                            .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBodyTemperature)
                            .addComponent(txtBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVitalSign1)
                    .addComponent(txtPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVitalSign2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRespirationRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespirationRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespirationRateActionPerformed

    private void txtBodyTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBodyTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodyTemperatureActionPerformed

    private void txtPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrescriptionActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        VitalSign vitalSign = new VitalSign();
        vitalSign.setBloodPressure(Double.parseDouble(txtBloodPressure.getText()));
        vitalSign.setBodyTemperature(Double.parseDouble(txtBodyTemperature.getText()));
        vitalSign.setPulseRate(Double.parseDouble(txtPulseRate.getText()));
        vitalSign.setRespirationRate(Double.parseDouble(txtRespirationRate.getText()));

        Encounter encounter = new Encounter();
        // TODO eid generate rule apply singleton
        encounter.setEid("1111");
        encounter.setDatetime(DateUtils.getCurrentTime());
        encounter.setDeptment(txtDeptment.getText());
        encounter.setPrescription(txtPrescription.getText());
        encounter.setRemark(txtaRemark.getText());
        encounter.setVitalSign(vitalSign);
        encounter.setdName(txtDoctorName.getText());
        encounter.sethName(hName);
        encounter.setpName(txtPatientName.getText());

        // update EncounterRecord.json
        encounterDao.insertNewEncounterRecord(encounter);

        // update patient maybe

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodPressureActionPerformed

    private void txtPulseRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulseRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseRateActionPerformed

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
            java.util.logging.Logger.getLogger(DiagnoseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiagnoseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiagnoseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiagnoseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiagnoseFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAppointmentID;
    private javax.swing.JLabel lblAppointmentID1;
    private javax.swing.JLabel lblAppointmentID2;
    private javax.swing.JLabel lblAppointmentID3;
    private javax.swing.JLabel lblAppointmentID4;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblBodyTemperature;
    private javax.swing.JLabel lblPulseRate;
    private javax.swing.JLabel lblRespirationRate;
    private javax.swing.JLabel lblVitalSign;
    private javax.swing.JLabel lblVitalSign1;
    private javax.swing.JLabel lblVitalSign2;
    private javax.swing.JTextField txtAppointmentID;
    private javax.swing.JFormattedTextField txtBloodPressure;
    private javax.swing.JFormattedTextField txtBodyTemperature;
    private javax.swing.JTextField txtDeptment;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPrescription;
    private javax.swing.JFormattedTextField txtPulseRate;
    private javax.swing.JFormattedTextField txtRespirationRate;
    private javax.swing.JTextArea txtaRemark;
    // End of variables declaration//GEN-END:variables
}
