package com.softwareatumedida.herencia;

import com.softwareatumedida.interfac.IDevolucion;

public class Jeans extends Ropa implements IDevolucion{

	private String corte;
	private char genero;
	
	public Jeans(String id, double precio, String talla, String color, String corte, char genero) {
		super(id, precio, talla, color);
		this.corte = corte;
		this.genero = genero;
	}
		
	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("CORTE:" + corte);
		System.out.println("GENERO:" + genero);
	}

	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("devolucion de Jeans");
		
	}
}
