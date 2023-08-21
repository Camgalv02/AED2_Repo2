import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Compra extends JFrame implements ActionListener
{
	
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3;
	JComboBox c1;
	JRadioButton r1,r2,r3,r4,r5,r6;
	JCheckBox  cb1,cb2;
	ButtonGroup g1,g2;
	float total= 0;

	Compra()
	{
		setLayout(null);		
		
		Font f1 = new Font ("Serial",1,13);
		Font f2 = new Font ("Serial",3,20);
		
		l1 = new JLabel("Tipo de Micro: ");
		l1.setBounds(130,20,100,40);
		l1.setFont(f1);
		add(l1);
		
		c1 = new JComboBox();
		c1.setBounds(240,20,110,40);
		c1.addItem("Intel U$D 150");
		c1.addItem("Atlon U$D 80");
		c1.addItem("Turion U$D120");
		add(c1);
		
		
		l2 = new JLabel("Placa Madre:");
		l2.setBounds(30,80,100,40);
		l2.setFont(f1);
		add(l2);
		
		g1 = new ButtonGroup();
				
		r1 = new JRadioButton("Asus");
		r1.setBounds(150,80,100,40);
		r1.setBackground(Color.pink);
		r1.setForeground(Color.black);
		add(r1);
		g1.add(r1);
		
		r2= new JRadioButton("GigaByte");
		r2.setBounds(260,80,100,40);
		r2.setBackground(Color.pink);
		r2.setForeground(Color.black);
		add(r2);
		g1.add(r2);
		
		r3 = new JRadioButton("Msi");
		r3.setBounds(370,80,100,40);
		r3.setBackground(Color.pink);
		r3.setForeground(Color.black);
		add(r3);
		g1.add(r3);
		
		
		l3 = new JLabel("Memoria:");
		l3.setBounds(30,130,100,40);
		l3.setFont(f1);
		add(l3);
		
		g2 = new ButtonGroup();
		
		r4 = new JRadioButton("2 Mb");
		r4.setBounds(150,130,100,40);
		r4.setBackground(Color.pink);
		r4.setForeground(Color.black);
		add(r4);
		g2.add(r4);
		
		r5 = new JRadioButton("4 Mb");
		r5.setBounds(260,130,100,40);
		r5.setBackground(Color.pink);
		r5.setForeground(Color.black);
		add(r5);
		g2.add(r5);
		
		r6 = new JRadioButton("8 Mb");
		r6.setBounds(370,130,100,40);
		r6.setBackground(Color.pink);
		r6.setForeground(Color.black);
		add(r6);
		g2.add(r6);
		
		
		cb1 = new JCheckBox("Monitor");
		cb1.setBounds(170,180,100,40);
		cb1.setBackground(Color.orange);
		cb1.setForeground(Color.black);
		add(cb1);
		
		cb2 = new JCheckBox("Disco Fijo 1 TB");
		cb2.setBounds(280,180,120,40);
		cb2.setBackground(Color.orange);
		cb2.setForeground(Color.black);
		add(cb2);
	
		b1 = new JButton("Calcular Importe");
		b1.addActionListener(this);
		b1.setBounds(100,240,150,40);
		add(b1);
		
		l4 = new JLabel("0,00",JLabel.CENTER);
		l4.setBounds(280,240,120,40);
		l4.setBackground(Color.black);
		l4.setForeground(Color.cyan);
		l4.setOpaque(true);
		l4.setFont(f2);
		add(l4);
		
		b2 = new JButton("Ver Dialogo");
		b2.setBounds(100,300,150,40);
		b2.addActionListener(this);
		add(b2);
		
		b3 = new JButton("Salir");
		b3.setBounds(260,300,150,40);
		b3.addActionListener(this);
		add(b3);
	}
	
	public void actionPerformed(ActionEvent e)	
	{
		
		
		if (e.getSource()==b1)
		{		
		
		float precio=0;
		
		String tipo = c1.getSelectedItem().toString();		
		int item =c1.getSelectedIndex();
		
		
		if (item==0)		
			precio = 150;
		else if (item==1)
				precio = 80;
		else if (item==2)
					precio = 120;
		
		//Placa
		
		int placa =0;
		
		if(r1.isSelected())
			placa = 75;
		else if (r2.isSelected())
			placa = 320;
		else if (r3.isSelected())
			placa = 100;
		
		//memoria 
		
		int memoria = 0;
		
		if(r1.isSelected())
			memoria = 50;
		else if (r1.isSelected())
			memoria = 80;
		else if (r1.isSelected())
			memoria = 130;
			
		//Monitor y Disco
		int monitor = 0;
			if(cb1.isSelected())
				monitor = 250;		
			
	    int disco = 0;
	    if (cb2.isSelected())
	    	disco=80;
	    
	    total= precio+placa+memoria+monitor+disco;
	    
	    DecimalFormat f1 = new DecimalFormat("0.00");
		l4.setText("$ "+ f1.format(total));	
				
		}
			
		
		if(e.getSource()==b3)		
			System.exit(0);
	
	}
	public static void main(String[] args) 
	{
		Compra c = new Compra();		
		c.setTitle("Venta de PC");		
		c.setBounds(400,400,500,430);
		c.setVisible(true);
		c.getContentPane().setBackground(new Color(119,170,255));

	}

}