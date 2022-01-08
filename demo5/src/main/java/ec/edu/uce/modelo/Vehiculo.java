package ec.edu.uce.modelo;

import java.math.BigDecimal;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String tipo;
	private Propietario propietario;
	private float precio;
	private float valorMatricula;
	
	//set y get
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(float valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	//to string
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", propietario=" + propietario
				+ ", precio=" + precio + ", valorMatricula=" + valorMatricula + "]";
	}
	
}
