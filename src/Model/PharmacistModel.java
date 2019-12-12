package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import View.*;

public class PharmacistModel {

    public boolean addAllergy(String brandname, String genericname, String description, String price, String quantity) {
        AllergyMed a = new AllergyMed();
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO `allergy`( `Brandname`, `Generic name`, `Description`, `Price`, `Quantity in Stock`) VALUES ('" + brandname + "','" + genericname + "','" + description + "','" + price + "'," + quantity + ")";
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(a, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean addBodypain(String brandname, String genericname, String description, String price, String quantity) {
        BodyPainMed b = new BodyPainMed();
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO `bodypain`( `Brandname`, `Generic name`, `Description`, `Price`, `Quantity in Stock`) VALUES ('" + brandname + "','" + genericname + "','" + description + "','" + price + "'," + quantity + ")";
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(b, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

}
