package PROJECT;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class MyFrame {
JFrame f;
	
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b;
	MyFrame(){
		JFrame frame = new JFrame("PET SHOP PRODUCT DETAILS");
	      frame.setSize(375, 250);
		f=new JFrame("my first frame"); 
		b=new JButton("submit");
		l1=new JLabel("Product name");
		l2=new JLabel(" Product category");
		l3=new JLabel(" Product Weight");
		l4=new JLabel("Product Color");
		l5=new JLabel("Product Age");
		l6=new JLabel(" Product Price");
		
		
		t1=new JTextField(11);
		t2=new JTextField(10);
		t3=new JTextField(9);
		t4=new JTextField(10);
		t5=new JTextField(19);
		t6=new JTextField(16);
		f.setSize(200,200);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(l5);
    	f.add(t5);
        f.add(l6);
        f.add(t6);
		f.add(b);
		f.getContentPane().setBackground(Color.orange);
		MyFrame f =new MyFrame();
	}
}

