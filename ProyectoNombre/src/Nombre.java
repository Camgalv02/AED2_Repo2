import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Nombre extends JFrame
{

	JLabel l1,l2,l3;
	
	Nombre()
	{
		setLayout(null);
		
		Font f1= new Font("Serif",3,25);
		Font f2= new Font("Serif",2,20);
		Font f3= new Font("Serif",1,15);
		
	
		
		l1 = new JLabel("Nombre1: Amara",JLabel.CENTER);
	  //label1.setBounds(x, y, ancho, alto);
		l1.setBounds(70, 80, 250, 40); //datos del label
		l1.setBackground(Color.white); //color de fondo
		l1.setOpaque(true); //opacar color de fondo
		l1.setForeground(Color.red); //color de texto
		l1.setFont(f1);
		add(l1); //visualizar el label
		
		
		l2 = new JLabel("Nombre2: Bernardo",JLabel.CENTER);
		//label2.setBounds(x, y, ancho, alto);
		l2.setBounds(70, 150, 250, 40); //datos del label
		l2.setBackground(Color.white); //color de fondo
		l2.setOpaque(true); //opacar color de fondo
		l2.setForeground(Color.ORANGE); //color de texto
		l2.setFont(f2);
		add(l2); //visualizar el label
		
		l3 = new JLabel("Nombre2: Cecilia",JLabel.CENTER);
		//label3.setBounds(x, y, ancho, alto);
		l3.setBounds(70, 210, 250, 40); //datos del label
		l3.setBackground(Color.white); //color de fondo
		l3.setOpaque(true); //opacar color de fondo
		l3.setForeground(Color.pink); //color de texto
		l3.setFont(f3);
		add(l3); //visualizar el label
	}
	
	public static void main(String[] args) {
		
		Nombre n = new Nombre();
		
		n.setBounds(200,150,400,500);
		n.setTitle("NombresDeCOLORES");
		n.setVisible(true);
	}

}
