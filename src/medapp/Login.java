package medapp;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Login extends JFrame {

    JButton log = new JButton("Login");
    JPanel panel = new JPanel();
    JLabel user = new JLabel("Username: ");
    JLabel pass = new JLabel("Password: ");
    JTextField userin = new JTextField();
    JPasswordField passwordin = new JPasswordField();

    Login() {
        super("Login Page");
        setBounds(500, 280, 500, 500);
        panel.setLayout(null);

        userin.setBounds(70, 40, 150, 20);
        user.setBounds(70, 20, 505, 20);
        passwordin.setBounds(70, 80, 150, 20);
        pass.setBounds(70, 60, 500, 20);
        log.setBounds(100, 100, 80, 20);

        panel.add(user);
        panel.add(pass);
        panel.add(userin);
        panel.add(passwordin);
        panel.add(log);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        actionlogin();
    }

    public void actionlogin() {
        log.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                ResultSet rs;
                PreparedStatement ps;
                String username = userin.getText();
                String password = String.valueOf(passwordin.getPassword());

                try {
                    //                if(username.length()>0 && password.length() >0 ){

                    try {
                        //                if(username.length()>0 && password.length() >0 ){
//
                        Connection con = null;

                        con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");

                        String query = "Select * from adminlogin Where username='" + username + "' and password='" + password + "'";
                        ps = con.prepareStatement(query);

                        rs = ps.executeQuery();

                        if (rs.next()) {

//                    home hme = new home();
//                    this.setVisible(false);
//                    hme.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "username and password are wrong ");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

                    }

//                else
                    {
//      JOptionPane.showMessageDialog(null, "please field username and password ");
//            }

//                String query = "SELECT  `username`, `password`,  FROM `register` WHERE `username ` = ? AND `password` = ?";
//            PreparedStatement ps;
//            Connection con;
//                String myDriver = "org.gjt.mm.mysql.Driver";
//                    String myUrl = "jdbc:mysql://localhost/medapp";
//                try {
                        String myDriver = "org.gjt.mm.mysql.Driver";
//                    String myUrl = "jdbc:mysql://localhost/medapp";
//                Class.forName(myDriver);

//                con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
//                    query = "INSERT INTO register( `username`, `age`, `password`, `cpassword`)" + "VALUES (?,?,?,?)";
//                ps = con.prepareStatement("SELECT  `username`, `password`,  FROM `register` WHERE `username ` = ? AND `password` = ?");
//                ps.setString(1, username);
//                ps.setString(2, password);
//                    ps.executeQuery();
//                    ps =   MyConnection.getConnection().prepareStatement(query);
//                    ps.setString(1, username);
//                    ps.setString(2, password);
//                    con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
//                    Class.forName(myDriver);
//                rs = ps.executeQuery();
//                if (rs.next()) {
//                    JOptionPane.showMessageDialog(null, "Yes");
//                } else {
//                    JOptionPane.showMessageDialog(null, "No");
//                }
//                } catch (ClassNotFoundException ex) {
//                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (ClassNotFoundException ex) {
//                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    //                try {
                    //                    //                if(username.length()>0 && password.length() >0 ){
                    ////
                                    Connection con =null;
                    //
                    //                     con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
                    //
                    //                    String query = "Select * from adminlogin Where username='" + username + "' and password='" + password + "'";
                    //                    ps = con.prepareStatement(query);
                    //
                    //                    rs = ps.executeQuery();
                    con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");

                    String query = "Select * from adminlogin Where username='" + username + "' and password='" + password + "'";
                    ps = con.prepareStatement(query);

                    rs = ps.executeQuery();

                    if (rs.next()) {

//                    home hme = new home();
//                    this.setVisible(false);
//                    hme.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "username and password are wrong ");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

                }

//                else
                {
//      JOptionPane.showMessageDialog(null, "please field username and password ");
//            }

//                String query = "SELECT  `username`, `password`,  FROM `register` WHERE `username ` = ? AND `password` = ?";
//            PreparedStatement ps;
//            Connection con;
//                String myDriver = "org.gjt.mm.mysql.Driver";
//                    String myUrl = "jdbc:mysql://localhost/medapp";
//                try {
                    String myDriver = "org.gjt.mm.mysql.Driver";
//                    String myUrl = "jdbc:mysql://localhost/medapp";
//                Class.forName(myDriver);

//                con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
//                    query = "INSERT INTO register( `username`, `age`, `password`, `cpassword`)" + "VALUES (?,?,?,?)";
//                ps = con.prepareStatement("SELECT  `username`, `password`,  FROM `register` WHERE `username ` = ? AND `password` = ?");
//                ps.setString(1, username);
//                ps.setString(2, password);
//                    ps.executeQuery();
//                    ps =   MyConnection.getConnection().prepareStatement(query);
//                    ps.setString(1, username);
//                    ps.setString(2, password);
//                    con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
//                    Class.forName(myDriver);
//                rs = ps.executeQuery();
//                if (rs.next()) {
//                    JOptionPane.showMessageDialog(null, "Yes");
//                } else {
//                    JOptionPane.showMessageDialog(null, "No");
//                }
//                } catch (ClassNotFoundException ex) {
//                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (ClassNotFoundException ex) {
//                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                //            catch (SQLException e
                        //                ) {
                        //                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
                        //            }
                        //                if (uname.equals("pharmacist") && paswd.equals("12345")) {
                        //                    Pharmacist regFace = new Pharmacist();
                        //                    regFace.setVisible(true);
                        //                    dispose();
                        //                } else {
                        //                    JOptionPane.showMessageDialog(null, "Wrong Password / Username");
                        //                    userin.setText("");
                        //                    passwordin.setText("");/
                        //                    userin.requestFocus();
                        //                }
            }
        }
        );

    }

}
