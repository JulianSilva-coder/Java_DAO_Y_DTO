package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.CellPhone;
import view.Ventana_Inicio;

public class Controller implements ActionListener {

	private Ventana_Inicio ventana;
	private CellPhone phone;

	public Controller() {
		phone = new CellPhone();
		/*
		 * anadircelular("XIAOMI","IP5","ANDROID","12345"); leercelular("12345");
		 */
		ventana = new Ventana_Inicio();
		asignarOyentes();
		var celularesguardado = phone.getCelular().getCelulares();

		for (int i = 0; i < celularesguardado.size(); i++) {
			ventana.getTabla1().anadirCelular(celularesguardado.get(i).getMarca(), celularesguardado.get(i).getModelo(),
					celularesguardado.get(i).getSistemaOP(), celularesguardado.get(i).getImei());
		}
	}

	private void asignarOyentes() {
		ventana.getInicio().getFoto().addActionListener(this);
		ventana.getInicio().getIniciar().addActionListener(this);
		ventana.getAlmacen().getTabla().addActionListener(this);
		ventana.getArchivo().addActionListener(this);
		ventana.getTabla1().getAtras().addActionListener(this);
		ventana.getAlmacen().getGuardar().addActionListener(this);
		ventana.getTabla1().getEditar().addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		if (comando.equals("FOTO")) {
			JOptionPane.showMessageDialog(ventana,
					"The University of the Bosque carried out an inventory program for cell phones to start press the button continue");
			JOptionPane.showMessageDialog(ventana,
					"La universidad del Bosque realizo un programa de inventario para celulares para iniciar oprime el boton continuar");
		} else if (comando.equals("INICIAR")) {
			ventana.getInicio().setVisible(false);
			ventana.getAlmacen().setVisible(true);
		} else if (comando.equals("TABLA")) {
			ventana.getInicio().setVisible(false);
			ventana.getAlmacen().setVisible(false);
			ventana.getTabla1().setVisible(true);
		} else if (comando.equals("ARCHIVO")) {
			JOptionPane.showMessageDialog(ventana, "Para encontrar el archivo donde se registra todos los objetos."
					+ "\n" + "Dirigete a: TallerBD1 > Data > Datos.cps");
		} else if (comando.equals("ATRAS")) {
			ventana.getInicio().setVisible(false);
			ventana.getAlmacen().setVisible(true);
			ventana.getTabla1().setVisible(false);
		} else if (comando.equals("SUBIR")) {
			if (ventana.getAlmacen().getBarra1().getText().equals("")) {
				JOptionPane.showMessageDialog(ventana, "Llene los datos de marca Por favor");
			} else if (ventana.getAlmacen().getBarra2().getText().equals("")) {
				JOptionPane.showMessageDialog(ventana, "Llene los datos de modelo Por favor");
			} else if (ventana.getAlmacen().getBarra3().getText().equals("")) {
				JOptionPane.showMessageDialog(ventana, "Llene los datos de Sistema_Operativo Por favor");
			} else if (ventana.getAlmacen().getBarra2().getText().equals("")) {
				JOptionPane.showMessageDialog(ventana, "Llene los datos de Imei Por favor");

			}
			anadircelular(ventana.getAlmacen().getBarra1().getText(), ventana.getAlmacen().getBarra2().getText(),
					ventana.getAlmacen().getBarra3().getText(), ventana.getAlmacen().getBarra4().getText());
		}else if(comando.equals("BORRAR")) {
			eliminarcelular(ventana.getTabla1().leerimei());
		}
	}

	public void anadircelular(String marca, String modelo, String sistemaOP, String imei) {
		phone.getCelular().crear(marca, modelo, sistemaOP, imei);
		ventana.getTabla1().anadirCelular(marca, modelo, sistemaOP, imei);
	}

	public void leercelular(String imei) {
		var telefono = phone.getCelular().leer(imei);
		System.out.println(telefono.getImei() + telefono.getMarca() + telefono.getModelo() + telefono.getSistemaOP());
	}
	public void eliminarcelular(String imei) {
		phone.getCelular().eliminar(phone.getCelular().leer(imei));
		ventana.getTabla1().eliminarFila(imei);
	}
}
