
package medapp;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//abstract class Login extends JFrame implements ActionListener {
//
//   JPanel panel;
//   JLabel user_label, password_label, message;
//   JTextField userName_text;
//   JPasswordField password_text;
//   JButton submit, cancel;
//
//   Login() {
//
//      // Username Label
//      user_label = new JLabel();
//      user_label.setText("User Name :");
//      userName_text = new JTextField();
//
//      // Password Label
//
//      password_label = new JLabel();
//      password_label.setText("Password :");
//      password_text = new JPasswordField();
//
//      // Submit
//
//      submit = new JButton("LOGIN");
//
//      panel = new JPanel(new GridLayout(3, 1));
//      panel.add(user_label);
//      panel.add(userName_text);
//      panel.add(password_label);
//      panel.add(password_text);
//
//      message = new JLabel();
//      panel.add(message);
//      panel.add(submit);
//
//      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//      // Adding the listeners to components..
//      submit.addActionListener(this);
//      add(panel, BorderLayout.CENTER);
//      setTitle("Please Login Here !");
//      setSize(450,350);
//      setVisible(true);
//   }
//}
//


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {

    JButton log = new JButton("Login");
    JPanel panel = new JPanel();
    JLabel user = new JLabel("Username: ");
    JLabel pass  = new JLabel("Password: ");
    JTextField userin = new JTextField();
    JPasswordField passwordin = new JPasswordField();

    Login() {
        super("Login Page");
        setBounds(500, 280, 500, 500);
        panel.setLayout(null);

        userin.setBounds(70, 40, 150, 20);
        user.setBounds(70,20,505,20);
        passwordin.setBounds(70, 80, 150, 20);
        pass.setBounds(70,60,500,20);
        log.setBounds(100, 100,80, 20);

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
                String uname = userin.getText();
                String paswd = passwordin.getText();
                if (uname.equals("pharmacist") && paswd.equals("12345")) {
                    Pharmacist regFace = new Pharmacist();
                    regFace.setVisible(true);
                    dispose();
                } else {

                    JOptionPane.showMessageDialog(null, "Wrong Password / Username");
                    userin.setText("");
                    passwordin.setText("");
                    userin.requestFocus();
                }

            }
        });
    }

}
