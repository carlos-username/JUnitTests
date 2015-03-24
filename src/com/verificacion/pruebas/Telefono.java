package com.verificacion.pruebas;

public class Telefono extends Telefonika
{
	private int numeroTelefono;
	private float saldoTelefono; 
	private final double tarifaCelular = 3.45;
	private  int numeroGratuito;
	
	public Telefono(String nom, int cu, int tel, float sal, int numeroGratuito)
	{
		super(nom,cu,sal);
		numeroTelefono=tel;
		saldoTelefono=sal;
		this.numeroGratuito = numeroGratuito;
	}
	
	public float getsaldoTelefono()
	{
		return saldoTelefono;
	}
	
	public String regresaDatos()
	{
		return "El cliente "+super.getNombreCliente()+", con número de cuenta # "+super.getNumCuenta()+", tiene un saldo de: "+saldoTelefono+
				". Su número telefonico es: "+numeroTelefono;
	}
	
	public void llamadaCelular(int minutos, int numero) throws Exception{
		if(isNumeroGratuito(numero)){
			return;
		}
		if(saldoTelefono < tarifaCelular){
			throw new Exception("El saldo es insuficiente");			
		}
		saldoTelefono -= tarifaCelular;
	}
	
	public boolean isNumeroGratuito(int numero){
		return numero == numeroGratuito;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public float getSaldoTelefono() {
		return saldoTelefono;
	}

	public void setSaldoTelefono(float saldoTelefono) {
		this.saldoTelefono = saldoTelefono;
	}

	public int getNumeroGratuito() {
		return numeroGratuito;
	}

	public void setNumeroGratuito(int numeroGratuito) {
		this.numeroGratuito = numeroGratuito;
	}

	public double getTarifaCelular() {
		return tarifaCelular;
	}
	
	

}
