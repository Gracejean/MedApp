package medapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Allergy extends JFrame {


    public class AllergyAdd extends JFrame {

        JButton add = new JButton("Add");
        JButton view = new JButton("View");
        JButton rev = new JButton("Remove");
        JPanel panel = new JPanel();
        JLabel brand = new JLabel("Brandname: ");
        JLabel gen = new JLabel("Generic name: ");
        JLabel des = new JLabel("Description: ");
        JLabel price = new JLabel("Price: ");
        JLabel quan = new JLabel("Quantity: ");
        JTextField brand_in = new JTextField();
        JTextField gen_in = new JTextField();
        JTextField price_in = new JTextField();
        JTextField quan_in = new JTextField();
        JTextField des_in = new JTextField();

        AllergyAdd() {
            super("Allergy Medicine");
            setBounds(500, 280, 600, 500);
            panel.setLayout(null);

            brand.setBounds(70, 20, 505, 20);
            brand_in.setBounds(70, 40, 150, 20);
            gen.setBounds(70, 60, 505, 20);
            gen_in.setBounds(70, 80, 150, 20);
            des.setBounds(70, 80, 505, 20);
            des_in.setBounds(70, 90, 150, 20);
            price.setBounds(70, 100, 505, 20);
            price_in.setBounds(70, 120, 150, 20);
            des.setBounds(70, 140, 505, 20);
            des_in.setBounds(70, 160, 150, 20);
            add.setBounds(90, 200, 100, 30);

            panel.add(brand);
            panel.add(gen);
            panel.add(des);
            panel.add(price);
            panel.add(quan);
            panel.add(brand_in);
            panel.add(gen_in);
            panel.add(des_in);
            panel.add(price_in);
            panel.add(quan_in);
            panel.add(add);

            getContentPane().add(panel);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
    }
    
    public class AllergyRem extends JFrame {

        JButton add = new JButton("Add");
        JButton view = new JButton("View");
        JButton rev = new JButton("Remove");
        JPanel panel = new JPanel();
        JLabel brand = new JLabel("Brandname: ");
        JLabel gen = new JLabel("Generic name: ");
        JLabel des = new JLabel("Description: ");
        JLabel price = new JLabel("Price: ");
        JLabel quan = new JLabel("Quantity: ");
        JTextField brand_in = new JTextField();
        JTextField gen_in = new JTextField();
        JTextField price_in = new JTextField();
        JTextField quan_in = new JTextField();
        JTextField des_in = new JTextField();

        AllergyRem() {
            super("Cough Medicine");
            setBounds(500, 280, 600, 500);
            panel.setLayout(null);

            brand.setBounds(70, 20, 505, 20);
            brand_in.setBounds(70, 40, 150, 20);
            gen.setBounds(70, 60, 505, 20);
            gen_in.setBounds(70, 80, 150, 20);
            des.setBounds(70, 80, 505, 20);
            des_in.setBounds(70, 90, 150, 20);
            price.setBounds(70, 100, 505, 20);
            price_in.setBounds(70, 120, 150, 20);
            des.setBounds(70, 140, 505, 20);
            des_in.setBounds(70, 160, 150, 20);
            add.setBounds(90, 200, 100, 30);

            panel.add(brand);
            panel.add(gen);
            panel.add(des);
            panel.add(price);
            panel.add(quan);
            panel.add(brand_in);
            panel.add(gen_in);
            panel.add(des_in);
            panel.add(price_in);
            panel.add(quan_in);
            panel.add(add);

            getContentPane().add(panel);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
    }


}
