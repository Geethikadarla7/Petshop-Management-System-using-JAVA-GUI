package PROJECT;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class panel  {
	public static void main(String args[]) {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		JPanel panel1 =new JPanel();
		JPanel panel2 =new JPanel();
		JPanel panel3 =new JPanel();
		JPanel panel4 =new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.orange);
		frame.add(panel1,BorderLayout.North)
		
		
	}
}