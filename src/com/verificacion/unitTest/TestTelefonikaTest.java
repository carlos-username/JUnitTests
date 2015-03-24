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

}
