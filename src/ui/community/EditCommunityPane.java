/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.community;

import dao.CommunityDao;
import dao.HospitalDao;
import dao.PatientDao;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Community;
import org.apache.commons.lang3.StringUtils;
import tool.CheckUtils;

/**
 *
 * @author limingxia
 */
public class EditCommunityPane extends javax.swing.JPanel {

    public Community community;

    /**
     * Creates new form EditCommunityPane
     */
    public EditCommunityPane() {
        initComponents();
    }

    EditCommunityPane(Community curCommunity) {
        this.community = CommunityDao.queryCommunitybByCAdminUser(curCommunity.getCommunityAdminUser());
        initComponents();
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

        btnClear = new javax.swing.JButton();
        btnSubmitAppointment = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        lblZipCode1 = new javax.swing.JLabel();
        jtxtInhabitants = new javax.swing.JFormattedTextField();
        lblZipCode = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        cbbCity1 = new javax.swing.JComboBox<>();

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/RepeatHS.png"))); // NOI18N
        btnClear.setText(" Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSubmitAppointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/about.png"))); // NOI18N
        btnSubmitAppointment.setText("Save");
        btnSubmitAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitAppointmentActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/community.jpeg"))); // NOI18N

        jPanel1.setBackground(null);
        jPanel1.setOpaque(false);

        txtName.setText(community.getcName());

        lblZipCode1.setText("Inhabitants:");

        jtxtInhabitants.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtxtInhabitants.setText(community.getInhabitants());

        lblZipCode.setText("ZipCode:");

        txtAddress.setText(community.getAddress());

        lblAddress.setText("Address:");

        lblCity.setText("City:");

        txtZipCode.setText(community.getZipcode());

        lblName.setText("Name:");

        cbbCity1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "Malden", "Cambridge" }));
        //if(selectedHospital.getCity().equals("Boston")) {
            //    cbbCity.setSelectedIndex(0);
            //} else if(selectedHospital.getCity().equals("Malden")) {
            //    cbbCity.setSelectedIndex(1);
            //} else {
            //    cbbCity.setSelectedIndex(2);
            //}
        cbbCity1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbCity1MouseClicked(evt);
            }
        });
        cbbCity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCity1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZipCode1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblZipCode, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtInhabitants, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtxtInhabitants, txtAddress, txtName, txtZipCode});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(cbbCity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipCode)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtInhabitants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipCode1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmitAppointment)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(139, 139, 139))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmitAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearAllBlanket();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSubmitAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitAppointmentActionPerformed
        String cName = txtName.getText();
        String city = (String) cbbCity.getSelectedItem();
        String address = txtAddress.getText();
        String zipCode = txtZipCode.getText();
        String inhabitants = jtxtInhabitants.getText();

        if (StringUtils.isBlank(cName) || StringUtils.isBlank(city) || StringUtils.isBlank(address) || StringUtils.isBlank(zipCode) || StringUtils.isBlank(inhabitants)) {
            JOptionPane.showMessageDialog(this, "Please Input All the Information!");
            return;

        }
        if (!CheckUtils.checkZipCode(zipCode)) {
            JOptionPane.showMessageDialog(this, "Please Check Zip Code!");
            return;
        }

        if (Integer.parseInt(inhabitants) < 0) {
            JOptionPane.showMessageDialog(this, "Please Check Inhabitant Number!");
            return;
        }

        Community newCommunity = new Community();
        newCommunity.setcName(cName);
        newCommunity.setCity(city);
        newCommunity.setAddress(address);
        newCommunity.setZipcode(zipCode);
        newCommunity.setInhabitants(inhabitants);
        newCommunity.setCommunityAdminUser(community.getCommunityAdminUser());

        if (!CommunityDao.updateCommunity(newCommunity, community)) {
            JOptionPane.showMessageDialog(this, "Fail to Edit!");
            return;
        }

        // update patient's community
        if (!PatientDao.updatePatientCommunity(community.getcName(), newCommunity.getcName())) {
            JOptionPane.showMessageDialog(this, "Fail to Edit!");
            return;
        }

        if (!HospitalDao.updateHospitaltCommunity(community.getcName(), newCommunity.getcName())) {
            JOptionPane.showMessageDialog(this, "Fail to Edit!");
            return;
        }
        JOptionPane.showMessageDialog(this, "Successfully!");

        // 防止连续点击造成的编辑失败
        community = newCommunity;
    }//GEN-LAST:event_btnSubmitAppointmentActionPerformed

    private void cbbCity1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbCity1MouseClicked

    }//GEN-LAST:event_cbbCity1MouseClicked

    private void cbbCity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCity1ActionPerformed

    }//GEN-LAST:event_cbbCity1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSubmitAppointment;
    private javax.swing.JComboBox<String> cbbCity;
    private javax.swing.JComboBox<String> cbbCity1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField jtxtInhabitants;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JLabel lblZipCode1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables

    private void clearAllBlanket() {
        txtName.setText("");
        cbbCity.setSelectedIndex(0);
        txtAddress.setText("");
        txtZipCode.setText("");
        jtxtInhabitants.setText("");
    }
}
