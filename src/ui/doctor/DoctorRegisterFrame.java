package ui.doctor;

import dao.DoctorDao;
import dao.HospitalDao;
import static dao.HospitalDao.file;
import dao.LoginDao;
import enumvalue.GenderEnum;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Doctor;
import model.Hospital;
import model.Login;
import org.apache.commons.lang3.StringUtils;
import tool.CheckUtils;
import tool.DateUtils;
import ui.LoginFrame;

/**
 *
 * @author Sajeeb
 */
public class DoctorRegisterFrame extends javax.swing.JFrame {

    public List<Hospital> hospitalList;
    public boolean fromHospitalAdmin = false;

    public DoctorRegisterFrame() {
        hospitalList = HospitalDao.queryHospitalList();
        initComponents();
    }

    public DoctorRegisterFrame(boolean fromHospitalAdmin) {

        this.fromHospitalAdmin = fromHospitalAdmin;

        hospitalList = HospitalDao.queryHospitalList();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        BasicInfoPane = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        rbtnMale = new javax.swing.JRadioButton();
        rbtnFemale = new javax.swing.JRadioButton();
        lblDateOfBirth = new javax.swing.JLabel();
        txtDataOfBirth = new javax.swing.JTextField();
        rbtnPreferNotToSay = new javax.swing.JRadioButton();
        lblMaritialStatus = new javax.swing.JLabel();
        chooseMaritialStatus = new javax.swing.JComboBox<>();
        lblPhone = new javax.swing.JLabel();
        txtMobilePhone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        LoginPanel = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        HospitalPane = new javax.swing.JPanel();
        lblDepartment = new javax.swing.JLabel();
        lblHosptialName = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        cbbDepartment = new javax.swing.JComboBox<>();
        lblAvailableTime = new javax.swing.JLabel();
        cbbHospital = new javax.swing.JComboBox<>();
        cbbLevel = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        ckbThurs = new javax.swing.JCheckBox();
        ckbFri = new javax.swing.JCheckBox();
        ckbTues = new javax.swing.JCheckBox();
        ckbWed = new javax.swing.JCheckBox();
        ckbMon = new javax.swing.JCheckBox();
        ckbSat = new javax.swing.JCheckBox();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BasicInfoPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basic Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 153, 153))); // NOI18N

        lblFirstName.setText("First Name:");

        lblLastName.setText("Last Name:");

        lblGender.setText("Gender:");

        buttonGroup1.add(rbtnMale);
        rbtnMale.setText("Male");

        buttonGroup1.add(rbtnFemale);
        rbtnFemale.setText("Female");

        lblDateOfBirth.setText("Date of Birth:");

        buttonGroup1.add(rbtnPreferNotToSay);
        rbtnPreferNotToSay.setText("Prefer not to say");

        lblMaritialStatus.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblMaritialStatus.setForeground(new java.awt.Color(51, 51, 51));
        lblMaritialStatus.setText("Maritial Status:");

        chooseMaritialStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced" }));
        chooseMaritialStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseMaritialStatusActionPerformed(evt);
            }
        });

        lblPhone.setText("Mobile Phone:");

        lblEmail.setText("Email:");

        javax.swing.GroupLayout BasicInfoPaneLayout = new javax.swing.GroupLayout(BasicInfoPane);
        BasicInfoPane.setLayout(BasicInfoPaneLayout);
        BasicInfoPaneLayout.setHorizontalGroup(
            BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFirstName)
                    .addComponent(lblGender)
                    .addComponent(lblDateOfBirth)
                    .addComponent(lblMaritialStatus)
                    .addComponent(lblPhone)
                    .addComponent(lblEmail)
                    .addComponent(lblLastName))
                .addGap(18, 18, 18)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BasicInfoPaneLayout.createSequentialGroup()
                        .addComponent(rbtnMale)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnFemale)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnPreferNotToSay))
                    .addComponent(chooseMaritialStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, 279, Short.MAX_VALUE)
                    .addComponent(txtDataOfBirth, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMobilePhone, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        BasicInfoPaneLayout.setVerticalGroup(
            BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnMale)
                        .addComponent(rbtnFemale)
                        .addComponent(rbtnPreferNotToSay))
                    .addComponent(lblGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateOfBirth)
                    .addComponent(txtDataOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaritialStatus)
                    .addComponent(chooseMaritialStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblPhone)
                    .addComponent(txtMobilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        LoginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 153, 153))); // NOI18N

        lblPassword.setText("Password:");

        lblConfirmPassword.setText("Confirm:");

        lblUserName.setText("UserName:");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblConfirmPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        LoginPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtConfirmPassword, txtPassword, txtUserName});

        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmPassword))
                .addGap(20, 20, 20))
        );

        HospitalPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hospital Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 153, 153))); // NOI18N

        lblDepartment.setText("Department:");

        lblHosptialName.setText("Name:");

        lblLevel.setText("Level:");

        cbbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ophtalmology", "Internal Medicine", "Surgery", "Pediatrics", "Obstetrics and Gynecology", "Stomatology", "Neurology" }));
        cbbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbDepartmentActionPerformed(evt);
            }
        });

        lblAvailableTime.setText("Available Time:");

        hospitalList.forEach(o -> {
            cbbHospital.addItem(o.toString());
        });
        cbbHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbHospitalActionPerformed(evt);
            }
        });

        cbbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Junior", "Intermediate", "Senior" }));
        cbbLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLevelActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        ckbThurs.setText("Thurs.");

        ckbFri.setText("Fri.");

        ckbTues.setText("Tues.");

        ckbWed.setText("Wed.");

        ckbMon.setText("Mon.");

        ckbSat.setText("Sat.");
        ckbSat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbSatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ckbMon)
                        .addGap(24, 24, 24)
                        .addComponent(ckbTues))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ckbThurs)
                        .addGap(18, 18, 18)
                        .addComponent(ckbFri)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbSat)
                    .addComponent(ckbWed))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbTues)
                    .addComponent(ckbMon)
                    .addComponent(ckbWed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ckbFri)
                        .addComponent(ckbSat))
                    .addComponent(ckbThurs))
                .addContainerGap())
        );

        javax.swing.GroupLayout HospitalPaneLayout = new javax.swing.GroupLayout(HospitalPane);
        HospitalPane.setLayout(HospitalPaneLayout);
        HospitalPaneLayout.setHorizontalGroup(
            HospitalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospitalPaneLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(HospitalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHosptialName)
                    .addComponent(lblDepartment)
                    .addComponent(lblLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HospitalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbbHospital, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbDepartment, 0, 247, Short.MAX_VALUE)
                    .addComponent(cbbLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
            .addGroup(HospitalPaneLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblAvailableTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        HospitalPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbbDepartment, cbbHospital, cbbLevel, jPanel1});

        HospitalPaneLayout.setVerticalGroup(
            HospitalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospitalPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HospitalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHosptialName)
                    .addComponent(cbbHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HospitalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartment)
                    .addComponent(cbbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HospitalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel)
                    .addComponent(cbbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HospitalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblAvailableTime)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/RepeatHS.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/about.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/doctor2.jpeg"))); // NOI18N
        lblIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lblIcon.setPreferredSize(new java.awt.Dimension(120, 120));
        lblIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(BasicInfoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HospitalPane, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(343, 343, 343))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {HospitalPane, LoginPanel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HospitalPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BasicInfoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chooseMaritialStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseMaritialStatusActionPerformed

    }//GEN-LAST:event_chooseMaritialStatusActionPerformed

    private void cbbDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbDepartmentActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String userName = txtUserName.getText();
        if (StringUtils.isBlank(userName)) {
            JOptionPane.showMessageDialog(this, "Please Input Username!");
            return;
        }
        if (!CheckUtils.checkUsername(userName)) {
            JOptionPane.showMessageDialog(this, "Rule of Username: 6-12 Characters, Contail Only Digit and Letter!");
            return;
        }
        // userName must be unique
        if (LoginDao.queryByUserName(userName) != null) {
            JOptionPane.showMessageDialog(this, "Duplicate Username, Please Change Another!");
            return;
        }

        String password = new String(txtPassword.getPassword());
        String confirmPassword = new String(txtConfirmPassword.getPassword());
        if (StringUtils.isBlank(password) || StringUtils.isBlank(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Please Input Password!");
            return;
        }
        if (!CheckUtils.checkPassword(password)) {
            JOptionPane.showMessageDialog(this, "Please Longer Than 8 character, Only Contain Digit and Letter, At Least one Capital Letter!");
            return;
        }
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Inconsistent Password!");
            return;
        }

        // name
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        if (StringUtils.isBlank(firstName) || StringUtils.isBlank(lastName)) {
            JOptionPane.showMessageDialog(this, "Please Input Name!");
            return;
        }
        if (!CheckUtils.checkName(firstName) || !CheckUtils.checkName(lastName)) {
            JOptionPane.showMessageDialog(this, "Invalid Name!");
            return;
        }

        // gender
        int gender;
        if (rbtnPreferNotToSay.isSelected()) {
            gender = GenderEnum.PREFER_NOT_TO_SAY.getIndex();
        } else if (rbtnFemale.isSelected()) {
            gender = GenderEnum.FEMALE.getIndex();
        } else if (rbtnMale.isSelected()) {
            gender = GenderEnum.MALE.getIndex();
        } else {
            JOptionPane.showMessageDialog(this, "Please Choose Your Gender!");
            return;
        }

        String dateOfBirth = txtDataOfBirth.getText();
        if (StringUtils.isBlank(dateOfBirth)) {
            JOptionPane.showMessageDialog(this, "Please Input Your Birthday!");
            return;
        }
        if (DateUtils.formatBirthday(dateOfBirth) == null) {
            JOptionPane.showMessageDialog(this, "Invalid Date, Please Input as 2022/01/01!");
            return;
        }

        int selectedMaritialStatus = chooseMaritialStatus.getSelectedIndex(); // optional

        String mobilePhone = txtMobilePhone.getText();
        if (!CheckUtils.checkPhoneNo(mobilePhone)) {
            JOptionPane.showMessageDialog(this, "Invalid Phone No, Please Check Again!");
            return;
        }

        String email = txtEmail.getText();
        if (!CheckUtils.checkEmail(email)) {
            JOptionPane.showMessageDialog(this, "Invalid Email, Please Check Again!");
            return;
        }

        Hospital belongToHospital = HospitalDao.queryHospitalByHName((String) cbbHospital.getSelectedItem());

        String department = (String) cbbDepartment.getSelectedItem();
        if (StringUtils.isBlank(department)) {
            JOptionPane.showMessageDialog(this, "Please Input Department!");
            return;
        }

        List<String> availTime = new ArrayList<>();
        if (ckbMon.isSelected()) {
            availTime.add("Monday");
        }
        if (ckbTues.isSelected()) {
            availTime.add("Tuesday");
        }
        if (ckbWed.isSelected()) {
            availTime.add("Wednesday");
        }
        if (ckbThurs.isSelected()) {
            availTime.add("Thursday");
        }
        if (ckbFri.isSelected()) {
            availTime.add("Friday");
        }
        if (ckbSat.isSelected()) {
            availTime.add("Saturday");
        }

        if (availTime.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Choose Work Time!");
            return;
        }

        // TODO 到底存的什么
        String level = (String) cbbLevel.getSelectedItem();

        Login newDoLoginModel = new Login();
        newDoLoginModel.setRoleType(enumvalue.RoleEnum.DOCTOR.getIndex());
        newDoLoginModel.setUserName(userName);
        newDoLoginModel.setPassword(password);

        LoginDao.insertNewUser(newDoLoginModel);

        Doctor doctor = new Doctor();
        doctor.setHid(belongToHospital.getHid());
        doctor.sethName(belongToHospital.gethName());
        doctor.setCommunity(belongToHospital.getCommunity());
        doctor.setZipCode(belongToHospital.getZipCode());
        doctor.setDateOfBirth(dateOfBirth);
        doctor.setDepartment(department);
        doctor.setEmail(email);
        doctor.setFirstName(firstName);
        doctor.setLastName(lastName);
        doctor.setUsername(userName);
        doctor.setGender(gender);
        doctor.setLevel(level);
        doctor.setMarritialStatus(selectedMaritialStatus);
        doctor.setPhoneNum(mobilePhone);
        doctor.setdName(firstName + " " + lastName);
        doctor.setAvailableTime(availTime);

        DoctorDao.insertNewDoctor(doctor);

        JOptionPane.showMessageDialog(this, "Congrats! Register Successfully!", "", JOptionPane.PLAIN_MESSAGE);

        if (!fromHospitalAdmin) {
            LoginFrame loginFrame = new LoginFrame(enumvalue.RoleEnum.DOCTOR.getIndex());
            loginFrame.setLocationRelativeTo(null);
            loginFrame.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnClearActionPerformed

    private void cbbHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbHospitalActionPerformed

    private void cbbLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbLevelActionPerformed

    private void ckbSatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbSatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbSatActionPerformed

    private void lblIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {

            @Override
            public String getDescription() {
                return "img file（.jpg;.png）";
            }

            @Override
            public boolean accept(File file) {
                if (file.isDirectory()) {
                    return true;
                }
                String fileName = file.getName().toLowerCase();
                if (fileName.endsWith(".jpg") || fileName.endsWith(".png")) {
                    return true;
                }
                return false;
            }
        });

        int i = fileChooser.showOpenDialog(getParent());
        if (i == fileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            if (file != null) {
                ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath());// 创建照片对象
                Image img = imageIcon.getImage();
                img = img.getScaledInstance(120, 120, Image.SCALE_AREA_AVERAGING);
                imageIcon.setImage(img);

                lblIcon.setText(null);
                lblIcon.setIcon(imageIcon);
            }
        }
    }//GEN-LAST:event_lblIconMouseClicked

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new DoctorRegisterFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BasicInfoPane;
    private javax.swing.JPanel HospitalPane;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbbDepartment;
    private javax.swing.JComboBox<String> cbbHospital;
    private javax.swing.JComboBox<String> cbbLevel;
    private javax.swing.JComboBox<String> chooseMaritialStatus;
    private javax.swing.JCheckBox ckbFri;
    private javax.swing.JCheckBox ckbMon;
    private javax.swing.JCheckBox ckbSat;
    private javax.swing.JCheckBox ckbThurs;
    private javax.swing.JCheckBox ckbTues;
    private javax.swing.JCheckBox ckbWed;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAvailableTime;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHosptialName;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblMaritialStatus;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JRadioButton rbtnPreferNotToSay;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtDataOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobilePhone;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
