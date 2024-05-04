package PROJECT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PetShopManagementGUI1  extends JFrame implements ActionListener {

	    // declare components
	    private JPanel welcomePanel, loginPanel, registerPanel;
	    private JLabel welcomeLabel, loginLabel, registerLabel;
	    private JTextField usernameField, registerUsernameField;
	    private JPasswordField passwordField, registerPasswordField;
	    private JButton loginButton, registerButton;

	    public PetShopManagementGUI1() {
	        // initialize components
	        welcomeLabel = new JLabel("Welcome to Pet Shop Management System!");
	        loginLabel = new JLabel("Login");
	        registerLabel = new JLabel("Register");
	        usernameField = new JTextField(20);
	        passwordField = new JPasswordField(20);
	        registerUsernameField = new JTextField(20);
	        registerPasswordField = new JPasswordField(20);
	        loginButton = new JButton("Login");
	        registerButton = new JButton("Register");

	        // add action listeners to buttons
	        loginButton.addActionListener(this);
	        registerButton.addActionListener(this);

	        // initialize panels
	        welcomePanel = new JPanel(new GridLayout(3, 1));
	        welcomePanel.add(welcomeLabel);
	        welcomePanel.add(loginButton);
	        welcomePanel.add(registerButton);

	        loginPanel = new JPanel(new GridLayout(3, 1));
	        loginPanel.add(loginLabel);
	        loginPanel.add(new JLabel("Username:"));
	        loginPanel.add(usernameField);
	        loginPanel.add(new JLabel("Password:"));
	        loginPanel.add(passwordField);
	        loginPanel.add(loginButton);

	        registerPanel = new JPanel(new GridLayout(4, 1));
	        registerPanel.add(registerLabel);
	        registerPanel.add(new JLabel("Username:"));
	        registerPanel.add(registerUsernameField);
	        registerPanel.add(new JLabel("Password:"));
	        registerPanel.add(registerPasswordField);
	        registerPanel.add(registerButton);

	        // add panels to frame
	        add(welcomePanel);

	        // set frame properties
	        setTitle("Pet Shop Management System");
	        setSize(400, 200);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	    }

	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == loginButton) {
	            String username = usernameField.getText();
	            String password = new String(passwordField.getPassword());
	            // check if username and password are correct
	            // if correct, open main window
	            // else, display error message
	        } else if (e.getSource() == registerButton) {
	            String username = registerUsernameField.getText();
	            String password = new String(registerPasswordField.getPassword());
	            // add new user to database
	            // display success message
	        }
	    }

	    public static void main(String[] args) {
	        new PetShopManagementGUI1();
	    }
	}


