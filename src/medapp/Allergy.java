/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medapp;

import java.awt.GridLayout;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;
import java.util.Date;

/**
 *
 * @author mendozaje_sd2022
 */
public class Allergy extends javax.swing.JFrame {
    
    int quan;
    int price;
    int amount;
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();

    /**
     * Creates new form Cough
     */
    public Allergy() {
        initComponents();
        ShowAllergy();
    }

    public Connection getConnection() {
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Botica.AllergyMedicine> getAllergyList() {
        ArrayList<Botica.AllergyMedicine> allergyList = new ArrayList<>();
        Connection connection = getConnection();

        String query = "Select* From `allergy`";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Botica.AllergyMedicine allergy;

            while (rs.next()) {
                Botica b = new Botica();
                allergy = b.new AllergyMedicine(rs.getInt("Id"), rs.getString("Brandname"), rs.getString("Generic name"), rs.getString("Description"), rs.getInt("Price"), rs.getInt("Quantity in Stock"));
                allergyList.add(allergy);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return allergyList;
    }

    public void ShowAllergy() {

        DefaultTableModel model = (DefaultTableModel) allergy_table.getModel();
        ArrayList<Botica.AllergyMedicine> list = getAllergyList();

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
                        .addGap(210, 210, 210)
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
                        .addComponent(add_cart)))
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
            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
            }
            

            JOptionPane.showMessageDialog(null, "☺☺☺--MEDAPP RECEIPT--☺☺☺" + "\n\n" + "Issued: " + strDate + "\n" + "Brandname: " + model.getValueAt(i, 1).toString() + "\n" + "Generic name: " + model.getValueAt(i, 2).toString() + "\n" + "Quantity: " + textField.getText() + "\n" + "Price: " + model.getValueAt(i, 4).toString() + "\n" + "Total amount: " + amount + "\n\n" + "☺☺-THANK FOR PURCHASING-☺☺");
        }
    }//GEN-LAST:event_add_cartActionPerformed

    private void allergy_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allergy_tableMouseClicked

    }//GEN-LAST:event_allergy_tableMouseClicked

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
            java.util.logging.Logger.getLogger(Allergy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Allergy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Allergy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Allergy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Allergy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_cart;
    private javax.swing.JTable allergy_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
