package com.softwareatumedida.practicasemana2;

public class Pelicula {
	
	private String titulo;
	private String genero;
	private String creador;
	private short anio;
	private boolean visto;
	
	public Pelicula() {
		// TODO Auto-generated constructor stub
	}
	
	public Pelicula(String titulo, String creador) {		
		this.titulo = titulo;
		this.genero = "";
		this.creador = creador;
		this.anio = 0;
		this.visto = false;
		
	}
	
	public Pelicula(String titulo,String genero,String creador,short anio) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.anio = anio;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public short getAnio() {
		return anio;
	}
	public void setAnio(short anio) {
		this.anio = anio;
	}	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
