package com.laboratorio;

public class moto {

	private String modelo;
	private String aerolinea;
	private int capacidad;
	
	
	public moto(String modelo, String aerolinea, int capacidad) {
		this.modelo = modelo;
		this.aerolinea = aerolinea;
		this.capaciad = capacidad;
	}
	
	public String getmodelo() {
		return modelo;
	}
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}

	public String getaerolinea() {
		return aerolinea;
	}
	public void setaerolinea(int aerolinea) {
		this.aerolinea = aerolinea;
	}
	public int getcapacidad() {
		return capacidad;
	}
	public void setcapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
}
