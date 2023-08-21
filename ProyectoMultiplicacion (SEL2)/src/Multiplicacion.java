import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Multiplicacion extends JFrame implements ActionListener
{
	
	JLabel label1, label2, label3, label4, label5, label6, label7 ;
	JButton b1, b2, b3, b4, b5, b6; 
	
	Multiplicacion()
	{
		
		setLayout(null);
		
		
		Font f1 = new Font ("Serif", 3, 40);
		Font f2 = new Font ("Serif", 1, 30);
		Font f3 = new Font ("Serif", 1, 15);

		
		label1 = new JLabel ("Primer Numero");
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
		b3.setBounds(30, 280, 410, 40);
		b3.addActionListener(this);
		b3.setFont(f3);
		add(b3);
		
		
	// Segundo Selector	
		
		
		label4 = new JLabel ("Segundo Numero");
		label4.setBounds(300,30,120,40);
		add(label4);
		
		label5 = new JLabel ("0", JLabel.CENTER);
		label5.setBounds(370,100,70,70);
		label5.setBackground(Color.black);
		label5.setForeground(Color.green);
		label5.setOpaque(true);
		label5.setFont(f1);
		add(label5);
		
		b4 = new JButton ("+");
		b4.setBounds(300, 70, 60, 60);
		b4.addActionListener(this);
		b4.setFont(f2);
		add(b4);
	
		b5 = new JButton ("-");
		b5.setBounds(300, 140, 60, 60);
		b5.addActionListener(this);
		b5.setFont(f2);
		add(b5);
	
	//----------------------------------------
		
		b6 = new JButton ("Multiplicar");
		b6.setBounds(30, 230, 230, 40);
		b6.addActionListener(this);
		b6.setFont(f3);
		add(b6);
		
		label6 = new JLabel ("0", JLabel.CENTER);
		label6.setBounds(270,230,170,40);
		label6.setBackground(Color.black);
		label6.setForeground(Color.green);
		label6.setOpaque(true);
		label6.setFont(f1);
		add(label6);
		
		label7 = new JLabel ("X");
		label7.setBounds(230,110,50,50);
		label7.setFont(f1);
		add(label7);
	}
	

	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource() == b1)  //boton1
		{
			
			String dato1 = label2.getText(); 
			int n1 = Integer.parseInt(dato1);  
			
			
			if(n1 < 100)
			{
				n1 = n1 + 10;                     
				label2.setText(String.valueOf(n1));
			}
			
		}
		
		if(e.getSource() == b2)  //boton 2
		{
			
			String dato1 = label2.getText(); 
			int n1 = Integer.parseInt(dato1);  
			
			
			if( n1 > 0)
			{
				n1 = n1 - 10;                    
				label2.setText(String.valueOf(n1));
			}
			
		}
		
		
		if(e.getSource() == b3)   //boton 3
		{
			
			System.exit(0);
			
		}
		
		
		if(e.getSource() == b4)   //boton 4
		{
			
			String dato2 = label5.getText(); 
			int n2 = Integer.parseInt(dato2);  
			
			
			if(n2 < 100)
			{
				
				n2 = n2 + 10;                     
				label5.setText(String.valueOf(n2));
				
			}
			
		}
		
		
		if(e.getSource() == b5)   //boton 5
		{
			
			String dato2 = label5.getText(); 
			int n2 = Integer.parseInt(dato2);  
			
			
			if(n2 > 0)
			{
				
				n2 = n2 - 10;                    
				label5.setText(String.valueOf(n2));
				
			}
		}
		
		
		if(e.getSource() == b6)  //boton 6
		{
			
			String dato1 = label2.getText();
			int n1 = Integer.parseInt(dato1);
			
			String dato2 = label5.getText();
			int n2 = Integer.parseInt(dato2);
			
			int m = n1 * n2;
			
			label6.setText(String.valueOf(m));
		
			
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Multiplicacion m = new Multiplicacion ();
		
		
		
		m.setBounds(300,200,500,400);
		m.setTitle("Multiplicacion de dos Numeros");
		m.setVisible(true);	

	}

}
