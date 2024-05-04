package PROJECT;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorChooserUI;  
public class Jframe {   
	    public static void main(String s[]) {  
	        JFrame frame = new JFrame("JFrame Example");
	        frame.setSize(new Dimension(400, 200));
	        frame.setLocation(new Point(400, 200));
	            
	        JPanel panel = new JPanel();    
	        JLabel label = new JLabel("Product details"); 
	        JLabel label1 = new JLabel("Product name"); 
	        JLabel label2 = new JLabel("Product age"); 
	        JLabel label3 = new JLabel("Product color"); 
	        JLabel label4 = new JLabel("Product breed"); 
	        JLabel label5 = new JLabel("Product weight");
	        JTextField t=new JTextField(10);
           JTextField t1=new JTextField(20);
	        JTextField t2=new JTextField(11);
         JTextField t3=new JTextField(11);
	        JTextField t4=new JTextField(11);
	        JTextField t5=new JTextField(11);
	        
	        JButton button = new JButton();  
	        button.setText("Submit");  
	        panel.add(label);
	        panel.add(t);
	        panel.add(label1);
	        panel.add(t1);
	        panel.add(label2);
	        panel.add(t2);
	        panel.add(label3);
	        panel.add(t3);
	        panel.add(label4);
	        panel.add(t4);
	        panel.add(label5);
	        panel.add(t5);
	        panel.add(button);  
	        frame.add(panel);  
	        
	        
	  
	        frame.setLocationRelativeTo(null);  
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        frame.setVisible(true); 
	        
	    }  
	}  

