package System;

import SystemClass.People;
import SystemClass.SystemDataIO;
import static SystemClass.SystemDataIO.allPeople;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PeopleSignUp extends javax.swing.JFrame {

    private static ArrayList<People> p = new ArrayList<People>();
    String pplID, name, address, gender, mobile, password, nationality;
    int age;

    public PeopleSignUp() {
        initComponents();
        setLocationRelativeTo(null);

        rbtnmale.setActionCommand("Male");
        rbtnfemale.setActionCommand("Female");
        rbtncitizen.setActionCommand("Citizen");
        rbtnnoncitizen.setActionCommand("Non-Citizen");
        SystemDataIO.read();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        GENDER = new javax.swing.ButtonGroup();
        NATIONALITY = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        lblnationality = new javax.swing.JLabel();
        lblmobileno = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtmobileno = new javax.swing.JTextField();
        btnregister = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        lblicpassport = new javax.swing.JLabel();
        txticpassport = new javax.swing.JTextField();
        rbtncitizen = new javax.swing.JRadioButton();
        rbtnnoncitizen = new javax.swing.JRadioButton();
        lblpassword = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        rbtnmale = new javax.swing.JRadioButton();
        rbtnfemale = new javax.swing.JRadioButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("People Sign Up");

        lblnationality.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblnationality.setText("Nationality:");
        lblnationality.setToolTipText("");

        lblmobileno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblmobileno.setText("MobileNo:");
        lblmobileno.setToolTipText("");

        lblgender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblgender.setText("Gender:");
        lblgender.setToolTipText("");

        lblage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblage.setText("Age:");
        lblage.setToolTipText("");

        lbladdress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbladdress.setText("Address:");
        lbladdress.setToolTipText("");

        lblname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblname.setText("Full Name:");
        lblname.setToolTipText("");

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

        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });

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

        btnregister.setBackground(new java.awt.Color(102, 102, 255));
        btnregister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(204, 255, 204));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnback.setForeground(new java.awt.Color(51, 51, 51));
        btnback.setText("<< Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        lblicpassport.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblicpassport.setText("IC/Passport:");
        lblicpassport.setToolTipText("");

        txticpassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txticpassportActionPerformed(evt);
            }
        });

        rbtncitizen.setBackground(new java.awt.Color(102, 102, 102));
        NATIONALITY.add(rbtncitizen);
        rbtncitizen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtncitizen.setText("Citizen");

        rbtnnoncitizen.setBackground(new java.awt.Color(102, 102, 102));
        NATIONALITY.add(rbtnnoncitizen);
        rbtnnoncitizen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnnoncitizen.setText("Non-Citizen");

        lblpassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblpassword.setText("Password:");
        lblpassword.setToolTipText("");

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        rbtnmale.setBackground(new java.awt.Color(102, 102, 102));
        GENDER.add(rbtnmale);
        rbtnmale.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnmale.setText("Male");

        rbtnfemale.setBackground(new java.awt.Color(102, 102, 102));
        GENDER.add(rbtnfemale);
        rbtnfemale.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnfemale.setText("Female");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblicpassport, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbladdress, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblage, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblnationality, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblpassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnback)
                                .addGap(12, 12, 12))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblgender, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblmobileno, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txticpassport, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnmale)
                                        .addGap(31, 31, 31)
                                        .addComponent(rbtnfemale))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtncitizen)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbtnnoncitizen)))))
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnregister)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txticpassport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblicpassport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbladdress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblgender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnmale)
                    .addComponent(rbtnfemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnationality, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtncitizen)
                            .addComponent(rbtnnoncitizen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed

    }//GEN-LAST:event_txtnameActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed

    }//GEN-LAST:event_txtaddressActionPerformed

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed

    }//GEN-LAST:event_txtageActionPerformed

    private void txtmobilenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobilenoActionPerformed

    }//GEN-LAST:event_txtmobilenoActionPerformed

    private void txticpassportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txticpassportActionPerformed

    }//GEN-LAST:event_txticpassportActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed

    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.setVisible(false);
        new SystemHomePage().setVisible(true);

    }//GEN-LAST:event_btnbackActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        if (txticpassport.getText().isEmpty() || txtname.getText().isEmpty() || txtaddress.getText().isEmpty() || txtage.getText().isEmpty()
                || GENDER.getSelection().getActionCommand().isEmpty() || txtmobileno.getText().isEmpty()
                || txtpassword.getText().isEmpty() || NATIONALITY.getSelection().getActionCommand().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please ensure all information are entered.", "Incomplete details", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                pplID = txticpassport.getText();
                name = txtname.getText();
                address = txtaddress.getText();
                age = Integer.parseInt(txtage.getText());
                gender = GENDER.getSelection().getActionCommand();
                mobile = txtmobileno.getText();
                password = txtpassword.getText();
                nationality = NATIONALITY.getSelection().getActionCommand();
                People found = SystemDataIO.checkingPeople(pplID);
                if (found != null) {
                    JOptionPane.showMessageDialog(rootPane, "Account has been registered!", "Warning", JOptionPane.WARNING_MESSAGE);

                } else {
                    People p = new People(pplID, name, address, age, gender, mobile, password, nationality);
                    System.out.println(allPeople.size());
                    allPeople.add(p);
                    People.PmodifyDetails();

                    JOptionPane.showMessageDialog(rootPane, "Account Registered Successfully!");
                    System.out.println(allPeople.size());

                    setVisible(false);
                    Covid19RegistrationSystem.psecond.setVisible(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Fail to access!", "Error", JOptionPane.WARNING_MESSAGE);

            }
        }
    }//GEN-LAST:event_btnregisterActionPerformed

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

    private void txtnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyTyped
        char c = evt.getKeyChar();

        if (Character.isAlphabetic(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            txtname.setEditable(true);
        } else {
            txtname.setEditable(false);
        }
    }//GEN-LAST:event_txtnameKeyTyped

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GENDER;
    private javax.swing.ButtonGroup NATIONALITY;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnregister;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblicpassport;
    private javax.swing.JLabel lblmobileno;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnationality;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JRadioButton rbtncitizen;
    private javax.swing.JRadioButton rbtnfemale;
    private javax.swing.JRadioButton rbtnmale;
    private javax.swing.JRadioButton rbtnnoncitizen;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txticpassport;
    private javax.swing.JTextField txtmobileno;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    // End of variables declaration//GEN-END:variables
}
