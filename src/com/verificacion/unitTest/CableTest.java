package com.verificacion.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.verificacion.pruebas.Cable;

public class CableTest {

	@Test
	public void testRegresaDatos() {
		String nombreCliente = "Jose Gamez";
		int numCuenta = 13;
		float saldoTotal = 200;
		int edad = 22;
		int paquete = 3;
		int numTv = 3;
		
		
		Cable cable = new Cable(nombreCliente, numCuenta, saldoTotal, edad, paquete, numTv);
		assertEquals("El cliente "+nombreCliente+", con número de cuenta # "+numCuenta+", tiene un saldo de internet de: "+saldoTotal+".", cable.regresaDatos());
		
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCable() {
		String nombreCliente = "Miguel Sanz";
		int numCuenta = 13;
		float saldoTotal = 200;
		int edad = 14;
		int paquete = 0;
		int numTv = 2;
		
		
		Cable cable = new Cable(nombreCliente, numCuenta, saldoTotal, edad, paquete, numTv);
		
	}

	@Test
	public void testGetSaldo() {
		String nombreCliente = "Carlos K";
		int numCuenta = 33;
		float saldo = 200;
		int edad = 20;
		int paquete = 2;
		int numTv = 5;
		
		
		Cable cable = new Cable(nombreCliente, numCuenta, saldo, edad, paquete, numTv);
		assertEquals(saldo, cable.getSaldo(), 0);
	}

	@Test
	public void testNombrePaquete() {
		String nombreCliente = "Klinsmann";
		int numCuenta = 13;
		float saldo = 500;
		int edad = 21;
		int paquete = 6;
		int numTv = 5;
		
		
		Cable cable = new Cable(nombreCliente, numCuenta, saldo, edad, paquete, numTv);
		System.out.println(cable.nombrePaquete());
	}

	@Test
	public void testCostoMensualTV() {
		String nombreCliente = "Ludim";
		int numCuenta = 666;
		float saldo = 50;
		int edad = 22;
		int paquete = 2;
		int numTv = 5;
		
		
		Cable cable = new Cable(nombreCliente, numCuenta, saldo, edad, paquete, numTv);
		assertEquals("XXX", cable.nombrePaquete());
	
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCostoMensualTVMenorEdad(){
		
		String nombreCliente = "Juan";
		int numCuenta = 7;
		int saldo = 3;
		int edad = 17;
		int paquete = 2;
		int numTv = 2;
		
		
		Cable cable2 = new Cable(nombreCliente, numCuenta, saldo, edad, paquete, numTv);
		System.out.println(cable2.nombrePaquete());
	}
	

}
