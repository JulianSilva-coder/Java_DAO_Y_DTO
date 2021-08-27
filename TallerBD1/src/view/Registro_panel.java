package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Registro_panel extends JPanel{
	
	private JTable tabla;
	private JButton editar,actualizar, atras;
	private String[] cabezera = {"MARCA","MODELO","SISTEMA_OP","IMEI"};
	private String[][] datos = {{"IPHONE", "XR" , "IOS" , "12345"}};
	
	public Registro_panel() {
		setSize(500, 600);
		setLayout(null);
		asignarentidades();
		setBackground(Color.DARK_GRAY);
		setVisible(false);
	}

	private void asignarentidades() {
		tabla = new JTable(datos,cabezera);
		JScrollPane jscp = new JScrollPane(tabla);
		jscp.setPreferredSize(new Dimension(400,250));
		jscp.setBounds(10,50,450,400);
		add(jscp);
		
		editar = new JButton("Editar");
		editar.setActionCommand("EDITAR");
		editar.setBounds(50,450,100,50);
		add(editar);
		
		actualizar = new JButton("Actualizar");
		actualizar.setActionCommand("ACTUALIZAR");
		actualizar.setBounds(170,450,100,50);
		add(actualizar);
		
		atras = new JButton("Atras");
		atras.setActionCommand("ATRAS");
		atras.setBounds(170,450,100,50);
		add(atras);
	}

	public JTable getTabla() {
		return tabla;
	}

	public void setTabla(JTable tabla) {
		this.tabla = tabla;
	}

	public JButton getEditar() {
		return editar;
	}

	public void setEditar(JButton editar) {
		this.editar = editar;
	}

	public JButton getActualizar() {
		return actualizar;
	}

	public void setActualizar(JButton actualizar) {
		this.actualizar = actualizar;
	}

	public String[] getCabezera() {
		return cabezera;
	}

	public void setCabezera(String[] cabezera) {
		this.cabezera = cabezera;
	}

	public String[][] getDatos() {
		return datos;
	}

	public void setDatos(String[][] datos) {
		this.datos = datos;
	}
}
