package medapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pharmacist extends JFrame {

    JLabel welcome = new JLabel("Welcome to MEDAPP");
    JPanel panel = new JPanel();
    JButton btn_add = new JButton("Add");
    JButton btn_remove = new JButton("Remove");
    JButton btn_view = new JButton("View");

    Pharmacist() {
        super("MEDAPP");
        setSize(300, 200);
        setLocation(500, 280);
        panel.setLayout(null);

        welcome.setBounds(70, 50, 150, 60);

        btn_add.setVisible(true);
        btn_add.setBounds(70, 100, 80, 30);

        btn_remove.setVisible(true);
        btn_remove.setBounds(70, 150, 80, 30);

        btn_view.setVisible(true);
        btn_view.setBounds(70, 200, 80, 30);

        panel.add(welcome);
        panel.add(btn_add);
        panel.add(btn_remove);
        panel.add(btn_view);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        btn_add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (true) {
                    Add a = new Add();
                    a.setVisible(true);
                    dispose();
                   
                }
            }
            
        });
        
    }

    public class Add extends JFrame implements ActionListener{

        JPanel panel1 = new JPanel();
        JRadioButton cough = new JRadioButton("Cough");
        JRadioButton headache = new JRadioButton("Headache");
        JRadioButton bodypain = new JRadioButton("Body Pain");
        JRadioButton allergy = new JRadioButton("Allergy");
        JButton select = new JButton("Select");

        ButtonGroup bg = new ButtonGroup();

        Add() {
            super("MEDAPP");
            setSize(300, 200);
            setLocation(500, 280);
            panel1.setLayout(null);

            cough.setBounds(70, 100, 100, 30);
            cough.setVisible(true);
            headache.setBounds(70, 150, 100, 30);
            headache.setVisible(true);
            bodypain.setBounds(70, 200, 100, 30);
            bodypain.setVisible(true);
            allergy.setBounds(70, 250, 100, 30);
            allergy.setVisible(true);
            select.setBounds(80,300,80,30);
            select.setVisible(true);
            
            select.addActionListener(this);
            add(cough);
            add(headache);
            add(bodypain);
            add(allergy);

            panel1.setSize(300, 300);

            bg.add(cough);
            bg.add(headache);
            bg.add(bodypain);
            bg.add(allergy);

            panel1.add(cough);
            panel1.add(headache);
            panel1.add(bodypain);
            panel1.add(allergy);
            panel1.add(select);

            getContentPane().add(panel1);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            
        }    
        public void actionPerformed(ActionEvent e){
                if(cough.isSelected()){
                    JOptionPane.showMessageDialog(this, "Ta");
                }
            }

        

    }

}
