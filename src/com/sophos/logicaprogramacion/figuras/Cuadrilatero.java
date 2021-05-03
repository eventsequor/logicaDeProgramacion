package com.sophos.logicaprogramacion.figuras;

public class Cuadrilatero extends Figura {
	private Double ladoA;
	private Double ladoB;

	public Cuadrilatero(Double ladoA, Double ladoB) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		super.setArea(calcularArea());

	}

	public double calcularArea() {
		return ladoA * ladoB;
	}
	
	
}
