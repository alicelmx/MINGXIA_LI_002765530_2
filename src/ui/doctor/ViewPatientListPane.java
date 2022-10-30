/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.doctor;

import dao.AppointmentDao;
import java.awt.Graphics;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Appointment;
import model.Doctor;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author limingxia
 */
public class ViewPatientListPane extends javax.swing.JPanel {

    public Doctor currentDoctor;
    public List<Appointment> appointmentList;

    /**
     * Creates new form DoctorDiagnosePane
     */
    public ViewPatientListPane() {
        initComponents();
    }

    public ViewPatientListPane(Doctor currentDoctor) {
        this.currentDoctor = currentDoctor;

        initComponents();

        appointmentList = AppointmentDao.queryTodayAppointmentByDId(currentDoctor.getDid());

        populateTable(appointmentList);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon(this.getClass().getResource("/assets/grey_line_bg.jpg"));
        img.paintIcon(this, g, 0, 0);
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
        tbAppointment = new javax.swing.JTable();
        btnDiagnose = new javax.swing.JButton();
        txtKeywords = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnRefesh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tbAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "AppointmentID", "Name", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbAppointment);

        btnDiagnose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/write.png"))); // NOI18N
        btnDiagnose.setText("Diagnose");
        btnDiagnose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnoseActionPerformed(evt);
            }
        });

        txtKeywords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKeywordsActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search.png"))); // NOI18N
        btnSearch.setText("search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/refresh.png"))); // NOI18N
        btnRefesh.setText("Refresh");
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Today's Appointment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDiagnose))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtKeywords)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDiagnose, btnSearch});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKeywords, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDiagnose)
                    .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDiagnose, btnSearch});

    }// </editor-fold>//GEN-END:initComponents

    private void btnDiagnoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnoseActionPerformed

        int selectedRowIndex = tbAppointment.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a Patient!");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tbAppointment.getModel();
        Appointment selectedAppointment = (Appointment) model.getValueAt(selectedRowIndex, 2);

        DiagnoseFrame diagnoseFrame = new DiagnoseFrame(selectedAppointment);
        diagnoseFrame.setLocationRelativeTo(null);
        diagnoseFrame.setVisible(true);
    }//GEN-LAST:event_btnDiagnoseActionPerformed

    private void txtKeywordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeywordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeywordsActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String keyword = txtKeywords.getText();
        if (StringUtils.isBlank(keyword)) {
            JOptionPane.showMessageDialog(this, "Please Input Keyword to Search.");
            return;
        }

        List<Appointment> searchResult = appointmentList.stream().filter(app
                -> app.getDatetime().equalsIgnoreCase(keyword)
                || app.getpName().equalsIgnoreCase(keyword)
                || app.getAid().equalsIgnoreCase(keyword)
        ).collect(Collectors.toList());

        populateTable(searchResult);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed

        // after update, query database
        List<Appointment> appointmentModels = AppointmentDao.queryTodayAppointmentByDId(currentDoctor.getDid());
        populateTable(appointmentModels);
    }//GEN-LAST:event_btnRefeshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiagnose;
    private javax.swing.JButton btnRefesh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAppointment;
    private javax.swing.JTextField txtKeywords;
    // End of variables declaration//GEN-END:variables

    private void populateTable(List<Appointment> appointmentModels) {

        DefaultTableModel model = (DefaultTableModel) tbAppointment.getModel();
        model.setRowCount(0);

        if (ObjectUtils.isEmpty(appointmentModels)) {
            return;
        }

        for (Appointment appointmentModel : appointmentModels) {

            Object[] row = new Object[3];
            row[0] = appointmentModel.getAid();
            row[1] = appointmentModel.getpName();
            row[2] = appointmentModel;

            model.addRow(row);
        }
    }
}
