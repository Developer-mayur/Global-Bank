 package Global_bank;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {
    JButton customerButton, managerButton;

    Main() {
        setTitle("Main Page");

        // Create a background panel with a custom image
        BackgroundPanel backgroundPanel = new BackgroundPanel("GlobalBank/icons/background.jpg");
        backgroundPanel.setLayout(null); 
        setContentPane(backgroundPanel);

        // Logo image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("GlobalBank/icons/banking.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(50, 10, 100, 100);
        backgroundPanel.add(l11);

        // Welcome label
        JLabel l1 = new JLabel("WELCOME TO GLOBAL BANK");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        l1.setBounds(150, 40, 600, 40);
        backgroundPanel.add(l1);

        // Customer button
        customerButton = new JButton("CUSTOMER");
        customerButton.setFont(new Font("Arial", Font.BOLD, 18));
        customerButton.setBounds(300, 150, 200, 50);
        customerButton.setBackground(Color.BLACK);
        customerButton.setForeground(Color.WHITE);
        customerButton.addActionListener(this);
        backgroundPanel.add(customerButton);

        // Manager button
        managerButton = new JButton("MANAGER");
        managerButton.setFont(new Font("Arial", Font.BOLD, 18));
        managerButton.setBounds(300, 220, 200, 50);
        managerButton.setBackground(Color.BLACK);
        managerButton.setForeground(Color.WHITE);
        managerButton.addActionListener(this);
        backgroundPanel.add(managerButton);

        setSize(800, 480);
        setLocation(550, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == customerButton) {
                // Open customer login or home page
                new Login().setVisible(true);
                setVisible(false);
            } else if (ae.getSource() == managerButton) {
                // Open manager login or home page
                new ManagerLogin().setVisible(true);
                setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }

    // Custom JPanel class to handle background image
    class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel(String imagePath) {
            this.backgroundImage = new ImageIcon(ClassLoader.getSystemResource(imagePath)).getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
