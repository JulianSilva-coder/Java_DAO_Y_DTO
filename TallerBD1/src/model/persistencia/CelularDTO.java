package model.persistencia;

import java.io.Serializable;

public class CelularDTO implements Serializable{
	
	/**
	 * 1L: long, diferenciar los enteros con los long
	 */
	private static final long serialVersionUID = 1000470126L;
	private String marca;
	private String modelo;
	private String sistemaOP;
	private String imei;
	
	public CelularDTO(String marca, String modelo, String sistemaOP, String imei) {
		this.marca = marca;
		this.modelo = modelo;
		this.sistemaOP = sistemaOP;
		this.imei = imei;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSistemaOP() {
		return sistemaOP;
	}

	public void setSistemaOP(String sistemaOP) {
		this.sistemaOP = sistemaOP;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", sistemaOP=" + sistemaOP + ", imei=" + imei + "]";
	}


}
