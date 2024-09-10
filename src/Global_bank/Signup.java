 package Global_bank;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class Signup extends JFrame implements ActionListener{
    
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8;
    JRadioButton r1, r2, r3, r4, r5;
    JButton b, b1;
    JDateChooser dateChooser;
    
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);
    
    Signup(){
        setTitle("NEW ACCOUNT APPLICATION FORM");

        // BackgroundPanel initialization fixed
        BackgroundPanel backgroundPanel = new BackgroundPanel(""); 
        backgroundPanel.setLayout(null); 
        setContentPane(backgroundPanel);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(20, 0, 100, 100);
        add(l11);

        l1 = new JLabel("APPLICATION FORM NO. " + first);
        l1.setFont(new Font("Raleway", Font.BOLD, 38));

        l2 = new JLabel("Page 1: Personal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));

        l3 = new JLabel("Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));

        l4 = new JLabel("Father's Name:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));

        l5 = new JLabel("Date of Birth:");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));

        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));

        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));

        l8 = new JLabel("Marital Status:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));

        l9 = new JLabel("Phone No:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));

        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));

        l11 = new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));

        l12 = new JLabel("Address:");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));

        l16 = new JLabel("State:");
        l16.setFont(new Font("Raleway", Font.BOLD, 20));

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));

        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));

        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));

        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));

        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 14));

        t6 = new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 14));

        t7 = new JTextField();
        t7.setFont(new Font("Raleway", Font.BOLD, 14));

        t8 = new JTextField();
        t8.setFont(new Font("Raleway", Font.BOLD, 14));

        b = new JButton("Next");
        b1 = new JButton("Back");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);

        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);

        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);

        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);
        groupstatus.add(r5);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 240, 400, 30);
        add(dateChooser);

        setLayout(null);
        l1.setBounds(140, 20, 600, 100);
        add(l1);

        l2.setBounds(290, 80, 600, 60);
        add(l2);

        l3.setBounds(100, 140, 100, 30);
        add(l3);

        t1.setBounds(300, 140, 400, 30);
        add(t1);

        l4.setBounds(100, 190, 200, 30);
        add(l4);

        t2.setBounds(300, 190, 400, 30);
        add(t2);

        l5.setBounds(100, 240, 200, 30);
        add(l5);

        l6.setBounds(100, 290, 200, 30);
        add(l6);

        r1.setBounds(300, 290, 60, 30);
        add(r1);

        r2.setBounds(450, 290, 90, 30);
        add(r2);

        l7.setBounds(100, 340, 200, 30);
        add(l7);

        t3.setBounds(300, 340, 400, 30);
        add(t3);

        l8.setBounds(100, 390, 200, 30);
        add(l8);

        r3.setBounds(300, 390, 100, 30);
        add(r3);

        r4.setBounds(450, 390, 100, 30);
        add(r4);

        r5.setBounds(635, 390, 100, 30);
        add(r5);

        l9.setBounds(100, 440, 200, 30);
        add(l9);

        t4.setBounds(300, 440, 400, 30);
        add(t4);

        l10.setBounds(100, 490, 200, 30);
        add(l10);

        t5.setBounds(300, 490, 400, 30);
        add(t5);

        l11.setBounds(100, 540, 200, 30);
        add(l11);

        t6.setBounds(300, 540, 400, 30);
        add(t6);

        l12.setBounds(100, 590, 200, 30);
        add(l12);

        t7.setBounds(300, 590, 400, 30);
        add(t7);

        l16.setBounds(100, 640, 200, 30);
        add(l16);

        t8.setBounds(300, 640, 400, 30);
        add(t8);

        b.setBounds(620, 700, 80, 30);
        add(b);

        b1.setBounds(320, 700, 80, 30);
        add(b1);

        b.addActionListener(this); 
        b1.addActionListener(this); 

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(500, 120);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
              new Login().setVisible(true);
                 setVisible(false);

            }
        if(validateData1()){
            String User_Id = first;
            String name = t1.getText();
            String fname = t2.getText();
            String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String gender = r1.isSelected() ? "Male" : r2.isSelected() ? "Female" : null;
            String email = t3.getText();
            String marital = r3.isSelected() ? "Married" : r4.isSelected() ? "Unmarried" : r5.isSelected() ? "Other" : null;
            String contact = t4.getText();
            String city = t5.getText();
            String pincode = t6.getText();
            String address = t7.getText();
            String state = t8.getText();

            try{ 
                
                Conn c1 = new Conn();  
                String q1 = "INSERT INTO Custmor VALUES ('" + User_Id + "', '" + name + "', '" + fname + "', '" + dob + "', '" + gender + "', '" + email + "', '" + marital + "', '" + contact + "', '" + city + "', '" + pincode + "', '" + address + "', '" + state + "')";

                  c1.s.executeUpdate(q1);
                new Signup2(first).setVisible(true);
                setVisible(false);

            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    private boolean validateData1(){
        if(t1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Plese Enter Name");
            return false;
        } 
        if(t2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Father's Name");
            return false;
        }
        if(!(r1.isSelected() || r2.isSelected())){
            JOptionPane.showMessageDialog(this, "Select Gender");
            return false;
        }
        if(t3.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Email");
            return false; 
        } 
        if(t7.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Address");
            return false; 
        }
        if(t5.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter City");
            return false; 
        }
        if(t6.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Check Pin Code");
            return false; 
        }
        if(t8.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter State Name");
            return false; 
        }
        if(t4.getText().trim().isEmpty() || !checkContact()){
            JOptionPane.showMessageDialog(this, "Enter  Correct Phone No");
            return false; 
        }
        return true;
    }

    private boolean checkContact(){
        return t4.getText().matches("\\d{10}");  
    }

    public static void main(String[] args){
        new Signup().setVisible(true);
    }

    // BackgroundPanel class
    class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel(String imagePath) {
            if (!imagePath.isEmpty()) {
                this.backgroundImage = new ImageIcon(ClassLoader.getSystemResource(imagePath)).getImage();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }
}
