 
package Global_bank;

 import javax.swing.*;
import java.awt.*;

public class DashboardSwing extends JFrame {

    public DashboardSwing() {
        // Set the JFrame properties
        setTitle("Swing Dashboard Example");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Main panel (acts as the content pane)
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 2)); // Two columns, one for each section
        
        // Left Panel
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(null); // Using absolute positioning
        leftPanel.setBackground(new Color(116, 140, 241)); // Color #748CF1
        leftPanel.setBorder(BorderFactory.createLineBorder(new Color(116, 140, 241), 2, true));
        
        // "Bus" Label
        JLabel busLabel = new JLabel("Bus");
        busLabel.setFont(new Font("Century Gothic", Font.PLAIN, 17));
        busLabel.setBounds(15, 20, 100, 30); // Set the position and size
        leftPanel.add(busLabel);
        
        // Bus Icon
        JLabel busIcon = new JLabel(new ImageIcon(getClass().getResource("/images/icons8-bus-50.png")));
        busIcon.setBounds(12, 60, 50, 56);
        leftPanel.add(busIcon);
        
        // Dot Icon
        JLabel dotIcon = new JLabel(new ImageIcon(getClass().getResource("/images/dot.png")));
        dotIcon.setBounds(263, 60, 50, 43);
        leftPanel.add(dotIcon);
        
        // Add left panel to the main panel
        mainPanel.add(leftPanel);
        
        // Right Panel
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null); // Using absolute positioning
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
        
        // Company Label
        JLabel companyLabel = new JLabel("Ui Java Company");
        companyLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
        companyLabel.setBounds(32, 48, 200, 30); // Set position and size
        rightPanel.add(companyLabel);
        
        // Company Image
        JLabel companyImage = new JLabel(new ImageIcon(getClass().getResource("/images/images.jpg")));
        companyImage.setBounds(394, 34, 194, 196);
        rightPanel.add(companyImage);
        
        // Description Labels
        JLabel descriptionLabel1 = new JLabel("Lorem Ipsum has been the industry's standard");
        descriptionLabel1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        descriptionLabel1.setBounds(32, 87, 400, 30);
        rightPanel.add(descriptionLabel1);
        
        JLabel descriptionLabel2 = new JLabel("dummy text ever since the 1500s,");
        descriptionLabel2.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        descriptionLabel2.setBounds(32, 109, 400, 30);
        rightPanel.add(descriptionLabel2);
        
        // Unlock Button
        JButton unlockButton = new JButton("Unlock");
        unlockButton.setFont(new Font("Century Gothic", Font.BOLD, 13));
        unlockButton.setBounds(32, 195, 163, 43);
        unlockButton.setBackground(new Color(53, 58, 86)); // Color #353A56
        unlockButton.setForeground(Color.WHITE);
        unlockButton.setFocusPainted(false);
        unlockButton.setBorder(BorderFactory.createLineBorder(new Color(53, 58, 86), 2, true));
        
        // Unlock Icon
        JLabel unlockIcon = new JLabel(new ImageIcon(getClass().getResource("/images/icons8-unlock-50.png")));
        unlockIcon.setBounds(0, 0, 40, 40);
        unlockButton.setIcon(new ImageIcon(getClass().getResource("/images/icons8-unlock-50.png")));
        rightPanel.add(unlockButton);
        
        // Add right panel to the main panel
        mainPanel.add(rightPanel);
        
        // Add the main panel to the JFrame
        add(mainPanel, BorderLayout.CENTER);
        
        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(()new DashboardSwing());
    }
}