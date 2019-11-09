
package medapp;
  

//import java.awt.Color;
//import static java.awt.Color.pink;
//import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JFrame;
//import javax.swing.JLabel;



public class Botica{
    
    public Botica (){
        JFrame frame = new JFrame("MEDAPP");
//        panel = new JPanel();
//        panel.setLayout(new FlowLayout()); 
        JLabel label = new JLabel("--☺☺ M E D A P P ☺☺--");
        JButton button1 = new JButton("PHARMACIST");
        button1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent ae) {
                if(true){
//                    JOptionPane.showMessageDialog(frame, "Login");
                    Login l = new Login();
                    l.setVisible(true);
                    dispose();
                }
            }

            private void dispose() {
                frame.dispose();
            }
            
        });
        JButton button2 = new JButton("CUSTOMER");

        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setBounds(200,200,200,200);
//        panel.setVisible(true);
//        panel.setVisible(true);
//        panel.setBounds(250,100,300,400);    
//        panel.setBackground(Color.pink); 
        


        
//        frame.add(panel);
        frame.setSize(400,400);    
//        frame.setLayout(null);    
//        frame.setVisible(true);  
       
    
        frame.add(label);
        frame.add(button1);
        frame.add(button2);
        
        

        label.setSize(600,500);
        label.setBounds(510,200,100,80);
//        frame.getContentPane().add(label);
        label.setVisible(true);
        label.setSize(150,50);
//        label.setText("Welo");
        button1.setBounds(500,300,100,50);
        button1.setVisible(true);
        button1.setSize(150,50);
        button2.setLocation(500,400);
        button2.setVisible(true);
        button2.setSize(150,50);
//        this.add(button1);
        
//        frame.setSize(200, 300);  
          
        
    }

//    private void add(JButton button1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }



    
            
}








