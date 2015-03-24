package com.verificacion.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.verificacion.pruebas.Cable;
import com.verificacion.pruebas.Internet;

public class InternetTest {

	@Test
	public void testRegresaDatos() {
		String nombreCliente = "Jose Gamez";
		int numCuenta = 13;
		float sal = 200;
		String plan = "hogar";
		
		String planDescription = "Disfruta la programación de los canales abiertos de tu localidad, incluidos en tu servicio de AXTEL TV. Y del mejor internete con 100 megas de velocidad.";
		
		Internet internet = new Internet(nombreCliente, numCuenta, plan, sal);
		assertEquals("El cliente "+nombreCliente+", con número de cuenta # "+numCuenta+", tiene un saldo de internet de: "+sal+
				"con un plan :'"+planDescription+"'.", internet.regresaDatos());
		
	}

	@Test(expected=IllegalArgumentException.class)
	public void testInternet() {
		String nombreCliente = "Ever Salinas";
		int numCuenta = 2;
		float sal = 0;
		String plan = "internet";

		Internet internet = new Internet(nombreCliente, numCuenta, plan, sal);
		
		System.out.println(internet.regresaDatos());
	}

	@Test
	public void testCheckPlan() {
		String nombreCliente = "Ever Salinas";
		int numCuenta = 45;
		float sal = 400;
		String plan = "hogar";
		String planDescription = "Disfruta la programación de los canales abiertos de tu localidad, incluidos en tu servicio de AXTEL TV. Y del mejor internete con 100 megas de velocidad.";
		
		Internet internet = new Internet(nombreCliente, numCuenta, plan, sal);
		
		assertEquals(planDescription, internet.checkPlan(plan));
	}

	@Test
	public void testGetSaldo() {
		String nombreCliente = "Roberto Enriquez";
		int numCuenta = 35;
		float sal = 300;
		String plan = "empresarial";
		Internet internet = new Internet(nombreCliente, numCuenta, plan, sal);
		
		assertEquals(sal, internet.getSaldo(), 0);
	}

	@Test
	public void testRandomDiscount() {
		String nombreCliente = "Gabriel Domingo";
		int numCuenta = 20;
		float sal = 100;
		String plan = "hogar";
		Internet internet = new Internet(nombreCliente, numCuenta, plan, sal);
		boolean as = (sal+10.0) > internet.randomDiscount();
		assertTrue(as);
	}

}
