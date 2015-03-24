package com.verificacion.pruebas;

import java.util.ArrayList;


public class Telefonika 
{
	private String nombreCliente;
	private int numCuenta;
	private float saldoTotal;
	private static ArrayList<String> arrNombres = new ArrayList<String>();
	private static ArrayList<Integer> arrCuentas = new ArrayList<Integer>();
	
	public Telefonika(String nom, int cuenta, float sal) throws IllegalArgumentException
	{
		if(!checkCuentaUsuario(nom,cuenta))
		{
			nombreCliente=nom;
			arrNombres.add(nombreCliente);
			if(!checkCuenta(cuenta))
			{
				throw new IllegalArgumentException("Número de cuenta equivocado. Escribalo otra vez");
			}
			numCuenta=cuenta;
			arrCuentas.add(this.numCuenta);
		}else {
			throw new IllegalArgumentException("El valor es negativo");
		}		
		saldoTotal=sal;
		
	}
	
	public String regresaDatos()
	{
		return "El cliente "+nombreCliente+", con número de cuenta # "+numCuenta+", tiene un saldo de"+saldoTotal;
	}
	
	public boolean checkCuenta(int cuenta)
	{
		return cuenta > 0;
	}
	
	public boolean checkCuentaUsuario(String nom, int cuenta)
	{
		boolean flag=false;
		if(!arrNombres.isEmpty())
		{
			//Búsqueda recorriendo todos los nombres y cuentas
			for(int i=0; i<arrNombres.size(); i++)
			{
				if(arrNombres.get(i)==nom && arrCuentas.get(i)==cuenta)
				{
					flag=true;
					break;
				}
			}
		}
		else
		{
			arrNombres.add(nom);
			arrCuentas.add(cuenta);
		}
		return flag;
		
	}
	
	public String getNombreCliente()
	{
		return nombreCliente;
	}
	
	public int getNumCuenta()
	{
		return numCuenta;
	}
	
	public void setNombreCliente(String nombreCliente) throws IllegalArgumentException
	{
		if(!arrNombres.contains(nombreCliente)){
			this.nombreCliente = nombreCliente;
		}
		throw new IllegalArgumentException("El usuario ya existe");
		
		
	}
	
	public void setNumCuenta(int cuenta) throws IllegalArgumentException
	{
		if(!checkCuentaUsuario(this.nombreCliente,cuenta))
		{
			if(!checkCuenta(cuenta))
			{
				throw new IllegalArgumentException("Número de cuenta equivocado. Escribalo otra vez");
			}
			numCuenta=cuenta;
		}else {
			throw new IllegalArgumentException("El valor es negativo");
		}	
	}

	public void setSaldoTotal(float saldo) {
		saldoTotal=saldoTotal + saldo;
		
	}
	
	public float getSaldoTotal(){
		return this.saldoTotal;
	}
}
