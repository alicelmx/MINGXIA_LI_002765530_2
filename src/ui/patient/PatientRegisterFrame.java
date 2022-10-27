package ui.patient;

import dao.CommunityDao;
import static dao.HospitalDao.file;
import dao.LoginDao;
import dao.PatientDao;
import enumvalue.GenderEnum;
import java.awt.Image;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Community;
import model.Login;
import model.Patient;
import org.apache.commons.lang3.StringUtils;
import tool.CheckUtils;
import tool.DateUtils;
import ui.LoginFrame;

/**
 *
 * @author Sajeeb
 */
public class PatientRegisterFrame extends javax.swing.JFrame {

    public List<Community> communityList;

    public PatientRegisterFrame() {
        communityList = CommunityDao.queryAllCommunityList();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        InputPane = new javax.swing.JPanel();
        AddressDetialsPane = new javax.swing.JPanel();
        lblHouse = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        cbbCommunity = new javax.swing.JComboBox<>();
        ContactInfoPane = new javax.swing.JPanel();
        lblPhone = new javax.swing.JLabel();
        txtMobilePhone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
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
        LoginPanel = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register");
        setResizable(false);

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/RepeatHS.png"))); // NOI18N
        btnClear.setText("Clear");

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/about.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        AddressDetialsPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 153, 153))); // NOI18N

        lblHouse.setText("House No:");

        lblCommunity.setText("Community:");

        lblCity.setText("City:");

        lblZipCode.setText("Zip Code:");

        communityList.forEach(o -> {
            cbbCommunity.addItem(o.getcName());
        });
        cbbCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCommunityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddressDetialsPaneLayout = new javax.swing.GroupLayout(AddressDetialsPane);
        AddressDetialsPane.setLayout(AddressDetialsPaneLayout);
        AddressDetialsPaneLayout.setHorizontalGroup(
            AddressDetialsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressDetialsPaneLayout.createSequentialGroup()
                .addGroup(AddressDetialsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddressDetialsPaneLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblHouse)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddressDetialsPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AddressDetialsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblZipCode, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)))
                .addGroup(AddressDetialsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCity)
                    .addComponent(txtHouse)
                    .addComponent(txtZipCode)
                    .addComponent(cbbCommunity, 0, 253, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddressDetialsPaneLayout.setVerticalGroup(
            AddressDetialsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressDetialsPaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(AddressDetialsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHouse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddressDetialsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddressDetialsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddressDetialsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipCode)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        ContactInfoPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 153, 153))); // NOI18N

        lblPhone.setText("Mobile Phone:");

        lblEmail.setText("Email:");

        javax.swing.GroupLayout ContactInfoPaneLayout = new javax.swing.GroupLayout(ContactInfoPane);
        ContactInfoPane.setLayout(ContactInfoPaneLayout);
        ContactInfoPaneLayout.setHorizontalGroup(
            ContactInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactInfoPaneLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ContactInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPhone)
                    .addComponent(lblEmail))
                .addGap(18, 18, 18)
                .addGroup(ContactInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMobilePhone)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        ContactInfoPaneLayout.setVerticalGroup(
            ContactInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactInfoPaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(ContactInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtMobilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContactInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

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
        lblMaritialStatus.setText("Maritial Status:");

        chooseMaritialStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced" }));
        chooseMaritialStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseMaritialStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BasicInfoPaneLayout = new javax.swing.GroupLayout(BasicInfoPane);
        BasicInfoPane.setLayout(BasicInfoPaneLayout);
        BasicInfoPaneLayout.setHorizontalGroup(
            BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDateOfBirth, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMaritialStatus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstName)
                    .addComponent(txtLastName)
                    .addComponent(txtDataOfBirth)
                    .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                        .addComponent(rbtnMale)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnFemale)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnPreferNotToSay))
                    .addComponent(chooseMaritialStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        BasicInfoPaneLayout.setVerticalGroup(
            BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGender)
                    .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnMale)
                        .addComponent(rbtnFemale)
                        .addComponent(rbtnPreferNotToSay)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateOfBirth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaritialStatus)
                    .addComponent(chooseMaritialStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        LoginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 153, 153))); // NOI18N

        lblPassword.setText("Password:");

        lblConfirmPassword.setText("Confirm:");

        lblUserName.setText("UserName:");

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblConfirmPassword)
                    .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblUserName)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword))))
                .addGap(26, 26, 26)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(txtConfirmPassword))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmPassword)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lblIcon.setPreferredSize(new java.awt.Dimension(120, 120));
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/assets/default_doctor_icon.png"));
        Image img = imageIcon.getImage().getScaledInstance(120, 120, Image.SCALE_AREA_AVERAGING);
        imageIcon.setImage(img);
        lblIcon.setText(null);
        lblIcon.setIcon(imageIcon);
        lblIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout InputPaneLayout = new javax.swing.GroupLayout(InputPane);
        InputPane.setLayout(InputPaneLayout);
        InputPaneLayout.setHorizontalGroup(
            InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPaneLayout.createSequentialGroup()
                .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InputPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BasicInfoPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ContactInfoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddressDetialsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(InputPaneLayout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        InputPaneLayout.setVerticalGroup(
            InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(InputPaneLayout.createSequentialGroup()
                        .addComponent(BasicInfoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ContactInfoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InputPaneLayout.createSequentialGroup()
                        .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddressDetialsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(InputPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(385, 385, 385))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnSave});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(InputPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String userName = txtUserName.getText();
        if (StringUtils.isBlank(userName)) {
            JOptionPane.showMessageDialog(this, "Please Input Username!");
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

        int selectedMaritialStatus = chooseMaritialStatus.getSelectedIndex();

        String mobilePhone = txtMobilePhone.getText();
        if (!CheckUtils.checkPhoneNo(mobilePhone)) {
            JOptionPane.showMessageDialog(this, "Please Check Phone!");
            return;
        }

        String email = txtEmail.getText();
        if (!CheckUtils.checkEmail(email)) {
            JOptionPane.showMessageDialog(this, "Please Check Email!");
            return;
        }

        String zipCode = txtZipCode.getText();
        if (!CheckUtils.checkZipCode(zipCode)) {
            JOptionPane.showMessageDialog(this, "Please Check Zip Code!");
            return;
        }

        String city = txtCity.getText();
        String community = (String) cbbCommunity.getSelectedItem();
        String houseNo = txtHouse.getText();

        // 两张表一起写
        Login newPatientLoginModel = new Login();
        // 和Patient表中一致
        newPatientLoginModel.setRoleType(enumvalue.RoleEnum.PATIENT.getIndex());
        newPatientLoginModel.setUserName(userName);
        newPatientLoginModel.setPassword(password);

        LoginDao.insertNewUser(newPatientLoginModel);

        Patient patient = new Patient();
        patient.setUsername(userName);
        patient.setCity(city);
        patient.setCommunity(community);
        patient.setEmail(email);
        patient.setFirstName(firstName);
        patient.setGender(gender);
        patient.setHouse(houseNo);
        patient.setLastName(lastName);
        patient.setMarritialStatus(selectedMaritialStatus);
        patient.setZipcode(zipCode);
        patient.setPhoneNum(mobilePhone);
        patient.setDateOfBirth(dateOfBirth);

        PatientDao.insertNewPatient(patient);

        JOptionPane.showMessageDialog(this, "Congrats! Register Successfully!", "", JOptionPane.PLAIN_MESSAGE);

        LoginFrame loginFrame = new LoginFrame(enumvalue.RoleEnum.PATIENT.getIndex());
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void chooseMaritialStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseMaritialStatusActionPerformed

    }//GEN-LAST:event_chooseMaritialStatusActionPerformed

    private void cbbCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbCommunityActionPerformed

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
                ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath());
                Image img = imageIcon.getImage();
                img = img.getScaledInstance(120, 120, Image.SCALE_AREA_AVERAGING);
                imageIcon.setImage(img);

                lblIcon.setText(null);
                lblIcon.setIcon(imageIcon);
            }
        }
    }//GEN-LAST:event_lblIconMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PatientRegisterFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddressDetialsPane;
    private javax.swing.JPanel BasicInfoPane;
    private javax.swing.JPanel ContactInfoPane;
    private javax.swing.JPanel InputPane;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbbCommunity;
    private javax.swing.JComboBox<String> chooseMaritialStatus;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMaritialStatus;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JRadioButton rbtnPreferNotToSay;
    private javax.swing.JTextField txtCity;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtDataOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobilePhone;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
