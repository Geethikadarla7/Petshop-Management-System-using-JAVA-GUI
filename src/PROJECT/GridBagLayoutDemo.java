package PROJECT;
import javax.swing.*;
import java.awt.*;


public class GridBagLayoutDemo { 
	   public static void main(String arg[]) {
	      JFrame frame = new JFrame("PET SHOP PRODUCT DETAILS");
	      frame.setSize(375, 250);
	      JLabel l1,l2,l3,l4,l5,l6;
	      l1=new JLabel("Product name");
			l2=new JLabel(" Product category");
			l3=new JLabel(" Product Weight");
			l4=new JLabel("Product Color");
			l5=new JLabel("Product Age");
			l6=new JLabel(" Product Price");
			frame.add(l1);
		      frame.add(l2);
		      frame.add(l3);
		      frame.add(l4);
		      frame.add(l5);
		      frame.add(l6);
	      // Setting layout as null
	      frame.setLayout(null);
	      
	      
	      // Creating Button
	      JButton button = new JButton("");
	      // Setting position and size of a button
	      button.setBounds(80,30,120,40);
	      frame.add(button);
	      
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setLocationRelativeTo(null);
	      frame.setVisible(true);
	   }
	}