package com.softwareatumedida.herencia;

import com.softwareatumedida.interfac.PlayeraPersonalizada;
import com.softwareatumedida.interfac.SmartPhone;

public class Principal {
	public static void main(String ...args) {
		Playera 	playera 	= new Playera("1", 300.95, "CHICA", "GRIS", "POLO");
		PlayeraPersonalizada playerapersonalizada = new PlayeraPersonalizada("4", 450.58, "MEDIANA", "VERDE", "micuenta@twitter.com");
		Jeans 		jeans 		= new Jeans("2", 595.55, "32", "AZUL", "SKINNY", 'F');
		Calcetin 	calcetin 	= new Calcetin("3", 29, "M", "NEGRO");
		SmartPhone smartphone = new SmartPhone(5, 1525.55, "telefonica", "xxx433", "SIM");
		
		playera.mostrarDatos();
		jeans.mostrarDatos();
		calcetin.mostrarDatos();
		playerapersonalizada.mostrarDatos();
		
		playera.hacerDevolucion();
		jeans.hacerDevolucion();
		calcetin.hacerDevolucion();
		smartphone.hacerDevolucion();
		
	}
}
