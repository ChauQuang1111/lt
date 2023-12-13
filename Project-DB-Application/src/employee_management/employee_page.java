/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_management;

import custome_management.*;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import main.first_page;

/**
 *
 * @author Acer pv
 */
public class employee_page extends javax.swing.JFrame {

    /**
     * Creates new form customer_page
     */
    public employee_page() {
        initComponents();
        connect();
        showEmployee();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlabel = new javax.swing.JLabel();
        jlabel1 = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        txtCustomer_ID = new javax.swing.JTextField();
        txtManager_ID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        add_btn = new javax.swing.JButton();
        txtEmployee_ID = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        dobLabel = new javax.swing.JLabel();
        street = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        city = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        province = new javax.swing.JLabel();
        txtDob = new com.toedter.calendar.JDateChooser();
        province1 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        province2 = new javax.swing.JLabel();
        txtProvince = new javax.swing.JTextField();
        txtJoining_Date = new com.toedter.calendar.JDateChooser();
        txtStreet = new javax.swing.JTextField();
        province3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        employee_tb = new javax.swing.JTable();
        search_place = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        refresh_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jlabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlabel.setForeground(new java.awt.Color(255, 255, 255));
        jlabel.setText("Employee ID:");

        jlabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlabel1.setForeground(new java.awt.Color(255, 255, 255));
        jlabel1.setText("Customer ID:");

        jlabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlabel2.setForeground(new java.awt.Color(255, 255, 255));
        jlabel2.setText("Manager ID:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADD New Employee");

        add_btn.setBackground(new java.awt.Color(255, 255, 255));
        add_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add_btn.setForeground(new java.awt.Color(51, 51, 51));
        add_btn.setText("Add");
        add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_btnMouseClicked(evt);
            }
        });

        name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name:");

        dobLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dobLabel.setForeground(new java.awt.Color(255, 255, 255));
        dobLabel.setText("Date Of Birth:");

        street.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        street.setForeground(new java.awt.Color(255, 255, 255));
        street.setText("SSN:");

        city.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        city.setForeground(new java.awt.Color(255, 255, 255));
        city.setText("City:");

        province.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        province.setForeground(new java.awt.Color(255, 255, 255));
        province.setText("Joining Date:");

        province1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        province1.setForeground(new java.awt.Color(255, 255, 255));
        province1.setText("Salary:");

        province2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        province2.setForeground(new java.awt.Color(255, 255, 255));
        province2.setText("Province:");

        txtStreet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStreetKeyPressed(evt);
            }
        });

        province3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        province3.setForeground(new java.awt.Color(255, 255, 255));
        province3.setText("Street:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 69, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(76, 76, 76))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel)
                            .addComponent(jlabel1)
                            .addComponent(jlabel2)
                            .addComponent(name)
                            .addComponent(dobLabel)
                            .addComponent(street)
                            .addComponent(city)
                            .addComponent(province)
                            .addComponent(province1)
                            .addComponent(province2)
                            .addComponent(province3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSSN)
                            .addComponent(txtCustomer_ID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtManager_ID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmployee_ID)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCity)
                            .addComponent(txtDob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSalary)
                            .addComponent(txtProvince)
                            .addComponent(txtJoining_Date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStreet))
                        .addGap(18, 18, 18))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployee_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomer_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtManager_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(province, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJoining_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(province1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(province2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(province3))
                .addGap(18, 18, 18)
                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Employee Infomation");

        employee_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        employee_tb.getTableHeader().setReorderingAllowed(false);
        employee_tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employee_tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employee_tb);

        search_place.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_placeKeyReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_search_20px.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        refresh_btn.setText("Refresh");
        refresh_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refresh_btnMouseClicked(evt);
            }
        });

        delete_btn.setText("Delete");
        delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(search_place, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(refresh_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(167, 167, 167))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search_place))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refresh_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection con;
    PreparedStatement pst;
    Statement st;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_db", "root", "kido1412");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public void showEmployee() {
        try {
            st = con.createStatement();
            String query = "select * from employee";
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int column_count = rsmd.getColumnCount();
            DefaultTableModel defaultTableModel = (DefaultTableModel) employee_tb.getModel();
            defaultTableModel.setColumnCount(0);
            defaultTableModel.setRowCount(0);

            for (int j = 0; j < column_count;) {
                defaultTableModel.addColumn(rsmd.getColumnName(++j));
            }
            while (rs.next()) {
                String tablearray[] = new String[column_count];
                for (int i = 1, k = 0; i <= column_count;) {
                    tablearray[k] = rs.getString(i++);
                    k++;
                }
                defaultTableModel.addRow(tablearray);
            }
        } catch (SQLException ex) {
            Logger.getLogger(employee_page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean validate(String employeeID, String customerID, String managerID, String salary, String ssn, String name, String street, String city, String province) {
        if ((isNumber(employeeID) && isNumber(customerID) && isNumber(ssn) && isNumber(managerID) && isNumber(salary)) == false) {
            JOptionPane.showMessageDialog(this, "ID, SSN and Salary must be a number");
            return false;
        } else if (name.equals("") || street.equals("") || city.equals("") || province.equals("") || customerID.equals("") || managerID.equals("") || ssn.equals("") || salary.equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill all the infomation");
            return false;
        }
        return true;
    }

    private void add_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseClicked
        String empId, cusId, managerId, salary, ssn, name, dob, street, city, province, joinDate;
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");

        empId = txtEmployee_ID.getText();
        cusId = txtCustomer_ID.getText();
        managerId = txtManager_ID.getText();
        name = txtName.getText();
        dob = dcn.format(txtDob.getDate());
        joinDate = dcn.format(txtJoining_Date.getDate());
        street = txtStreet.getText();
        city = txtCity.getText();
        province = txtProvince.getText();
        salary = txtSalary.getText();
        ssn = txtSSN.getText();

        if (validate(empId, cusId, managerId, salary, ssn, name, street, city, province)) {
            try {
                pst = con.prepareStatement("insert into employee (employee_id, salary, joining_date, manager_id, customer_id, ssn, name, dob, street, city, province) values (?,?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, empId);
                pst.setString(2, salary);
                pst.setString(3, joinDate);
                pst.setString(4, managerId);
                pst.setString(5, cusId);
                pst.setString(6, ssn);
                pst.setString(7, name);
                pst.setString(8, dob);
                pst.setString(9, street);
                pst.setString(10, city);
                pst.setString(11, province);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Successfully");
                showEmployee();
                txtEmployee_ID.setText("");
                txtCustomer_ID.setText("");
                txtManager_ID.setText("");
                txtName.setText("");
                txtSSN.setText("");
                txtCity.setText("");
                txtProvince.setText("");
                txtSalary.setText("");
                txtStreet.setText("");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Employee id or SSN already existed");
            }
        }
    }//GEN-LAST:event_add_btnMouseClicked

    public void search(String str) {
        DefaultTableModel model = (DefaultTableModel) employee_tb.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        employee_tb.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    private void search_placeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_placeKeyReleased
        String searchString = search_place.getText();
        search(searchString);
    }//GEN-LAST:event_search_placeKeyReleased

    private void refresh_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh_btnMouseClicked
        showEmployee();
    }//GEN-LAST:event_refresh_btnMouseClicked

    private void delete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseClicked
        int index = employee_tb.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Choose a row you want to delete first");
        } else {
            TableModel model = employee_tb.getModel();
            String employeeID = (String) model.getValueAt(index, 0);
            try {
                pst = con.prepareStatement("delete from employee where employee_id = '" + employeeID + "'");
                int dialogButton = JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING", JOptionPane.YES_NO_OPTION);

                if (dialogButton == JOptionPane.YES_OPTION) {
                    pst.executeUpdate();
                    showEmployee();
                }
            } catch (SQLException ex) {
                Logger.getLogger(employee_page.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_delete_btnMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        first_page f = new first_page();
        f.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void txtStreetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStreetKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreetKeyPressed
    employee_update emp = new employee_update(new javax.swing.JFrame(), true);
    private void employee_tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employee_tbMouseClicked
        if (evt.getClickCount() == 2) {

            int index = employee_tb.getSelectedRow();
            TableModel model = employee_tb.getModel();
            String empId = (String) model.getValueAt(index, 0);
            String salary = (String) model.getValueAt(index, 1);
            String joiningDate = (String) model.getValueAt(index, 2);
            String managerId = (String) model.getValueAt(index, 3);
            String customerId = (String) model.getValueAt(index, 4);
            String ssn = (String) model.getValueAt(index, 5);
            String name = (String) model.getValueAt(index, 6);
            String dob = (String) model.getValueAt(index, 7);
            String street = (String) model.getValueAt(index, 8);
            String city = (String) model.getValueAt(index, 9);
            String province = (String) model.getValueAt(index, 10);
            
            emp.txtEmployeeID.setText(empId);
            emp.txtSalary.setText(salary);
           try {
                java.util.Date joindate = new SimpleDateFormat("yyyy-MM-dd").parse(joiningDate);
                emp.txtJoiningDate.setDate(joindate);
            } catch (ParseException ex) {
                Logger.getLogger(customer_page.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                java.util.Date dob2 = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
                emp.txtDob.setDate(dob2);
            } catch (ParseException ex) {
                Logger.getLogger(customer_page.class.getName()).log(Level.SEVERE, null, ex);
            }
            emp.txtManagerID.setText(managerId);
            emp.txtCustomerID.setText(customerId);
            emp.txtSSN.setText(ssn);
            emp.txtName.setText(name);
            emp.txtStreet.setText(street);
            emp.txtCity.setText(city);
            emp.txtProvince.setText(province);

            emp.setVisible(true);
            emp.pack();
            emp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_employee_tbMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JLabel city;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JTable employee_tb;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel province;
    private javax.swing.JLabel province1;
    private javax.swing.JLabel province2;
    private javax.swing.JLabel province3;
    private javax.swing.JButton refresh_btn;
    private javax.swing.JTextField search_place;
    private javax.swing.JLabel street;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCustomer_ID;
    private com.toedter.calendar.JDateChooser txtDob;
    private javax.swing.JTextField txtEmployee_ID;
    private com.toedter.calendar.JDateChooser txtJoining_Date;
    public javax.swing.JTextField txtManager_ID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtProvince;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}