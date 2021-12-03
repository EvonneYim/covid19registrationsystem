package System;

import static System.Covid19RegistrationSystem.pthird;
import SystemClass.Appointment;
import SystemClass.People;
import SystemClass.SystemDataIO;
import static SystemClass.SystemDataIO.allAppointments;
import static SystemClass.SystemDataIO.allPeople;
import javax.swing.JOptionPane;

public class PeopleLogin extends javax.swing.JFrame {

    public PeopleLogin() {
        initComponents();
        SystemDataIO.read();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblicpassport = new javax.swing.JLabel();
        txticpassport = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        btnshow = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("People Channel");
        setName("login"); // NOI18N

        lblicpassport.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblicpassport.setForeground(new java.awt.Color(0, 51, 51));
        lblicpassport.setText("IC/Passport");

        lblpassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(0, 51, 51));
        lblpassword.setText("Password");

        btnlogin.setBackground(new java.awt.Color(0, 102, 102));
        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(51, 51, 51));
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(204, 255, 204));
        btnback.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        btnback.setForeground(new java.awt.Color(51, 51, 51));
        btnback.setText("<< Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnshow.setBackground(new java.awt.Color(102, 102, 102));
        btnshow.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnshow.setText("Show");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Covid-19 Registration System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblpassword)
                                    .addComponent(lblicpassport, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txticpassport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnshow))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnback)
                                .addGap(48, 48, 48)
                                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblicpassport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txticpassport, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnshow)
                    .addComponent(lblpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.setVisible(false);
        new SystemHomePage().setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed

        try {
            String peopleID = txticpassport.getText();
            String password = (new String(txtpassword.getPassword()));
            String second = "2";

            if (peopleID.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please enter IC/Passport or Password!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                People found = SystemDataIO.checkingPeople(peopleID);
                if (found == null) {
                    JOptionPane.showMessageDialog(rootPane, "Account does not exist!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {

                    if (password.equals(found.getPassword())) {
                        Covid19RegistrationSystem.plogin = found;
                        setVisible(false);
                        Covid19RegistrationSystem.pthird.setVisible(true);

                        //Profile
                        People current = null;
                        boolean check = false;

                        for (int i = 0; i < allPeople.size(); i++) {
                            People a = allPeople.get(i);
                            if (peopleID.equals(a.getPeopleID())) {
                                check = true;
                                current = a;
                                break;
                            }
                        }
                        if (check) {
                            pthird.rbtnmale.setActionCommand("Male");
                            pthird.rbtnfemale.setActionCommand("Female");
                            pthird.rbtncitizen.setActionCommand("Citizen");
                            pthird.rbtnnoncitizen.setActionCommand("Non-Citizen");

                            pthird.txtid.setText(current.getPeopleID());
                            pthird.txtname.setText(current.getPeopleName());
                            pthird.txtaddress.setText(current.getAddress());
                            pthird.txtage.setText(String.valueOf(current.getAge()));
                            if (current.getGender().equals("Male")) {
                                pthird.rbtnmale.setSelected(true);

                            } else {
                                pthird.rbtnfemale.setSelected(true);
                            }
                            pthird.txtmobileno.setText(current.getMobileNo());
                            if (current.getNationality().equals("Citizen")) {
                                pthird.rbtncitizen.setSelected(true);

                            } else {
                                pthird.rbtnnoncitizen.setSelected(true);
                            }
                            pthird.txtpassword.setText(current.getPassword());
                            pthird.lblWelcome.setText("Hello, " + current.getPeopleName());
                        }
                        //1st Dose Appointment
                        Appointment current1 = null;
                        boolean check1 = false;
                        System.out.println(allAppointments.size());
                        for (int i = 0; i < allAppointments.size(); i++) {
                            Appointment b = allAppointments.get(i);
                            if (peopleID.equals(b.getPpl().getPeopleID())) {
                                check1 = true;
                                current1 = b;
                                break;
                            }
                        }
                        if (check1) {
                            pthird.txtaid.setText(current1.getAppointmentID());
                            pthird.txtdate.setText(current1.getAppointmentDate());
                            pthird.txttime.setText(current1.getAppointmentTime());
                            pthird.txtcentre.setText(current1.getPlace().toString());
                            pthird.txtdose.setText(String.valueOf(current1.getDose()));
                            pthird.txtstatus.setText(current1.getAppointmentStatus());
                            pthird.txtvacstatus.setText(current1.getVaccinationStatus());

                            if ((!pthird.txtid.getText().isEmpty() || !pthird.txtdate.getText().isEmpty() || !pthird.txttime.getText().isEmpty() || !pthird.txtcentre.getText().isEmpty()
                                    || !pthird.txtdose.getText().isEmpty() || !pthird.txtstatus.getText().isEmpty() || !pthird.txtvacstatus.getText().isEmpty())) {
                                pthird.btnregister.setEnabled(false);
                                pthird.btncancelappointment.setEnabled(true);
                            } else {
                                pthird.btnregister.setEnabled(true);
                                pthird.btncancelappointment.setEnabled(false);
                            }
                            if (pthird.txtstatus.getText().equals("Accepted") && pthird.txtvacstatus.getText().equals("Completed")) {
                                pthird.btnregister.setEnabled(false);
                                pthird.btncancelappointment.setEnabled(false);
                            }

                        }
                        //2nd Dose Appointment
                        Appointment current2 = null;
                        boolean check2 = false;
                        System.out.println(allAppointments.size());
                        for (int i = 0; i < allAppointments.size(); i++) {
                            Appointment c = allAppointments.get(i);
                            if (peopleID.equals(c.getPpl().getPeopleID()) && second.equals(String.valueOf(c.getDose()))) {
                                check2 = true;
                                current2 = c;
                                break;
                            }
                        }
                        if (check2) {
                            pthird.txtaid2.setText(current2.getAppointmentID());
                            pthird.txtdate2.setText(current2.getAppointmentDate());
                            pthird.txttime2.setText(current2.getAppointmentTime());
                            pthird.txtcentre2.setText(current2.getPlace().toString());
                            pthird.txtdose2.setText(String.valueOf(current2.getDose()));
                            pthird.txtstatus2.setText(current2.getAppointmentStatus());
                            pthird.txtvacstatus2.setText(current2.getVaccinationStatus());

                            if ((!pthird.txtaid2.getText().isEmpty() || !pthird.txtdate2.getText().isEmpty() || !pthird.txttime2.getText().isEmpty() || !pthird.txtcentre2.getText().isEmpty()
                                    || !pthird.txtdose2.getText().isEmpty() || !pthird.txtstatus2.getText().isEmpty() || !pthird.txtvacstatus2.getText().isEmpty())) {
                                pthird.btnregister2.setEnabled(false);
                                pthird.btncancelappointment2.setEnabled(true);
                            } else {
                                pthird.btnregister2.setEnabled(false);
                                pthird.btncancelappointment2.setEnabled(false);
                            }
                            if (pthird.txtstatus2.getText().equals("Accepted") && pthird.txtvacstatus2.getText().equals("Completed")) {
                                pthird.btnregister2.setEnabled(false);
                                pthird.btncancelappointment2.setEnabled(false);
                            }

                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Wrong password!", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Fail to login!", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnloginActionPerformed

    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed

        if (btnshow.isSelected()) {

            txtpassword.setEchoChar((char) 0);
        } else {
            txtpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_btnshowActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogin;
    private javax.swing.JToggleButton btnshow;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblicpassport;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JTextField txticpassport;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
