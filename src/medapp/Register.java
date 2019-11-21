package medapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    JPasswordField cpassword = new JPasswordField();

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
        cpassword.setBounds(70, 160, 150, 20);
        reg.setBounds(100, 200, 100, 20);

        panel.add(user);
        panel.add(pass);
        panel.add(useage);
        panel.add(age);
        panel.add(cpass);
        panel.add(cpassword);
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
                String uname = userin.getText();
                String uage = useage.getText();
                String paswd = String.valueOf(passwordin.getPassword());
                String cpaswd = String.valueOf(cpassword.getPassword());
                
                PreparedStatement st;
                String query = "INSERT INTO 'the_app_users'('u_uname', 'u_uage', 'u_paswd', 'u_cpaswd') VALUES (?,?,?,?) ";
                
                try{
                    st = MyConnection..prepareStatement(query);
                }catch(SQLException ex){
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if (uname == null && uage == null && paswd == null && cpaswd == null) {
                    JOptionPane.showMessageDialog(null, "Please complete!!");
                    cpassword.setText("");
                    passwordin.setText("");
                    useage.setText("");
                    userin.setText("");
                    userin.requestFocus();
                } else {
                    if (uname != null && uage != null && paswd != null && cpaswd != null) {

                        if (passwordin.getText().equals(cpassword.getText())) {
                            Pharmacist regFace = new Pharmacist();
                            regFace.setVisible(true);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Mismatched password!!!");
                            cpassword.setText("");
                            passwordin.setText("");
                            passwordin.requestFocus();
                        }
                    }

                }
            }
        });
    }

}
