package com.verificacion.pruebas;

import java.util.ArrayList;


public class Telefonika 
{
	private String nombreCliente;
	private int numCuenta;
	private float saldoTotal;
	private ArrayList<String> arrNombres = new ArrayList<String>();
	private ArrayList<Integer> arrCuentas = new ArrayList<Integer>();
	
	public Telefonika(String nom, int cuenta, float sal)
	{
		while(!checkCuentaUsuario(nom,cuenta))
		{
			nombreCliente=nom;
			while(!checkCuenta(cuenta))
			{
				System.out.println("Número de cuenta equivocado. Escribalo otra vez");
			}
			numCuenta=cuenta;
		}
		saldoTotal=sal;
		System.out.println(regresaDatos());
	}
	
	public String regresaDatos()
	{
		return "El cliente "+nombreCliente+", con número de cuenta # "+numCuenta+", tiene un saldo de"+saldoTotal;
	}
	
	public boolean checkCuenta(int cuenta)
	{
		boolean flag=false;
		if(cuenta>0)
		{
			flag=true;
		}
		return flag;
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
	
	public String getNombre()
	{
		return nombreCliente;
	}
	
	public int getNumCuenta()
	{
		return numCuenta;
	}
}
