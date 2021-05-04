package com.sophos.logicaprogramacion.figuras;

public class Triangulo extends Figura {
	private double longitudLadoA;
	private double longitudLadoB;
	private double longitudLadoC;

	public Triangulo(double longitudLadoA, double longitudLadoB, double longitudLadoC) {
		super();
		this.longitudLadoA = longitudLadoA;
		this.longitudLadoB = longitudLadoB;
		this.longitudLadoC = longitudLadoC;
		setArea(calcularArea());
		setPerimetro(calcularPerimetro());
	}

	public double calcularArea() {
		return (longitudLadoA * longitudLadoB) / 2;
	}

	public double calcularPerimetro() {
		return longitudLadoA + longitudLadoB + longitudLadoC;
	}

	public void soyUnaFigura() {
		System.out.println("Triangulo");
	}

}
