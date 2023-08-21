import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Suministrodeagua extends JFrame {

	private JPanel contentPane;
	private JLabel label2;
	private JLabel label3;
	private JLabel label1;
	int nivel;
	int barrio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Suministrodeagua frame = new Suministrodeagua();
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
	public Suministrodeagua() {
		setTitle("Suministro de Agua");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 502);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Opciones");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Barrio A");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label2.setText("A");

			}
		});
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Barrio B");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label2.setText("B");

			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Barrio C");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label2.setText("C");
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Salir");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton botonA = new JButton("Barrio A");
		botonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label2.setText("A");

			}
		});
		botonA.setBounds(281, 58, 89, 23);
		contentPane.add(botonA);

		JButton botonB = new JButton("Barrio B");
		botonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label2.setText("B");
			}
		});
		botonB.setBounds(281, 92, 89, 23);
		contentPane.add(botonB);

		JButton btnNewButton_2 = new JButton("Barrio C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label2.setText("C");
			}
		});
		btnNewButton_2.setBounds(281, 126, 89, 23);
		contentPane.add(btnNewButton_2);

		label2 = new JLabel("---");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setOpaque(true);
		label2.setBackground(Color.WHITE);
		label2.setBounds(422, 84, 70, 39);
		contentPane.add(label2);

		JButton btnNewButton_3 = new JButton("Suministrar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String dato = label1.getText();
				int nivel = Integer.parseInt(dato);
				
				String barrio = label2.getText();

				if (barrio.equals("A") && nivel <= 5000) {
					label3.setText("Correcto");
				} else if (barrio.equals("B") && nivel <= 8000) {
					label3.setText("Correcto");
				} else if (barrio.equals("C") && nivel <= 10000) {
					label3.setText("Correcto");
				} else {
					label3.setText("Incorrecto");
				}
			}
		});
		btnNewButton_3.setBounds(281, 200, 106, 23);
		contentPane.add(btnNewButton_3);

		label3 = new JLabel("---");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setOpaque(true);
		label3.setBackground(Color.WHITE);
		label3.setBounds(422, 200, 83, 23);
		contentPane.add(label3);

		JLabel lblNewLabel_2 = new JLabel("Destino");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(435, 62, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Estado");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(446, 175, 46, 14);
		contentPane.add(lblNewLabel_3);

		JButton btnNewButton_4 = new JButton("Inicializar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label1.setText("0");
				label2.setText("---");
				label3.setText("---");
				y = 0;
				repaint();
			}
		});
		btnNewButton_4.setBounds(281, 298, 224, 23);
		contentPane.add(btnNewButton_4);

		JLabel lblNewLabel_4 = new JLabel("Nivel del tanque");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(28, 68, 106, 19);
		contentPane.add(lblNewLabel_4);

		label1 = new JLabel("0");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setOpaque(true);
		label1.setBackground(Color.WHITE);
		label1.setBounds(162, 58, 46, 39);
		contentPane.add(label1);

		JButton btnNewButton_5 = new JButton("<<");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String dato = label1.getText();
				int n = Integer.parseInt(dato);

				if (n > 0) {
					n = n - 1000;
					label1.setText(String.valueOf(n));
					y = y - 15;
					repaint();
				}

			}
		});
		btnNewButton_5.setBounds(29, 238, 57, 23);
		contentPane.add(btnNewButton_5);

		JButton btnNewButton_5_1 = new JButton(">>");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String dato = label1.getText();
				int n = Integer.parseInt(dato);

				if (n < 10000) {
					n = n + 1000;
					label1.setText(String.valueOf(n));
					y = y + 15;
					repaint();

				}
			}
		});
		btnNewButton_5_1.setBounds(151, 238, 57, 23);
		contentPane.add(btnNewButton_5_1);

		JButton btnNewButton_6 = new JButton("Datos Seleccionados");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tanque = label1.getText();
				String destino = label2.getText();

				JOptionPane.showMessageDialog(null, "Destino:  " + destino + " \n Nivel del Tanque: " + tanque);

			}
		});
		btnNewButton_6.setBounds(26, 298, 182, 23);
		contentPane.add(btnNewButton_6);
	}

	int y = 0;

	public void paint(Graphics g) {
		super.paint(g);

		// medidor
		g.setColor(Color.black);
		g.drawRect(40, 210, 165, 40);

		// porcentajes

		int espaciado = 40;

		g.drawString("0", 35 + espaciado * 0, 200);
		g.drawString("2000", 7 + espaciado * 1, 200);
		g.drawString("4000", 7 + espaciado * 2, 200);
		g.drawString("6000", 7+ espaciado * 3, 200);
		g.drawString("8000", 7 + espaciado * 4, 200);
		g.drawString("10000", 7 + espaciado * 5, 200);

		// linea de nivel de cisterna

		g.setColor(Color.red);
		g.fillRect(40, 210, 15 + y, 40);

	}

}
