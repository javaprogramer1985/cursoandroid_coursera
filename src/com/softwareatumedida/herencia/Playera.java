package com.softwareatumedida.herencia;

import com.softwareatumedida.interfac.IDevolucion;

public class Playera extends Ropa implements IDevolucion{
	
	private String corte;
	
	public Playera(String id, double precio, String talla, String color,String corte) {
		super(id, precio, talla, color);
		this.corte = corte;
	}
		
	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("CORTE: " + corte);
	}

	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("se devolvio una playera");
	}
}
