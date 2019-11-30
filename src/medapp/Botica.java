package medapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Botica extends JFrame {

    JLabel label = new JLabel("--☺☺ M E D A P P ☺☺--");
    JButton button1 = new JButton("GET STARTED");
    JPanel panelShad = new JPanel();
//    JButton button2 = new JButton("CUSTOMER");

    JPanel panel = new JPanel();

    Botica() {
        super("MEDAPP");

        panel.setLayout(null);
        setBounds(200, 200, 400, 400);


//        panel.add(label);
        panel.add(button1);
        panel.add(panelShad);
        panelShad.add(label);
//        panel.add(button2);

//        label.setSize(600, 500);
        panelShad.setBackground(Color.white);
        panelShad.setBounds(0,35, 385,50);
        label.setBounds(10, 40, 100, 20);
        label.setVisible(true);
        label.setSize(150, 50);
        button1.setBounds(500, 300, 100, 50);
        button1.setVisible(true);
        button1.setSize(150, 50);
//        button2.setLocation(500, 400);
//        button2.setVisible(true);
//        button2.setSize(150, 50);

        panel.setBackground(new Color(255,204,255));
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                if (true) {
                    State l = new State();
//                    Login l = new Login();
                    l.setVisible(true);
                    dispose();
                }
            }

        });

//        button2.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent e) {
//                if (true) {
//                    Choice c = new Choice();
//                    c.setVisible(true);
//                    dispose();
//                }
//            }
//
//        });

    }

    public class Choice extends JFrame implements ActionListener {

        JPanel panel = new JPanel();
        JButton yes = new JButton("Yes");
        JButton no = new JButton("No");
        JLabel label = new JLabel("Do you have an account?");

        Choice() {
            super("Option Page");
            setBounds(500, 280, 500, 500);
            panel.setLayout(null);

            yes.setVisible(true);
            yes.setBounds(70, 100, 80, 50);

            no.setVisible(true);
            no.setBounds(70, 180, 80, 50);

            label.setVisible(true);
            label.setBounds(50, 40, 300, 50);

            panel.add(yes);
            panel.add(no);
            panel.add(label);

            getContentPane().add(panel);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            action();
            action1();


        }
        public void action(){
        yes.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae) {
                    if(true){
//                        Login l = new Login();
//                        l.setVisible(true);
//                        dispose();
                    }
                }
                
            });
        }
        
        public void action1(){
            no.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    if(true){
                        Register r = new Register();
                        r.setVisible(true);
                        dispose();
                    }
                }
            });
        }

        public void actionPerformed(ActionEvent ae) {
            
        }

    }

}
