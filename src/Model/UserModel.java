
package Model;

import View.Signin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import View.Signup;
import java.awt.HeadlessException;
import java.sql.ResultSet;


public class UserModel {
    public boolean signupUser(String username, String password, int age) {
        Signup s = new Signup();
        boolean registered = false;
        try {
            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            stmt = con.createStatement();
            String sql = "INSERT INTO `customers`(`username`,  `password`, `age`) VALUES ('" + username + "','" + password + "'," + age + ")";
            stmt.executeUpdate(sql);
            con.close();
            registered= true;
            System.out.println("Successful");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(s, "Cannot connect to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return registered;
    }
    
    public int signin(String username, String password) {
        Signin signin = new Signin();
        int success = 400;
        boolean log = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            java.sql.Statement stmt = con.createStatement();
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM `pharmacists` where username = '" + username + "' and password = '" + password + "'");

            if (rs1.next()) {
                log = true;
                return success = 500;
            } else {
                ResultSet rs = stmt.executeQuery("SELECT * FROM `customers` where username = '" + username + "'");
                if (rs.next()) {
                    if (rs.getString("password").equals(password)) {
                        log = true;
                        return success = 600;
                    }
                }
            }
            if (log == false) {
                return success;
            }
            con.close();
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(signin, "Error while connecting!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }


}
