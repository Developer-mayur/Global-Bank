 package Global_bank;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {
    JButton customerButton, managerButton;

    Main() {
        setTitle("Main Page");

        BackgroundPanel backgroundPanel = new BackgroundPanel("GlobalBank/icons/background.jpg");
        backgroundPanel.setLayout(null); 
        setContentPane(backgroundPanel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("GlobalBank/icons/banking.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(50, 10, 100, 100);
        backgroundPanel.add(l11);

        JLabel l1 = new JLabel("WELCOME TO GLOBAL BANK");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        l1.setBounds(150, 40, 600, 40);
        backgroundPanel.add(l1);

        customerButton = new JButton("Customer");
        customerButton.setFont(new Font("Arial", Font.BOLD, 18));
        customerButton.setBounds(300, 150, 200, 50);
        customerButton.setBackground(Color.BLACK);
        customerButton.setForeground(Color.WHITE);
        customerButton.addActionListener(this);
        backgroundPanel.add(customerButton);

        managerButton = new JButton("Administration");
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
                new Login().setVisible(true);
                setVisible(false);
            } else if (ae.getSource() == managerButton) {
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

    class BackgroundPanel extends JPanel {
        private Image backgroundImage;
        private float alpha = 0.5f; // Transparency level (0.0f is fully transparent, 1.0f is fully opaque)

        public BackgroundPanel(String imagePath) {
            this.backgroundImage = new ImageIcon(ClassLoader.getSystemResource(imagePath)).getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Set the transparency level
            AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha);
            g2d.setComposite(alphaComposite);

            // Draw the background image with transparency
            g2d.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
