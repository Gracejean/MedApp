package View;

import Controller.PharmacistController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Model.Botica.CoughMedicine;
import Model.Botica;

public class CoughMed extends javax.swing.JFrame {

    static String id, brandname, genericname, description, price, quantity;

    public CoughMed() {
        initComponents();
        ShowCough();
        setLocationRelativeTo(null);
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

    public ArrayList<CoughMedicine> getCoughList() {
        ArrayList<CoughMedicine> allergyList = new ArrayList<>();
        Connection connection = getConnection();

        String query = "Select* From `cough`";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            CoughMedicine cough;

            while (rs.next()) {
                Botica b = new Botica();
                cough = b.new CoughMedicine(rs.getInt("Id"), rs.getString("Brandname"), rs.getString("Generic name"), rs.getString("Description"), rs.getInt("Price"), rs.getInt("Quantity in Stock"));
                allergyList.add(cough);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return allergyList;
    }

    public void ShowCough() {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        ArrayList<CoughMedicine> list = getCoughList();

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
        table.setModel(model);
    }

    public void executeQuery(String query, String Message) {
        Connection con = getConnection();
        Statement st;
        try {
            st = con.createStatement();
            if ((st.executeUpdate(query)) == 1) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);

                ShowCough();
                JOptionPane.showMessageDialog(null, "Data " + Message + " successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Not data " + Message);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        id_in = new javax.swing.JTextField();
        gen_in = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        des_in = new javax.swing.JTextField();
        price_in = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quan_in = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        brand_in = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        bnt_delete = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        id_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_inActionPerformed(evt);
            }
        });

        gen_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen_inActionPerformed(evt);
            }
        });

        jLabel1.setText("Brandname");

        jLabel2.setText("Generic name");

        jLabel3.setText("Description");

        des_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                des_inActionPerformed(evt);
            }
        });

        price_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_inActionPerformed(evt);
            }
        });

        jLabel4.setText("Price");

        jLabel5.setText("Quantity");

        quan_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quan_inActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "   ID", "  Brandname", "  Generic name", "   Description", "   Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMaxWidth(30);
            table.getColumnModel().getColumn(1).setMaxWidth(80);
            table.getColumnModel().getColumn(2).setMaxWidth(250);
            table.getColumnModel().getColumn(3).setMaxWidth(600);
            table.getColumnModel().getColumn(4).setMaxWidth(45);
            table.getColumnModel().getColumn(5).setMaxWidth(55);
        }

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        brand_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand_inActionPerformed(evt);
            }
        });

        jLabel6.setText("ID");

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        bnt_delete.setText("Delete");
        bnt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(gen_in, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(des_in, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(price_in, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(quan_in, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(id_in, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand_in, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_add)
                        .addGap(54, 54, 54)
                        .addComponent(btn_update)
                        .addGap(56, 56, 56)
                        .addComponent(bnt_delete)
                        .addGap(101, 101, 101))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_add)
                            .addComponent(btn_update)
                            .addComponent(bnt_delete))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(brand_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gen_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(des_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(price_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(quan_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_inActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_inActionPerformed

    private void gen_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen_inActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gen_inActionPerformed

    private void des_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_des_inActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_des_inActionPerformed

    private void price_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_inActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_inActionPerformed

    private void quan_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quan_inActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quan_inActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        brandname = brand_in.getText();
        genericname = gen_in.getText();
        description = des_in.getText();
        price = price_in.getText();
        quantity = quan_in.getText();

        PharmacistController pc = new PharmacistController();
        if (pc.checkCough(brandname, genericname, description, price, quantity) == true) {

            JOptionPane.showMessageDialog(rootPane, "Cough Medicine Added Successfully!");
            this.setVisible(false);
            new CoughMed().setVisible(true);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Cough Medicine Added Failed");
        }

    }//GEN-LAST:event_btn_addActionPerformed

    private void brand_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand_inActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand_inActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        id = id_in.getText();
        brandname = brand_in.getText();
        genericname = gen_in.getText();
        description = des_in.getText();
        price = price_in.getText();
        quantity = quan_in.getText();

        PharmacistController pc = new PharmacistController();
        if (pc.checkUpCough(id, brandname, genericname, description, price, quantity) == true) {

            JOptionPane.showMessageDialog(rootPane, "Allergy Medicine Updated Successfully!");
            this.setVisible(false);
            new CoughMed().setVisible(true);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Allergy Medicine Updated Failed");
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void bnt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_deleteActionPerformed
        id = id_in.getText();

        PharmacistController pc = new PharmacistController();

        if (pc.checkDelCough(id) == true) {
            JOptionPane.showMessageDialog(rootPane, "Medicine Deleted Successfully!");
            this.setVisible(false);
            new CoughMed().setVisible(true);
        }
    }//GEN-LAST:event_bnt_deleteActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int i = table.getSelectedRow();
        TableModel model = table.getModel();
        id_in.setText(model.getValueAt(i, 0).toString());
        brand_in.setText(model.getValueAt(i, 1).toString());
        gen_in.setText(model.getValueAt(i, 2).toString());
        des_in.setText(model.getValueAt(i, 3).toString());
        price_in.setText(model.getValueAt(i, 4).toString());
        quan_in.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(CoughMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoughMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoughMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoughMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoughMed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_delete;
    private javax.swing.JTextField brand_in;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_update;
    private javax.swing.JTextField des_in;
    private javax.swing.JTextField gen_in;
    private javax.swing.JTextField id_in;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField price_in;
    private javax.swing.JTextField quan_in;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
