package PROJECT;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxExample {
	JFrame f;
	ComboBoxExample(){
		JFrame f=new JFrame();
		String Country[]= {"us","newzealand"};
		JComboBox c= new JComboBox(Country);
		c.setBounds(50,50,90,20);
		f.add(c);
		f.setSize(400,500);
		f.setVisible(true);
		f.setLayout(null);
	}
		public static void main(String args[]) {
			new ComboBoxExample();
			
				
		}
	}


