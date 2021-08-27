package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Almacen extends JPanel {
	
	private JTextField barra1, barra2, barra3, barra4;
	private JLabel etiq1, etiq2, etiq3,etiq4;
	private JButton guardar, tabla;
	
	public Almacen() {
		setSize(500, 600);
		setLayout(null);
		asignar();
		setBackground(Color.DARK_GRAY);
		setVisible(false);
	
	}

	private void asignar() {
		etiq1 = new JLabel("Marca:");
		etiq1.setFont(new Font("Arial", Font.BOLD,18));
		etiq1.setForeground(Color.white);
		etiq1.setBounds(40,50,80,50);
		add(etiq1);
		
		barra1 = new JTextField();
		barra1.setBounds(40,95,250,40);
		barra1.setFont(new Font("Arial", Font.BOLD,18));
		add(barra1);
		
		etiq2 = new JLabel("Modelo:");
		etiq2.setFont(new Font("Arial", Font.BOLD,18));
		etiq2.setForeground(Color.white);
		etiq2.setBounds(40,140,80,50);
		add(etiq2);
		
		barra2 = new JTextField();
		barra2.setBounds(40,185,250,40);
		barra2.setFont(new Font("Arial", Font.BOLD,18));
		add(barra2);
		
		etiq3 = new JLabel("Sistema Operativo:");
		etiq3.setFont(new Font("Arial", Font.BOLD,18));
		etiq3.setForeground(Color.white);
		etiq3.setBounds(40,230,250,50);
		add(etiq3);
		
		barra3 = new JTextField();
		barra3.setBounds(40,275,250,40);
		barra3.setFont(new Font("Arial", Font.BOLD,18));
		add(barra3);
		
		etiq4 = new JLabel("Numero de Serie:");
		etiq4.setFont(new Font("Arial", Font.BOLD,18));
		etiq4.setForeground(Color.white);
		etiq4.setBounds(40,320,250,50);
		add(etiq4);
		
		barra4 = new JTextField();
		barra4.setBounds(40,365,250,40);
		barra4.setFont(new Font("Arial", Font.BOLD,18));
		add(barra4);
		
		guardar = new JButton("Guardar");
		guardar.setActionCommand("SUBIR");
		guardar.setBounds(85,450,150,50);
		guardar.setFont(new Font("Arial", Font.BOLD,15));
		add(guardar);
		
		tabla = new JButton("Tabla");
		guardar.setActionCommand("TABLA");
		guardar.setBounds(255,450,150,50);
		guardar.setFont(new Font("Arial", Font.BOLD,15));
		add(guardar);
	}
}
