package System;

import SystemClass.Centre;
import SystemClass.Committee;
import SystemClass.SystemDataIO;
import static SystemClass.SystemDataIO.allCentreVaccines;
import static SystemClass.SystemDataIO.allVaccines;
import SystemClass.Vaccines;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CommitteeVaccines extends javax.swing.JFrame {

    DefaultTableModel dtm;
    String columnname[] = new String[]{"ID", "Centre", "Supply Amount"};
    String id;
    Centre centre;
    int supply;

    public CommitteeVaccines() {
        initComponents();
        dtm = new DefaultTableModel(columnname, 0);
        tblVacSupply.setModel(dtm);
        SystemDataIO.read();
        DisplayTable();
        setLabelText();
        loadCentre();
        Vaccines v = new Vaccines();
        txtSID.setText(v.AutoNumber());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAPA = new javax.swing.JLabel();
        CAPA = new javax.swing.JLabel();
        CAPO = new javax.swing.JLabel();
        lblAPO = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblAPI = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CAPI = new javax.swing.JLabel();
        CAPE = new javax.swing.JLabel();
        lblAPE = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblAPU = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CAPU = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVacSupply = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboxCentre = new javax.swing.JComboBox<>();
        txtSID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSuppAmount = new javax.swing.JTextField();
        btnReset1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supply Vaccines to Centres");

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 153, 153), new java.awt.Color(153, 255, 255)));

        btnBack.setBackground(new java.awt.Color(204, 255, 204));
        btnBack.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 51, 51));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 0, 0));
        btnLogout.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(153, 153, 153));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(153, 255, 153));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(51, 51, 51));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(153, 255, 0));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(51, 51, 51));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(51, 255, 153));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 51, 51));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnBack)
                .addGap(200, 200, 200)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Search ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("APA");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblAPA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAPA.setText("1");
        lblAPA.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblAPAPropertyChange(evt);
            }
        });

        CAPA.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        CAPA.setForeground(new java.awt.Color(102, 102, 0));
        CAPA.setText("Moderate");
        CAPA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CAPO.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        CAPO.setForeground(new java.awt.Color(102, 102, 0));
        CAPO.setText("Moderate");
        CAPO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblAPO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAPO.setText("2");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("APO");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblAPI.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAPI.setText("3");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("API");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CAPI.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        CAPI.setForeground(new java.awt.Color(102, 102, 0));
        CAPI.setText("Moderate");
        CAPI.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CAPE.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        CAPE.setForeground(new java.awt.Color(102, 102, 0));
        CAPE.setText("Moderate");
        CAPE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblAPE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAPE.setText("4");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("APE");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblAPU.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAPU.setText("5");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("APU");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CAPU.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        CAPU.setForeground(new java.awt.Color(102, 102, 0));
        CAPU.setText("Moderate");
        CAPU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblVacSupply.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Supply ID", "Centre", "Supply Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblVacSupply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVacSupplyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVacSupply);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Supply ID");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Centre");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cboxCentre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCentreActionPerformed(evt);
            }
        });

        txtSID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSID.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Supply amount");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtSuppAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSuppAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSuppAmountKeyReleased(evt);
            }
        });

        btnReset1.setBackground(new java.awt.Color(0, 102, 102));
        btnReset1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReset1.setForeground(new java.awt.Color(255, 255, 255));
        btnReset1.setText("Reset");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboxCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSID, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSuppAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CAPA)
                            .addComponent(lblAPA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAPO, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CAPO))))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAPI, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CAPI))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CAPE)
                                    .addComponent(lblAPE, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAPU, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(CAPU, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReset1)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAPA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAPO, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CAPA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CAPO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(107, 107, 107))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAPU, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(CAPU, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAPI, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAPE, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CAPI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CAPE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(2, 2, 2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSuppAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        CommitteeOperations co = new CommitteeOperations();
        co.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int result;
        result = JOptionPane.showConfirmDialog(null, "Are you sure to log out?", "System Log Out", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            CommitteeLogin login;
            login = new CommitteeLogin();
            this.setVisible(false);
            new CommitteeLogin().setVisible(true);

        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (cboxCentre.getModel().getSelectedItem().toString().equals("notset") || txtSuppAmount.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please ensure all information are entered.", "Incomplete details", JOptionPane.WARNING_MESSAGE);
        } else {
            try {

                id = txtSID.getText();
                centre = (Centre) cboxCentre.getSelectedItem();
                supply = Integer.parseInt(txtSuppAmount.getText());

                for (int i = 0; i < allVaccines.size(); i++) {
                    if (allVaccines.get(i).getSupplyID().equals(id)) {
                        JOptionPane.showMessageDialog(rootPane, "Duplicated SupplyID! Please update by enter Edit", "Repeated SupplyID", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }

                Vaccines v = new Vaccines(centre, supply);
                SystemDataIO.allVaccines.add(v);

                System.out.println(v.toString());

                for (int i = 0; i < allCentreVaccines.size(); i++) {
                    if (allCentreVaccines.get(i).getCentre().toString().equals(centre.toString())) {
                        int total = allCentreVaccines.get(i).getVacamount() + supply;
                        allCentreVaccines.get(i).setVacamount(total);

                    }
                }
                Committee.modifyVacSupply();
                setLabelText();
                ClearText();
                DisplayTable();

                JOptionPane.showMessageDialog(rootPane, "Added successfully!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "To update, please select Edit button!", "Fail to add", JOptionPane.WARNING_MESSAGE);
                ClearText();
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (cboxCentre.getModel().getSelectedItem().toString().equals("notset") || txtSuppAmount.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please ensure all information are entered.", "Incomplete details", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                id = txtSID.getText();
                centre = Centre.valueOf((cboxCentre.getSelectedItem().toString()));
                supply = Integer.parseInt(txtSuppAmount.getText());

                Vaccines current = null;
                boolean found = false;

                for (int i = 0; i < allVaccines.size(); i++) {
                    Vaccines b = allVaccines.get(i);
                    if (id.equals(b.getSupplyID())) {
                        found = true;
                        current = b;
                        break;
                    }
                }
                if (found) {

                    for (int i = 0; i < allCentreVaccines.size(); i++) {
                        if (allCentreVaccines.get(i).getCentre().toString().equals(centre.toString())) {
                            int total = allCentreVaccines.get(i).getVacamount() + supply - current.getSupplyamount();
                            allCentreVaccines.get(i).setVacamount(total);

                        }
                    }
                    current.setPlace(centre);
                    current.setSupplyamount(supply);

                    Committee.modifyVacSupply();
                    setLabelText();
                    ClearText();
                    DisplayTable();

                    JOptionPane.showMessageDialog(rootPane, "Edited successfully!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Username not found!", "Fail to edit", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Fail to access!", "Error", JOptionPane.WARNING_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int result;
        result = JOptionPane.showConfirmDialog(null, "Are you sure to delete this information?", "Delete Information", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            try {
                id = txtSID.getText();
                centre = Centre.valueOf((cboxCentre.getSelectedItem().toString()));
                supply = Integer.parseInt(txtSuppAmount.getText());

                Vaccines current = null;
                boolean found = false;
                SystemDataIO.read();

                for (int i = 0; i < allVaccines.size(); i++) {
                    Vaccines a = allVaccines.get(i);
                    if (id.equals(a.getSupplyID())) {
                        found = true;
                        current = a;
                        allVaccines.remove(a);
                        break;
                    }
                }

                if (found) {
                    Committee.modifyAppointment();

                    ClearText();
                    DisplayTable();

                    JOptionPane.showMessageDialog(rootPane, "Deleted successfully!");

                } else {
                    JOptionPane.showMessageDialog(rootPane, "User not exist!", "Fail to delete", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Fail to access!", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void lblAPAPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblAPAPropertyChange

    }//GEN-LAST:event_lblAPAPropertyChange

    private void tblVacSupplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVacSupplyMouseClicked

        int i;
        i = tblVacSupply.getSelectedRow();
        txtSID.setText(dtm.getValueAt(i, 0).toString());
        cboxCentre.getModel().setSelectedItem(dtm.getValueAt(i, 1).toString());
        txtSuppAmount.setText(dtm.getValueAt(i, 2).toString());
    }//GEN-LAST:event_tblVacSupplyMouseClicked

    private void cboxCentreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCentreActionPerformed

    }//GEN-LAST:event_cboxCentreActionPerformed

    private void txtSuppAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSuppAmountKeyReleased
        try {
            int value = Integer.parseInt(txtSuppAmount.getText());

            if (value < 0) {

                txtSuppAmount.setText("1");
                return;
            }
        } catch (Exception e) {
            txtSuppAmount.setText("1");
        }
    }//GEN-LAST:event_txtSuppAmountKeyReleased

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        Search();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
        ClearText();
        DisplayTable();
    }//GEN-LAST:event_btnReset1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommitteeVaccines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel CAPA;
    public static javax.swing.JLabel CAPE;
    public static javax.swing.JLabel CAPI;
    public static javax.swing.JLabel CAPO;
    public static javax.swing.JLabel CAPU;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReset1;
    private javax.swing.JComboBox<Centre> cboxCentre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblAPA;
    public static javax.swing.JLabel lblAPE;
    public static javax.swing.JLabel lblAPI;
    public static javax.swing.JLabel lblAPO;
    public static javax.swing.JLabel lblAPU;
    private javax.swing.JTable tblVacSupply;
    private javax.swing.JTextField txtSID;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSuppAmount;
    // End of variables declaration//GEN-END:variables

    public void setLabelText() {
        for (int i = 0; i < allCentreVaccines.size(); i++) {
            int vacAmount = allCentreVaccines.get(i).getVacamount();
            String va = vacAmount + "";
            String l = allCentreVaccines.get(i).getCentre().toString();

            String condition = (vacAmount <= 10 ? "Urgent" : vacAmount <= 20 ? "Moderate" : "Sufficient");
            if (l.equals("APA")) {
                lblAPA.setText(va);
                CAPA.setText(condition);
            } else if (l.equals("APE")) {
                lblAPE.setText(va);
                CAPE.setText(condition);
            } else if (l.equals("API")) {
                lblAPI.setText(va);
                CAPI.setText(condition);
            } else if (l.equals("APO")) {
                lblAPO.setText(va);
                CAPO.setText(condition);
            } else if (l.equals("APU")) {
                lblAPU.setText(va);
                CAPU.setText(condition);
            }
        }
    }

    public void DisplayTable(JTable ctable) {
        dtm.setRowCount(0);
        try {
            File file = new File("Vaccines.txt");
            Scanner sc;
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line;
                line = sc.nextLine();
                if (!(line.isEmpty())) {
                    String[] wordsinLine;
                    wordsinLine = line.split(";");
                    dtm.addRow(wordsinLine);
                }
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "File not found.", "Error", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void DisplayTable() {
        DisplayTable(tblVacSupply);

    }

    public void Search() {
        String searchAppointment;
        searchAppointment = txtSearch.getText();
        dtm.setRowCount(0);

        try {
            File file;
            file = new File("Vaccines.txt");
            Scanner sc;
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String Line;
                Line = sc.nextLine();
                if (Line.contains(searchAppointment)) {
                    String[] wordsinLine;
                    wordsinLine = Line.split(";");
                    dtm.addRow(wordsinLine);
                }
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Please ensure all procedures are in correct manner.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void ClearText() {
        cboxCentre.getModel().setSelectedItem("notset");
        txtSuppAmount.setText("1");
        Vaccines v = new Vaccines();
        txtSID.setText(v.AutoNumber());
    }

    private void loadCentre() {
        cboxCentre.setModel(new DefaultComboBoxModel<>(Centre.values()));
    }

}
