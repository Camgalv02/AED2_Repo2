import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Suma extends JFrame implements ActionListener
{
	
	JLabel  l1, l2, l3;
	JTextField  t1, t2;
	JButton  b1, b2;
	
	Suma()
	{
		setLayout(null);
		
		Font f1 = new Font ("Serif",1,20);
		
		l1 = new JLabel ("Primer valor");
		l1.setBounds(30,40,200,40);
		add(l1);
		
		t1 = new JTextField();
		t1.setBounds(120,40,100,40);
		add(t1);
		
		l2 = new JLabel ("Segundo Valor");
		l2.setBounds(30,90,100,40);
		add(l2);
		
		t2 = new JTextField();
		t2.setBounds(120,90,100,40);
		add(t2);
		
		b1 = new JButton("Sumar");
		b1.setBounds(30,150,190,40);
		b1.addActionListener(this); //no olvidar
		b1.setFont(f1);
		add(b1); //hacer visible el elemento
		
		l3 = new JLabel("0",JLabel.CENTER);
		l3.setBounds(30,200,190,40);
		l3.setFont(f1);
		l3.setBackground(Color.orange); //color de fondo
		l3.setForeground(Color.red); //color de texto
		l3.setOpaque(true);
		add(l3); //hacer visible el elemento
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String dato1= t1.getText(); //tomamos los valores String del campo
			String dato2=t2.getText();
			
			int numero1 = Integer.parseInt(dato1); //transformamos los valores a float
			int numero2 = Integer.parseInt(dato2);
            int suma = numero1 + numero2;
			
			String resultado= String.valueOf(suma); //transformamos el valor int a String
			l3.setText(resultado);
			
		}
		
	}
	

	public static void main(String[] args) 
	{
		Suma s = new Suma();
		s.setBounds(200,150,300,400);
		s.setTitle("***Suma de números***");
		s.setVisible(true);

	}

}
