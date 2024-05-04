package PROJECT;

import java.awt.BorderLayout;


import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Homepage {
	
	public static void main(String args[]) {
		ImageIcon image =new ImageIcon("petshop.png");
		JLabel label = new JLabel();
		
		label.setForeground(new Color(255,0,255));
	    label.setVerticalAlignment(JLabel.TOP);
	    label.setIcon(image);
	   label.setBounds(150, 150, 200, 200);
	    
		JFrame frame=new JFrame();
		frame.setTitle("Pet Management System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(10,10));
		frame.getContentPane().setBackground(new Color(255,255,255));
	    frame.setBounds(0, 0, 250, 0);
		frame.add(label);
	    frame.add(new JLabel(image)) ;
	    
	   
	    JPanel panel1 =new JPanel();
		panel1.setBackground(Color.red);
		panel1.setBounds(0,0,250,250);
	    panel1.setPreferredSize(new Dimension(100,100));
	    panel1.add(new JButton("LOGIN/REGISTER"));
	    panel1.add(new JButton("HOME"));
	    panel1.add(new JButton("PRODUCTS"));
	    panel1.add(new JButton("CUSTOMER"));
	    panel1.add(new JButton("MISSING"));
	    panel1.add(new JButton("LOGOUT"));
	    frame.add(panel1,BorderLayout.WEST);
         
		
	
	   	
		 JPanel cyan=new JPanel();
		 cyan.setBackground(Color.cyan);
		 cyan.setBounds(0, 250,500, 100);
		 cyan.add(new JButton("cats"));
		 cyan.add(new JButton("Dogs"));
		 cyan.add(new JButton("Birds"));
		 cyan.setPreferredSize(new Dimension(0,0));
		 frame.add(cyan,BorderLayout.NORTH);
		 
		 frame.add(cyan);
		 
	     
		 JPanel yellow= new JPanel();
		 yellow.setBackground(Color.yellow);
		 yellow.setBounds(250, 0, 0, 250);
		 yellow.setPreferredSize(new Dimension(100,100));
	    
	     frame.add(yellow,BorderLayout.CENTER);
        JLayeredPane layeredPane =new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
       
         
		
	   
	   
	 
		}

}
