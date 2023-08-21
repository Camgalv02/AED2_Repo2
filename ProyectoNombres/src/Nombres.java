import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Nombre 
{

	JLabel label1,label2,label3;
	
	Nombre()
	{
		
		Font f1= new Font("Serif", 3,25);
		
		label1= new JLabel();
		label1.setBounds(30, 30, 60, 60);
		label1.setForeground(Color.red);
		label1.setFont(f1);
		add(label1);
		
				
		 
	}





}
