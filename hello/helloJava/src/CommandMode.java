
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class CommandMode extends javax.swing.JFrame {

    public CommandMode() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Write your SQL query here...");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Show Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            // loading mysql driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            // creating connection with database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "admin");
            // creating statement object
            Statement st = con.createStatement();

            // Write your query
            // String query = "select book_details.book_id, book_details.title, 
            //                  author.name from book_details inner join author on "
            //                  + "book_details.author_author_id = author.author_id";
            // Get your query from input section like TextArea
            String query = jTextArea1.getText().trim();

            //Create a resultset object and store the return object of query execution
            ResultSet rs = st.executeQuery(query);

            //Retrieving the ResultSetMetaData object
            ResultSetMetaData rsmd = rs.getMetaData();

            //getting the column type
            int column_count = rsmd.getColumnCount();
            System.out.println(column_count);

            // Creating a default table object and typecast out JTable into it            
            DefaultTableModel defaultTableModel = (DefaultTableModel) jTable2.getModel();

            // Initialy set row and column size as 0
            defaultTableModel.setColumnCount(0);
            defaultTableModel.setRowCount(0);

            // Adding colums according to metadata information
            for (int j = 0; j < column_count;) {
                //// Adding colum name according to metadata information
                defaultTableModel.addColumn(rsmd.getColumnName(++j));

                System.out.println(rsmd.getColumnName(j));
            }

            // Traverse result set object to end
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

// If you want to print information on console               
//                int i=1;
//                String book_id = rs.getString(i++);
//                String author = rs.getString(i++);
//                String title = rs.getString(i++);
//                String isbn = rs.getString(i++);
//                                              
//                String tablearray[] = {book_id,author,title,isbn};
//                  
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        MainPage mp = new MainPage();
        mp.setVisible(true);

    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommandMode().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
