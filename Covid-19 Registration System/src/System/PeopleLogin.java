package System;

import static System.Covid19RegistrationSystem.pthird;
import SystemClass.People;
import SystemClass.SystemDataIO;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("login"); // NOI18N

        lblicpassport.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblicpassport.setText("IC/Passport:");

        txticpassport.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblpassword.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblpassword.setText("Password:");

        btnlogin.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        txtpassword.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnshow.setBackground(new java.awt.Color(102, 102, 102));
        btnshow.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnshow.setText("Show");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblicpassport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txticpassport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnshow)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txticpassport, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblicpassport, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnshow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlogin, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnback, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.setVisible(false);
        new SystemHomePage().setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
    
        try{             
        String peopleID = txticpassport.getText();
        String password = (new String(txtpassword.getPassword()));
        
        if(peopleID.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Please enter IC/Passport or Password!","Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            People found = SystemDataIO.checkingPeople(peopleID);
            if(found == null){
                JOptionPane.showMessageDialog(rootPane,"Account does not exist!","Warning", JOptionPane.WARNING_MESSAGE);
            } else{               
                
                if(password.equals(found.getPassword())){
                    Covid19RegistrationSystem.plogin = found;
                    setVisible(false);
                    Covid19RegistrationSystem.pthird.setVisible(true);
                    
                    People current = null;
                    boolean check = false;
                    System.out.println(allPeople.size());
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
                        System.out.println(current.getGender());
                        pthird.txtmobileno.setText(current.getMobileNo());
                         if (current.getNationality().equals("Citizen")) {
                            pthird.rbtncitizen.setSelected(true);

                        } else {
                            pthird.rbtnnoncitizen.setSelected(true);
                        }
                        pthird.txtpassword.setText(current.getPassword());
                    }

                        
                    
                    
                } else{
                    JOptionPane.showMessageDialog(rootPane,"Wrong password!", "Error", JOptionPane.ERROR_MESSAGE);
                    
                }
            }}}catch(Exception e){
                JOptionPane.showMessageDialog(rootPane,"Fail to login!","Error", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JLabel lblicpassport;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JTextField txticpassport;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
