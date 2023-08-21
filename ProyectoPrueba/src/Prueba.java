import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class Prueba extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JLabel Resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba frame = new Prueba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Prueba() {
		setTitle("Primer Trabajo con WindowBuilder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primer Programa");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(113, 25, 224, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese producto:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(26, 71, 120, 45);
		contentPane.add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t1.setBounds(186, 83, 117, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese precio:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(26, 114, 120, 45);
		contentPane.add(lblNewLabel_1_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t2.setColumns(10);
		t2.setBounds(186, 126, 117, 20);
		contentPane.add(t2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ingrese cantidad:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(26, 156, 120, 45);
		contentPane.add(lblNewLabel_1_1_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t3.setColumns(10);
		t3.setBounds(186, 168, 117, 20);
		contentPane.add(t3);
		
		JButton btnNewButton = new JButton("Calcular importe");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1= t2.getText();
				String dato2= t3.getText();
				
				float precio=Float.parseFloat(dato1);
				int cantidad= Integer.parseInt(dato2);
				
			float total= precio*cantidad;
				
				DecimalFormat f= new DecimalFormat("$"+"0.00");
				
				Resultado.setText(f.format(total));
				
			}
		});
		btnNewButton.setBounds(26, 228, 136, 43);
		contentPane.add(btnNewButton);
		
		Resultado = new JLabel("$0,00");
		Resultado.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Resultado.setOpaque(true);
		Resultado.setBackground(Color.ORANGE);
		Resultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Resultado.setHorizontalAlignment(SwingConstants.CENTER);
		Resultado.setBounds(205, 224, 98, 43);
		contentPane.add(Resultado);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
			
		});
		btnNewButton_1.setBounds(371, 276, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
