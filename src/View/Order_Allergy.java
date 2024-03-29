package View;

import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;
import java.util.Date;
import Model.Botica;
import Model.UserModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Order_Allergy extends javax.swing.JFrame {

    int quan;
    int price;
    int amount;
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();

    public Order_Allergy() {
        initComponents();
        ShowAllergy();
    }

    public void ShowAllergy() {
        UserModel u = new UserModel();
        DefaultTableModel model = (DefaultTableModel) allergy_table.getModel();
        ArrayList<Botica.AllergyMedicine> list = u.getAllergyList();

        for (int i = 0; i < list.size(); ++i) {
            Object[] row = new Object[6];

            row[0] = list.get(i).getId();
            row[1] = list.get(i).getBrandname();
            row[2] = list.get(i).getGenericname();
            row[3] = list.get(i).getDescription();
            row[4] = list.get(i).getPrice();
            row[5] = list.get(i).getQuantity();

            model.addRow(row);
        }
        allergy_table.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allergy_table = new javax.swing.JTable();
        add_cart = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MEDAPP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        allergy_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Brandname", "Generic name", "Description", "Price", "Quantitiy "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        allergy_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allergy_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(allergy_table);

        add_cart.setText("Add to Cart");
        add_cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_cartActionPerformed(evt);
            }
        });

        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btn_back)
                        .addGap(68, 68, 68)
                        .addComponent(add_cart)))
                .addGap(802, 802, 802)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(466, 466, 466))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(68, 68, 68)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_cart)
                            .addComponent(btn_back))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_cartActionPerformed

        int i = allergy_table.getSelectedRow();
        TableModel model = allergy_table.getModel();

        Object[] options1 = {"Order", "Cancel"};

        panel.setLayout(new GridLayout(0, 2, 2, 2));

        panel.add(new JLabel("ID: "));
        panel.add(new JLabel(model.getValueAt(i, 0).toString()));
        panel.add(new JLabel("Brandname: "));
        panel.add(new JLabel(model.getValueAt(i, 1).toString()));
        panel.add(new JLabel("Generic name: "));
        panel.add(new JLabel(model.getValueAt(i, 2).toString()));
        panel.add(new JLabel("Description: "));
        panel.add(new JLabel(model.getValueAt(i, 3).toString()));
        panel.add(new JLabel("Price: "));
        panel.add(new JLabel(model.getValueAt(i, 4).toString()));
        panel.add(new JLabel("Quantity in Stock: "));
        panel.add(new JLabel(model.getValueAt(i, 5).toString()));
        panel.add(new JLabel("Enter quantity to order: "));
        JTextField textField = new JTextField(10);
        panel.add(textField);

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        String strDate = formatter.format(date);

        int result = JOptionPane.showOptionDialog(null, panel, "Order",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options1, null);
        if (result == JOptionPane.YES_OPTION) {

            String q = textField.getText();
            String p = model.getValueAt(i, 4).toString();

            try {
                quan = Integer.parseInt(q);
                price = Integer.parseInt(p);
                amount = price * quan;

//                Signup s = new Signup();
//                boolean registered = false;
                try {
                    Statement stmt = null;
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
                    stmt = con.createStatement();
                    String sql = "INSERT INTO `purchase`(`brandname`, `price`, `quantity`, `total`) VALUES ('" + model.getValueAt(i, 1).toString() + "','" + model.getValueAt(i, 4).toString() + "', '" + textField.getText() + "', '" + amount + "')";
                    stmt.executeUpdate(sql);
                    con.close();
//                    registered = true;
                    System.out.println("Successful");
                } catch (ClassNotFoundException | SQLException e) {
//                    JOptionPane.showMessageDialog(s, "Cannot connect to database!", "Error", JOptionPane.ERROR_MESSAGE);
                }


                Cart c = new Cart();
                dispose();
                c.setVisible(true);
//                JOptionPane.showMessageDialog(null, "☺☺☺--MEDAPP RECEIPT--☺☺☺" + "\n\n" + "Issued: " + strDate + "\n" + "Brandname: " + model.getValueAt(i, 1).toString() + "\n" + "Generic name: " + model.getValueAt(i, 2).toString() + "\n" + "Quantity: " + textField.getText() + "\n" + "Price: " + model.getValueAt(i, 4).toString() + "\n" + "Total amount: " + amount + "\n\n" + "☺☺-THANK FOR PURCHASING-☺☺");
            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
            }

//            JOptionPane.showMessageDialog(null, "☺☺☺--MEDAPP RECEIPT--☺☺☺" + "\n\n" + "Issued: " + strDate + "\n" + "Brandname: " + model.getValueAt(i, 1).toString() + "\n" + "Generic name: " + model.getValueAt(i, 2).toString() + "\n" + "Quantity: " + textField.getText() + "\n" + "Price: " + model.getValueAt(i, 4).toString() + "\n" + "Total amount: " + amount + "\n\n" + "☺☺-THANK FOR PURCHASING-☺☺");
        }
    }//GEN-LAST:event_add_cartActionPerformed

    private void allergy_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allergy_tableMouseClicked

    }//GEN-LAST:event_allergy_tableMouseClicked

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        CustomerDashboard c = new CustomerDashboard();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(Order_Allergy.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order_Allergy.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order_Allergy.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order_Allergy.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Order_Allergy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_cart;
    private javax.swing.JTable allergy_table;
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
