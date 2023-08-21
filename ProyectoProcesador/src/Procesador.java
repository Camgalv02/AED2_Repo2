import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Procesador extends JFrame {

	private JPanel contentPane;
	private JLabel label1;
	private JLabel label2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Procesador frame = new Procesador();
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
	public Procesador() {
		setTitle("            Procesador de Texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 734, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hoja");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(58, 48, 88, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Margen Superior");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(296, 51, 157, 23);
		contentPane.add(lblNewLabel_1);
		
		label1 = new JLabel("0");
		label1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label1.setOpaque(true);
		label1.setForeground(Color.WHITE);
		label1.setBackground(Color.BLUE);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label1.setBounds(282, 98, 66, 62);
		contentPane.add(label1);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato= label1.getText();
				int n = Integer.parseInt(dato);
				if(n<25)
				{
					n = n + 1;
					label1.setText(String.valueOf(n));
					y1 = y1 + 3;
					repaint();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(369, 91, 85, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato= label1.getText();
				int n = Integer.parseInt(dato);
				if(n>0)
				{
					n = n - 1;
					label1.setText(String.valueOf(n));
					y1 = y1 - 3;
					repaint();
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(369, 134, 85, 33);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Margen Inferior");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(296, 193, 157, 23);
		contentPane.add(lblNewLabel_1_1);
		
		label2 = new JLabel("0");
		label2.setOpaque(true);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label2.setBackground(Color.BLUE);
		label2.setBounds(282, 243, 66, 62);
		contentPane.add(label2);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato= label2.getText();
				int n = Integer.parseInt(dato);
				if(n<25)
				{
					n = n + 1;
					label2.setText(String.valueOf(n));
					y2 = y2 - 3;
					repaint();
				}
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(368, 241, 85, 33);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("-");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato= label2.getText();
				int n = Integer.parseInt(dato);
				if(n>0)
				{
					n = n - 1;
					label2.setText(String.valueOf(n));
					y2 = y2 + 3;
					repaint();
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(368, 284, 85, 33);
		contentPane.add(btnNewButton_1_1);
		
		JLabel asd = new JLabel("Margen Izquierdo");
		asd.setHorizontalAlignment(SwingConstants.CENTER);
		asd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		asd.setBounds(72, 358, 157, 23);
		contentPane.add(asd);
		
		label3 = new JLabel("0");
		label3.setOpaque(true);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label3.setBackground(Color.BLUE);
		label3.setBounds(58, 405, 66, 62);
		contentPane.add(label3);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato= label3.getText();
				int n = Integer.parseInt(dato);
				if(n<20)
				{
					n = n + 1;
					label3.setText(String.valueOf(n));
					x1 = x1 + 3;
					repaint();
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(145, 398, 85, 33);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("-");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato= label3.getText();
				int n = Integer.parseInt(dato);
				if(n>0)
				{
					n = n - 1;
					label3.setText(String.valueOf(n));
					x1 = x1 - 3;
					repaint();
				}
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_2.setBounds(145, 441, 85, 33);
		contentPane.add(btnNewButton_1_2);
		
		JLabel lblMargenDerecho = new JLabel("Margen Derecho");
		lblMargenDerecho.setHorizontalAlignment(SwingConstants.CENTER);
		lblMargenDerecho.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMargenDerecho.setBounds(295, 358, 157, 23);
		contentPane.add(lblMargenDerecho);
		
		label4 = new JLabel("0");
		label4.setOpaque(true);
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setForeground(Color.WHITE);
		label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label4.setBackground(Color.BLUE);
		label4.setBounds(281, 405, 66, 62);
		contentPane.add(label4);
		
		JButton btnNewButton_3_1 = new JButton("+");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato= label4.getText();
				int n = Integer.parseInt(dato);
				if(n<20)
				{
					n = n + 1;
					label4.setText(String.valueOf(n));
					x2 = x2 - 3;
					repaint();
				}
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3_1.setBounds(368, 398, 85, 33);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_1_2_1 = new JButton("-");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato= label4.getText();
				int n = Integer.parseInt(dato);
				if(n>0)
				{
					n = n - 1;
					label4.setText(String.valueOf(n));
					x2 = x2 + 3;
					repaint();
				}
			}
		});
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_2_1.setBounds(368, 441, 85, 33);
		contentPane.add(btnNewButton_1_2_1);
	}
	
	int y1=0;
	int y2=0;
	int x1=0;
	int x2=0;
	private JLabel label3;
	private JLabel label4;
	public void paint (Graphics g)
	{
		
		super.paint(g);
		
		// Sombra de la hoja
		g.setColor(Color.black);
		g.fillRect(80, 130, 130, 210);
		
		// Hoja
		g.setColor(Color.yellow);
		g.fillRect(70, 120, 130, 210);		
		
		// Margen Izquierdo
		g.setColor(Color.red);
		g.fillRect(70+x1, 120, 4, 210);
		
		// Margen Derecho
		g.setColor(Color.red);
		g.fillRect(70+130-4+x2, 120, 4, 210);
		
		// Margen Superior
		g.setColor(Color.red);
		g.fillRect(70, 120+y1, 130, 4);
		
		// Margen Inferior
		g.setColor(Color.red);
		g.fillRect(70, 120+210-4+y2, 130, 4);
		
		g.setColor(Color.black);
		g.drawRect(70, 120, 130, 210);
		
	}
}