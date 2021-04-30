package com.sophos.logicaprogramacion;

import java.util.Scanner;

import com.sophos.logicaprogramacion.paquete2.ModificadorDos;
import com.sophos.logicaprogramacion.vehiculo.Vehiculo;

public class Main {

	public static void main(String[] args) {
//		Vehiculo carro1 = new Vehiculo();
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
