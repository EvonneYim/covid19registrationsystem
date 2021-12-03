/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import SystemClass.Appointment;
import SystemClass.Centre;
import SystemClass.People;
import SystemClass.SystemDataIO;
import static SystemClass.SystemDataIO.allAppointments;
import static SystemClass.SystemDataIO.allPeople;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PeopleMainPage extends javax.swing.JFrame {

    String pplID, name, address, gender, mobile, password, nationality;
    int age;

    /**
     * Creates new form COVID
     */
    public PeopleMainPage() {
        initComponents();
    }

    public void ClearProfile() {
        txtid.setText("");
        txtname.setText("");
        txtaddress.setText("");
        txtage.setText("");
        txtmobileno.setText("");
        txtpassword.setText("");
        btnedit.setEnabled(true);
        btnsave.setEnabled(false);
        btncanceledit.setEnabled(false);
    }

    public void Clear1stDose() {
        txtaid.setText("");
        txtdate.setText("");
        txtdate.setText("");
        txttime.setText("");
        txtcentre.setText("");
        txtdose.setText("");
        txtstatus.setText("");
        txtvacstatus.setText("");
        btnregister.setEnabled(true);
        btncancelappointment.setEnabled(false);
    }

    public void Clear2ndDose() {
        txtaid2.setText("");
        txtdate2.setText("");
        txtdate2.setText("");
        txttime2.setText("");
        txtcentre2.setText("");
        txtdose2.setText("");
        txtstatus2.setText("");
        txtvacstatus2.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gender = new javax.swing.ButtonGroup();
        Nationality = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblid = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        lblmoblieno = new javax.swing.JLabel();
        lblnationality = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtmobileno = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btncanceledit = new javax.swing.JButton();
        lblpassword = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        rbtnmale = new javax.swing.JRadioButton();
        rbtnfemale = new javax.swing.JRadioButton();
        rbtncitizen = new javax.swing.JRadioButton();
        rbtnnoncitizen = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lbltime = new javax.swing.JLabel();
        txtdose = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        lblstatus = new javax.swing.JLabel();
        lblcentre = new javax.swing.JLabel();
        txtstatus = new javax.swing.JTextField();
        txttime = new javax.swing.JTextField();
        lblvacstatus = new javax.swing.JLabel();
        txtcentre = new javax.swing.JTextField();
        txtvacstatus = new javax.swing.JTextField();
        lbldate = new javax.swing.JLabel();
        btnregister = new javax.swing.JButton();
        lbldose = new javax.swing.JLabel();
        lblaid = new javax.swing.JLabel();
        txtaid = new javax.swing.JTextField();
        btncancelappointment = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbltime1 = new javax.swing.JLabel();
        txtdose2 = new javax.swing.JTextField();
        txtdate2 = new javax.swing.JTextField();
        lblstatus1 = new javax.swing.JLabel();
        lblcentre1 = new javax.swing.JLabel();
        txtstatus2 = new javax.swing.JTextField();
        txttime2 = new javax.swing.JTextField();
        lblvacstatus1 = new javax.swing.JLabel();
        txtcentre2 = new javax.swing.JTextField();
        txtvacstatus2 = new javax.swing.JTextField();
        lbldate1 = new javax.swing.JLabel();
        btnregister2 = new javax.swing.JButton();
        lbldose1 = new javax.swing.JLabel();
        lblaid1 = new javax.swing.JLabel();
        txtaid2 = new javax.swing.JTextField();
        btncancelappointment2 = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 315));

        lblid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblid.setText("ID:");
        lblid.setToolTipText("");

        lblname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblname.setText("Name:");
        lblname.setToolTipText("");

        lbladdress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbladdress.setText("Address:");
        lbladdress.setToolTipText("");

        lblage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblage.setText("Age:");
        lblage.setToolTipText("");

        lblgender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblgender.setText("Gender:");
        lblgender.setToolTipText("");

        lblmoblieno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmoblieno.setText("MobileNo:");
        lblmoblieno.setToolTipText("");

        lblnationality.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnationality.setText("Nationality:");
        lblnationality.setToolTipText("");

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txtname.setEditable(false);
        txtname.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnameKeyTyped(evt);
            }
        });

        txtaddress.setEditable(false);
        txtaddress.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        txtaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtaddressKeyTyped(evt);
            }
        });

        txtage.setEditable(false);
        txtage.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });
        txtage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtageKeyTyped(evt);
            }
        });

        txtmobileno.setEditable(false);
        txtmobileno.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtmobileno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobilenoActionPerformed(evt);
            }
        });
        txtmobileno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmobilenoKeyTyped(evt);
            }
        });

        btnsave.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnsave.setText("Save");
        btnsave.setEnabled(false);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btncanceledit.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btncanceledit.setText("Cancel");
        btncanceledit.setEnabled(false);
        btncanceledit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanceleditActionPerformed(evt);
            }
        });

        lblpassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblpassword.setText("Password:");
        lblpassword.setToolTipText("");

        txtpassword.setEditable(false);
        txtpassword.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        Gender.add(rbtnmale);
        rbtnmale.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        rbtnmale.setText("Male");
        rbtnmale.setEnabled(false);

        Gender.add(rbtnfemale);
        rbtnfemale.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        rbtnfemale.setText("Female");
        rbtnfemale.setEnabled(false);

        Nationality.add(rbtncitizen);
        rbtncitizen.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        rbtncitizen.setText("Citizen");
        rbtncitizen.setEnabled(false);

        Nationality.add(rbtnnoncitizen);
        rbtnnoncitizen.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        rbtnnoncitizen.setText("Non-Citizen");
        rbtnnoncitizen.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbladdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblgender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblmoblieno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblnationality, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbtnmale)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbtnfemale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btncanceledit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(85, 85, 85))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtncitizen)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnnoncitizen))
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladdress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnedit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnmale, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbtnfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btncanceledit))
                    .addComponent(lblgender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmoblieno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtncitizen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbtnnoncitizen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblnationality, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Profile", jPanel1);

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltime.setText("Time:");
        lbltime.setToolTipText("");

        txtdose.setEditable(false);
        txtdose.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtdose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdoseActionPerformed(evt);
            }
        });

        txtdate.setEditable(false);
        txtdate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });

        lblstatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblstatus.setText("Status:");
        lblstatus.setToolTipText("");

        lblcentre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcentre.setText("Centre:");
        lblcentre.setToolTipText("");

        txtstatus.setEditable(false);
        txtstatus.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });

        txttime.setEditable(false);
        txttime.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txttime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimeActionPerformed(evt);
            }
        });

        lblvacstatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblvacstatus.setText("Vaccination:");
        lblvacstatus.setToolTipText("");

        txtcentre.setEditable(false);
        txtcentre.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtcentre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcentreActionPerformed(evt);
            }
        });

        txtvacstatus.setEditable(false);
        txtvacstatus.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtvacstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvacstatusActionPerformed(evt);
            }
        });

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldate.setText("Date:");
        lbldate.setToolTipText("");

        btnregister.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });

        lbldose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldose.setText("Dose:");
        lbldose.setToolTipText("");

        lblaid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblaid.setText("Appointment ID:");
        lblaid.setToolTipText("");

        txtaid.setEditable(false);
        txtaid.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaidActionPerformed(evt);
            }
        });

        btncancelappointment.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btncancelappointment.setText("Cancel");
        btncancelappointment.setEnabled(false);
        btncancelappointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelappointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblvacstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbldose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbldate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcentre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtdose, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btncancelappointment, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvacstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcentre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtaid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblaid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcentre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcentre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdose, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncancelappointment, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvacstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblvacstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );

        jTabbedPane1.addTab("1st Dose", jPanel2);

        lbltime1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltime1.setText("Time:");
        lbltime1.setToolTipText("");

        txtdose2.setEditable(false);
        txtdose2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtdose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdose2ActionPerformed(evt);
            }
        });

        txtdate2.setEditable(false);
        txtdate2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdate2ActionPerformed(evt);
            }
        });

        lblstatus1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblstatus1.setText("Status:");
        lblstatus1.setToolTipText("");

        lblcentre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcentre1.setText("Centre:");
        lblcentre1.setToolTipText("");

        txtstatus2.setEditable(false);
        txtstatus2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtstatus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatus2ActionPerformed(evt);
            }
        });

        txttime2.setEditable(false);
        txttime2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txttime2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttime2ActionPerformed(evt);
            }
        });

        lblvacstatus1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblvacstatus1.setText("Vaccination:");
        lblvacstatus1.setToolTipText("");

        txtcentre2.setEditable(false);
        txtcentre2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtcentre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcentre2ActionPerformed(evt);
            }
        });

        txtvacstatus2.setEditable(false);
        txtvacstatus2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtvacstatus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvacstatus2ActionPerformed(evt);
            }
        });

        lbldate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldate1.setText("Date:");
        lbldate1.setToolTipText("");

        btnregister2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnregister2.setText("Register");
        btnregister2.setEnabled(false);
        btnregister2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregister2ActionPerformed(evt);
            }
        });

        lbldose1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldose1.setText("Dose:");
        lbldose1.setToolTipText("");

        lblaid1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblaid1.setText("Appointment ID:");
        lblaid1.setToolTipText("");

        txtaid2.setEditable(false);
        txtaid2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtaid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaid2ActionPerformed(evt);
            }
        });

        btncancelappointment2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btncancelappointment2.setText("Cancel");
        btncancelappointment2.setEnabled(false);
        btncancelappointment2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelappointment2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblaid1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblvacstatus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblstatus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbldose1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbldate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltime1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcentre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtdose2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btncancelappointment2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvacstatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttime2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcentre2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnregister2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtstatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtaid2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblaid1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaid2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldate1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltime1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttime2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcentre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcentre2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdose2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldose1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnregister2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncancelappointment2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtstatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvacstatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblvacstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        jTabbedPane1.addTab("2nd Dose", jPanel3);

        lblWelcome.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblWelcome.setText("Hello, username");

        btnlogout.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        int result;
        result = JOptionPane.showConfirmDialog(null, "Are you sure?", "Log Out", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            ClearProfile();
            Clear1stDose();
            Clear2ndDose();
            btnregister2.setEnabled(false);
            btncancelappointment2.setEnabled(false);

            PeopleLogin login;
            login = new PeopleLogin();
            this.setVisible(false);
            new PeopleLogin().setVisible(true);

        }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            pplID = txtid.getText();
            name = txtname.getText();
            address = txtaddress.getText();
            age = Integer.parseInt(txtage.getText());
            gender = Gender.getSelection().getActionCommand();
            mobile = txtmobileno.getText();
            password = txtpassword.getText();
            nationality = Nationality.getSelection().getActionCommand();
            People current = null;
            boolean found = false;
            System.out.println(allPeople.size());
            for (int i = 0; i < allPeople.size(); i++) {
                People a = allPeople.get(i);
                if (pplID.equals(a.getPeopleID())) {
                    found = true;
                    current = a;
//                    System.out.println("Checked");
                    break;
                }
            }
            if (found) {
                current.setPeopleName(name);
                current.setAddress(address);
                current.setAge(age);
                current.setGender(gender);
                current.setMobileNo(mobile);
                current.setPassword(password);
                current.setNationality(nationality);
                People.PmodifyDetails();
//                allPeople.clear();            //if no clear, will always add record into arraylisy, cannot identify duplicates
                JOptionPane.showMessageDialog(rootPane, "Profile edited successfully!");

                txtname.setEditable(false);
                txtaddress.setEditable(false);
                txtage.setEditable(false);
                rbtnmale.setEnabled(false);
                rbtnfemale.setEnabled(false);
                txtmobileno.setEditable(false);
                rbtncitizen.setEnabled(false);
                rbtnnoncitizen.setEnabled(false);
                txtpassword.setEditable(false);
                btnsave.setEnabled(false);
                btncanceledit.setEnabled(false);
                btnedit.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Fail to access!", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtmobilenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobilenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobilenoActionPerformed

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        txtname.setEditable(true);
        txtaddress.setEditable(true);
        txtage.setEditable(true);
        rbtnmale.setEnabled(true);
        rbtnfemale.setEnabled(true);
        txtmobileno.setEditable(true);
        rbtncitizen.setEnabled(true);
        rbtnnoncitizen.setEnabled(true);
        txtpassword.setEditable(true);
        btnsave.setEnabled(true);
        btncanceledit.setEnabled(true);
        btnedit.setEnabled(false);

    }//GEN-LAST:event_btneditActionPerformed

    private void btncanceleditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanceleditActionPerformed
        People current = null;
        boolean check = false;
        System.out.println(allPeople.size());
        for (int i = 0; i < allPeople.size(); i++) {
            People a = allPeople.get(i);
            if (txtid.getText().equals(a.getPeopleID())) {
                check = true;
                current = a;
                break;
            }
        }
        if (check) {
            rbtnmale.setActionCommand("Male");
            rbtnfemale.setActionCommand("Female");
            rbtncitizen.setActionCommand("Citizen");
            rbtnnoncitizen.setActionCommand("Non-Citizen");

            txtid.setText(current.getPeopleID());
            txtname.setText(current.getPeopleName());
            txtaddress.setText(current.getAddress());
            txtage.setText(String.valueOf(current.getAge()));
            if (current.getGender().equals("Male")) {
                rbtnmale.setSelected(true);

            } else {
                rbtnfemale.setSelected(true);
            }
            System.out.println(current.getGender());
            txtmobileno.setText(current.getMobileNo());
            if (current.getNationality().equals("Citizen")) {
                rbtncitizen.setSelected(true);

            } else {
                rbtnnoncitizen.setSelected(true);
            }
            txtpassword.setText(current.getPassword());

            txtname.setEditable(false);
            txtaddress.setEditable(false);
            txtage.setEditable(false);
            rbtnmale.setEnabled(false);
            rbtnfemale.setEnabled(false);
            txtmobileno.setEditable(false);
            rbtncitizen.setEnabled(false);
            rbtnnoncitizen.setEnabled(false);
            txtpassword.setEditable(false);
            btnsave.setEnabled(false);
            btncanceledit.setEnabled(false);
            btnedit.setEnabled(true);
        }

    }//GEN-LAST:event_btncanceleditActionPerformed

    private void txtdoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdoseActionPerformed

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed

    private void txttimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimeActionPerformed

    private void txtcentreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcentreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcentreActionPerformed

    private void txtvacstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvacstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvacstatusActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyTyped
        char c = evt.getKeyChar();

        if (Character.isAlphabetic(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            txtname.setEditable(true);
        } else {
            txtname.setEditable(false);
        }
    }//GEN-LAST:event_txtnameKeyTyped

    private void txtageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtageKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if (txtage.getText().length() >= 2) {
            JOptionPane.showMessageDialog(rootPane, "Please input less than 3 digits!", "Invalid age", JOptionPane.WARNING_MESSAGE);
            txtage.setText("");
        }
    }//GEN-LAST:event_txtageKeyTyped

    private void txtmobilenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobilenoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if (txtmobileno.getText().length() >= 10) {
            JOptionPane.showMessageDialog(rootPane, "Please input less than 10 digits!", "Invalid mobile number", JOptionPane.WARNING_MESSAGE);
            txtmobileno.setText("");
        }
    }//GEN-LAST:event_txtmobilenoKeyTyped

    private void txtaddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaddressKeyTyped

    }//GEN-LAST:event_txtaddressKeyTyped

    private void txtaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaidActionPerformed

    private void btncancelappointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelappointmentActionPerformed

        int result;
        result = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel the appointment?", "1st Dose Appointment Cancellation", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            try {
                String appID = txtaid.getText();

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
                    People.cancelAppointment();

                    Clear1stDose();

                    btnregister.setEnabled(true);
                    btncancelappointment.setEnabled(false);

                    JOptionPane.showMessageDialog(rootPane, "Appointment Canceled Successfully!");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Fail to access!", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }


    }//GEN-LAST:event_btncancelappointmentActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        int result;
        result = JOptionPane.showConfirmDialog(null, "Are you sure?", "Register 1st Dose Appointment", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            try {
                pplID = txtid.getText();
                People found = SystemDataIO.checkingPeople(pplID);

                People current = null;
                if (found != null) {
                    current = found;

                    Appointment a = new Appointment();

                    txtaid.setText(a.AutoNumber());

                    Calendar c = Calendar.getInstance();
                    c.add(Calendar.DATE, 7);
                    SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");

                    String datestr = sdf.format(c.getTime());
                    txtdate.setText(datestr);

                    String AppTime = "-";
                    txttime.setText(AppTime);

                    int Adose = 1;
                    txtdose.setText(String.valueOf(Adose));

                    String defaultAppStatus = "Pending";
                    txtstatus.setText(defaultAppStatus);

                    String defaultVacStatus = "Incomplete";
                    txtvacstatus.setText(defaultVacStatus);

                    txtcentre.setText("notset");

                    btnregister.setEnabled(false);
                    btncancelappointment.setEnabled(true);

                    a = new Appointment(current, datestr, AppTime, Adose, Centre.notset, defaultAppStatus, defaultVacStatus);
                    allAppointments.add(a);

                    People.makeAppointment();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Fail to access!", "Error", JOptionPane.WARNING_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnregisterActionPerformed

    private void txtdose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdose2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdose2ActionPerformed

    private void txtdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdate2ActionPerformed

    private void txtstatus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatus2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatus2ActionPerformed

    private void txttime2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttime2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttime2ActionPerformed

    private void txtcentre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcentre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcentre2ActionPerformed

    private void txtvacstatus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvacstatus2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvacstatus2ActionPerformed

    private void btnregister2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregister2ActionPerformed
        int result;
        result = JOptionPane.showConfirmDialog(null, "Are you sure?", "Register 2nd Dose Appointment", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            try {
                pplID = txtid.getText();
                People found = SystemDataIO.checkingPeople(pplID);

                People current = null;
                if (found != null) {
                    current = found;

                    Appointment a = new Appointment();

                    txtaid2.setText(a.AutoNumber());

                    Calendar c = Calendar.getInstance();
                    c.add(Calendar.DATE, 7);
                    SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
                    String datestr = sdf.format(c.getTime());
                    txtdate2.setText(datestr);

                    String AppTime = "-";
                    txttime2.setText(AppTime);

                    int Adose = 2;
                    txtdose2.setText(String.valueOf(Adose));

                    String defaultAppStatus = "Pending";
                    txtstatus2.setText(defaultAppStatus);

                    String defaultVacStatus = "Incomplete";
                    txtvacstatus2.setText(defaultVacStatus);

                    txtcentre2.setText("notset");

                    btnregister2.setEnabled(false);
                    btncancelappointment2.setEnabled(true);

                    a = new Appointment(current, datestr, AppTime, Adose, Centre.notset, defaultAppStatus, defaultVacStatus);
                    allAppointments.add(a);

                    People.makeAppointment();
//                    if (txtvacstatus.getText().equals("Completed") && txtstatus.getText().equals("Accepted")) {
//                        btnregister.setEnabled(false);
//                        btncancelappointment.setEnabled(false);
//                        lblnotice.setText("You are partially vaccinated!");
//                    } else if (txtvacstatus.getText().equals("Incomplete") && txtstatus.getText().equals("Pending")) {
//                        lblnotice.setText("Your appointment request has submitted, kindly wait for approval.");
//                    } else if (txtstatus.getText().equals("Rejected")) {
//                        lblreject.setText("Your appointment has been rejected.");
//                    }
//                        this.setVisible(false);
//                        ca.setVisible(true);
//                        
//                        ca.DisplayTable();                       

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Fail to access!", "Error", JOptionPane.WARNING_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnregister2ActionPerformed

    private void txtaid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaid2ActionPerformed

    private void btncancelappointment2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelappointment2ActionPerformed

        int result;
        result = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel the appointment?", "2nd Dose Appointment Cancellation", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            try {
                String appID = txtaid2.getText();

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
                    People.cancelAppointment();

                    Clear2ndDose();
                    btnregister2.setEnabled(true);
                    JOptionPane.showMessageDialog(rootPane, "2nd Dose Appointment Canceled Successfully!");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Fail to access!", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btncancelappointment2ActionPerformed

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
            java.util.logging.Logger.getLogger(PeopleMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleMainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.ButtonGroup Gender;
    protected static javax.swing.ButtonGroup Nationality;
    protected static javax.swing.JButton btncancelappointment;
    protected static javax.swing.JButton btncancelappointment2;
    private javax.swing.JButton btncanceledit;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnlogout;
    protected static javax.swing.JButton btnregister;
    protected static javax.swing.JButton btnregister2;
    private javax.swing.JButton btnsave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    protected static javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblaid;
    private javax.swing.JLabel lblaid1;
    private javax.swing.JLabel lblcentre;
    private javax.swing.JLabel lblcentre1;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldate1;
    private javax.swing.JLabel lbldose;
    private javax.swing.JLabel lbldose1;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblmoblieno;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnationality;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JLabel lblstatus1;
    private javax.swing.JLabel lbltime;
    private javax.swing.JLabel lbltime1;
    private javax.swing.JLabel lblvacstatus;
    private javax.swing.JLabel lblvacstatus1;
    protected static javax.swing.JRadioButton rbtncitizen;
    protected static javax.swing.JRadioButton rbtnfemale;
    protected static javax.swing.JRadioButton rbtnmale;
    protected static javax.swing.JRadioButton rbtnnoncitizen;
    protected static javax.swing.JTextField txtaddress;
    protected static javax.swing.JTextField txtage;
    protected static javax.swing.JTextField txtaid;
    protected static javax.swing.JTextField txtaid2;
    protected static javax.swing.JTextField txtcentre;
    protected static javax.swing.JTextField txtcentre2;
    protected static javax.swing.JTextField txtdate;
    protected static javax.swing.JTextField txtdate2;
    protected static javax.swing.JTextField txtdose;
    protected static javax.swing.JTextField txtdose2;
    protected static javax.swing.JTextField txtid;
    protected static javax.swing.JTextField txtmobileno;
    protected static javax.swing.JTextField txtname;
    protected static javax.swing.JTextField txtpassword;
    protected static javax.swing.JTextField txtstatus;
    protected static javax.swing.JTextField txtstatus2;
    protected static javax.swing.JTextField txttime;
    protected static javax.swing.JTextField txttime2;
    protected static javax.swing.JTextField txtvacstatus;
    protected static javax.swing.JTextField txtvacstatus2;
    // End of variables declaration//GEN-END:variables
}
