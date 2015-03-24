package com.verificacion.pruebas;

public class Cable extends Telefonika
{
	private float saldoCable;
	
	public Cable(String nom, int cu, float sal)
	{
		super(nom, cu, sal);
		saldoCable=sal;
	}
	
	public float getSaldo()
	{
		return saldoCable;
	}
	
	public String regresaDatos()
	{
		return "El cliente "+super.getNombre()+", con número de cuenta # "+super.getNumCuenta()+", tiene un saldo de internet de: "+saldoCable+
				".";
	}

	
}
