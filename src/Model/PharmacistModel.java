package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class PharmacistModel {

    public boolean addMedicine(String brandname, String genericname, String description, String price, String quantity, String type) {
        boolean success = false;
        boolean exist = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO `" + type + "`( `Brandname`, `Generic name`, `Description`, `Price`, `Quantity in Stock`) VALUES ('" + brandname + "','" + genericname + "','" + description + "','" + price + "'," + quantity + ")";
            System.out.println(type);
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }
    
    public boolean delMedicine(String id, String type) {
        boolean success = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            String sql = "DELETE FROM `" + type + "` WHERE `id` = '" + id + "'";
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean updateMedicine(String id, String brandname, String genericname, String description, String price, String quantity, String type){
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            String sql = "UPDATE `" + type + "` SET `Brandname`= '" + brandname + "',`Generic name`='" + genericname + "',`Description`='" + description + "',`Price`= '" + price + "',`Quantity in Stock`= '" + quantity + "' WHERE `id` = " + id;
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

}
