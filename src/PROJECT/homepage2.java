package PROJECT;
import javax.swing.*;
import java.awt.*;
public class homepage2  extends JFrame{


	    // Constructor to set up GUI
	    public void homepage2() {
	        // Set up window properties
	        setTitle("Welcome to Our Pet Shop!");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(400, 300);

	        // Create components for window
	        JLabel titleLabel = new JLabel("Our Pet Shop");
	        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
	        JLabel descriptionLabel = new JLabel("We offer a wide variety of pets and pet supplies.");
	        descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
	        JButton browsePetsButton = new JButton("Browse Pets");
	        JButton registerPetButton = new JButton("Register Your Pet");
	        JButton contactUsButton = new JButton("Contact Us");

	        // Set up layout manager
	        setLayout(new GridBagLayout());
	        GridBagConstraints c = new GridBagConstraints();
	        c.gridx = 0;
	        c.gridy = 0;
	        c.insets = new Insets(10, 10, 10, 10);
	        c.anchor = GridBagConstraints.CENTER;

	        // Add components to window
	        add(titleLabel, c);
	        c.gridy++;
	        add(descriptionLabel, c);
	        c.gridy++;
	        add(browsePetsButton, c);
	        c.gridy++;
	        add(registerPetButton, c);
	        c.gridy++;
	        add(contactUsButton, c);

	        // Show window
	        setVisible(true);
	    }

	    // Main method to create GUI
	    public static void main(String[] args) {
	        new homepage2();
	    }
	}
