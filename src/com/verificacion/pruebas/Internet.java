package com.verificacion.pruebas;

import java.util.Random;


public class Internet extends Telefonika
{
	private String planInternet;
	private float saldoInternet;
	
	public Internet(String nom,int cu,String plan,float sal)
	{
		super(nom,cu,sal);
		planInternet=checkPlan(plan);
		saldoInternet=sal;
		super.setSaldoTotal(saldoInternet-randomDiscount());
		regresaDatos();
	}
	
	public String checkPlan(String pl)
	{
		String temp=null;
		switch(pl.toLowerCase())
		{
			case "hogar":
				temp="Disfruta la programación de los canales abiertos de tu localidad, incluidos en tu servicio de AXTEL TV. Y del mejor internete con 100 megas de velocidad.";
				break;
			
			case "empresarial":
				temp="Servicio telefónico que incluye enrutamiento de llamadas por horario, uso o emergencia, discriminación de llamadas, bloqueo y desborde de llamadas.";
				break;
				
			case "internet":
				temp="Conéctate al Internet más rápido de México que te ofrece hasta 200 Megas de velocidad.";
				break;
				
			case "negocios":
				temp="Movilidad, Comodidad, Cobertura y Simplicidad para tu negocio. Con una velocidad de 400 megas para tu local.";
				break;
		}
		return temp;
	}
	
	public String regresaDatos()
	{
		return "El cliente "+super.getNombreCliente()+", con número de cuenta # "+super.getNumCuenta()+", tiene un saldo de internet de: "+saldoInternet+
				"con un plan :'"+planInternet+"'.";
	}
	
	public float getSaldo()
	{
		return saldoInternet;
	}

	public int randomDiscount()
	{
		int discount;
		Random rand = new Random();
		discount=rand.nextInt((int)this.saldoInternet)+10;
		return discount;
	}
}