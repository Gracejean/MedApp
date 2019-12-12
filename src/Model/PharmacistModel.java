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

    public boolean addCough(String brandname, String genericname, String description, String price, String quantity) {
        BodyPainMed b = new BodyPainMed();
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO `cough`( `Brandname`, `Generic name`, `Description`, `Price`, `Quantity in Stock`) VALUES ('" + brandname + "','" + genericname + "','" + description + "','" + price + "'," + quantity + ")";
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(b, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean addHeadache(String brandname, String genericname, String description, String price, String quantity) {
        BodyPainMed b = new BodyPainMed();
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO `headache`( `Brandname`, `Generic name`, `Description`, `Price`, `Quantity in Stock`) VALUES ('" + brandname + "','" + genericname + "','" + description + "','" + price + "'," + quantity + ")";
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(b, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

//      Delete
    public boolean delAllergy(String id) {
        AllergyMed a = new AllergyMed();
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            String sql = "DELETE FROM `allergy` WHERE `id` = '" + id + "'";
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(a, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean delCough(String id) {
        CoughMed c = new CoughMed();
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            String sql = "DELETE FROM `cough` WHERE `id` = '" + id + "'";
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(c, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean delHeadache(String id) {
        HeadacheMed h = new HeadacheMed();
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            String sql = "DELETE FROM `headache` WHERE `id` = '" + id + "'";
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(h, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean delBodypain(String id) {
        BodyPainMed a = new BodyPainMed();
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            String sql = "DELETE FROM `bodypain` WHERE `id` = '" + id + "'";
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(a, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

//    Updated
    public boolean updateAllergy(String id, String brandname, String genericname, String description, String price, String quantity) {
        AllergyMed a = new AllergyMed();
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            String sql = "UPDATE `allergy` SET `Brandname`= '" + brandname + "',`Generic name`='" + genericname + "',`Description`='" + description + "',`Price`= '" + price + "',`Quantity in Stock`= '" + quantity + "' WHERE `id` = " + id;
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(a, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean updateCough(String id, String brandname, String genericname, String description, String price, String quantity) {
        CoughMed c = new CoughMed();
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            String sql = "UPDATE `cough` SET `Brandname`= '" + brandname + "',`Generic name`='" + genericname + "',`Description`='" + description + "',`Price`= '" + price + "',`Quantity in Stock`= '" + quantity + "' WHERE `id` = " + id;
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(c, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean updateHeadache(String id, String brandname, String genericname, String description, String price, String quantity) {
        HeadacheMed h = new HeadacheMed();
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            String sql = "UPDATE `headache` SET `Brandname`= '" + brandname + "',`Generic name`='" + genericname + "',`Description`='" + description + "',`Price`= '" + price + "',`Quantity in Stock`= '" + quantity + "' WHERE `id` = " + id;
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(h, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean updateBodypain(String id, String brandname, String genericname, String description, String price, String quantity) {
        BodyPainMed a = new BodyPainMed();
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            String sql = "UPDATE `bodypain` SET `Brandname`= '" + brandname + "',`Generic name`='" + genericname + "',`Description`='" + description + "',`Price`= '" + price + "',`Quantity in Stock`= '" + quantity + "' WHERE `id` = " + id;
            stmt.executeUpdate(sql);
            success = true;
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(a, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }
}
