package com.sophos.logicaprogramacion.vehiculo;

public class Vehiculo {

	private Integer cantidadLlantas;
	private String color;
	private String marca;
	private BateriaElectrica bateria;
	private Combustible combustible;

	public Vehiculo() {
		this(0, "sin color", "sin marca");
	}

	public Vehiculo(Integer cantidadLlantas, String color, String marca) {
		this.cantidadLlantas = cantidadLlantas;
		this.color = color;
		this.marca = marca;
	}

	public void cargarElVehiculo(Combustible bateria) {

	}

	public void cargarElVehiculo(BateriaElectrica bateria) {

	}

	public Vehiculo(Integer cantidadLlantas) {
		this(cantidadLlantas, "sin color", "sin marca");
	}

	public Integer getCantidadLlantas() {
		return cantidadLlantas;
	}

	public void setCantidadLlantas(Integer cantidadLlantas) {
		this.cantidadLlantas = cantidadLlantas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
