package com.verificacion.pruebas;

public class Internet extends Telefonika
{
	private String planInternet;
	private float saldoInternet;
	
	public Internet(String nom,int cu,String plan,float sal)
	{
		super(nom,cu,sal);
		planInternet=plan;
		saldoInternet=sal;
	}
	
	public String regresaDatos()
	{
		return "El cliente "+super.getNombre()+", con número de cuenta # "+super.getNumCuenta()+", tiene un saldo de internet de: "+saldoInternet+
				"con un plan :'"+planInternet+"'.";
	}
	
	public float getSaldo()
	{
		return saldoInternet;
	}

}
