package com.verificacion.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.verificacion.pruebas.Internet;
import com.verificacion.pruebas.Telefono;

public class TelefonoTest {

	@Test
	public void testRegresaDatos() {
		String nombreCliente = "Jose Gamez";
		int numCuenta = 13;
		float sal = 200;
		int telef = 83592311;
		int numeroGratuito = 14344554;
		
		Telefono telefono = new Telefono(nombreCliente, numCuenta, telef, sal, numeroGratuito);
		assertEquals("El cliente "+nombreCliente+", con número de cuenta # "+numCuenta+", tiene un saldo de: "+sal+
				". Su número telefonico es: "+telef, telefono.regresaDatos());
	}

	@Test
	public void testTelefono() {
		String nombreCliente = "Jose Gamez";
		int numCuenta = 14;
		float sal = 300;
		int telef = 83592331;
		int numeroGratuito = 14344554;
		
		
		Telefono telefono = new Telefono(nombreCliente, numCuenta, telef, sal, numeroGratuito);
		assertEquals("El cliente "+nombreCliente+", con número de cuenta # "+numCuenta+", tiene un saldo de: "+sal+
				". Su número telefonico es: "+telef, telefono.regresaDatos());
	}

	@Test(expected=IllegalArgumentException.class)
	public void testGetsaldoTelefono() {
		String nombreCliente = "BladisLab";
		int numCuenta = 5;
		float sal = 300;
		int telef = 84493311;
		int numeroGratuito = 13324454;
		
		Telefono telefono = new Telefono(nombreCliente, numCuenta, telef, sal, numeroGratuito);
		Telefono telefon2 = new Telefono(nombreCliente, numCuenta, telef, sal, numeroGratuito);
		
	}

	@Test
	public void testLlamadaCelular() throws Exception {
		String nombreCliente = "Josefyy";
		int numCuenta = 5;
		float sal = 328;
		int telef = 44493311;
		int numeroGratuito = 13324454;
		
		Telefono telefono = new Telefono(nombreCliente, numCuenta, telef, sal, numeroGratuito);
		
		telefono.llamadaCelular(5, numeroGratuito);
		
		assertEquals(sal, telefono.getSaldoTelefono(), 0);
	}

	@Test
	public void testGetNumeroGratuito() {
		String nombreCliente = "Jose Gamez";
		int numCuenta = 5;
		float sal = 200;
		int telef = 83592311;
		int numeroGratuito = 14344554;
	
		
		Telefono telefono = new Telefono(nombreCliente, numCuenta, telef, sal, numeroGratuito);
		assertTrue(telefono.isNumeroGratuito(numeroGratuito));
	}

}
