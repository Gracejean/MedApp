package Controller;

import Model.UserModel;
import View.*;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UserController {

    UserModel u = new UserModel();
    State state = new State();

    public boolean validateUser(String username, String password, String age, String cpassword) {
        Signup s = new Signup();
        boolean registered = false;

        if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "input username");
        } else if (age.equals("")) {
            JOptionPane.showMessageDialog(null, "input age");
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "input password");
        } else if (!password.equals(cpassword)) {
            JOptionPane.showMessageDialog(null, "mismatched password");
        } else {
//            
//           if(state.pharmacist() == true){
//               
//           }
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM `customers` WHERE username='" + username + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(s, "Username exist!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        int userage = Integer.parseInt(age);
                        if (userage >= 18 && userage <= 130) {
                            registered = u.signupUser(username, password, userage);
                            return registered;
                        } else {
                            JOptionPane.showMessageDialog(s, "Minor is not to purchase", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(s, "Age should be number!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
            }

        }
        return registered;
    }
    
    public int validateSignin(String username, String password) {
        int success = 400;
        return u.signin(username, password);
    }

}
