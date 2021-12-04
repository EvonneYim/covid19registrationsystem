package System;

import javax.swing.JOptionPane;

public class CommitteeOperations extends javax.swing.JFrame {

    public CommitteeOperations() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        btnPpl = new javax.swing.JButton();
        btnApp = new javax.swing.JButton();
        btnVac = new javax.swing.JButton();
        btnSummary = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnCommitee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operations for Commitee");

        jTabbedPane1.setForeground(new java.awt.Color(153, 153, 255));

        btnPpl.setBackground(new java.awt.Color(102, 102, 255));
        btnPpl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPpl.setForeground(new java.awt.Color(51, 51, 51));
        btnPpl.setText("People List");
        btnPpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPplActionPerformed(evt);
            }
        });

        btnApp.setBackground(new java.awt.Color(204, 51, 255));
        btnApp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnApp.setForeground(new java.awt.Color(51, 51, 51));
        btnApp.setText("Appointment List");
        btnApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppActionPerformed(evt);
            }
        });

        btnVac.setBackground(new java.awt.Color(51, 255, 51));
        btnVac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnVac.setForeground(new java.awt.Color(51, 51, 51));
        btnVac.setText("Vaccines List");
        btnVac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacActionPerformed(evt);
            }
        });

        btnSummary.setBackground(new java.awt.Color(255, 255, 51));
        btnSummary.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSummary.setForeground(new java.awt.Color(51, 51, 51));
        btnSummary.setText("Statistical Report");
        btnSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSummaryActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        btnLogout.setBackground(new java.awt.Color(255, 0, 0));
        btnLogout.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(153, 153, 153));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnCommitee.setBackground(new java.awt.Color(255, 153, 153));
        btnCommitee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCommitee.setForeground(new java.awt.Color(51, 51, 51));
        btnCommitee.setText("Commitee Management");
        btnCommitee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommiteeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnCommitee, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCommitee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPpl, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVac, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApp, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPpl, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnApp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVac, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPplActionPerformed
        this.setVisible(false);
        CommitteePeople cp = new CommitteePeople();
        cp.setVisible(true);
    }//GEN-LAST:event_btnPplActionPerformed

    private void btnAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppActionPerformed
        this.setVisible(false);
        CommitteeAppointment ca = new CommitteeAppointment();
        ca.setVisible(true);
    }//GEN-LAST:event_btnAppActionPerformed

    private void btnVacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacActionPerformed
        this.setVisible(false);
        CommitteeVaccines cv = new CommitteeVaccines();
        cv.setVisible(true);
    }//GEN-LAST:event_btnVacActionPerformed

    private void btnSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSummaryActionPerformed
   
        this.setVisible(false);
        CommitteeReport cr = new CommitteeReport();
        cr.setVisible(true);
    }//GEN-LAST:event_btnSummaryActionPerformed

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

    private void btnCommiteeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommiteeActionPerformed
        String input = JOptionPane.showInputDialog("Enter keyword to proceed:");
        try {
            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please enter keyword!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (input.equals("ilovesinovac")) {
                    this.setVisible(false);
                    CommitteeManagement cm = new CommitteeManagement();
                    cm.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Wrong password!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Fail to access!", "Error", JOptionPane.WARNING_MESSAGE);
        }
        //put input dialog to limit access
    }//GEN-LAST:event_btnCommiteeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommitteeOperations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApp;
    private javax.swing.JButton btnCommitee;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPpl;
    private javax.swing.JButton btnSummary;
    private javax.swing.JButton btnVac;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
