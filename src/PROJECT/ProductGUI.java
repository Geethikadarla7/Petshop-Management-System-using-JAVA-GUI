package PROJECT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ProductGUI extends JFrame implements ActionListener {{
		
		    private JLabel nameLabel, breedLabel, ageLabel, colorLabel, weightLabel, backgroundLabel;
		    private JTextField nameField, breedField, ageField, colorField, weightField;
		    private JButton submitButton, clearButton, colorButton;
		    private Color backgroundColor = Color.WHITE;
		    
		    public ProductGUI() {
		        // Set up main window
		        setTitle("Product Details");
		        setSize(400, 300);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        setLayout(new GridLayout(7, 2));
		        
		        // Create labels and text fields
		        nameLabel = new JLabel("Name:");
		        nameField = new JTextField();
		        breedLabel = new JLabel("Breed:");
		        breedField = new JTextField();
		        ageLabel = new JLabel("Age:");
		        ageField = new JTextField();
		        colorLabel = new JLabel("Color:");
		        colorField = new JTextField();
		        weightLabel = new JLabel("Weight:");
		        weightField = new JTextField();
		        
		        // Create buttons
		        submitButton = new JButton("Submit");
		        submitButton.addActionListener(this);
		        clearButton = new JButton("Clear");
		        clearButton.addActionListener(this);
		        colorButton = new JButton("Select Color");
		        colorButton.addActionListener(this);
		        
		        // Create label for background color
		        backgroundLabel = new JLabel("Background Color:");
		        backgroundLabel.setOpaque(true);
		        backgroundLabel.setBackground(backgroundColor);
		        
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
		        add(submitButton);
		        add(clearButton);
		        add(backgroundLabel);
		        add(colorButton);
		        
		        // Display window
		        setVisible(true);
		    }
		    
		    // Action performed when a button is clicked
		    public void actionPerformed(ActionEvent e) {
		        if (e.getSource() == submitButton) {
		            String name = nameField.getText();
		            String breed = breedField.getText();
		            int age = Integer.parseInt(ageField.getText());
		            String color = colorField.getText();
		            double weight = Double.parseDouble(weightField.getText());
		            
		            // Do something with product details (e.g. add to database)
		            System.out.println("Name: " + name);
		            System.out.println("Breed: " + breed);
		            System.out.println("Age: " + age);
		            System.out.println("Color: " + color);
		            System.out.println("Weight: " + weight);
		        }
		        else if (e.getSource() == clearButton) {
		            // Clear all fields
		            nameField.setText("");
		            breedField.setText("");
		            ageField.setText("");
		            colorField.setText("");
		            weightField.setText("");
		        }
		        else if (e.getSource() == colorButton) {
		            // Let user select background color
		            backgroundColor = JColorChooser.showDialog(this, "Select Color", backgroundColor);
		            backgroundLabel.setBackground(backgroundColor);
		        }
		    }
		    
		    
		    public static void main(String[] args) {
		        ProductGUI gui = new ProductGUI();
		   }
		}



		    
		    
		



}
