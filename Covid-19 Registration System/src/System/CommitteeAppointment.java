package System;

import SystemClass.Appointment;
import SystemClass.Centre;
import SystemClass.Committee;
import SystemClass.People;
import SystemClass.SystemDataIO;
import static SystemClass.SystemDataIO.allAppointments;
import static SystemClass.SystemDataIO.allCentreVaccines;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CommitteeAppointment extends javax.swing.JFrame implements DisplayTableandSearch{

    DefaultTableModel dtm;
    String columnname[] = new String[]{"ID", "Name", "App_ID", "App_Date", "App_Time", "Dose", "Centre", "App_Status", "Vac_Status"};
    String pplID, name, appID, appTime, appStatus, vacStatus;
    Centre centre;
    int dose;
    Date appDate;

    public CommitteeAppointment() {
        initComponents();
        setLocationRelativeTo(null);
        rbtnAcc.setActionCommand("Accepted");
        rbtnRej.setActionCommand("Rejected");
        rbtnPending.setActionCommand("Pending");
        rbtnComplete.setActionCommand("Completed");
        rbtnIncomplete.setActionCommand("Incomplete");

        dtm = new DefaultTableModel(columnname, 0);
        tblAppointment.setModel(dtm);
        SystemDataIO.read();
        DisplayTable();
        loadCenter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        APP_STATUS = new javax.swing.ButtonGroup();
        VAC_STATUS = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAppointment = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtICPassport = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblAppID = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        spinDose = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        cboCentre = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rbtnRej = new javax.swing.JRadioButton();
        rbtnAcc = new javax.swing.JRadioButton();
        rbtnIncomplete = new javax.swing.JRadioButton();
        rbtnComplete = new javax.swing.JRadioButton();
        cboAppTime = new javax.swing.JComboBox<>();
        rbtnPending = new javax.swing.JRadioButton();
        jdAppDate = new com.toedter.calendar.JDateChooser();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Appointment Management");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Search ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        tblAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Appointment ID", "Appointment Date", "Appointment Time", "Dose", "Centre", "Appointment Status", "Vaccination Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAppointmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAppointment);
        if (tblAppointment.getColumnModel().getColumnCount() > 0) {
            tblAppointment.getColumnModel().getColumn(1).setMinWidth(150);
            tblAppointment.getColumnModel().getColumn(5).setMaxWidth(50);
            tblAppointment.getColumnModel().getColumn(6).setMaxWidth(70);
        }

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("IC/ Passport");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Full Name");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtName.setEnabled(false);

        txtICPassport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtICPassport.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("App_ID");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblAppID.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblAppID.setForeground(new java.awt.Color(255, 0, 0));
        lblAppID.setText("not set");
        lblAppID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("App_Date");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("App_Time");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(204, 51, 255));
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

        btnSave.setBackground(new java.awt.Color(255, 102, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(51, 51, 51));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 153, 255));
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
                .addGap(286, 286, 286)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Dose");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        spinDose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        spinDose.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Centre");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Appointment Status");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Vaccination Status");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        rbtnRej.setBackground(new java.awt.Color(153, 153, 153));
        APP_STATUS.add(rbtnRej);
        rbtnRej.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbtnRej.setText("Rejected");
        rbtnRej.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRejActionPerformed(evt);
            }
        });

        rbtnAcc.setBackground(new java.awt.Color(153, 153, 153));
        APP_STATUS.add(rbtnAcc);
        rbtnAcc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbtnAcc.setText("Accepted");
        rbtnAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAccActionPerformed(evt);
            }
        });

        rbtnIncomplete.setBackground(new java.awt.Color(153, 153, 153));
        VAC_STATUS.add(rbtnIncomplete);
        rbtnIncomplete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbtnIncomplete.setText("Incomplete");
        rbtnIncomplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnIncompleteActionPerformed(evt);
            }
        });

        rbtnComplete.setBackground(new java.awt.Color(153, 153, 153));
        VAC_STATUS.add(rbtnComplete);
        rbtnComplete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbtnComplete.setText("Completed");
        rbtnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCompleteActionPerformed(evt);
            }
        });

        cboAppTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "9.00am", "9.20am", "9.40am", "10.00am", "10.20am", "10.40am", "11.00am", "11.20am", "11.40am", "12.00pm", "12.20pm", "12.40pm", "1.00pm", "1.20pm", "1.40pm", "2.00pm", "2.20pm", "2.40pm", "3.00pm", "3.20pm", "3.40pm", "4.00pm", "4.20pm", "4.40pm", "5.00pm" }));

        rbtnPending.setBackground(new java.awt.Color(153, 153, 153));
        APP_STATUS.add(rbtnPending);
        rbtnPending.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbtnPending.setText("Pending");
        rbtnPending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPendingActionPerformed(evt);
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtICPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAppID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdAppDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboAppTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinDose, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(rbtnAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnRej, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnPending, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnIncomplete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(18, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtICPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAppID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdAppDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spinDose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboAppTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnAcc)
                            .addComponent(rbtnRej)
                            .addComponent(rbtnPending))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnIncomplete)
                            .addComponent(rbtnComplete))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnReset)
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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (txtICPassport.getText().isEmpty() || txtName.getText().isEmpty() || lblAppID.getText().isEmpty() || cboAppTime.getModel().getSelectedItem().equals("-")
                || cboCentre.getModel().getSelectedItem().toString().equals("notset") || APP_STATUS.getSelection().getActionCommand().isEmpty()
                || VAC_STATUS.getSelection().getActionCommand().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please ensure all information are entered and valid.", "Incomplete details", JOptionPane.WARNING_MESSAGE);
        } else {
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, 6);
            Date defaultdate = c.getTime();

            if (jdAppDate.getDate().before(defaultdate)) {
                JOptionPane.showMessageDialog(rootPane, "Please set the appointment after 1 week!", "Invalid appointment date", JOptionPane.WARNING_MESSAGE);
                return;         //means the function had completed, no need to run forward
            }

            int count = 0;
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
            String datestr = sdf.format(jdAppDate.getDate());

            for (int i = 0; i < allAppointments.size(); i++) {

                if (allAppointments.get(i).getAppointmentDate().equals(datestr)
                        && allAppointments.get(i).getAppointmentTime().equals(cboAppTime.getSelectedItem())
                        && allAppointments.get(i).getPlace().equals(cboCentre.getSelectedItem())) {
                    count++;
                }
            }

            if (count >= 5) {
                JOptionPane.showMessageDialog(rootPane, "This slot is fully booked! Please select another date, time or centre!", "Placement is fully booked!", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (rbtnPending.isSelected()) {
                JOptionPane.showMessageDialog(rootPane, "Please update the appointment status to Accepted before proceed", "Invalid appointment status", JOptionPane.WARNING_MESSAGE);
                return;
            } else {

                try {
                    pplID = txtICPassport.getText();
                    name = txtName.getText();
                    appID = lblAppID.getText();
                    appDate = jdAppDate.getDate();
                    appTime = cboAppTime.getSelectedItem().toString();
                    dose = Integer.parseInt(spinDose.getValue().toString());
                    centre = Centre.valueOf((cboCentre.getSelectedItem().toString()));
                    appStatus = APP_STATUS.getSelection().getActionCommand();
                    vacStatus = VAC_STATUS.getSelection().getActionCommand();

                    Appointment current = null;
                    boolean found = false;

                    for (int i = 0; i < allAppointments.size(); i++) {
                        Appointment a = allAppointments.get(i);

                        if (appID.equals(a.getAppointmentID())) {
                            found = true;
                            current = a;
                            break;
                        }
                    }
                    if (found) {

                        if (current.getVaccinationStatus().equals("Incomplete") && vacStatus.equals("Completed") && appStatus.equals("Accepted")) {        //from Incomplete status to Completed, 1 bottle of vaccines will be deducted
                            for (int i = 0; i < allCentreVaccines.size(); i++) {
                                if (allCentreVaccines.get(i).getCentre().toString().equals(centre.toString())) {
                                    allCentreVaccines.get(i).setVacamount(allCentreVaccines.get(i).getVacamount() - 1);
                                    break;
                                }
                            }
                        }

                        current.setAppointmentDate(datestr);
                        current.setAppointmentTime(appTime);
                        current.setDose(dose);
                        current.setPlace(centre);
                        current.setVaccinationStatus(vacStatus);
                        current.setAppointmentStatus(appStatus);

                        
                        
                        Calendar cd = Calendar.getInstance();
                        boolean isFound = false;
                        for (int i = 0; i < allAppointments.size(); i++) {
                            if (allAppointments.get(i).getPpl().getPeopleID().equals(pplID)
                                    && !allAppointments.get(i).getAppointmentID().equals(appID)) {
                                cd.setTime(sdf.parse(allAppointments.get(i).getAppointmentDate()));
                                isFound = true;
                            }
                        }
                        //sout tab = system.out.println

                        cd.add(Calendar.DATE, 6);
                        Date defaultdate1 = cd.getTime();

                        if (appDate.before(defaultdate1) && isFound) {
                            JOptionPane.showMessageDialog(rootPane, "Second appointment can only be placed after 1 week!", "Invalid appointment date", JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        if (current.getDose() == 1 && vacStatus.equals("Completed") && appStatus.equals("Accepted")) {

                            cd.setTime(appDate);
                            cd.add(Calendar.DATE, 6);
                            String datestr1 = sdf.format(cd.getTime());
                            String apptime = "-", appstatus = "Pending", vacstatus = "Incomplete";
                            int dose = 2;

                            People ppl = new People(pplID, name);           //Polymorphism in People
                            Appointment b = new Appointment();              //Polymorphism in Appointment
                            Appointment a = new Appointment(ppl, datestr1, apptime, dose, Centre.notset, appstatus, vacstatus, b.AutoNumber());

                            allAppointments.add(a);
                        }

                        Committee.modifyAppointment();
                        ClearText();
                        DisplayTable();
                        JOptionPane.showMessageDialog(rootPane, "Updated successfully!");

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "People account not found! To renew the IC/ Passport, please add" + "\n"
                                + "the new information again and remove the old record for security.",
                                "Fail to edit", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Fail to access!", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int result;
        result = JOptionPane.showConfirmDialog(null, "Are you sure to delete this information?", "Delete Information", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            try {
                appID = lblAppID.getText();

                Appointment current = null;
                boolean found = false;

                for (int i = 0; i < allAppointments.size(); i++) {
                    Appointment a = allAppointments.get(i);
                    if (appID.equals(a.getAppointmentID())) {
                        found = true;
                        current = a;
                        allAppointments.remove(a);
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

    private void rbtnRejActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRejActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnRejActionPerformed

    private void rbtnAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAccActionPerformed

    }//GEN-LAST:event_rbtnAccActionPerformed

    private void rbtnIncompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnIncompleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnIncompleteActionPerformed

    private void rbtnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCompleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCompleteActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        Search();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void rbtnPendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPendingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnPendingActionPerformed

    private void tblAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAppointmentMouseClicked
        int i;
        Date date;

        try {
            i = tblAppointment.getSelectedRow();
            txtICPassport.setText(dtm.getValueAt(i, 0).toString());
            txtName.setText(dtm.getValueAt(i, 1).toString());
            lblAppID.setText(dtm.getValueAt(i, 2).toString());

            date = new SimpleDateFormat("dd MMM yyyy").parse((String) dtm.getValueAt(i, 3));
            jdAppDate.setDate(date);

            cboAppTime.getModel().setSelectedItem(dtm.getValueAt(i, 4).toString());
            spinDose.setValue(Integer.parseInt(dtm.getValueAt(i, 5).toString()));
            cboCentre.getModel().setSelectedItem(dtm.getValueAt(i, 6).toString());

            appStatus = dtm.getValueAt(i, 7).toString();

            if (appStatus.equals("Accepted")) {
                rbtnAcc.setSelected(true);

            } else if (appStatus.equals("Rejected")) {
                rbtnRej.setSelected(true);

            } else {
                rbtnPending.setSelected(true);
            }

            vacStatus = dtm.getValueAt(i, 8).toString();

            if (vacStatus.equals("Incomplete")) {
                rbtnIncomplete.setSelected(true);

            } else {
                rbtnComplete.setSelected(true);

            }
        } catch (Exception ex) {
            Logger.getLogger(CommitteeAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_tblAppointmentMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        ClearText();
        DisplayTable();
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CommitteeAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommitteeAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommitteeAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommitteeAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommitteeAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup APP_STATUS;
    private javax.swing.ButtonGroup VAC_STATUS;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    protected static javax.swing.JComboBox<String> cboAppTime;
    protected static javax.swing.JComboBox<Centre> cboCentre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    protected static com.toedter.calendar.JDateChooser jdAppDate;
    protected static javax.swing.JLabel lblAppID;
    private javax.swing.JRadioButton rbtnAcc;
    private javax.swing.JRadioButton rbtnComplete;
    protected static javax.swing.JRadioButton rbtnIncomplete;
    protected static javax.swing.JRadioButton rbtnPending;
    private javax.swing.JRadioButton rbtnRej;
    protected static javax.swing.JSpinner spinDose;
    private javax.swing.JTable tblAppointment;
    protected static javax.swing.JTextField txtICPassport;
    public static javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public void DisplayTable(JTable ctable) {
        dtm.setRowCount(0);
        try {
            File file = new File("Appointment.txt");
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
        DisplayTable(tblAppointment);

    }

    public void Search() {
        String searchAppointment;
        searchAppointment = txtSearch.getText();
        dtm.setRowCount(0);

        try {
            File file;
            file = new File("Appointment.txt");
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

    public void ClearText() {
        jdAppDate.setCalendar(null);
        cboAppTime.getModel().setSelectedItem("-");
        cboCentre.getModel().setSelectedItem("notset");
        spinDose.setValue(0);
        txtICPassport.setText("");
        txtName.setText("");
        lblAppID.setText("unset");
        VAC_STATUS.clearSelection();
        APP_STATUS.clearSelection();
    }

    private void loadCenter() {
        cboCentre.setModel(new DefaultComboBoxModel<>(Centre.values()));
    }

}
