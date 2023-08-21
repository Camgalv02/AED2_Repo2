import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SelectorNumerico extends JFrame implements ActionListener
{
	
	JLabel label1, label2;
	JButton b1, b2,b3; 
	
	SelectorNumerico()
	{
		setLayout(null);
		
		Font f1 = new Font ("Serif", 3, 40);
		Font f2 = new Font ("Serif", 1, 30);
		Font f3 = new Font ("Serif", 1, 15);

		
		label1 = new JLabel ("Indice de Nivel");
		label1.setBounds(70,30,120,40);
		add(label1);
		
		label2 = new JLabel ("0", JLabel.CENTER);
		label2.setBounds(50,100,70,70);
		label2.setBackground(Color.black);
		label2.setForeground(Color.green);
		label2.setOpaque(true);
		label2.setFont(f1);
		add(label2);
		
		b1 = new JButton ("+");
		b1.setBounds(130, 70, 60, 60);
		b1.addActionListener(this);
		b1.setFont(f2);
		add(b1);
		
		b2 = new JButton ("-");
		b2.setBounds(130, 140, 60, 60);
		b2.addActionListener(this);
		b2.setFont(f2);
		add(b2);
		
		b3 = new JButton ("Salir del Programa");
		b3.setBounds(30, 230, 180, 40);
		b3.addActionListener(this);
		b3.setFont(f3);
		add(b3);
		
	}
	

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)  //boton1
		{
			String dato = label2.getText(); //  dato = " 0 "
			int n= Integer.parseInt(dato);  //    n  = " 0 "
			
			if(n<100)
			{
				n=n+10;                     //   n     =    10
				label2.setText(String.valueOf(n));
			}
			
		}
		
		if(e.getSource()==b2) //boton 2
		{
			String dato = label2.getText(); //  dato  =  " 0 "
			int n= Integer.parseInt(dato);  //    n   =  " 0 "
			
			if(n>0)
			{
				n=n-10;                     //    n   =    10
				label2.setText(String.valueOf(n));
			}
		}
		
		if(e.getSource()==b3)   //boton 3
		{
			System.exit(0);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		SelectorNumerico s = new SelectorNumerico ();
		
		s.setBounds(300,200,300,400);
		s.setTitle("SelectorNumerico");
		s.setVisible(true);	

	}

}
