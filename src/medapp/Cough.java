package medapp;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Cough extends JFrame {

    JButton save = new JButton("Save");
    JButton view = new JButton("View");
    JButton rev = new JButton("Remove");
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
        
        String columnLabel[] = {"Brandname", "Generic Name", "Desription", "Price", "Quantity"};
            String data[][] = {{"Biogesic", "Paracetamol", "For minor aches or pains and etc.", "50", "20"},
            {"Bioflu", "Phenylephrine", "For clogged nose,runny nose,and etc.", "20", "30"},
            {"Nalfon", "Fenoprofen", "For mild to moderate pain of analgesia", "20", "20"}};
            JTable table = new JTable(data, columnLabel);

    public class CoughAdd extends JFrame {

        JPanel panel = new JPanel();
       

        CoughAdd() {
            super("Cough Medicine");
            setBounds(500, 280, 600, 500);
            panel.setLayout(null);

            brand.setBounds(70, 20, 505, 20);
            brand_in.setBounds(70, 40, 150, 20);
            gen.setBounds(70, 60, 505, 20);
            gen_in.setBounds(70, 80, 150, 20);
            des.setBounds(70, 100, 505, 20);
            des_in.setBounds(70, 120, 150, 20);
            price.setBounds(70, 140, 505, 20);
            price_in.setBounds(70, 160, 150, 20);
            quan.setBounds(70, 180, 505, 20);
            quan_in.setBounds(70, 200, 150, 20);
            save.setBounds(90, 240, 100, 30);

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
            panel.add(save);

            getContentPane().add(panel);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            
            save.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.addRow(new Object[]{
                        brand_in.getText(),gen_in.getText(),des_in.getText(),price_in.getText(),quan_in.getText()
                    });
                }
                
            });
        }
    }

    public class CoughRem extends JFrame {

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

        CoughRem() {
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
            save.setBounds(90, 200, 100, 30);

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
            panel.add(save);

            getContentPane().add(panel);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
    }

    public class Table extends JFrame {

        JPanel f;
        JButton add;

        Table() {
            super("Cough Table");
            f = new JPanel();
            add = new JButton("Add");
            

            TableColumnModel columnModel = table.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(70);
            columnModel.getColumn(1).setPreferredWidth(100);
            columnModel.getColumn(2).setPreferredWidth(220);
            columnModel.getColumn(3).setPreferredWidth(35);
            columnModel.getColumn(4).setPreferredWidth(50);

            setSize(500, 400);

            getContentPane().add(f);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);

            JScrollPane scrollPane = new JScrollPane(table);
            f.add(scrollPane);
            f.add(add);
            add.setVisible(true);
            add.setBounds(50, 100, 100, 50);

            scrollPane.setPreferredSize(new Dimension(475, 150));

            add.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent ae) {
                    if (true) {
                        CoughAdd c = new CoughAdd();
                        c.setVisible(true);
//                        dispose();
                    }
                }

            });

        }

    }
}

