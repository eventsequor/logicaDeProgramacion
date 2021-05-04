package com.sophos.logicaprogramacion;

import java.util.Scanner;

import com.sophos.logicaprogramacion.figuras.Cuadrilatero;
import com.sophos.logicaprogramacion.figuras.Figura;
import com.sophos.logicaprogramacion.figuras.Triangulo;
import com.sophos.logicaprogramacion.paquete2.ModificadorDos;
import com.sophos.logicaprogramacion.vehiculo.Vehiculo;

public class Main {

	public static void main(String[] args) {
		Triangulo triguanlo = new Triangulo(11, 11, 9);
		System.out.println("Área del triangulo " + triguanlo.getArea());
		System.out.println("Perimetro del triangulo " + triguanlo.getPerimetro());
		int triangulos = 0;
		int cuadrados = 0;
		Figura[] misFiguras = genera(20);
		System.out.println(misFiguras.length);
		for (Figura figura : misFiguras) {
			if (figura instanceof Triangulo) {
				triangulos++;
			} else if (figura instanceof Cuadrilatero) {
				cuadrados++;
			}
		}

		System.out.println("Tengo " + triangulos + " triangulos");
		System.out.println("Tengo " + cuadrados + " cuadrados");
	}

	public static Figura[] genera(int tamanho) {
		Figura[] listaFiguras = new Figura[tamanho];
		for (int i = 0; i < listaFiguras.length; i++) {
			if (randomNum() > 5) {
				listaFiguras[i] = new Cuadrilatero((double) randomNum(), (double) randomNum());
			} else {
				listaFiguras[i] = new Triangulo((double) randomNum(), (double) randomNum(), (double) randomNum());
			}
		}

		return listaFiguras;
	}

	public static int randomNum() {
		return (int) Math.floor(Math.random() * (1 - 10 + 1) + 10);
	}

	public void arreglos() {
		double notas[] = new double[5];
		notas[0] = 5;
		notas[1] = 4;
		notas[2] = 3;
		notas[3] = 0;
		notas[4] = 4.5;
		double resultado = 0;
		for (double nota : notas) {
			resultado += nota;
		}
		System.out.println("Promedio de la nota: " + resultado / 5);
	}

	public void yaContinuamos() {
		Figura rectangulo = new Cuadrilatero(5.0, 5.0);

		if (rectangulo instanceof Cuadrilatero) {
			System.out.println("Esto es un cuadrilatero");
			Cuadrilatero aux = (Cuadrilatero) rectangulo;
			System.out.println(aux.soyUnaFigura());
		} else {
			System.out.println("Esto no es un cuadrilateros");
		}
	}

	public void metodoHerenciaClase4() {
		Cuadrilatero cuadrado = new Cuadrilatero(6.0, 25.0);
		System.out.println("El área del cuadrado es: " + cuadrado.getArea());
		System.out.println("El perimetro del cuadrado es: " + cuadrado.getPerimetro());
	}

	public void metodoClase3() {
		Vehiculo carro1 = new Vehiculo();
//		System.out.println(carro1.getMarca());
//
//		Vehiculo carro2 = new Vehiculo(4, "azul", "renault");
//		System.out.println(carro2.getMarca());

		Zapato zapatico = new Zapato("ferrari", "puma", 0);
		zapatico.setTalla("M");

		System.out.println("El valor de la talla del zapato es:\n" + zapatico.getTalla());
	}

	public void ejercicioCiclos() {
		Main obj = new Main();
		int variable = obj.sume(5);
		System.out.println("Imprimir variable " + variable);
	}

	public Integer sume(int x) {
		System.out.println("Método recursivo: " + x);
		if (x < 10) {
			return sume(x + 1);
		} else {
			return x;
		}
	}

	public void ciclos() {
		String arreglo[] = { "Colombia", "EEUU", "Canada" };
		// 0 1 3
		for (String pais : arreglo) {
			System.out.println(pais);
		}

		do {
			System.out.println("no debe continuar");
		} while (false);
	}

	public void caseSwitch() {
		System.out.println("Por favor indiqueme su talla");
		Scanner lectura = new Scanner(System.in);
		String talla = lectura.next();
		talla = Character.toString(talla.toLowerCase().trim().charAt(0));
		switch (talla) {
		case "s":
			System.out.println("Pequeño");
			System.out.println();
			break;
		case "m":
			System.out.println("Mediano");
			System.out.println();
			break;
		case "l":
			System.out.println("grande");
			System.out.println();
			break;

		default:
			System.out.println("Talla invalida");
			break;
		}
	}

	public void metodo3() {
		System.out.println("Por favor indiqueme su estatura en centimetros");
		Scanner lectura = new Scanner(System.in);
		try {
			int estatura = lectura.nextInt();
			if (estatura < 130) {
				System.out.println("No puede montar por bajito");
			} else if (estatura < 170) {
				System.out.println("Sesión 2");
			} else if (estatura < 200) {
				System.out.println("Sesión 3");
			} else if (estatura > 200) {
				System.out.println("No puede montar por alto");
			} else if (estatura < 150) {
				System.out.println("Sesión 1");
			}
		} catch (Exception e) {
			System.out.println("Usted no ha ingresado un valor valido");
		}
	}

	public void metodo2() {
		String variable = Modificador.nombre;
		String variable2 = Hijo.nombre3;
		System.out.println(variable2);
	}

	public void metodo1() {
		String args[] = { "" };
		if (args.length > 0) {
			String valorA = args[0];

			if (valorA.equals("123456")) {
				System.out.println("su clave es correcta");
			} else {
				System.out.println("su clave es incorrecta");
			}
		} else {
			System.out.println("Usted no envio argumentos");
		}
	}
}
