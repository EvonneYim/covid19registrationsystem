package System;

import SystemClass.Appointment;
import SystemClass.Centre;
import SystemClass.Citizen;
import SystemClass.Committee;
import SystemClass.NonCitizen;
import SystemClass.People;
import SystemClass.SystemDataIO;
import static SystemClass.SystemDataIO.allAppointments;
import static SystemClass.SystemDataIO.allPeople;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CommitteePeople extends javax.swing.JFrame implements DisplayTableandSearch{

    private static ArrayList<People> p = new ArrayList<People>();
    DefaultTableModel dtm;
    String columnname[] = new String[]{"ID", "Name", "Address", "Age", "Gender", "Mobile No.", "Password", "Nationality"};
    String pplID, name, address, gender, mobile, password, nationality;
    int age;

    public CommitteePeople() {
        initComponents();
        setLocationRelativeTo(null);

        rbtnMale.setActionCommand("Male");
        rbtnFemale.setActionCommand("Female");
        rbtnCitizen.setActionCommand("Citizen");
        rbtnNCitizen.setActionCommand("Non-Citizen");

        dtm = new DefaultTableModel(columnname, 0);
        tblPeople.setModel(dtm);
        SystemDataIO.read();
        DisplayTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GENDER = new javax.swing.ButtonGroup();
        NATIONALITY = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeople = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtICPassport = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        rbtnMale = new javax.swing.JRadioButton();
        rbtnFemale = new javax.swing.JRadioButton();
        rbtnCitizen = new javax.swing.JRadioButton();
        rbtnNCitizen = new javax.swing.JRadioButton();
        btnPlaceApp = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("People Management");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        tblPeople.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address", "Age", "Gender", "Mobile No.", "Password", "Nationality"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeopleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPeople);
        if (tblPeople.getColumnModel().getColumnCount() > 0) {
            tblPeople.getColumnModel().getColumn(1).setMinWidth(150);
            tblPeople.getColumnModel().getColumn(2).setMinWidth(200);
            tblPeople.getColumnModel().getColumn(3).setMinWidth(30);
            tblPeople.getColumnModel().getColumn(4).setMinWidth(80);
            tblPeople.getColumnModel().getColumn(5).setMinWidth(120);
            tblPeople.getColumnModel().getColumn(6).setMinWidth(120);
            tblPeople.getColumnModel().getColumn(7).setMinWidth(120);
        }

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Search ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 153, 153), new java.awt.Color(153, 255, 255)));

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

        btnAdd.setBackground(new java.awt.Color(204, 204, 255));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(51, 51, 51));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(153, 204, 255));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(51, 51, 51));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 153, 255));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 51, 51));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
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
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("IC/ Passport");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Full Name");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Address");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Age");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Gender");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Mobile No.");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Password");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Nationality");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtICPassport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtAge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        txtMobile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMobileKeyTyped(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rbtnMale.setBackground(new java.awt.Color(153, 153, 153));
        GENDER.add(rbtnMale);
        rbtnMale.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbtnMale.setForeground(new java.awt.Color(102, 102, 102));
        rbtnMale.setText("Male");
        rbtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMaleActionPerformed(evt);
            }
        });

        rbtnFemale.setBackground(new java.awt.Color(153, 153, 153));
        GENDER.add(rbtnFemale);
        rbtnFemale.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbtnFemale.setForeground(new java.awt.Color(102, 102, 102));
        rbtnFemale.setText("Female");
        rbtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFemaleActionPerformed(evt);
            }
        });

        rbtnCitizen.setBackground(new java.awt.Color(153, 153, 153));
        NATIONALITY.add(rbtnCitizen);
        rbtnCitizen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbtnCitizen.setForeground(new java.awt.Color(102, 102, 102));
        rbtnCitizen.setText("Citizen");
        rbtnCitizen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnCitizenMouseClicked(evt);
            }
        });
        rbtnCitizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCitizenActionPerformed(evt);
            }
        });

        rbtnNCitizen.setBackground(new java.awt.Color(153, 153, 153));
        NATIONALITY.add(rbtnNCitizen);
        rbtnNCitizen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbtnNCitizen.setForeground(new java.awt.Color(102, 102, 102));
        rbtnNCitizen.setText("Non-Citizen");
        rbtnNCitizen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnNCitizenMouseClicked(evt);
            }
        });
        rbtnNCitizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNCitizenActionPerformed(evt);
            }
        });

        btnPlaceApp.setBackground(new java.awt.Color(102, 102, 102));
        btnPlaceApp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPlaceApp.setForeground(new java.awt.Color(204, 204, 204));
        btnPlaceApp.setText("Place Appointment");
        btnPlaceApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceAppActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 102, 102));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReset)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtICPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rbtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rbtnCitizen, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rbtnNCitizen))
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnPlaceApp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtICPassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnMale)
                    .addComponent(rbtnFemale)
                    .addComponent(rbtnCitizen)
                    .addComponent(rbtnNCitizen)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addComponent(btnPlaceApp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        if (txtICPassport.getText().isEmpty() || txtName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtAge.getText().isEmpty()
                || GENDER.getSelection().getActionCommand().isEmpty() || txtMobile.getText().isEmpty()
                || txtPassword.getText().isEmpty() || NATIONALITY.getSelection().getActionCommand().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please ensure all information are entered.", "Incomplete details", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                pplID = txtICPassport.getText();
                name = txtName.getText();
                address = txtAddress.getText();
                age = Integer.parseInt(txtAge.getText());
                gender = GENDER.getSelection().getActionCommand();
                mobile = txtMobile.getText();
                password = txtPassword.getText();
                nationality = NATIONALITY.getSelection().getActionCommand();
                People found = SystemDataIO.checkingPeople(pplID);
                if (found != null) {
                    JOptionPane.showMessageDialog(rootPane, "This People account has been registered!");

                } else {

                    People p = new People(pplID, name, address, age, gender, mobile, password, nationality);
                    
                    allPeople.add(p);
                   
                    Committee.PmodifyDetails();
                    ClearText();
                    DisplayTable();

                    JOptionPane.showMessageDialog(rootPane, "Added successfully!");
                    
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Fail to access!", "Error", JOptionPane.WARNING_MESSAGE);

            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        if (txtICPassport.getText().isEmpty() || txtName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtAge.getText().isEmpty()
                || GENDER.getSelection().getActionCommand().isEmpty() || txtMobile.getText().isEmpty()
                || txtPassword.getText().isEmpty() || NATIONALITY.getSelection().getActionCommand().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please ensure all information are entered.", "Incomplete details", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                pplID = txtICPassport.getText();
                name = txtName.getText();
                address = txtAddress.getText();
                age = Integer.parseInt(txtAge.getText());
                gender = GENDER.getSelection().getActionCommand();
                mobile = txtMobile.getText();
                password = txtPassword.getText();
                nationality = NATIONALITY.getSelection().getActionCommand();
                People current = null;
                boolean found = false;
                
                for (int i = 0; i < allPeople.size(); i++) {
                    People a = allPeople.get(i);
                    if (pplID.equals(a.getPeopleID())) {
                        found = true;
                        current = a;

                        break;
                    }
                }
                if (found) {
                    current.setPeopleID(pplID);
                    current.setPeopleName(name);
                    current.setAddress(address);
                    current.setAge(age);
                    current.setGender(gender);
                    current.setMobileNo(mobile);
                    current.setPassword(password);
                    current.setNationality(nationality);
                    Committee.PmodifyDetails();

                    ClearText();
                    DisplayTable();

                    JOptionPane.showMessageDialog(rootPane, "Edited successfully!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "People account not found! To renew the IC/ Passport, please add" + "\n"
                            + "the new information again and remove the old record for security.",
                            "Fail to edit", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Fail to access!", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        if (txtICPassport.getText().isEmpty() || txtName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtAge.getText().isEmpty()
                || GENDER.getSelection().getActionCommand().isEmpty() || txtMobile.getText().isEmpty()
                || txtPassword.getText().isEmpty() || NATIONALITY.getSelection().getActionCommand().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please ensure all information are entered.", "Incomplete details", JOptionPane.WARNING_MESSAGE);
        } else {
            int result;
            result = JOptionPane.showConfirmDialog(null, "Are you sure to delete this information?", "Delete Information", JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                try {
                    pplID = txtICPassport.getText();
                    name = txtName.getText();
                    address = txtAddress.getText();
                    age = Integer.parseInt(txtAge.getText());
                    gender = GENDER.getSelection().getActionCommand();
                    mobile = txtMobile.getText();
                    password = txtPassword.getText();
                    nationality = NATIONALITY.getSelection().getActionCommand();
                    People current = null;
                    boolean found = false;

                    for (int i = 0; i < allPeople.size(); i++) {
                        People a = allPeople.get(i);
                        if (pplID.equals(a.getPeopleID())) {
                            found = true;
                            current = a;
                            allPeople.remove(a);
                            break;
                        }
                    }

                    if (found) {
                        Committee.PmodifyDetails();
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
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void rbtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMaleActionPerformed

    }//GEN-LAST:event_rbtnMaleActionPerformed

    private void rbtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFemaleActionPerformed

    }//GEN-LAST:event_rbtnFemaleActionPerformed

    private void rbtnCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCitizenActionPerformed

    }//GEN-LAST:event_rbtnCitizenActionPerformed

    private void rbtnNCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNCitizenActionPerformed

    }//GEN-LAST:event_rbtnNCitizenActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed

    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        Search();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            ClearText();
            DisplayTable();
            System.out.println("Double Clicked");
        }

    }//GEN-LAST:event_formMouseClicked

    private void tblPeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeopleMouseClicked
        int i;
        i = tblPeople.getSelectedRow();
        txtICPassport.setText(dtm.getValueAt(i, 0).toString());
        txtName.setText(dtm.getValueAt(i, 1).toString());
        txtAddress.setText(dtm.getValueAt(i, 2).toString());
        txtAge.setText(dtm.getValueAt(i, 3).toString());
        gender = dtm.getValueAt(i, 4).toString();

        if (gender.equals("Male")) {
            rbtnMale.setSelected(true);

        } else {
            rbtnFemale.setSelected(true);
        }

        txtMobile.setText(dtm.getValueAt(i, 5).toString());
        txtPassword.setText(dtm.getValueAt(i, 6).toString());
        nationality = dtm.getValueAt(i, 7).toString();

        if (nationality.equals("Citizen")) {
            rbtnCitizen.setSelected(true);

        } else {
            rbtnNCitizen.setSelected(true);
        }

    }//GEN-LAST:event_tblPeopleMouseClicked

    private void txtMobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if (txtMobile.getText().length() >= 11) {
            JOptionPane.showMessageDialog(rootPane, "Please input less than 12 digits!", "Invalid phone number format", JOptionPane.WARNING_MESSAGE);
            txtMobile.setText("");
        }
    }//GEN-LAST:event_txtMobileKeyTyped

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if (txtAge.getText().length() >= 2) {
            JOptionPane.showMessageDialog(rootPane, "Please input less than 3 digits!", "Invalid age", JOptionPane.WARNING_MESSAGE);
            txtAge.setText("");
        }
    }//GEN-LAST:event_txtAgeKeyTyped

    private void rbtnCitizenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnCitizenMouseClicked

        pplID = txtICPassport.getText();
        password = txtPassword.getText();

        if (rbtnCitizen.isSelected()) {
            if (pplID.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please enter your IC and Password!", "Could not verify identification", JOptionPane.ERROR_MESSAGE);
                NATIONALITY.clearSelection();
            } else {
                Citizen c = new Citizen(pplID, name, address, age, gender, mobile, password, nationality);
                c.setIcNumber(pplID);
                c.setPassword(password);
                
                JOptionPane.showMessageDialog(rootPane, "The IC entered will be your future login access:"
                        + "\n" + "Username: " + c.getIcNumber() + "\n" + "Passport: " + c.getPassword(), "IC as People Account ID", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_rbtnCitizenMouseClicked

    private void rbtnNCitizenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnNCitizenMouseClicked
        pplID = txtICPassport.getText();
        password = txtPassword.getText();

        if (rbtnNCitizen.isSelected()) {
            if (pplID.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please enter your Passport and Password!", "Could not verify identification", JOptionPane.ERROR_MESSAGE);
                NATIONALITY.clearSelection();
            } else {
                NonCitizen nc = new NonCitizen(pplID, name, address, age, gender, mobile, password, nationality);
                nc.setPassportNumber(pplID);
                nc.setPassword(password);
                
                JOptionPane.showMessageDialog(rootPane, "The Passport entered will be your future login access:"
                        + "\n" + "Username: " + nc.getPassportNumber() + "\n" + "Passport: " + nc.getPassword(), "Passport as People Account ID", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_rbtnNCitizenMouseClicked

    private void btnPlaceAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceAppActionPerformed
        if (txtICPassport.getText().isEmpty() || txtName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtAge.getText().isEmpty()
                || GENDER.getSelection().getActionCommand().isEmpty() || txtMobile.getText().isEmpty()
                || txtPassword.getText().isEmpty() || NATIONALITY.getSelection().getActionCommand().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please ensure all information are entered.", "Incomplete details", JOptionPane.WARNING_MESSAGE);
        } else {
            int result;
            result = JOptionPane.showConfirmDialog(null, "Are you sure to place appointment for this account?", "Place appointmnet", JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                try {
                    pplID = txtICPassport.getText();
                    name = txtName.getText();
                    address = txtAddress.getText();
                    age = Integer.parseInt(txtAge.getText());
                    gender = GENDER.getSelection().getActionCommand();
                    mobile = txtMobile.getText();
                    password = txtPassword.getText();
                    nationality = NATIONALITY.getSelection().getActionCommand();

                    People found = SystemDataIO.checkingPeople(pplID);
                    People current = null;
                    if (found != null) {
                        CommitteeAppointment ca = new CommitteeAppointment();
                        current = found;

                        for (int i = 0; i < allAppointments.size(); i++) {
                            if (allAppointments.get(i).getPpl().getPeopleID().equals(current.getPeopleID())) {
                                JOptionPane.showMessageDialog(rootPane, "This people had submitted the appointment request!", "Existing submission", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                        }

                        Appointment a = new Appointment();          //to call Auto Number method

                        ca.txtICPassport.setText(pplID);
                        ca.txtName.setText(name);
                        ca.lblAppID.setText(a.AutoNumber());        //Auto Number from Appointment class

                        Calendar c = Calendar.getInstance();
                        c.add(Calendar.DATE, 7);
                        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");

                        String datestr = sdf.format(c.getTime());
                        Date defaultdate = sdf.parse(datestr);

                        ca.jdAppDate.setDate(defaultdate);

                        ca.cboAppTime.getModel().setSelectedItem("-");

                        ca.cboCentre.getModel().setSelectedItem(Centre.notset);
                        ca.spinDose.setValue(1);
                        ca.rbtnPending.setSelected(true);
                        ca.rbtnIncomplete.setSelected(true);

                        String AID = ca.txtICPassport.getText();
                        String AName = ca.txtName.getText();

                        String AppTime = ca.cboAppTime.getSelectedItem().toString();
                        int Adose = (Integer) ca.spinDose.getValue();
                        Centre Acentre = (Centre) ca.cboCentre.getModel().getSelectedItem();

                        String defaultAppStatus = "Pending";
                        String defaultVacStatus = "Incomplete";

                        a = new Appointment(current, datestr, AppTime, Adose, Acentre, defaultAppStatus, defaultVacStatus);
                        allAppointments.add(a);

                        Committee.modifyAppointment();
                        
                        this.setVisible(false);
                        ca.setVisible(true);

                        ca.DisplayTable();

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Please update this People account to proceed!", "Fail to place appointments", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Fail to access!", "Error", JOptionPane.WARNING_MESSAGE);
//                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btnPlaceAppActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        ClearText();
        DisplayTable();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char c = evt.getKeyChar();

        if (Character.isAlphabetic(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            txtName.setEditable(true);
        } else {
            txtName.setEditable(false);
        }
    }//GEN-LAST:event_txtNameKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommitteePeople().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GENDER;
    private javax.swing.ButtonGroup NATIONALITY;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPlaceApp;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnCitizen;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JRadioButton rbtnNCitizen;
    private javax.swing.JTable tblPeople;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtICPassport;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public void DisplayTable(JTable ctable) {
        dtm.setRowCount(0);
        try {
            File file = new File("People.txt");
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
        DisplayTable(tblPeople);

    }

    public void Search() {
        String searchCommitee;
        searchCommitee = txtSearch.getText();
        dtm.setRowCount(0);

        try {
            File file;
            file = new File("People.txt");
            Scanner sc;
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String Line;
                Line = sc.nextLine();
                if (Line.contains(searchCommitee)) {
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

    public void ClearText() {
        txtICPassport.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtAge.setText("");
        GENDER.clearSelection();
        txtMobile.setText("");
        txtPassword.setText("");
        txtSearch.setText("");
        NATIONALITY.clearSelection();

    }

}
