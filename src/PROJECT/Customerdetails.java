package PROJECT;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Customerdetails {

public  class PetShopGUI implements ActionListener {

    // GUI components
    private JFrame frame;
    private JPanel panel;
    private JLabel nameLabel, petTypeLabel, transactionLabel;
    private JTextField nameField, petTypeField, transactionField;
    private JButton addButton, clearButton;

    // Constructor to initialize the GUI components
    public PetShopGUI() {

        // Create frame and panel
        frame = new JFrame("Pet Shop");
        panel = new JPanel();

        // Create labels
        nameLabel = new JLabel("Customer Name:");
        petTypeLabel = new JLabel("Pet Type:");
        transactionLabel = new JLabel("Transaction Amount:");

        // Create text fields
        nameField = new JTextField(20);
        petTypeField = new JTextField(20);
        transactionField = new JTextField(10);

        // Create buttons
        addButton = new JButton("Add Transaction");
        clearButton = new JButton("Clear Fields");

        // Add action listeners to buttons
        addButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Add components to panel
        panel.setLayout(new GridLayout(4, 2));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(petTypeLabel);
        panel.add(petTypeField);
        panel.add(transactionLabel);
        panel.add(transactionField);
        panel.add(addButton);
        panel.add(clearButton);

        // Add panel to frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Method to handle button clicks
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addButton) {

            // Get user inputs
            String name = nameField.getText();
            String petType = petTypeField.getText();
            double transactionAmount = Double.parseDouble(transactionField.getText());

            // Clear text fields
            nameField.setText("");
            petTypeField.setText("");
            transactionField.setText("");
        }

        if (e.getSource() == clearButton) {

            // Clear text fields
            nameField.setText("");
            petTypeField.setText("");
            transactionField.setText("");
        }
    }

    // Main method to create GUI object
    public static void main(String[] args) {
        Customerdetails Customer= new Customerdetails();
    }
}

// Transaction class to represent a pet shop transaction
class Transaction {

    // Instance variables
    private String customerName;
    private String petType;
    private double transactionAmount;

    // Constructor
    public Transaction(String name, String pet, double amount) {
        customerName = name;
        petType = pet;
        transactionAmount = amount;
    }

    // Getters and setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String name) {
        customerName = name;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String pet) {
        petType = pet;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double amount) {
        transactionAmount = amount;
    }
}

}
