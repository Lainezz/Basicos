package com.daw.ayuda;

import java.util.Scanner;

public class CheatSheetBucles {

	public static void main(String[] args) {
		//Los bucles los utilizamos cuando queremos repetir un mismo trozo de código varias veces.
		//Los bucles más simples son los bucles for, bucles while y bucles do-while
		
		/*
		 * BUCLES FOR: Cuando sabemos a ciencia cierta el número de veces que queremos ejecutar el código
		 */
		String[] alumnos = {"Fran", "Alba", "Joseph", "Carlos", "Antonio"};
		//Sabemos que hay 5 alumnos, así que podemos usar un bucle for para recorrer el array
		for (int i = 0; i < alumnos.length; i++) {
			String nombre = alumnos[i];
			System.out.println("Nombre alumno: "+nombre);
		}

		/*
		 * BUCLES WHILE: Los usamos cuando no sabemos el número de veces que se va a repetir el trozo de código. Puede ser 0 o infinitas veces.
		 */
		Scanner scan = new Scanner(System.in);
		int edad = 0;
		while(edad < 18) {
			System.out.print("(Introduzca su edad) Debe ser mayor de edad para acceder: ");
			edad = scan.nextInt();
		}

		System.out.println("Bienvenid@");
		
		/*
		 * BUCLES DO-WHILE: Tienen el mismo principio que los bucles while, pero los do-while SIEMPRE se ejecutan al menos 1 vez.
		 */
		int eleccion;
		System.out.println("Bienvenid@ a la cafeteria");
		System.out.println("¿Qué desea tomar?");
		do {
			System.out.println("1. Cafe");
			System.out.println("2. Tostada");
			System.out.println("0. Salir");
			System.out.print("Introduza su elección (0-2): ");
			eleccion = scan.nextInt();
			if(eleccion != 0) {
				System.out.println("¿Qué más quiere tomar?");
			}
		} while (eleccion != 0);
		System.out.println("Gracias y hasta pronto");
		
		scan.close();
	}

}
