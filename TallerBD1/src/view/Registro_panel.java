package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Registro_panel extends JPanel{
	
	private JTable tabla;
	private JButton editar,actualizar, atras;
	private DefaultTableModel modelotabla;
	private int cantidad = 0;
	/*
	private String[] cabezera = {"MARCA","MODELO","SISTEMA_OP","IMEI"};
	*/
	public Registro_panel() {
		
		setSize(500, 600);
		setLayout(null);
		asignarentidades();
		cargarTabla();
		setBackground(Color.DARK_GRAY);
		setVisible(false);
	}

	public void eliminarFila(String Imei) {
		for (int i = 0; i < tabla.getRowCount(); i++) {
			if(Imei.equals(tabla.getModel().getValueAt(i, 0))) {
				modelotabla.removeRow(i);
				cantidad--;
			}
		}
	}
	
	public String leerimei() {
		return tabla.getModel().getValueAt(tabla.getSelectedRow(), 0).toString();
	}

	private void cargarTabla() {
		//Esa variable cantidad = es para controlar las filas del registro.
		tabla = new JTable(new DefaultTableModel(new Object[] {"MARCA","MODELO","SISTEMA_OP","IMEI"}, cantidad));
		//
		modelotabla = (DefaultTableModel) tabla.getModel();
		//
		JScrollPane jscp = new JScrollPane(tabla);
		/*jscp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		 * Es la definicion del scroll que sube o baja el contenido.
		*/
		jscp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		jscp.setPreferredSize(new Dimension(400,250));
		jscp.setBounds(10,50,460,400);
		add(jscp);		
		cantidad++;
	}
	public void anadirCelular(String marca, String modelo, String SistemOP, String Imei) {
		modelotabla.addRow(new Object[] {marca, modelo, SistemOP, Imei});
		cantidad++;
	}
	private void asignarentidades() {		
		editar = new JButton("Borrar");
		editar.setActionCommand("BORRAR");
		editar.setBounds(50,500,100,50);
		add(editar);
		
		actualizar = new JButton("Actualizar");
		actualizar.setActionCommand("ACTUALIZAR");
		actualizar.setBounds(170,500,100,50);
		add(actualizar);
		
		atras = new JButton("Atras");
		atras.setActionCommand("ATRAS");
		atras.setBounds(290,500,100,50);
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

	public DefaultTableModel getModelotabla() {
		return modelotabla;
	}

	public void setModelotabla(DefaultTableModel modelotabla) {
		this.modelotabla = modelotabla;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public JButton getAtras() {
		return atras;
	}

	public void setAtras(JButton atras) {
		this.atras = atras;
	}
	
}
