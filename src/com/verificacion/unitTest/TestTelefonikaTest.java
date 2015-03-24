package com.verificacion.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.verificacion.pruebas.Telefonika;

public class TestTelefonikaTest {

	@Test
	public void test() {
		String nombreCliente = "Carlos Klinsmann";
		int numCuenta = 1;
		float saldoTotal = 300;
		
		Telefonika telef = new Telefonika(nombreCliente, numCuenta, saldoTotal);
		
		assertEquals("El cliente "+nombreCliente+", con número de cuenta # "
		+numCuenta+", tiene un saldo de"+saldoTotal, telef.regresaDatos());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNotValid() {
		String nombreCliente = "Marin Salinas";
		int numCuenta = 0;
		float saldoTotal = 400;
		
		Telefonika telef = new Telefonika(nombreCliente, numCuenta, saldoTotal);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNumCuentas() {
		String nombreCliente = "Marin Salinas";
		int numCuenta = 0;
		float saldoTotal = 400;
		
		Telefonika telef = new Telefonika(nombreCliente, numCuenta, saldoTotal);
		Telefonika telef2 = new Telefonika(nombreCliente, numCuenta, saldoTotal);
		
	}
	
	@Test
	public void testSaldoTotal() {
		String nombreCliente = "Marin Salinas";
		int numCuenta = 1;
		float saldoTotal = 999999998;
		
		Telefonika telef = new Telefonika(nombreCliente, numCuenta, saldoTotal);
		telef.setSaldoTotal(saldoTotal);
		assertEquals(saldoTotal, telef.getSaldoTotal());
		
	}
	
	
	
	
	
	
	

}
