package PROJECT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

	  
	public class PetShopGUI extends JFrame implements ActionListener {
	  
	  private JLabel titleLabel;
	  private JButton loginButton;
	  private JButton registerButton;
	  private JList<String> productList;
	  private JButton customerButton;
	  private JButton transactionButton;
	  private JButton missingPetsButton;
	  
	  public PetShopGUI() {
	    setTitle("Pet Shop");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(600, 400);
	    setLayout(new BorderLayout());
	    
	    // Create the title label
	    titleLabel = new JLabel("Welcome to our Pet Shop!");
	    titleLabel.setHorizontalAlignment(JLabel.CENTER);
	    add(titleLabel, BorderLayout.NORTH);
	    
	    // Create the login and register buttons
	    JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 10, 0));
	    loginButton = new JButton("Login");
	    loginButton.addActionListener(this);
	    registerButton = new JButton("Register");
	    registerButton.addActionListener(this);
	    buttonPanel.add(loginButton);
	    buttonPanel.add(registerButton);
	    add(buttonPanel, BorderLayout.SOUTH);
	    
	    // Create the product list
	    String[] products = {"Pet food", "Toys", "Leashes", "Collars", "Treats"};
	    productList = new JList<String>(products);
	    productList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    JScrollPane scrollPane = new JScrollPane(productList);
	    add(scrollPane, BorderLayout.CENTER);
	    
	    // Create the customer button
	    customerButton = new JButton("Customer");
	    customerButton.addActionListener(this);
	    add(customerButton, BorderLayout.EAST);
	    
	    // Create the transaction button
	    transactionButton = new JButton("Transaction");
	    transactionButton.addActionListener(this);
	    add(transactionButton, BorderLayout.WEST);
	    
	    // Create the missing pets button
	    missingPetsButton = new JButton("Missing Pets");
	    missingPetsButton.addActionListener(this);
	    add(missingPetsButton, BorderLayout.SOUTH);
	  }
	  
	  public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == loginButton) {
	      // Show login dialog
	      JOptionPane.showMessageDialog(this, "Login dialog");
	    } else if (e.getSource() == registerButton) {
	      // Show register dialog
	      JOptionPane.showMessageDialog(this, "Register dialog");
	    } else if (e.getSource() == customerButton) {
	      // Show customer page
	      JOptionPane.showMessageDialog(this, "Customer page");
	    } else if (e.getSource() == transactionButton) {
	      // Show transaction page
	      JOptionPane.showMessageDialog(this, "Transaction page");
	    } else if (e.getSource() == missingPetsButton) {
	      // Show missing pets page
	      JOptionPane.showMessageDialog(this, "Missing pets page");
	    }
	  }
	  
	  public static void main(String[] args) {
	    PetShopGUI gui = new PetShopGUI();
	    gui.setVisible(true);
	  }
	}


