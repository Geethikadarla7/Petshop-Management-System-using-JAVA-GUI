package PROJECT;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class buttonclass extends JFrame implements ActionListener {
	buttonclass(){
		JButton button=new JButton();
		button.setBounds(200, 100, 100, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ActionEvent button = null;
		if(e==button) {
			System.out.println("button pressed");
			
			
		}
		
	}

}
