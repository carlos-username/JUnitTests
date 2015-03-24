package com.verificacion.pruebas;

public class Cable extends Telefonika
{
	private float saldoCable;
	private int paquete;
	private String[] paquetes = {"Total", "HBO", "XXX", "Basico"};
	private double[] costoPorTV = {79.99, 84.99, 99.89, 50.76};
	private int numTV; 
	private int edadCliente;
	
	public Cable(String nom, int cu, float sal, int edad, int paquete, int numTV) throws IllegalArgumentException
	{
		super(nom, cu, sal);
		saldoCable=sal;
		if(edad < 15){
			throw new IllegalArgumentException("No tienes edad suficiente para contrarar el servio");
		}
		this.edadCliente = edad;
		if(edad < 18 && paquetes[paquete].equals("XXX")){
			throw new IllegalArgumentException("No tienes edad suficiente para contrarar el servcio XXX");
		}
		this.paquete = paquete;
		
		if(numTV < 1) throw new IllegalArgumentException("Debes de tener almenos una tele");
		this.numTV = numTV;
		
	}
	
	public float getSaldo()
	{
		return saldoCable;
	}
	
	public String regresaDatos()
	{
		return "El cliente "+super.getNombreCliente()+", con número de cuenta # "+super.getNumCuenta()+", tiene un saldo de internet de: "+saldoCable+
				".";
	}
	
	public String nombrePaquete(){
		return this.paquetes[this.paquete];
	}
	
	public double costoMensualTV(){
		return this.costoPorTV[this.paquete] * this.numTV;
	}
	
	
	
	

	
}
