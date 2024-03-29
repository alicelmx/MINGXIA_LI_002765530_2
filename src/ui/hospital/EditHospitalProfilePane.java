/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.hospital;

import dao.CommunityDao;
import dao.HospitalDao;
import java.awt.Graphics;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Community;
import model.Hospital;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import tool.CheckUtils;

/**
 *
 * @author limingxia
 */
public class EditHospitalProfilePane extends javax.swing.JPanel {

    public List<Community> communityList;
    public Hospital curHospital;

    /**
     * Creates new form EditHospitalProfilePane
     */
    public EditHospitalProfilePane() {
        initComponents();
    }

    public EditHospitalProfilePane(Hospital currentHospital) {
        communityList = CommunityDao.queryAllCommunityList();
        curHospital = HospitalDao.queryHospitalByHID(currentHospital.getHid());

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

        AddressInfoPane = new javax.swing.JPanel();
        lblName1 = new javax.swing.JLabel();
        lblCity1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        lblAddress1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaIntro = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        BasicInfoPane = new javax.swing.JPanel();
        lblCity = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        cbbCommunity = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();
        cbbCity = new javax.swing.JComboBox<>();

        AddressInfoPane.setBackground(null);
        AddressInfoPane.setOpaque(false);
        AddressInfoPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basic Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 153, 153))); // NOI18N

        lblName1.setText("Name:");

        lblCity1.setText("Phone:");

        txtName.setText(curHospital.gethName());
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtPhone.setText(curHospital.getPhone());

        lblAddress1.setText("Intro:");

        txaIntro.setColumns(20);
        txaIntro.setRows(5);
        txaIntro.setText(curHospital.getIntro());
        txaIntro.setAutoscrolls(false);
        jScrollPane1.setViewportView(txaIntro);

        javax.swing.GroupLayout AddressInfoPaneLayout = new javax.swing.GroupLayout(AddressInfoPane);
        AddressInfoPane.setLayout(AddressInfoPaneLayout);
        AddressInfoPaneLayout.setHorizontalGroup(
            AddressInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressInfoPaneLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(AddressInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName1)
                    .addComponent(lblCity1)
                    .addComponent(lblAddress1))
                .addGap(18, 18, 18)
                .addGroup(AddressInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(txtPhone)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        AddressInfoPaneLayout.setVerticalGroup(
            AddressInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressInfoPaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(AddressInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddressInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCity1)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddressInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.setBackground(null);
        jPanel2.setOpaque(false);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/about.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/RepeatHS.png"))); // NOI18N
        btnClear.setText(" Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClear)
                .addGap(50, 50, 50)
                .addComponent(btnSave)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnSave});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BasicInfoPane.setBackground(null);
        BasicInfoPane.setOpaque(false);
        BasicInfoPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 153, 153))); // NOI18N

        lblCity.setText("City:");

        lblZipCode.setText("ZipCode:");

        txtZipCode.setText(curHospital.getZipCode());
        txtZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipCodeActionPerformed(evt);
            }
        });

        int selectedIdx = 0;
        for(Community c : communityList) {
            if(c.getCity().equals(curHospital.getCity())) {
                cbbCommunity.addItem(c.getcName());
            }
            if(c.getcName().equals(curHospital.getCommunity())) {
                selectedIdx = cbbCommunity.getItemCount()-1;
            }
        }
        cbbCommunity.setSelectedIndex(selectedIdx);
        cbbCommunity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbCommunityMouseClicked(evt);
            }
        });
        cbbCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCommunityActionPerformed(evt);
            }
        });

        lblCommunity.setText("Community:");

        cbbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "Malden", "Cambridge" }));
        if(curHospital.getCity().equals("Boston")) {
            cbbCity.setSelectedIndex(0);
        } else if(curHospital.getCity().equals("Malden")) {
            cbbCity.setSelectedIndex(1);
        } else {
            cbbCity.setSelectedIndex(2);
        }
        cbbCity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbCityMouseClicked(evt);
            }
        });
        cbbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BasicInfoPaneLayout = new javax.swing.GroupLayout(BasicInfoPane);
        BasicInfoPane.setLayout(BasicInfoPaneLayout);
        BasicInfoPaneLayout.setHorizontalGroup(
            BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblZipCode))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasicInfoPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtZipCode))
                .addGap(55, 55, 55))
        );
        BasicInfoPaneLayout.setVerticalGroup(
            BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(cbbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipCode))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AddressInfoPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BasicInfoPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(AddressInfoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BasicInfoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String hName = txtName.getText();
        String phone = txtPhone.getText();
        String intro = txaIntro.getText(); // optional

        if (StringUtils.isBlank(hName) || StringUtils.isBlank(phone)) {
            JOptionPane.showMessageDialog(this, "Please Input Name or Phone No!");
            return;
        }
        if (!CheckUtils.checkPhoneNo(phone)) {
            JOptionPane.showMessageDialog(this, "Please Check Phone No!");
            return;
        }

        String city = (String) cbbCity.getSelectedItem();
        String community = (String) cbbCommunity.getSelectedItem();
        String zipCode = txtZipCode.getText();

        if (StringUtils.isBlank(city) || StringUtils.isBlank(community) || StringUtils.isBlank(zipCode)) {
            JOptionPane.showMessageDialog(this, "Please Input All the Information!");
            return;
        }

        if (!CheckUtils.checkZipCode(zipCode)) {
            JOptionPane.showMessageDialog(this, "Please Check Zip Code!");
            return;
        }

        Hospital hospital = new Hospital();
        hospital.sethName(hName);
        hospital.setPhone(phone);
        hospital.setIntro(intro);
        hospital.setCity(city);
        hospital.setZipCode(zipCode);
        hospital.setCommunity(community);
        hospital.setHospitalAdminUserName(curHospital.getHospitalAdminUserName());

        if (!HospitalDao.updateHospital(hospital, curHospital)) {
            JOptionPane.showMessageDialog(this, "Duplicate Hospital!");
            return;
        }

        JOptionPane.showMessageDialog(this, "Edit Successfully!");

        // 防止连续点击造成的编辑失败
        curHospital = hospital;
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clearAllBlanket();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipCodeActionPerformed

    private void cbbCommunityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbCommunityMouseClicked
        txtZipCode.setText("");
        txtZipCode.setEnabled(true);
    }//GEN-LAST:event_cbbCommunityMouseClicked

    private void cbbCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCommunityActionPerformed

        String selectedCommmunity = (String) cbbCommunity.getSelectedItem();
        Community sc = CommunityDao.queryCommunityListByCName(selectedCommmunity);

        if (ObjectUtils.isNotEmpty(sc)) {
            txtZipCode.setText(sc.getZipcode());
            txtZipCode.setEnabled(false);
        }
    }//GEN-LAST:event_cbbCommunityActionPerformed

    private void cbbCityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbCityMouseClicked
        txtZipCode.setText("");
        txtZipCode.setEnabled(true);
    }//GEN-LAST:event_cbbCityMouseClicked

    private void cbbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCityActionPerformed

        String cityName = (String) cbbCity.getSelectedItem();
        List<Community> communitys = CommunityDao.queryCommunityListByCityName(cityName);
        cbbCommunity.removeAllItems();

        if (ObjectUtils.isEmpty(communitys)) {
            return;
        }
        communitys.forEach(o -> cbbCommunity.addItem(o.getcName()));
    }//GEN-LAST:event_cbbCityActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddressInfoPane;
    private javax.swing.JPanel BasicInfoPane;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbbCity;
    private javax.swing.JComboBox<String> cbbCommunity;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCity1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextArea txaIntro;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables

    private void clearAllBlanket() {
        txtName.setText("");
        txtPhone.setText("");
        txaIntro.setText("");
        cbbCity.setSelectedIndex(0);
        cbbCommunity.setSelectedIndex(0);
        txtZipCode.setText("");
    }
}
