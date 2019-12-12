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
            JOptionPane.showMessageDialog(b, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return bodypain;

    }

    public boolean checkCough(String brandname, String genericname, String description, String price, String quantity) {
        CoughMed c = new CoughMed();
        boolean cough = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `cough` WHERE Brandname ='" + brandname + "'");

            if (rs.next()) {
                JOptionPane.showMessageDialog(c, "Medicine Name already existed!\nUpdate " + brandname, "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (genericname.length() > 0 && brandname.length() > 0 && description.length() > 0) {
                    try {
                        int amount = Integer.parseInt(price);
                        try {
                            int stock = Integer.parseInt(quantity);
                            cough = pm.addCough(brandname, genericname, description, price, quantity);
                            return cough;

                        } catch (HeadlessException | NumberFormatException e) {
                            JOptionPane.showMessageDialog(c, "Stock should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (HeadlessException | NumberFormatException e) {
                        JOptionPane.showMessageDialog(c, "Price should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(c, "Fill Up Everything", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(c, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return cough;

    }

    public boolean checkHeadache(String brandname, String genericname, String description, String price, String quantity) {
        HeadacheMed h = new HeadacheMed();
        boolean head = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `headache` WHERE Brandname ='" + brandname + "'");

            if (rs.next()) {
                JOptionPane.showMessageDialog(h, "Medicine Name already existed!\nUpdate " + brandname, "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (genericname.length() > 0 && brandname.length() > 0 && description.length() > 0) {
                    try {
                        int amount = Integer.parseInt(price);
                        try {
                            int stock = Integer.parseInt(quantity);
                            head = pm.addHeadache(brandname, genericname, description, price, quantity);
                            return head;

                        } catch (HeadlessException | NumberFormatException e) {
                            JOptionPane.showMessageDialog(h, "Stock should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (HeadlessException | NumberFormatException e) {
                        JOptionPane.showMessageDialog(h, "Price should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(h, "Fill Up Everything", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(h, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return head;

    }

//    Delete
    public boolean checkDelAllergy(String id) {
        AllergyMed a = new AllergyMed();
        boolean success = false;
        boolean exist = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `allergy` WHERE id ='" + id + "'");

            while (rs.next()) {
                try {
                    if (rs.getString("id").equals(id)) {
                        try {
                            exist = true;
                            return success = pm.delAllergy(id);
                        } catch (HeadlessException e) {
                            JOptionPane.showMessageDialog(a, "Error Removing", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(a, "ID should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (exist == false) {
                JOptionPane.showMessageDialog(a, "Medicine ID Number does not Exist", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(a, "Error connecting to database", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean checkDelCough(String id) {
        CoughMed c = new CoughMed();
        boolean success = false;
        boolean exist = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `cough` WHERE id ='" + id + "'");

            while (rs.next()) {
                try {
                    if (rs.getString("id").equals(id)) {
                        try {
                            exist = true;
                            return success = pm.delCough(id);
                        } catch (HeadlessException e) {
                            JOptionPane.showMessageDialog(c, "Error Removing", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(c, "ID should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (exist == false) {
                JOptionPane.showMessageDialog(c, "Medicine ID Number does not Exist", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(c, "Error connecting to database", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean checkDelHeadache(String id) {
        HeadacheMed h = new HeadacheMed();
        boolean success = false;
        boolean exist = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `headache` WHERE id ='" + id + "'");

            while (rs.next()) {
                try {
                    if (rs.getString("id").equals(id)) {
                        try {
                            exist = true;
                            return success = pm.delHeadache(id);
                        } catch (HeadlessException e) {
                            JOptionPane.showMessageDialog(h, "Error Removing", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(h, "ID should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (exist == false) {
                JOptionPane.showMessageDialog(h, "Medicine ID Number does not Exist", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(h, "Error connecting to database", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean checkDelBodypain(String id) {
       BodyPainMed b = new BodyPainMed();
        boolean success = false;
        boolean exist = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `bodypain` WHERE id ='" + id + "'");

            while (rs.next()) {
                try {
                    if (rs.getString("id").equals(id)) {
                        try {
                            exist = true;
                            return success = pm.delBodypain(id);
                        } catch (HeadlessException e) {
                            JOptionPane.showMessageDialog(b, "Error Removing", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(b, "ID should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (exist == false) {
                JOptionPane.showMessageDialog(b, "Medicine ID Number does not Exist", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(b, "Error connecting to database", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean checkUpAllergy(String id, String brandname, String genericname, String description, String price, String quantity) {
        AllergyMed a = new AllergyMed();
        boolean success = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `allergy` WHERE id ='" + id + "'");

            while (rs.next()) {
//                JOptionPane.showMessageDialog(a, "Medicine Name already existed!\nUpdate " + brandname, "Error", JOptionPane.ERROR_MESSAGE);

                if (genericname.length() > 0 && brandname.length() > 0 && description.length() > 0) {
                    try {
                        int amount = Integer.parseInt(price);
                        try {
                            int stock = Integer.parseInt(quantity);
                            success = pm.updateAllergy(id, brandname, genericname, description, price, quantity);
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

    public boolean checkUpCough(String id, String brandname, String genericname, String description, String price, String quantity) {
        CoughMed c = new CoughMed();
        boolean success = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `cough` WHERE id ='" + id + "'");

            while (rs.next()) {
//                JOptionPane.showMessageDialog(a, "Medicine Name already existed!\nUpdate " + brandname, "Error", JOptionPane.ERROR_MESSAGE);

                if (genericname.length() > 0 && brandname.length() > 0 && description.length() > 0) {
                    try {
                        int amount = Integer.parseInt(price);
                        try {
                            int stock = Integer.parseInt(quantity);
                            success = pm.updateCough(id, brandname, genericname, description, price, quantity);
                            return success;

                        } catch (HeadlessException | NumberFormatException e) {
                            JOptionPane.showMessageDialog(c, "Stock should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (HeadlessException | NumberFormatException e) {
                        JOptionPane.showMessageDialog(c, "Price should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(c, "Fill Up Everything", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(c, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;

    }

    public boolean checkUpBodypain(String id, String brandname, String genericname, String description, String price, String quantity) {
        BodyPainMed b = new BodyPainMed();
        boolean success = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `bodypain` WHERE id ='" + id + "'");

            while (rs.next()) {
//                JOptionPane.showMessageDialog(a, "Medicine Name already existed!\nUpdate " + brandname, "Error", JOptionPane.ERROR_MESSAGE);

                if (genericname.length() > 0 && brandname.length() > 0 && description.length() > 0) {
                    try {
                        int amount = Integer.parseInt(price);
                        try {
                            int stock = Integer.parseInt(quantity);
                            success = pm.updateBodypain(id, brandname, genericname, description, price, quantity);
                            return success;

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
            JOptionPane.showMessageDialog(b, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;

    }

    public boolean checkUpHeadache(String id, String brandname, String genericname, String description, String price, String quantity) {
        HeadacheMed h = new HeadacheMed();
        boolean success = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `headache` WHERE id ='" + id + "'");

            while (rs.next()) {
//                JOptionPane.showMessageDialog(a, "Medicine Name already existed!\nUpdate " + brandname, "Error", JOptionPane.ERROR_MESSAGE);

                if (genericname.length() > 0 && brandname.length() > 0 && description.length() > 0) {
                    try {
                        int amount = Integer.parseInt(price);
                        try {
                            int stock = Integer.parseInt(quantity);
                            success = pm.updateHeadache(id, brandname, genericname, description, price, quantity);
                            return success;

                        } catch (HeadlessException | NumberFormatException e) {
                            JOptionPane.showMessageDialog(h, "Stock should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (HeadlessException | NumberFormatException e) {
                        JOptionPane.showMessageDialog(h, "Price should be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(h, "Fill Up Everything", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(h, "Error connecting to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;

    }

    public boolean checkUp(String id, String brandname, String genericname, String description, String price, String quantity) {
        AllergyMed a = new AllergyMed();
        boolean success = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `allergy` WHERE id ='" + id + "'");

            while (rs.next()) {
//                JOptionPane.showMessageDialog(a, "Medicine Name already existed!\nUpdate " + brandname, "Error", JOptionPane.ERROR_MESSAGE);

                if (genericname.length() > 0 && brandname.length() > 0 && description.length() > 0) {
                    try {
                        int amount = Integer.parseInt(price);
                        try {
                            int stock = Integer.parseInt(quantity);
                            success = pm.updateAllergy(id, brandname, genericname, description, price, quantity);
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

}
