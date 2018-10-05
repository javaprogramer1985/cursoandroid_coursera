package com.softwareatumedida.interfac;

public class SmartPhone extends Telefono implements IDevolucion{
	
	private String SIM;
	
	public SmartPhone(int id, double precio, String marca, String modelo, String SIM) {
		super(id, precio, marca, modelo);
		// TODO Auto-generated constructor stub
		this.SIM = SIM;
	}

	public String getSIM() {
		return SIM;
	}

	public void setSIM(String sIM) {
		SIM = sIM;
	}
	
	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("Se devolvio un SmartPhone");
	}
}
