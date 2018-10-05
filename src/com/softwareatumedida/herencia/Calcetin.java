package com.softwareatumedida.herencia;

import com.softwareatumedida.interfac.IDevolucion;

public class Calcetin extends Ropa implements IDevolucion{

	public Calcetin(String id, double precio, String talla, String color) {
		super(id, precio, talla, color);
	}

	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("Se devolvio unos calcetines");
	}

}
