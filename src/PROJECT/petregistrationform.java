package PROJECT;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class petregistrationform extends JFrame implements ActionListener {
	
	

	    // Labels for each field
	    JLabel nameLabel = new JLabel("Pet Name:");
	    JLabel breedLabel = new JLabel("Breed:");
	    JLabel ageLabel = new JLabel("Age:");
	    JLabel colorLabel = new JLabel("Color:");
	    JLabel weightLabel = new JLabel("Weight:");
	    JLabel featuresLabel = new JLabel("Unique Features:");
	    JLabel ownerLabel = new JLabel("Owner's Name:");
	    JLabel localityLabel = new JLabel("Locality:");

	    // Text fields for each field
	    JTextField nameField = new JTextField(20);
	    JTextField breedField = new JTextField(20);
	    JTextField ageField = new JTextField(3);
	    JTextField colorField = new JTextField(20);
	    JTextField weightField = new JTextField(5);
	    JTextField featuresField = new JTextField(20);
	    JTextField ownerField = new JTextField(20);
	    JTextField localityField = new JTextField(20);

	    // Button to submit registration
	    JButton registerButton = new JButton("Register Pet");

	    // Constructor to set up GUI
	    public petregistrationform() {
	        // Set up window properties
	        setTitle("Pet Registration Form");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(177, 174);
	        setLayout(new GridLayout(9,6));

	        // Add components to window
	        add(nameLabel);
	        add(nameField);
	        add(breedLabel);
	        add(breedField);
	        add(ageLabel);
	        add(ageField);
	        add(colorLabel);
	        add(colorField);
	        add(weightLabel);
	        add(weightField);
	        add(featuresLabel);
	        add(featuresField);
	        add(ownerLabel);
	        add(ownerField);
	        add(localityLabel);
	        add(localityField);
	        add(registerButton);
	        registerButton.addActionListener(this);

	        
	        setVisible(true);
	    }

	    // ActionListener method to handle button clicks
	    public void actionPerformed(ActionEvent e) {
	        // Get values from text fields
	        String name = nameField.getText();
	        String breed = breedField.getText();
	        int age = Integer.parseInt(ageField.getText());
	        String color = colorField.getText();
	        double weight = Double.parseDouble(weightField.getText());
	        String features = featuresField.getText();
	        String owner = ownerField.getText();
	        String locality = localityField.getText();

	       

	        
	        JOptionPane.showMessageDialog(this, "Pet registration successful!");
	    }

	    // 
	    public static void main(String[] args) {
	        new petregistrationform();
	    }
	}


