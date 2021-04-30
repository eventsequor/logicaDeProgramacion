package com.sophos.logicaprogramacion.vehiculo;

public class Combustible {
	String tipo;
	String nombre;
	Integer cantidadGasolinaEnLitros;

	public Integer getCantidadGasolinaEnLitros() {
		return cantidadGasolinaEnLitros;
	}

	public void setCantidadGasolinaEnLitros(Integer cantidadGasolinaEnLitros) {
		this.cantidadGasolinaEnLitros = cantidadGasolinaEnLitros;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
