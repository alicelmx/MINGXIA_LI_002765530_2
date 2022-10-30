package ui.hospital;

import dao.CommunityDao;
import dao.PatientDao;
import enumvalue.GenderEnum;
import java.util.List;
import javax.swing.JOptionPane;
import model.Community;
import model.Patient;
import org.apache.commons.lang3.StringUtils;
import tool.CheckUtils;
import tool.DateUtils;

/**
 *
 * @author Sajeeb
 */
public class EditPatientInfoFrame extends javax.swing.JFrame {

    public List<Community> communityList;
    public Patient curPatient;

    public EditPatientInfoFrame() {
        communityList = CommunityDao.queryAllCommunityList();
        initComponents();
    }

    public EditPatientInfoFrame(Patient selectedPatient) {
        communityList = CommunityDao.queryAllCommunityList();
        curPatient = selectedPatient;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpSex = new javax.swing.ButtonGroup();
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
        jLabel1 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register");
        setResizable(false);

        AddressDetialsPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 153, 153))); // NOI18N

        lblHouse.setText("House No:");

        lblCommunity.setText("Community:");

        lblCity.setText("City:");

        lblZipCode.setText("Zip Code:");

        txtHouse.setText(curPatient.getHouse());

        txtCity.setText(curPatient.getCity());

        txtZipCode.setText(curPatient.getZipcode());

        communityList.forEach(o -> {
            cbbCommunity.addItem(o.getcName());
        });

        cbbCommunity.setSelectedItem(curPatient.getCommunity());
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
                .addGap(30, 30, 30))
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

        txtMobilePhone.setText(curPatient.getPhoneNum());

        lblEmail.setText("Email:");

        txtEmail.setText(curPatient.getEmail());

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

        txtFirstName.setText(curPatient.getFirstName());

        txtLastName.setText(curPatient.getLastName());

        lblGender.setText("Gender:");

        btngrpSex.add(rbtnMale);
        rbtnMale.setText("Male");
        if(curPatient.getGender().equals(enumvalue.GenderEnum.MALE.getIndex())){
            rbtnMale.setSelected(true);
        }

        btngrpSex.add(rbtnFemale);
        rbtnFemale.setText("Female");
        if(curPatient.getGender().equals(enumvalue.GenderEnum.FEMALE.getIndex())){
            rbtnFemale.setSelected(true);
        }

        lblDateOfBirth.setText("Date of Birth:");

        txtDataOfBirth.setText(curPatient.getDateOfBirth());

        btngrpSex.add(rbtnPreferNotToSay);
        rbtnPreferNotToSay.setText("Prefer not to say");
        if(curPatient.getGender().equals(enumvalue.GenderEnum.PREFER_NOT_TO_SAY.getIndex())){
            rbtnPreferNotToSay.setSelected(true);
        }

        lblMaritialStatus.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblMaritialStatus.setText("Maritial Status:");

        chooseMaritialStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced" }));
        if(curPatient.getMarritialStatus().equals(enumvalue.MaritialStatusEnum.SINGLE.getIndex())) {
            chooseMaritialStatus.setSelectedIndex(enumvalue.MaritialStatusEnum.SINGLE.getIndex());
        } else if(curPatient.getMarritialStatus().equals(enumvalue.MaritialStatusEnum.MARRIED.getIndex())) {
            chooseMaritialStatus.setSelectedIndex(enumvalue.MaritialStatusEnum.MARRIED.getIndex());
        } else if(curPatient.getMarritialStatus().equals(enumvalue.MaritialStatusEnum.DIVORCED.getIndex())) {
            chooseMaritialStatus.setSelectedIndex(enumvalue.MaritialStatusEnum.DIVORCED.getIndex());
        }
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
                    .addComponent(chooseMaritialStatus, 0, 288, Short.MAX_VALUE))
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/patient.jpeg"))); // NOI18N

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

        javax.swing.GroupLayout InputPaneLayout = new javax.swing.GroupLayout(InputPane);
        InputPane.setLayout(InputPaneLayout);
        InputPaneLayout.setHorizontalGroup(
            InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPaneLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ContactInfoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BasicInfoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InputPaneLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(AddressDetialsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InputPaneLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(351, 351, 351))
        );
        InputPaneLayout.setVerticalGroup(
            InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputPaneLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InputPaneLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(AddressDetialsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InputPaneLayout.createSequentialGroup()
                        .addComponent(BasicInfoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(ContactInfoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(InputPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(InputPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chooseMaritialStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseMaritialStatusActionPerformed

    }//GEN-LAST:event_chooseMaritialStatusActionPerformed

    private void cbbCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCommunityActionPerformed
        String selectedCommmunity = (String) cbbCommunity.getSelectedItem();
        Community sc = CommunityDao.queryCommunityListByCName(selectedCommmunity);

        txtCity.setText(sc.getCity());
        txtCity.setEnabled(false);

        txtZipCode.setText(sc.getZipcode());
        txtZipCode.setEnabled(false);
    }//GEN-LAST:event_cbbCommunityActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clearAllBlanket();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
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

        if (StringUtils.isBlank(houseNo) || StringUtils.isBlank(city)) {
            JOptionPane.showMessageDialog(this, "Please Input City and House No!");
            return;
        }

        Patient patient = new Patient();
        patient.setUsername(curPatient.getUsername());
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

        PatientDao.updatePatient(curPatient, patient);

        JOptionPane.showMessageDialog(this, "Successfully!", "", JOptionPane.PLAIN_MESSAGE);

        this.dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new EditPatientInfoFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddressDetialsPane;
    private javax.swing.JPanel BasicInfoPane;
    private javax.swing.JPanel ContactInfoPane;
    private javax.swing.JPanel InputPane;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup btngrpSex;
    private javax.swing.JComboBox<String> cbbCommunity;
    private javax.swing.JComboBox<String> chooseMaritialStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMaritialStatus;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JRadioButton rbtnPreferNotToSay;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDataOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobilePhone;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables

    private void clearAllBlanket() {
        txtFirstName.setText("");
        txtLastName.setText("");
        btngrpSex.clearSelection();
        txtDataOfBirth.setText("");
        txtMobilePhone.setText("");
        txtEmail.setText("");
        txtHouse.setText("");
        txtCity.setText("");
        txtZipCode.setText("");
    }
}
