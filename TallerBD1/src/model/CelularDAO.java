package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import model.persistencia.Archivo;
import model.persistencia.CelularDTO;

public class CelularDAO {
	
	/*
	 * Utilizamos el arrayList para poder crear, escribir, eliminar, y actualizar los objetos del tipo celular 
	 */
	
	public CelularDAO() {
		try {
			var celularesR = (ArrayList<CelularDTO>) new Archivo().leerarchivo();
			celulares = celularesR;
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private ArrayList<CelularDTO> celulares = new ArrayList<>();
	
	public void crear(String marca, String modelo, String sistemaOP, String imei) {
		
		/*
		 * var: Forma rapida de llamar a las variables
		 */
		var celularNuevo = new CelularDTO(marca, modelo, sistemaOP, imei);
		celulares.add(celularNuevo);
		try {
			new Archivo().escribir(celulares);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void eliminar(CelularDTO celular) {
		celulares.remove(celular);
	}
	public CelularDTO leer(String imei) {
		/*
		 * Ese for-each su ejecucion es la misma, la diferencia es como se llama esos objetos.
		 */
		for (CelularDTO busqueda : celulares) {
			if(busqueda.getImei().equals(imei)) {
			return busqueda;	
			}
		}
		return null;
	}
	public void actualizar(CelularDTO objviejo, String marca, String modelo, String sistemaOP, String imei) {
		var celularactualizado = new CelularDTO(marca, modelo, sistemaOP, imei);
		for (int i = 0; i < celulares.size(); i++) {
			if(celulares.get(i) == objviejo) {
				celulares.set(i, celularactualizado);
			}
		}
	}
	public ArrayList<CelularDTO> getCelulares() {
		return celulares;
	}
	
}
