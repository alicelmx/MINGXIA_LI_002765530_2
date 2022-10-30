/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.system;

import dao.AppointmentDao;
import dao.DoctorDao;
import dao.HospitalDao;
import dao.PatientDao;
import java.awt.Graphics;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Appointment;
import model.Doctor;
import model.Hospital;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author limingxia
 */
public class ManageAppointmentPane extends javax.swing.JPanel {

    public Hospital curHospital;
    public Doctor curDoctor;
    public List<Appointment> appointmentModelList;

    /**
     * Creates new form AuthManagementPane
     */
    public ManageAppointmentPane() {
        queryAppointmentList();

        initComponents();

        populateTable(appointmentModelList);
    }

    public ManageAppointmentPane(Hospital currentHospital) {
        curHospital = currentHospital;
        queryAppointmentList();

        initComponents();

        populateTable(appointmentModelList);
    }

    public ManageAppointmentPane(Doctor doctor) {
        curDoctor = doctor;
        queryAppointmentList();

        initComponents();

        populateTable(appointmentModelList);
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

        txtKeyword = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAppointment = new javax.swing.JTable();
        btnRefesh = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        txtKeyword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKeywordActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search.png"))); // NOI18N
        btnSearch.setText("search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tbAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Hospital", "Department", "Doctor", "Patient", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbAppointment);

        btnRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/refresh.png"))); // NOI18N
        btnRefesh.setText("Refresh");
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete.png"))); // NOI18N
        btnDelete.setText("Cancel");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Appointment Management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 38, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtKeywordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeywordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeywordActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String keyword = txtKeyword.getText();
        if (StringUtils.isBlank(keyword)) {
            JOptionPane.showMessageDialog(this, "Please Input Keyword to Search!");
            return;
        }

        List<Appointment> searchResult = appointmentModelList.stream().filter(a
                -> a.getdName().equalsIgnoreCase(keyword)
                || a.gethName().equalsIgnoreCase(keyword)
                || a.getDatetime().equalsIgnoreCase(keyword)
                || a.getDepartment().equalsIgnoreCase(keyword)
                || a.getpName().equalsIgnoreCase(keyword)
        ).collect(Collectors.toList());

        populateTable(searchResult);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        txtKeyword.setText("");

        queryAppointmentList();
        populateTable(appointmentModelList);
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRowIndex = tbAppointment.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a Appointment to Cancel!");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tbAppointment.getModel();
        Appointment selectedAppointment = (Appointment) model.getValueAt(selectedRowIndex, 0);

        // cannot delete finished appointment
        if (selectedAppointment.getStatus().equals(1)) {
            JOptionPane.showMessageDialog(this, "Cannot Delete Finished Appointment!");
            return;
        }

        if (!AppointmentDao.deleteAppointment(selectedAppointment)) {
            JOptionPane.showMessageDialog(this, "Fail to Cancel!");
            return;
        }

        JOptionPane.showMessageDialog(this, "Delete Successfully!");

        btnRefesh.doClick();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AddAppointmentFrame addAppointmentFrame = new AddAppointmentFrame(curHospital);
        addAppointmentFrame.setLocationRelativeTo(null);
        addAppointmentFrame.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void queryAppointmentList() {
        if (!ObjectUtils.isEmpty(curHospital)) {
            appointmentModelList = AppointmentDao.queryAppointmentByHid(curHospital.getHid());
        } else if (!ObjectUtils.isEmpty(curDoctor)) {
            appointmentModelList = AppointmentDao.queryAppointmentByDid(curDoctor.getDid());
        } else {
            appointmentModelList = AppointmentDao.queryAllAppointment();
        }

    }

    private void populateTable(List<Appointment> appointmentList) {

        DefaultTableModel model = (DefaultTableModel) tbAppointment.getModel();
        model.setRowCount(0);

        if (ObjectUtils.isEmpty(appointmentList)) {
            return;
        }

        for (Appointment appointment : appointmentList) {
            Integer appStatus = appointment.getStatus();

            Object[] row = new Object[6];

            // query database
            if (appStatus.equals(0)) {

                row[0] = appointment;
                row[1] = HospitalDao.queryHospitalByHID(appointment.getHid()).gethName();
                row[2] = appointment.getDepartment();
                row[3] = DoctorDao.queryDoctorByDid(appointment.getDid()).getdName();
                row[4] = PatientDao.queryPatientByPid(appointment.getPid()).getFullName();
                row[5] = "Processing";
            } else {
                // use fast photo
                row[0] = appointment;
                row[1] = appointment.gethName();
                row[2] = appointment.getDepartment();
                row[3] = appointment.getdName();
                row[4] = appointment.getpName();
                row[5] = "Finished";
            }

            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefesh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAppointment;
    private javax.swing.JTextField txtKeyword;
    // End of variables declaration//GEN-END:variables
}
