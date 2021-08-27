package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.CellPhone;
import view.Ventana_Inicio;

public class Controller implements ActionListener{

	private Ventana_Inicio ventana;
	private CellPhone phone;
	
	public Controller() {
		phone = new CellPhone();
		anadircelular("XIAOMI","IP5","ANDROID","12345");
		leercelular("12345");
		ventana = new Ventana_Inicio();
		asignarOyentes();
	}
	private void asignarOyentes() {
		ventana.getInicio().getFoto().addActionListener(this);
		ventana.getInicio().getIniciar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		if(comando.equals("FOTO")) {
			JOptionPane.showMessageDialog(ventana, "The University of the Bosque carried out an inventory program for cell phones to start press the button continue");
			JOptionPane.showMessageDialog(ventana, "La universidad del Bosque realizo un programa de inventario para celulares para iniciar oprime el boton continuar");
		}else if(comando.equals("INICIAR")) {
			ventana.getInicio().setVisible(false);
			ventana.getAlmacen().setVisible(true);
		}else if(comando.equals("TABLA")) {
			ventana.getInicio().setVisible(false);
			ventana.getAlmacen().setVisible(false);
		}else if(comando.equals("")){
			
		}
		
	}
	
	public void anadircelular(String marca, String modelo, String sistemaOP, String imei) {
		phone.getCelular().crear(marca, modelo, sistemaOP, imei);
	}
	public void leercelular(String imei) {
		var telefono = phone.getCelular().leer(imei);
		System.out.println(telefono.getImei()+telefono.getMarca() + telefono.getModelo() + telefono.getSistemaOP());
	}
}
