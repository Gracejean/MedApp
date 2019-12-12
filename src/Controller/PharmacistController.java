package Controller;

//import Model.PharmacistModel;
import Model.PharmacistModel;
import View.*;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class PharmacistController {

    PharmacistModel pm = new PharmacistModel();

    public boolean checkAllergy(String brandname, String genericname, String description, String price, String quantity) {
        AllergyMed a = new AllergyMed();
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `allergy` WHERE Brandname ='" + brandname + "'");

            if (rs.next()) {
                JOptionPane.showMessageDialog(a, "Medicine Name already existed!\nUpdate " + brandname, "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (genericname.length() > 0 && brandname.length() > 0 && description.length() > 0) {
                    try {
                        int amount = Integer.parseInt(price);
                        try {
                            int stock = Integer.parseInt(quantity);
                            success = pm.addAllergy(brandname, genericname, description, price, quantity);
                            return success;

                        } catch (HeadlessException | NumberFormatException e) {
                            JOptionPane.showMessageDialog(a, "Stock should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (HeadlessException | NumberFormatException e) {
                        JOptionPane.showMessageDialog(a, "Price should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(a, "Fill Up Everything", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(a, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean checkBodypain(String brandname, String genericname, String description, String price, String quantity) {
        BodyPainMed b = new BodyPainMed();
        boolean bodypain = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `bodypain` WHERE Brandname ='" + brandname + "'");

            if (rs.next()) {
                JOptionPane.showMessageDialog(b, "Medicine Name already existed!\nUpdate " + brandname, "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (genericname.length() > 0 && brandname.length() > 0 && description.length() > 0) {
                    try {
                        int amount = Integer.parseInt(price);
                        try {
                            int stock = Integer.parseInt(quantity);
                            bodypain = pm.addBodypain(brandname, genericname, description, price, quantity);
                            return bodypain;

                        } catch (HeadlessException | NumberFormatException e) {
                            JOptionPane.showMessageDialog(b, "Stock should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (HeadlessException | NumberFormatException e) {
                        JOptionPane.showMessageDialog(b, "Price should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(b, "Fill Up Everything", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
//            JOptionPane.showMessageDialog(b, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return bodypain;

    }
}
