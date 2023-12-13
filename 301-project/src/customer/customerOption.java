/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package customer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import main.login;
import model.customer;

/**
 *
 * @author ADMIN
 */
public class customerOption extends javax.swing.JFrame {

    private login login;
    private customer cus;
    private customerInformation cusInfor;
    private customerSaving cusSav;
    private customerDeposit cusDepo;
    private customerCurrent cusCur;
    private customerLoan cusLoan;
    private customerTransfer cusTransfer;

    /**
     * Creates new form customerOption
     */
    public customerOption(login login, customer cus) {
        this.login = login;
        this.cus = cus;
        System.out.println(cus.getName());

        initComponents();
    }

    public void replaceLogin() {
        login.dispose();
        setVisible(true);
    }

    public customerOption(customerInformation cusInfor, customer cus) {
        this.cusInfor = cusInfor;
        this.cus = cus;
        System.out.println(cus.getName());

        initComponents();
    }

    //mai
    public void replaceCustomerInfor() {
        cusInfor.dispose();
        setVisible(true);
    }
    //end-mai

    public customerOption(customerSaving cusSav, customer cus) {
        this.cusSav = cusSav;
        this.cus = cus;
        System.out.println(cus.getName());

        initComponents();
    }

    //mai
    public void replaceCustomerSaving() {
        cusSav.dispose();
        setVisible(true);
    }
    //end-mai

    public customerOption(customerDeposit cusDepo, customer cus) {
        this.cusDepo = cusDepo;
        this.cus = cus;
        System.out.println(cus.getName());

        initComponents();
    }

    //mai
    public void replaceCustomerDeposit() {
        cusDepo.dispose();
        setVisible(true);
    }
    //end-mai

    public customerOption(customerCurrent cusCur, customer cus) {
        this.cusCur = cusCur;
        this.cus = cus;
        System.out.println(cus.getName());

        initComponents();
    }

    //mai
    public void replaceCustomerCurrent() {
        cusCur.dispose();
        setVisible(true);
    }
    //end-mai

    public customerOption(customerLoan cusLoan, customer cus) {
        this.cusLoan = cusLoan;
        this.cus = cus;
        System.out.println(cus.getName());

        initComponents();
    }

    //mai
    public void replaceCustomerLoan() {
        cusLoan.dispose();
        setVisible(true);
    }
    //end-mai

    public customerOption(customerTransfer cusTransfer, customer cus) {
        this.cusTransfer = cusTransfer;
        this.cus = cus;
        System.out.println(cus.getName());

        initComponents();
    }

    //mai
    public void replaceCustomerTransfer() {
        cusTransfer.dispose();
        setVisible(true);

    }
    //end-mai

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnProfile = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnOpenSaving = new javax.swing.JButton();
        btnOpenCurrent = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        btnTakeLoan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(221, 182, 201));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(24, 31, 49));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHOOSE YOUR OPTION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        btnProfile.setBackground(new java.awt.Color(23, 31, 48));
        btnProfile.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setText("PROFILE");
        btnProfile.setBorder(null);
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnDeposit.setBackground(new java.awt.Color(161, 210, 229));
        btnDeposit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeposit.setText("DEPOSIT");
        btnDeposit.setBorder(null);
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnOpenSaving.setBackground(new java.awt.Color(224, 226, 225));
        btnOpenSaving.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnOpenSaving.setText("OPEN SAVING ACCOUNT");
        btnOpenSaving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenSavingActionPerformed(evt);
            }
        });

        btnOpenCurrent.setBackground(new java.awt.Color(231, 193, 206));
        btnOpenCurrent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnOpenCurrent.setText("OPEN CURRENT ACCOUNT");
        btnOpenCurrent.setBorder(null);
        btnOpenCurrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenCurrentActionPerformed(evt);
            }
        });

        btnTransfer.setBackground(new java.awt.Color(170, 201, 206));
        btnTransfer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTransfer.setText("TRANSFER");
        btnTransfer.setBorder(null);
        btnTransfer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        btnTakeLoan.setBackground(new java.awt.Color(174, 169, 173));
        btnTakeLoan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTakeLoan.setText("TAKE LOAN");
        btnTakeLoan.setBorder(null);
        btnTakeLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeLoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOpenSaving, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOpenCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTakeLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpenSaving, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpenCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTakeLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//click button profile --> go to profile
    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        try {
            if (evt.getActionCommand().equals("PROFILE")) {
                callEmployeeProfile(cus);
            }
        } catch (Exception e) {
            System.out.println("failed");
        }
    }//GEN-LAST:event_btnProfileActionPerformed
//end button profile

    private void btnOpenSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenSavingActionPerformed
        try {
            if (evt.getActionCommand().equals("OPEN SAVING ACCOUNT")) {               
                callCustomerSaving(cus);
            }
        } catch (Exception e) {
            System.out.println("failed");
        }
    }//GEN-LAST:event_btnOpenSavingActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        try {
            if (evt.getActionCommand().equals("DEPOSIT")) {
                callDeposit(cus);
            }
        } catch (Exception e) {
            System.out.println("failed");
        }
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnOpenCurrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenCurrentActionPerformed
        try {
            if (evt.getActionCommand().equals("OPEN CURRENT ACCOUNT")) {
                callCustomerCurrent(cus);
            }
        } catch (Exception e) {
            System.out.println("failed");
        }
    }//GEN-LAST:event_btnOpenCurrentActionPerformed

    private void btnTakeLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeLoanActionPerformed
        try {
            if (evt.getActionCommand().equals("TAKE LOAN")) {
                callCustomerLoan(cus);
            }
        } catch (Exception e) {
            System.out.println("failed");
        }
    }//GEN-LAST:event_btnTakeLoanActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        try {
            if (evt.getActionCommand().equals("TRANSFER")) {
                callCustomerTransfer(cus);
            }
        } catch (Exception e) {
            System.out.println("failed");
        }
    }//GEN-LAST:event_btnTransferActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(customerOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(customerOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(customerOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(customerOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new customerOption().setVisible(true);
//            }
//        });
//    }
    //mai        
    private void callEmployeeProfile(customer cus) {
        customerInformation cusInfo = new customerInformation(this, cus);
        cusInfo.setVisible(true);
        cusInfo.replaceOption();

    }
    //end-mai

    //mai        
    private void callCustomerSaving(customer cus) {
        customerSaving cusSav = new customerSaving(this, cus);
        cusSav.setVisible(true);
        cusSav.replaceOption();
    }
    //end-mai

    //mai
    private void callDeposit(customer cus) {
        customerDeposit cusDepo = new customerDeposit(this, cus);
        cusDepo.setVisible(true);
        cusDepo.replaceOption();
    }
    //end-mai

    //mai
    private void callCustomerCurrent(customer cus) {
        customerCurrent cusCur = new customerCurrent(this, cus);
        cusCur.setVisible(true);
        cusCur.replaceOption();
    }
    //end-mai

    //mai
    private void callCustomerLoan(customer cus) {
        customerLoan cusLoan = new customerLoan(this, cus);
        cusLoan.setVisible(true);
        cusLoan.replaceOption();
    }
    //end-mai

    //mai
    private void callCustomerTransfer(customer cus) {
        customerTransfer cusTrans = new customerTransfer(this, cus);
        cusTrans.setVisible(true);
        cusTrans.replaceOption();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnOpenCurrent;
    private javax.swing.JButton btnOpenSaving;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnTakeLoan;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
