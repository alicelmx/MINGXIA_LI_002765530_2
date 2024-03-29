/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.hospital;

import dao.EncounterDao;
import java.awt.Graphics;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.Encounter;
import model.EncounterHistory;
import model.Hospital;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author limingxia
 */
public class ManageEncounterPane extends javax.swing.JPanel {

    public EncounterHistory encounterHistory = new EncounterHistory();
    public Hospital currHospital;
    public Doctor curDoctor;
    public List<Encounter> encounterList;

    /**
     * Creates new form AuthManagementPane
     */
    public ManageEncounterPane() {
        encounterList = EncounterDao.queryAllEncounterRecord();

        initComponents();

        populateTable(encounterList);

    }

    public ManageEncounterPane(Hospital currHospital) {

        this.currHospital = currHospital;
        encounterList = EncounterDao.queryEncounterByHID(this.currHospital.getHid());

        initComponents();

        populateTable(encounterList);

    }

    public ManageEncounterPane(Doctor doctor) {

        this.curDoctor = doctor;
        encounterList = EncounterDao.queryEncounterByDid(this.curDoctor.getDid());

        initComponents();

        populateTable(encounterList);
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

        txtKeywords = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEncounterHistory = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRefesh = new javax.swing.JButton();

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

        tbEncounterHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Hospital", "Doctor", "Department", "Patient"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbEncounterHistory);

        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/write.png"))); // NOI18N
        btnView.setText("Edit");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Encounter History");

        btnRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/refresh.png"))); // NOI18N
        btnRefesh.setText("Refresh");
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRefesh)
                        .addGap(18, 18, 18)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(txtKeywords, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearch))))
                .addGap(0, 38, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRefesh, btnView});

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
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnRefesh, btnView});

    }// </editor-fold>//GEN-END:initComponents

    private void txtKeywordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeywordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeywordsActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String keywords = txtKeywords.getText();
        if (StringUtils.isBlank(keywords)) {
            JOptionPane.showMessageDialog(this, "Please Input Keyword to Search!");
            return;
        }
        encounterHistory.setEncounterHistory(encounterList);
        List<Encounter> searchResult = encounterHistory.searchByKeyword(keywords);

        populateTable(searchResult);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        int selectedRowIndex = tbEncounterHistory.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a Encounter to Edit.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tbEncounterHistory.getModel();
        Encounter encounter = (Encounter) model.getValueAt(selectedRowIndex, 0);

        EditEncounterDetailFrame encounterDetailFrame = new EditEncounterDetailFrame(encounter);
        encounterDetailFrame.setLocationRelativeTo(null);
        encounterDetailFrame.setVisible(true);

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        txtKeywords.setText("");

        if (ObjectUtils.isNotEmpty(currHospital)) {
            encounterList = EncounterDao.queryEncounterByHID(this.currHospital.getHid());
        } else if (ObjectUtils.isNotEmpty(curDoctor)) {
            encounterList = EncounterDao.queryEncounterByDid(this.curDoctor.getDid());
        } else {
            encounterList = EncounterDao.queryAllEncounterRecord();
        }

        populateTable(encounterList);
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void populateTable(List<Encounter> encounters) {

        DefaultTableModel model = (DefaultTableModel) tbEncounterHistory.getModel();
        model.setRowCount(0);

        if (ObjectUtils.isEmpty(encounters)) {
            return;
        }

        for (Encounter encounter : encounters) {

            Object[] row = new Object[5];
            row[0] = encounter;
            row[1] = encounter.gethName();
            row[2] = encounter.getdName();
            row[3] = encounter.getDeptment();
            row[4] = encounter.getpName();

            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefesh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbEncounterHistory;
    private javax.swing.JTextField txtKeywords;
    // End of variables declaration//GEN-END:variables
}
