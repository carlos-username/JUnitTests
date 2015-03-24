package com.verificacion.pruebas;

public class Telefono extends Telefonika
{
	private int numeroTelefono;
	private float saldoTelefono;
	
	public Telefono(String nom, int cu, int tel, float sal)
	{
		super(nom,cu,sal);
		numeroTelefono=tel;
		saldoTelefono=sal;
	}
	
	public float getsaldoTel()
	{
		return saldoTelefono;
	}
	
	public String regresaDatos()
	{
		return "El cliente "+super.getNombre()+", con número de cuenta # "+super.getNumCuenta()+", tiene un saldo de: "+saldoTelefono+
				". Su número telefonico es: "+numeroTelefono;
	}

}
