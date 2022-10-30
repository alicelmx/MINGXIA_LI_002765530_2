package ui.hospital;

import dao.DoctorDao;
import dao.HospitalDao;
import dao.LoginDao;
import enumvalue.GenderEnum;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Doctor;
import model.Hospital;
import model.Login;
import org.apache.commons.lang3.StringUtils;
import tool.CheckUtils;
import tool.DateUtils;

/**
 *
 * @author Sajeeb
 */
public class EditDoctorInfoFrame extends javax.swing.JFrame {

    public List<Hospital> hospitalList;
    public Doctor selectedDoctor;
    public Login curLoginModel;

    public EditDoctorInfoFrame() {
        initComponents();
    }

    public EditDoctorInfoFrame(Doctor selectedDoctor) {

        this.selectedDoctor = selectedDoctor;
        curLoginModel = LoginDao.queryByUserName(selectedDoctor.getUsername());

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpSex = new javax.swing.ButtonGroup();
        BasicInfoPane = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        txtDataOfBirth = new javax.swing.JTextField();
        lblMaritialStatus = new javax.swing.JLabel();
        chooseMaritialStatus = new javax.swing.JComboBox<>();
        lblPhone = new javax.swing.JLabel();
        txtMobilePhone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbtnFemale = new javax.swing.JRadioButton();
        rbtnPreferNotToSay = new javax.swing.JRadioButton();
        rbtnMale = new javax.swing.JRadioButton();
        HospitalPane = new javax.swing.JPanel();
        lblDepartment = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        cbbDepartment = new javax.swing.JComboBox<>();
        lblAvailableTime = new javax.swing.JLabel();
        cbbLevel = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        ckbFri = new javax.swing.JCheckBox();
        ckbMon = new javax.swing.JCheckBox();
        ckbWed = new javax.swing.JCheckBox();
        ckbSat = new javax.swing.JCheckBox();
        ckbThurs = new javax.swing.JCheckBox();
        ckbTues = new javax.swing.JCheckBox();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BasicInfoPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basic Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 153, 153))); // NOI18N

        lblFirstName.setText("First Name:");

        lblLastName.setText("Last Name:");

        txtFirstName.setText(selectedDoctor.getFirstName());

        txtLastName.setText(selectedDoctor.getLastName());

        lblGender.setText("Gender:");

        lblDateOfBirth.setText("Date of Birth:");

        txtDataOfBirth.setText(selectedDoctor.getDateOfBirth());

        lblMaritialStatus.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblMaritialStatus.setForeground(new java.awt.Color(51, 51, 51));
        lblMaritialStatus.setText("Maritial Status:");

        chooseMaritialStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced" }));
        if(selectedDoctor.getMarritialStatus().equals(enumvalue.MaritialStatusEnum.SINGLE.getIndex())) {
            chooseMaritialStatus.setSelectedIndex(enumvalue.MaritialStatusEnum.SINGLE.getIndex());
        } else if(selectedDoctor.getMarritialStatus().equals(enumvalue.MaritialStatusEnum.MARRIED.getIndex())) {
            chooseMaritialStatus.setSelectedIndex(enumvalue.MaritialStatusEnum.MARRIED.getIndex());
        } else if(selectedDoctor.getMarritialStatus().equals(enumvalue.MaritialStatusEnum.DIVORCED.getIndex())) {
            chooseMaritialStatus.setSelectedIndex(enumvalue.MaritialStatusEnum.DIVORCED.getIndex());
        }
        chooseMaritialStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseMaritialStatusActionPerformed(evt);
            }
        });

        lblPhone.setText("Mobile Phone:");

        txtMobilePhone.setText(selectedDoctor.getPhoneNum());

        lblEmail.setText("Email:");

        txtEmail.setText(selectedDoctor.getEmail());

        btngrpSex.add(rbtnFemale);
        rbtnFemale.setText("Female");
        if(selectedDoctor.getGender().equals(enumvalue.GenderEnum.FEMALE.getIndex())){
            rbtnFemale.setSelected(true);
        }
        rbtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFemaleActionPerformed(evt);
            }
        });

        btngrpSex.add(rbtnPreferNotToSay);
        rbtnPreferNotToSay.setText("Prefer not to say");
        if(selectedDoctor.getGender().equals(enumvalue.GenderEnum.PREFER_NOT_TO_SAY.getIndex())){
            rbtnPreferNotToSay.setSelected(true);
        }

        btngrpSex.add(rbtnMale);
        rbtnMale.setText("Male");
        if(selectedDoctor.getGender().equals(enumvalue.GenderEnum.MALE.getIndex())){
            rbtnMale.setSelected(true);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnMale)
                .addGap(18, 18, 18)
                .addComponent(rbtnFemale)
                .addGap(18, 18, 18)
                .addComponent(rbtnPreferNotToSay)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnMale)
                    .addComponent(rbtnFemale)
                    .addComponent(rbtnPreferNotToSay))
                .addContainerGap())
        );

        javax.swing.GroupLayout BasicInfoPaneLayout = new javax.swing.GroupLayout(BasicInfoPane);
        BasicInfoPane.setLayout(BasicInfoPaneLayout);
        BasicInfoPaneLayout.setHorizontalGroup(
            BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                        .addComponent(lblDateOfBirth)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataOfBirth))
                    .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                        .addComponent(lblMaritialStatus)
                        .addGap(18, 18, 18)
                        .addComponent(chooseMaritialStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                        .addComponent(lblPhone)
                        .addGap(18, 18, 18)
                        .addComponent(txtMobilePhone))
                    .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail))
                    .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                            .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblLastName)
                                .addComponent(lblGender))
                            .addGap(18, 18, 18)
                            .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLastName)))
                        .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                            .addComponent(lblFirstName)
                            .addGap(18, 18, 18)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        BasicInfoPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {chooseMaritialStatus, jPanel1, txtDataOfBirth, txtEmail, txtFirstName, txtLastName, txtMobilePhone});

        BasicInfoPaneLayout.setVerticalGroup(
            BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasicInfoPaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblGender)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateOfBirth)
                    .addComponent(txtDataOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaritialStatus)
                    .addComponent(chooseMaritialStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMobilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone))
                .addGap(18, 18, 18)
                .addGroup(BasicInfoPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        HospitalPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Work Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 153, 153))); // NOI18N

        lblDepartment.setText("Department:");

        lblLevel.setText("Level:");

        String[] departmentList = { "Ophtalmology", "Internal Medicine", "Surgery", "Pediatrics", "Obstetrics and Gynecology", "Stomatology", "Neurology" };
        cbbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(departmentList));
        for(int i=0;i<departmentList.length;i++) {
            if(departmentList[i].equals(selectedDoctor.getDepartment())) {
                cbbDepartment.setSelectedIndex(i);
            }
        }
        cbbDepartment.setEnabled(false);
        cbbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbDepartmentActionPerformed(evt);
            }
        });

        lblAvailableTime.setText("Available Time:");

        cbbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Junior", "Intermediate", "Senior" }));
        String level = selectedDoctor.getLevel();
        if(level.equalsIgnoreCase("Junior")) {
            cbbLevel.setSelectedIndex(0);
        } else if(level.equalsIgnoreCase("Intermediate")) {
            cbbLevel.setSelectedIndex(1);
        } else if(level.equalsIgnoreCase("Senior")) {
            cbbLevel.setSelectedIndex(2);
        }
        cbbLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLevelActionPerformed(evt);
            }
        });

        ckbFri.setText("Fri.");
        selectedDoctor.getAvailableTime().forEach( time -> {
            if(time.equals("Friday")) {
                ckbFri.setSelected(true);
            }
        });

        ckbMon.setText("Mon.");
        selectedDoctor.getAvailableTime().forEach( time -> {
            if(time.equals("Monday")) {
                ckbMon.setSelected(true);
            }
        });

        ckbWed.setText("Wed.");
        selectedDoctor.getAvailableTime().forEach( time -> {
            if(time.equals("Wednesday")) {
                ckbWed.setSelected(true);
            }
        });

        ckbSat.setText("Sat.");
        selectedDoctor.getAvailableTime().forEach( time -> {
            if(time.equals("Saturday")) {
                ckbSat.setSelected(true);
            }
        });
        ckbSat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbSatActionPerformed(evt);
            }
        });

        ckbThurs.setText("Thurs.");
        selectedDoctor.getAvailableTime().forEach( time -> {
            if(time.equals("Thursday")) {
                ckbThurs.setSelected(true);
            }
        });

        ckbTues.setText("Tues.");
        selectedDoctor.getAvailableTime().forEach( time -> {
            if(time.equals("Tuesday")) {
                ckbTues.setSelected(true);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ckbMon)
                        .addGap(24, 24, 24)
                        .addComponent(ckbTues))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ckbThurs)
                        .addGap(18, 18, 18)
                        .addComponent(ckbFri)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbSat)
                    .addComponent(ckbWed))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbTues)
                    .addComponent(ckbMon)
                    .addComponent(ckbWed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbFri)
                    .addComponent(ckbSat)
                    .addComponent(ckbThurs))
                .addContainerGap())
        );

        javax.swing.GroupLayout HospitalPaneLayout = new javax.swing.GroupLayout(HospitalPane);
        HospitalPane.setLayout(HospitalPaneLayout);
        HospitalPaneLayout.setHorizontalGroup(
            HospitalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospitalPaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(HospitalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvailableTime, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLevel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDepartment, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(HospitalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        HospitalPaneLayout.setVerticalGroup(
            HospitalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospitalPaneLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(HospitalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartment)
                    .addComponent(cbbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HospitalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel)
                    .addComponent(cbbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(HospitalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblAvailableTime)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/patient.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(BasicInfoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HospitalPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HospitalPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BasicInfoPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
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

        String level = (String) cbbLevel.getSelectedItem();

        Hospital belongToHospital = HospitalDao.queryHospitalByHID(selectedDoctor.getHid());

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
        doctor.setUsername(selectedDoctor.getUsername());
        doctor.setGender(gender);
        doctor.setLevel(level);
        doctor.setMarritialStatus(selectedMaritialStatus);
        doctor.setPhoneNum(mobilePhone);
        doctor.setdName(firstName + " " + lastName);
        doctor.setAvailableTime(availTime);

        if (!DoctorDao.updateDoctor(doctor, selectedDoctor)) {
            JOptionPane.showMessageDialog(this, "Fail to Edit!");
            return;
        }

        JOptionPane.showMessageDialog(this, "Edit Successfully!", "", JOptionPane.PLAIN_MESSAGE);

        this.dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clearAllBlanket();

    }//GEN-LAST:event_btnClearActionPerformed

    private void cbbLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbLevelActionPerformed

    private void ckbSatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbSatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbSatActionPerformed

    private void rbtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnFemaleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new EditDoctorInfoFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BasicInfoPane;
    private javax.swing.JPanel HospitalPane;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup btngrpSex;
    private javax.swing.JComboBox<String> cbbDepartment;
    private javax.swing.JComboBox<String> cbbLevel;
    private javax.swing.JComboBox<String> chooseMaritialStatus;
    private javax.swing.JCheckBox ckbFri;
    private javax.swing.JCheckBox ckbMon;
    private javax.swing.JCheckBox ckbSat;
    private javax.swing.JCheckBox ckbThurs;
    private javax.swing.JCheckBox ckbTues;
    private javax.swing.JCheckBox ckbWed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAvailableTime;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblMaritialStatus;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JRadioButton rbtnPreferNotToSay;
    private javax.swing.JTextField txtDataOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobilePhone;
    // End of variables declaration//GEN-END:variables

    private void clearAllBlanket() {
        txtFirstName.setText("");
        txtLastName.setText("");
        btngrpSex.clearSelection();
        txtDataOfBirth.setText("");
        txtMobilePhone.setText("");
        txtEmail.setText("");
        ckbMon.setSelected(false);
        ckbTues.setSelected(false);
        ckbWed.setSelected(false);
        ckbThurs.setSelected(false);
        ckbFri.setSelected(false);
        ckbSat.setSelected(false);

    }
}
