package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Inicio extends JPanel{
	
	private JButton iniciar, foto;
	private JLabel etiqueta1, etiqueta2;
	
	public Inicio() {
		setSize(500, 600);
		setLayout(null);
		asignar();
		setBackground(Color.DARK_GRAY);
		setVisible(true);
	}

	private void asignar() {
		
		ImageIcon imagen = new ImageIcon("logo.jpg");
		ImageIcon icon = new ImageIcon(imagen.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		foto = new JButton(icon);
		foto.setActionCommand("FOTO");
		foto.setBounds(130,150,200,200);
		add(foto);
		
		iniciar = new JButton("Comenzar");
		iniciar.setActionCommand("INICIAR");
		iniciar.setBounds(165,450,150,50);
		iniciar.setFont(new Font("Arial", Font.BOLD,15));
		add(iniciar);
		
		etiqueta1 = new JLabel("Autor: Julian Andres Silva Beltran");
		etiqueta1.setFont(new Font("Arial", Font.ITALIC,25));
		etiqueta1.setBounds(50,370,450,80);
		etiqueta1.setForeground(Color.white);
		add(etiqueta1);
		
		etiqueta2 = new JLabel("CELL PHONE STORAGE");
		etiqueta2.setFont(new Font("Arial", Font.ITALIC,25));
		etiqueta2.setBounds(100,40,450,80);
		etiqueta2.setForeground(Color.white);
		add(etiqueta2);	
	}

	public JButton getIniciar() {
		return iniciar;
	}

	public void setIniciar(JButton iniciar) {
		this.iniciar = iniciar;
	}

	public JButton getFoto() {
		return foto;
	}

	public void setFoto(JButton foto) {
		this.foto = foto;
	}

	public JLabel getEtiqueta1() {
		return etiqueta1;
	}

	public void setEtiqueta1(JLabel etiqueta1) {
		this.etiqueta1 = etiqueta1;
	}

	public JLabel getEtiqueta2() {
		return etiqueta2;
	}

	public void setEtiqueta2(JLabel etiqueta2) {
		this.etiqueta2 = etiqueta2;
	}
	
}
