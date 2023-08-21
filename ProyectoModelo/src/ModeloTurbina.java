import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ModeloTurbina extends JFrame {

	private JPanel contentPane;
	private JLabel label1;
	private JLabel lblNewLabel;
	private JRadioButton r1;
	private JRadioButton r2;
	private JRadioButton r3;
	private JButton btnNewButton_2;
	private JLabel label3;
	private JButton btnNewButton_3;
	private JLabel label2;
	private JLabel lblNewLabel_1;
	private ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModeloTurbina frame = new ModeloTurbina();
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
	public ModeloTurbina() {
		setTitle(" Modelo de Parcial : Turbina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 420);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Tipo de turbina");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Turbina A");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label2.setText("A");
				r1.setSelected(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Turbina B");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				label2.setText("B");
				r2.setSelected(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Turbina C");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				label2.setText("C");
				r3.setSelected(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_3 = new JMenuItem("Salir");
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
		
		buttonGroup = new ButtonGroup();

		
		label1 = new JLabel("0");
		label1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label1.setOpaque(true);
		label1.setBackground(Color.GREEN);
		label1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(33, 30, 46, 48);
		contentPane.add(label1);
		
		JButton btnNewButton = new JButton("^");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato=label1.getText();
				int n= Integer.parseInt(dato);
				
				
				label3.setForeground(Color.black);
				label3.setText("");
					
					
				if(n<100) {
					n=n+10;
					label1.setText(String.valueOf(n));
					y=y+18;
					repaint();
		
					
					
					if(n==100) {
						label3.setForeground(Color.red);
						label3.setText("Peligro");
					}
					
					
				}
			
			}
		});
		btnNewButton.setBounds(93, 30, 46, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("v");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato=label1.getText();
				int n= Integer.parseInt(dato);
				

				label3.setForeground(Color.black);
				label3.setText("");
				
				if(n>0) {
					n=n-10;
					label1.setText(String.valueOf(n));
					y=y-18;
					repaint();
				
				}
			}
		});
		btnNewButton_1.setBounds(93, 55, 46, 23);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("Seleccione la turbina");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(52, 119, 123, 29);
		contentPane.add(lblNewLabel);
		
		r1 = new JRadioButton("Turbina A");
		r1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				label2.setText("A");
			}
		});
	
		buttonGroup.add(r1);
		r1.setBounds(33, 172, 84, 23);
		contentPane.add(r1);
		
		r2 = new JRadioButton("Turbina B");
		r2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				label2.setText("B");
			}
		});
		buttonGroup.add(r2);
		r2.setBounds(33, 214, 84, 23);
		contentPane.add(r2);
		
		r3 = new JRadioButton("Turbina C");
		r3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				label2.setText("C");
			}
		});
		buttonGroup.add(r3);
		r3.setBounds(33, 254, 84, 23);
		contentPane.add(r3);
		
		label2 = new JLabel("---");
		label2.setOpaque(true);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label2.setBackground(Color.GREEN);
		label2.setBounds(134, 202, 46, 48);
		contentPane.add(label2);
		
		btnNewButton_2 = new JButton("Comenzar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String dato1=label1.getText();
				String dato2=label2.getText();//turbina
				
				int p=Integer.parseInt(dato1);
						
						if(p>=10 && p<40 && dato2.equals("A"))
						{
							label3.setText("Correcto");
						}
						else
						{
							if(p>=50 && p<80 && dato2.equals("B"))
							{
								label3.setText("Correcto");
							}
							else
								if(p>=90 && p<100 && dato2.equals("C"))
								{
									label3.setText("Correcto");
								}
								else
								{
									label3.setText("Incorrecto");
								}
						}
			}
		});
		btnNewButton_2.setBounds(33, 314, 106, 23);
		contentPane.add(btnNewButton_2);
		
		label3 = new JLabel("---");
		label3.setOpaque(true);
		label3.setBackground(Color.ORANGE);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setBounds(158, 314, 84, 23);
		contentPane.add(label3);
		
		btnNewButton_3 = new JButton("Inicializar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				label1.setText("0");
				label2.setText("---");
				label3.setText("---");
				y=0;
				r1.setSelected(false);
				r2.setSelected(false);
				r3.setSelected(false);
				buttonGroup.clearSelection();
				repaint();

				
			}
		});
		btnNewButton_3.setBounds(282, 314, 106, 23);
		contentPane.add(btnNewButton_3);
		
		lblNewLabel_1 = new JLabel("Porcentaje de Vapor");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(282, 30, 123, 23);
		contentPane.add(lblNewLabel_1);
	}
	
	
	int y=0;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	
	public void paint(Graphics g) {
		super.paint(g);
		//recuadro numerico
		g.setColor(Color.black);
		g.drawRect(37,70,115,80);
		
		//recuadro selector radio
		g.setColor(Color.black);
		g.drawRect(37,170,160,170);
		
		//contenido
		g.setColor(Color.red);
		g.fillRect(320,120+180-5-y,50,5+y);
		//             y+ancho-atura
		
	
		//medidor
		g.setColor(Color.black);
		g.drawRect(320,120-5,50,180+5);
		
		// recuadro medidor
		g.setColor(Color.black);
		g.drawRect(270,80,150,260);
		
		
		
	}
}
