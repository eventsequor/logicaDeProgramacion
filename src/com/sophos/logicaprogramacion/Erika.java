package com.sophos.logicaprogramacion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Erika {

	public static void main(String[] args) {
		double nota1 = 5;
		double nota2 = 4.5;
		double nota3 = 2.1;
		double nota4 = 0;
		double nota5 = 5;
		double nota6 = 4;
		double resultado = nota1 + nota2 + nota3 + nota4 + nota5 + nota6;
		System.out.println("Suma de todas la notas: " + resultado);
		resultado = resultado / 6;
		System.out.println("Promedio de todas de todas la notas: " + resultado);
		System.out.println("nota1: " + nota1);
		// listas monodimencionales
		// ----------------0-- 1-- 2--- 3- 4- 5
		double lista[] = { 5, 4.5, 2.1, 0, 5, 4 };
		double[] lista2 = new double[6];
		lista2[0] = 5;// 1
		lista2[1] = 4.5;// 2
		lista2[2] = 2.1;// 3
		lista2[3] = 0;// 4
		lista2[4] = 5;// 5
		lista2[5] = 4;// 6

		double resultadoLista1 = lista[0] + lista[1] + lista[2] + lista[3] + lista[4] + lista[5];
		System.out.println("\nSuma total lista1: " + resultadoLista1);
		int cantidadPosiciones = lista.length;
		System.out.println("Cantidad de posiciones de la lista1: " + cantidadPosiciones);
		resultadoLista1 = resultadoLista1 / cantidadPosiciones;
		System.out.println("Promedio lista 1: " + resultadoLista1);
		double resultadoPromedio = 0;
		for (int i = 0; i < 6; i++) {
			System.out.println("Nota" + (i + 1) + ": " + lista[i]);
			resultadoPromedio = resultadoPromedio + lista[i];
		}
		System.out.println("Suma de resultados: " + resultadoPromedio);
		resultadoPromedio = resultadoPromedio / lista.length;
		System.out.println("Promedio de notas: " + resultadoPromedio);

		// Método de ordenamiento burbuja

		Scanner leer = new Scanner(System.in);
		System.out.println("Por favor escriba un valor: ");
		String muestra = leer.nextLine();
		System.out.println("Ejemplo " + muestra);

	}

}
