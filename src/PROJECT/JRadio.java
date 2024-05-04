package PROJECT;

import javax.swing.JFrame;

public class JRadio { 
	JFrame f;    
	JRadioButtonExample(){    
	f=new JFrame();     
	JRadioButton r1=new JRadioButton("A) Male");    
	JRadioButton r2=new JRadioButton("B) Female");    
	r1.setBounds(75,50,100,30);    
	r2.setBounds(75,100,100,30);    
	ButtonGroup bg=new ButtonGroup();    
	bg.add(r1);bg.add(r2);    
	f.add(r1);f.add(r2);      
	f.setSize(300,300);    
	f.setLayout(null);    
	f.setVisible(true);    
	}    
	public static void main(String[] args) {    
	    new RadioButtonExample();    
	}
	public void setBounds(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}    
	}    
	
	

}
