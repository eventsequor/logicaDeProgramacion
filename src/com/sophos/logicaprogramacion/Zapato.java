package com.sophos.logicaprogramacion;

public class Zapato {

	private String modelo;
	private String marca;
	private Integer talla;

	public Zapato(String modelo, String marca, Integer talla) {
		this.modelo = modelo;
		this.marca = marca;
		this.talla = talla;
	}

	public Zapato() {
		this("sin modelo", "sin marca", 0);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getTalla() {
		return talla;
	}

	public void setTalla(Integer talla) {
		this.talla = talla;
	}

	public void setTalla(String talla) {
		switch (talla) {
		case "M":
			setTalla(34);
			break;
		case "MX":
			this.talla = 33;
			break;

		default:
			System.out.println("El valor de la talla no existe");
			break;

		}

	}

}
