import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;

public class Cisterna extends JFrame {

	private JPanel contentPane;
	private JLabel label1;
	private JLabel labelCorrecto;
	private JLabel label2;
	int nivel=0;
	int depto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cisterna frame = new Cisterna();
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
	public Cisterna() {
		setTitle("   ***Cisterna***");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton departamento1 = new JButton("Departamento 1");
		departamento1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				label1.setText("1");
				depto=1;
			}
		});
		departamento1.setBounds(24, 52, 125, 29);
		contentPane.add(departamento1);

		JButton departamento2 = new JButton("Departamento 2");
		departamento2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				label1.setText("2");
				depto=2;
			}
		});
		departamento2.setBounds(24, 98, 125, 29);
		contentPane.add(departamento2);

		JButton departamento3 = new JButton("Departamento 3");
		departamento3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				label1.setText("3");
				depto=3;
			}
		});
		departamento3.setBounds(24, 154, 125, 29);
		contentPane.add(departamento3);

		JLabel lblNewLabel = new JLabel("Departamento Seleccionado: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(159, 52, 180, 29);
		contentPane.add(lblNewLabel);

		label1 = new JLabel("---");
		label1.setOpaque(true);
		label1.setBackground(Color.ORANGE);
		label1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(227, 92, 43, 39);
		contentPane.add(label1);

		JButton btnDepartamento_1_1 = new JButton("Inicializar");
		btnDepartamento_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDepartamento_1_1.setBounds(186, 154, 125, 29);
		contentPane.add(btnDepartamento_1_1);

		JButton btnDepartamento_1_1_1 = new JButton("Comenzar");
		btnDepartamento_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dato1 = label2.getText();
				String dato2 = label1.getText();
				int nivel = Integer.parseInt(dato1);
				int depto = Integer.parseInt(dato2);

				if(depto==1 && nivel>0 && nivel<50)
				{
					labelCorrecto.setText("Correcto");
				}
				else
				{
					if(depto==2 && nivel>=50 && nivel<=70)
					{
						labelCorrecto.setText("Correcto");
					}
					else
					{
						if(depto==3 && nivel>70)
						{
							labelCorrecto.setText("Correcto");
						}
						else
						{
							labelCorrecto.setText("Incorrecto");
						}
					}
				}

			}
		});
		btnDepartamento_1_1_1.setBounds(370, 52, 125, 29);
		contentPane.add(btnDepartamento_1_1_1);

		JButton btnDepartamento_1_1_2 = new JButton("Salir");
		btnDepartamento_1_1_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});
		btnDepartamento_1_1_2.setBounds(370, 154, 125, 29);
		contentPane.add(btnDepartamento_1_1_2);

		labelCorrecto = new JLabel("---");
		labelCorrecto.setBackground(Color.ORANGE);
		labelCorrecto.setOpaque(true);
		labelCorrecto.setHorizontalAlignment(SwingConstants.CENTER);
		labelCorrecto.setBounds(370, 98, 125, 29);
		contentPane.add(labelCorrecto);

		JLabel lblNivelDeLa = new JLabel("Nivel de la Cisterna:");
		lblNivelDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblNivelDeLa.setBounds(51, 248, 161, 29);
		contentPane.add(lblNivelDeLa);

		label2 = new JLabel("---");
		label2.setOpaque(true);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label2.setBackground(Color.ORANGE);
		label2.setBounds(389, 255, 59, 47);
		contentPane.add(label2);

		JButton btnNewButton_1 = new JButton("<<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(nivel!=0 || nivel==100)
				{
					nivel=nivel-10;
				}
				
				String nivelCisterna=String.valueOf(nivel);
				label2.setText(nivelCisterna);
				}
			}
		);
		btnNewButton_1.setBounds(370, 313, 49, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton(">>");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(nivel==0 || nivel<100)
				{
					nivel=nivel+10;
				}
				
				String nivelCisterna=String.valueOf(nivel);
				label2.setText(nivelCisterna);
				}
			
		});
		btnNewButton_1_1.setBounds(429, 313, 49, 23);
		contentPane.add(btnNewButton_1_1);
	}

	public void paint(Graphics g) {
		super.paint(g);

		// rectangulo contenedor superior
		g.drawRect(20, 45, 500, 205);
		// rectangulo contenedor inferior
		g.drawRect(20, 260, 500, 160);

		// medidor
		g.drawRect(65, 330, 230, 50);

		// porcentajes
		int espaciado = 22;

		g.drawString("0", 65 + espaciado * 0, 397);
		g.drawString("10", 65 + espaciado * 1, 397);
		g.drawString("20", 65 + espaciado * 2, 397);
		g.drawString("30", 65 + espaciado * 3, 397);
		g.drawString("40", 65 + espaciado * 4, 397);
		g.drawString("50", 65 + espaciado * 5, 397);
		g.drawString("60", 65 + espaciado * 6, 397);
		g.drawString("70", 65 + espaciado * 7, 397);
		g.drawString("80", 65 + espaciado * 8, 397);
		g.drawString("90", 65 + espaciado * 9, 397);
		g.drawString("100", 65 + espaciado * 10, 397);
		g.drawString("%", 65 + espaciado * 11, 397);

		// linea de nivel de cisterna

		g.setColor(Color.red);
		g.fillRect(65, 330, 10, 52);
	}
}
