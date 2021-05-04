package com.sophos.logicaprogramacion.figuras;

public class Cuadrilatero extends Figura {
	private Double ladoA;
	private Double ladoB;

	public Cuadrilatero(Double ladoA, Double ladoB) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		setArea(calcularArea());
		setPerimetro(calcularPerimetro());
	}

	private double calcularArea() {
		return ladoA * ladoB;
	}

	private double calcularPerimetro() {
		return 2 * (ladoA + ladoB);
	}
	
	public String soyUnaFigura() {
		return "soy una figura cuadrilatera";
	}

}
