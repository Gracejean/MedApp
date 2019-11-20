package medapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import medapp.Allergy.AllergyAdd;
import medapp.BodyPain.BodyAdd;
import medapp.Cough.CoughAdd;
import medapp.Cough.Table;
import medapp.Headache.HeadAdd;

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

        btn_remove.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (true) {
                    Remove r = new Remove();
                    r.setVisible(true);
                    dispose();
                }
            }

        });

        btn_view.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (true) {
                    View v = new View();
                    v.setVisible(true);
                    dispose();
                }
            }

        });

    }

    public class Add extends JFrame implements ActionListener {

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
            select.setBounds(80, 300, 80, 30);
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

        public void actionPerformed(ActionEvent e) {
            if (cough.isSelected()) {
                Cough c = new Cough();
                Table t = c.new Table();
                t.setVisible(true);
                dispose();
            } else if (headache.isSelected()) {
                Headache h = new Headache();
                HeadAdd hadd = h.new HeadAdd();
                hadd.setVisible(true);
                dispose();
            } else if (bodypain.isSelected()) {
                BodyPain b = new BodyPain();
                BodyAdd badd = b.new BodyAdd();
                badd.setVisible(true);
                dispose();
            } else {
                Allergy a = new Allergy();
                AllergyAdd gadd = a.new AllergyAdd();
                gadd.setVisible(true);
                dispose();
            }
        }

    }

    public class Remove extends JFrame implements ActionListener {

        JPanel panel1 = new JPanel();
        JRadioButton cough = new JRadioButton("Cough");
        JRadioButton headache = new JRadioButton("Headache");
        JRadioButton bodypain = new JRadioButton("Body Pain");
        JRadioButton allergy = new JRadioButton("Allergy");
        JButton select = new JButton("Select");

        ButtonGroup bg = new ButtonGroup();

        Remove() {
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
            select.setBounds(80, 300, 80, 30);
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

        public void actionPerformed(ActionEvent e) {
            if (cough.isSelected()) {
                JOptionPane.showMessageDialog(this, "Ta");
            } else if (headache.isSelected()) {
                JOptionPane.showMessageDialog(this, "head");
            } else if (bodypain.isSelected()) {
                JOptionPane.showMessageDialog(this, "body");
            } else {
                JOptionPane.showMessageDialog(this, "allergy");
            }
        }
    }

    public class View extends JFrame implements ActionListener {

        JPanel panel1 = new JPanel();
        JRadioButton cough = new JRadioButton("Cough");
        JRadioButton headache = new JRadioButton("Headache");
        JRadioButton bodypain = new JRadioButton("Body Pain");
        JRadioButton allergy = new JRadioButton("Allergy");
        JButton select = new JButton("Select");

        ButtonGroup bg = new ButtonGroup();

        View() {
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
            select.setBounds(80, 300, 80, 30);
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

        public void actionPerformed(ActionEvent e) {
            if (cough.isSelected()) {   

                JOptionPane.showMessageDialog(this, "Ta");
            } else if (headache.isSelected()) {
                JOptionPane.showMessageDialog(this, "head");
            } else if (bodypain.isSelected()) {
                JOptionPane.showMessageDialog(this, "body");
            } else {
                JOptionPane.showMessageDialog(this, "allergy");
            }
        }
    }

}
