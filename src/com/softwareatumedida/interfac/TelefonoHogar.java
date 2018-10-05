package com.softwareatumedida.interfac;

public class TelefonoHogar extends Telefono implements IDevolucion{

	private boolean alambrico;
	
	public TelefonoHogar(int id, double precio, String marca, String modelo, boolean alambrico) {
		super(id, precio, marca, modelo);
		// TODO Auto-generated constructor stub
		this.alambrico = alambrico;
	}

	public boolean isAlambrico() {
		return alambrico;
	}

	public void setAlambrico(boolean alambrico) {
		this.alambrico = alambrico;
	}

	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("Se devolvio un telefono de hogar");
	}
}
