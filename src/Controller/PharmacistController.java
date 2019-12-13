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
    String allergy = "allergy";
    String bodypain = "bodypain";
    String cough = "cough";
    String headache = "headache";

    public boolean checkMedicine(String brandname, String genericname, String description, String price, String quantity, String type) {

        boolean success = false;

        try {
            if (type.equals(allergy) == true) {

                success = pm.addMedicine(brandname, genericname, description, price, quantity, type);
                return success;
            } else if (type.equals(bodypain)) {
                success = pm.addMedicine(brandname, genericname, description, price, quantity, type);
                return success;
            } else if (type.equals(cough)) {
                success = pm.addMedicine(brandname, genericname, description, price, quantity, type);
                return success;
            } else if (type.equals(headache)) {
                success = pm.addMedicine(brandname, genericname, description, price, quantity, type);
                return success;
            } else {
                JOptionPane.showMessageDialog(null, "Database does not exist");
            }

        } catch (Exception e) {

        }
        return success;
    }
    
    public boolean checkDelMedicine(String id, String type){
        boolean success = false;
        
        try {
            if (type.equals(allergy) == true) {

                success = pm.delMedicine(id, type);
                return success;
            } else if (type.equals(bodypain)) {
                success = pm.delMedicine(id, type);
                return success;
            } else if (type.equals(cough)) {
                success = pm.delMedicine(id, type);
                return success;
            } else if (type.equals(headache)) {
                success = pm.delMedicine(id, type);
                return success;
            } else {
                JOptionPane.showMessageDialog(null, "Database does not exist");
            }

        } catch (Exception e) {

        }
        return success;
    }

//    public boolean checkAllergy(String brandname, String genericname, String description, String price, String quantity) {
//        AllergyMed a = new AllergyMed();
//        boolean success = false;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM `allergy` WHERE Brandname ='" + brandname + "'");
//
//            if (rs.next()) {
//                JOptionPane.showMessageDialog(a, "Medicine Name already existed!\nUpdate " + brandname, "Error", JOptionPane.ERROR_MESSAGE);
//            } else {
//                if (genericname.length() > 0 && brandname.length() > 0 && description.length() > 0) {
//                    try {
//                        int amount = Integer.parseInt(price);
//                        try {
//                            int stock = Integer.parseInt(quantity);
//                            success = pm.addAllergy(brandname, genericname, description, price, quantity);
//                            return success;
//
//                        } catch (HeadlessException | NumberFormatException e) {
//                            JOptionPane.showMessageDialog(a, "Stock should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
//                        }
//
//                    } catch (HeadlessException | NumberFormatException e) {
//                        JOptionPane.showMessageDialog(a, "Price should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
//                    }
//
//                } else {
//                    JOptionPane.showMessageDialog(a, "Fill Up Everything", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//        } catch (ClassNotFoundException | SQLException e) {
//            JOptionPane.showMessageDialog(a, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//        return success;
//    }
//

////    Delete
//    public boolean checkDelAllergy(String id) {
//        AllergyMed a = new AllergyMed();
//        boolean success = false;
//        boolean exist = false;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM `allergy` WHERE id ='" + id + "'");
//
//            while (rs.next()) {
//                try {
//                    if (rs.getString("id").equals(id)) {
//                        try {
//                            exist = true;
//                            return success = pm.delAllergy(id);
//                        } catch (HeadlessException e) {
//                            JOptionPane.showMessageDialog(a, "Error Removing", "Error", JOptionPane.ERROR_MESSAGE);
//                        }
//                    }
//                } catch (HeadlessException | NumberFormatException e) {
//                    JOptionPane.showMessageDialog(a, "ID should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//            if (exist == false) {
//                JOptionPane.showMessageDialog(a, "Medicine ID Number does not Exist", "Error", JOptionPane.ERROR_MESSAGE);
//            }
//        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
//            JOptionPane.showMessageDialog(a, "Error connecting to database", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//        return success;
//    }
//
    
    public boolean checkUpdateMedicine(String id, String brandname, String genericname, String description, String price, String quantity, String type){
        boolean success = false;
        
        try {
            if (type.equals(allergy) == true) {

                success = pm.updateMedicine(id, brandname, genericname, description, price, quantity, type);
                return success;
            } else if (type.equals(bodypain)) {
                success = pm.updateMedicine(id, brandname, genericname, description, price, quantity, type);
                return success;
            } else if (type.equals(cough)) {
                success = pm.updateMedicine(id, brandname, genericname, description, price, quantity, type);
                return success;
            } else if (type.equals(headache)) {
                success = pm.updateMedicine(id, brandname, genericname, description, price, quantity, type);
                return success;
            } else {
                JOptionPane.showMessageDialog(null, "Database does not exist");
            }

        } catch (Exception e) {

        }
        return success;
    }

//    public boolean checkUpAllergy(String id, String brandname, String genericname, String description, String price, String quantity) {
//        AllergyMed a = new AllergyMed();
//        boolean success = false;
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM `allergy` WHERE id ='" + id + "'");
//
//            while (rs.next()) {
////                JOptionPane.showMessageDialog(a, "Medicine Name already existed!\nUpdate " + brandname, "Error", JOptionPane.ERROR_MESSAGE);
//
//                if (genericname.length() > 0 && brandname.length() > 0 && description.length() > 0) {
//                    try {
//                        int amount = Integer.parseInt(price);
//                        try {
//                            int stock = Integer.parseInt(quantity);
//                            success = pm.updateAllergy(id, brandname, genericname, description, price, quantity);
//                            return success;
//
//                        } catch (HeadlessException | NumberFormatException e) {
//                            JOptionPane.showMessageDialog(a, "Stock should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
//                        }
//
//                    } catch (HeadlessException | NumberFormatException e) {
//                        JOptionPane.showMessageDialog(a, "Price should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
//                    }
//
//                } else {
//                    JOptionPane.showMessageDialog(a, "Fill Up Everything", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//        } catch (ClassNotFoundException | SQLException e) {
//            JOptionPane.showMessageDialog(a, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//        return success;
//
//    }
//

}
