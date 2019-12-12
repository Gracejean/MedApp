package Model;

import View.Cart;
import View.Signin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import View.Signup;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.util.ArrayList;
//import Model.Order;

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
            registered = true;
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

    public ArrayList<Botica.AllergyMedicine> getAllergyList() {
        ArrayList<Botica.AllergyMedicine> allergyList = new ArrayList<>();

        String query = "Select* From `allergy`";
        Statement st;
        ResultSet rs;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            st = con.createStatement();
            rs = st.executeQuery(query);
            Botica.AllergyMedicine allergy;

            while (rs.next()) {
                Botica b = new Botica();
                allergy = b.new AllergyMedicine(rs.getInt("Id"), rs.getString("Brandname"), rs.getString("Generic name"), rs.getString("Description"), rs.getInt("Price"), rs.getInt("Quantity in Stock"));
                allergyList.add(allergy);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return allergyList;
    }

    public ArrayList<Order> getOrder() {
        ArrayList<Order> orderList = new ArrayList<>();

        String query = "Select From 'purchase'";
        Statement st;
        ResultSet rs;

        try {
            Class.forName("com.msql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            st = con.createStatement();
            rs = st.executeQuery(query);
            Order order;

            while (rs.next()) {
                order = new Order(rs.getInt("id"), rs.getString("type"), rs.getString("brandname"), rs.getInt("price"), rs.getInt("quantity"), rs.getInt("total"));
                orderList.add(order);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderList;
    }

    public boolean purchase(int id, String type, String brandname, int price, int quantity, int total) {
        Cart c = new Cart();
        boolean cart = false;
        try {
            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medapp", "root", "");
            stmt = con.createStatement();
            String sql = "INSERT INTO `purchase`(`type`, `brandname`, `price`, `quantity`, `total`) VALUES ('" + type + "','" + brandname + "'," + price + ")";
            stmt.executeUpdate(sql);
            con.close();
            registered = true;
            System.out.println("Successful");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(s, "Cannot connect to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return registered;
    }

}
