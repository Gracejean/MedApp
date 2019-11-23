package medapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends JFrame {

    JButton reg = new JButton("Register");
    JPanel panel = new JPanel();
    JLabel user = new JLabel("Username: ");
    JLabel age = new JLabel("Age: ");
    JLabel pass = new JLabel("Password: ");
    JLabel cpass = new JLabel("Confirm Password: ");
    JTextField userin = new JTextField();
    JTextField useage = new JTextField();
    JPasswordField passwordin = new JPasswordField();
    JPasswordField cpasswordin = new JPasswordField();

    Register() {
        super("Register Page");
        setBounds(500, 280, 500, 500);
        panel.setLayout(null);

        user.setBounds(70, 20, 505, 20);
        userin.setBounds(70, 40, 150, 20);
        age.setBounds(70, 60, 505, 20);
        useage.setBounds(70, 80, 150, 20);
        pass.setBounds(70, 100, 505, 20);
        passwordin.setBounds(70, 120, 150, 20);
        cpass.setBounds(70, 140, 505, 20);
        cpasswordin.setBounds(70, 160, 150, 20);
        reg.setBounds(100, 200, 100, 20);

        panel.add(user);
        panel.add(pass);
        panel.add(useage);
        panel.add(age);
        panel.add(cpass);
        panel.add(cpasswordin);
        panel.add(userin);
        panel.add(passwordin);
        panel.add(reg);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        actionlogin();
    }

    public void actionlogin() {
        reg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                Connection con = null;
                String query;
                String username = userin.getText();
                String age = useage.getText();
                String password = String.valueOf(passwordin.getPassword());
                String cpassword = String.valueOf(cpasswordin.getPassword());
                
                if (username.equals("")){
                    JOptionPane.showMessageDialog(null, "input username");
                }else if (age.equals("")){
                    JOptionPane.showMessageDialog(null, "input age");
                }else if (password.equals("")){
                    JOptionPane.showMessageDialog(null, "input password");
                }else if (!password.equals(cpassword)){
                    JOptionPane.showMessageDialog(null, "mismatched password");
                }

                try {
                    String myDriver = "org.gjt.mm.mysql.Driver";
                    String myUrl = "jdbc:mysql://localhost/medapp";
                    Class.forName(myDriver);

                    con = DriverManager.getConnection(myUrl, "root", "");

                    query = "INSERT INTO register( `username`, `age`, `password`, `cpassword`)" + "VALUES (?,?,?,?)";
                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    preparedStmt.setString(1, username);
                    preparedStmt.setString(2, age);
                    preparedStmt.setString(3, password);
                    preparedStmt.setString(4, cpassword);

                    preparedStmt.execute();

                    con.close();
                } catch (Exception e) {
                    System.err.println("Got an exception!");
                    System.err.println(e.getMessage());
                }
//                Login login = new Login();
//                login.setVisible(true);
//                dispose();
//                JOptionPane.showMessageDialog(null, "Successfully Registered!!!");

            }

        });
    }

}
