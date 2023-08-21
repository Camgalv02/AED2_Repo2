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
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class VentaDeCelulares extends JFrame implements ActionListener

{
	JLabel label1, label2, label3, label4;
	JButton boton1, boton2, boton3;
	JComboBox combo1;
	JRadioButton radio1, radio2, radio3, radio4, radio5, radio6;
	JCheckBox cb1, cb2;
	ButtonGroup grupo1, grupo2;

	VentaDeCelulares() {
		setLayout(null);

		label1 = new JLabel("Seleccione la Marca: ");
		label1.setBounds(80, 20, 150, 40);
		add(label1);

		label2 = new JLabel("Seleccione el tipo: ");
		label2.setBounds(30, 80, 150, 40);
		add(label2);
		grupo1 = new ButtonGroup();

		radio1 = new JRadioButton("Gama Baja");
		radio1.setBounds(150, 80, 100, 40);
		add(radio1);
		grupo1.add(radio1);

		radio2 = new JRadioButton("Gama Media");
		radio2.setBounds(260, 80, 100, 40);
		add(radio2);
		grupo1.add(radio2);

		radio3 = new JRadioButton("Gama Alta");
		radio3.setBounds(370, 80, 100, 40);
		add(radio3);
		grupo1.add(radio3);

		combo1 = new JComboBox();
		combo1.setBounds(240, 20, 110, 40);
		combo1.addItem("IPhone U$D 250");
		combo1.addItem("Samsung U$D 200");
		combo1.addItem("Motorola U$D 180");
		add(combo1);

		label3 = new JLabel("Memoria:");
		label3.setBounds(30, 150, 100, 40);
		add(label3);

		grupo2 = new ButtonGroup();

		radio4 = new JRadioButton("8 Gb");
		radio4.setBounds(30, 190, 100, 40);
		add(radio4);
		grupo2.add(radio4);

		radio5 = new JRadioButton("16 Gb");
		radio5.setBounds(30, 230, 100, 40);
		add(radio5);
		grupo2.add(radio5);

		radio6 = new JRadioButton("32 Gb");
		radio6.setBounds(30, 270, 100, 40);
		add(radio6);
		grupo2.add(radio6);

		cb1 = new JCheckBox("Vidrio Templado");
		cb1.setBounds(230, 150, 100, 40);
		add(cb1);

		cb2 = new JCheckBox("Funda Protectora");
		cb2.setBounds(230, 190, 120, 40);
		add(cb2);

		boton1 = new JButton("Calcular Importe");
		boton1.setBounds(170, 270, 150, 40);
		boton1.addActionListener(this);
		add(boton1);

		label4 = new JLabel("0,00", JLabel.CENTER);
		label4.setBounds(360, 270, 120, 40);
		label4.setBackground(Color.black);
		label4.setForeground(Color.cyan);
		label4.setOpaque(true);
		add(label4);

		boton2 = new JButton("Ver Dialogo");
		boton2.setBounds(170, 320, 150, 40);
		boton2.addActionListener(this);
		add(boton2);

		boton3 = new JButton("Salir");
		boton3.setBounds(360, 320, 120, 40);
		boton3.addActionListener(this);
		add(boton3);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {

			float precio = 0;

			String tipo = combo1.getSelectedItem().toString();
			int item = combo1.getSelectedIndex();

			if (item == 0)
				tipo = tipo + 250;
			else if (item == 1)
				tipo = tipo + 200;
			else if (item == 2)
				tipo = tipo + 180;

			//

			float precio1 =0;
			
			if(radio1.isSelected())//gamabaja
				precio1 = 250;
			else if (radio2.isSelected())//media
				precio1 = precio1 + 200 * 1.10f;
			else if (radio3.isSelected())//alta
				precio1= precio1 +180 *1.30f;

			// memoria

			float memoria = 0;

			if (radio1.isSelected())
				memoria = 30;
			else if (radio2.isSelected())
				memoria = memoria + 60 * 1.10f;
			else if (radio3.isSelected())
				memoria = memoria + 90 * 1.30f;

			// vidrio y funda

			int vidrio = 0;
			int funda = 0;
			if (cb1.isSelected())
				;
			{

				vidrio = 3;
			}
			if (cb2.isSelected()) {

				funda = 5;
			}

			float total =precio1+memoria+vidrio+funda;
			DecimalFormat f1 = new DecimalFormat("0.00");
			label4.setText("$"+f1.format(total));
		}

		if (e.getSource() == boton3)
			System.exit(0);

	}

	public static void main(String[] args) {
		VentaDeCelulares vc = new VentaDeCelulares();

		vc.setTitle(" Venta de Celulares");
		vc.setBounds(200, 200, 550, 500);
		vc.setVisible(true);
	}
}