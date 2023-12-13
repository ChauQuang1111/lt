/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Saving extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "admin";
    private static final String conn = "jdbc:mysql://localhost:3306/banking";

    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form Branch
     */
    public Saving() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void updateDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(conn, username, password);
            pst = sqlConn.prepareStatement("select * from banking.savings_account");

            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();

            int column_count = stData.getColumnCount();
            System.out.println(column_count);

            DefaultTableModel defaultTableModel = (DefaultTableModel) savingTable.getModel();

            defaultTableModel.setColumnCount(0);
            defaultTableModel.setRowCount(0);

            for (int j = 0; j < column_count;) {
                //// Adding colum name according to metadata information
                defaultTableModel.addColumn(stData.getColumnName(++j));

                System.out.println(stData.getColumnName(j));
            }

            while (rs.next()) {
                // Considering maximun column size is 100
                String tablearray[] = new String[100];

                //Selecting data from each column of ResultSet table
                for (int i = 1, k = 0; i <= column_count;) {
                    // Assigning data to each column into JTable
                    tablearray[k++] = rs.getString(i++);

                    System.out.println(tablearray[k]);
                }

                // Add the column information as a row into default table
                defaultTableModel.addRow(tablearray);
            }
            sqlConn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        exitButton = new javax.swing.JButton();
        BranchIDLabel = new javax.swing.JLabel();
        BranchCityLabel = new javax.swing.JLabel();
        BranchAssetsLabel = new javax.swing.JLabel();
        accountNumTxt = new javax.swing.JTextField();
        balanceTxt = new javax.swing.JTextField();
        branchIDTxt = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        savingTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rateTxt = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        BranchIDLabel.setText("Account Number");

        BranchCityLabel.setText("Balance");

        BranchAssetsLabel.setText("Branch ID");

        accountNumTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumTxtActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        savingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "account_number", "balance", "branch_id", "interest_rate"
            }
        ));
        savingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savingTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(savingTable);

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Interest rate");

        rateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BranchIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BranchCityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BranchAssetsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(balanceTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(accountNumTxt)
                            .addComponent(branchIDTxt)
                            .addComponent(rateTxt))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BranchIDLabel)
                    .addComponent(accountNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BranchCityLabel)
                            .addComponent(balanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BranchAssetsLabel)
                            .addComponent(branchIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

        MainPage main = new MainPage();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void accountNumTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumTxtActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(conn, username, password);
            pst = sqlConn.prepareStatement("insert into banking.savings_account(account_number, balance, branch_id, interest_rate)value(?,?,?,?)");

            pst.setString(1, accountNumTxt.getText());
            pst.setString(2, balanceTxt.getText());
            pst.setString(3, branchIDTxt.getText());
            pst.setString(4, rateTxt.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Added");
            updateDB();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        accountNumTxt.setText("");
        balanceTxt.setText("");
        branchIDTxt.setText("");
        rateTxt.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        updateDB();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(conn, username, password);
            pst = sqlConn.prepareStatement("UPDATE banking.savings_account SET balance = ?, branch_id = ?, interest_rate = ? WHERE (account_number = ?)");

            pst.setString(1, balanceTxt.getText());
            pst.setString(2, branchIDTxt.getText());
            pst.setString(3, rateTxt.getText());
            pst.setString(4, accountNumTxt.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Updated");
            updateDB();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void savingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savingTableMouseClicked
        DefaultTableModel defaultTableModel = (DefaultTableModel) savingTable.getModel();
        int selectedRows = savingTable.getSelectedRow();

        accountNumTxt.setText(defaultTableModel.getValueAt(selectedRows, 0).toString());
        balanceTxt.setText(defaultTableModel.getValueAt(selectedRows, 1).toString());
        branchIDTxt.setText(defaultTableModel.getValueAt(selectedRows, 2).toString());
        rateTxt.setText(defaultTableModel.getValueAt(selectedRows, 3).toString());
    }//GEN-LAST:event_savingTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DefaultTableModel defaultTableModel = (DefaultTableModel) savingTable.getModel();
        int selectedRows = savingTable.getSelectedRow();

        int id = Integer.parseInt(defaultTableModel.getValueAt(selectedRows, 0).toString());
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(conn, username, password);
            pst = sqlConn.prepareStatement("delete from banking.savings_account where account_number=?");

            pst.setInt(1, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete Successfully, Database updated");
            updateDB();
            accountNumTxt.setText("");
            balanceTxt.setText("");
            branchIDTxt.setText("");
            rateTxt.setText("");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void rateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateTxtActionPerformed

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
            java.util.logging.Logger.getLogger(Branch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Branch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Branch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Branch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Saving().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BranchAssetsLabel;
    private javax.swing.JLabel BranchCityLabel;
    private javax.swing.JLabel BranchIDLabel;
    private javax.swing.JTextField accountNumTxt;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField balanceTxt;
    private javax.swing.JTextField branchIDTxt;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rateTxt;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JTable savingTable;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
