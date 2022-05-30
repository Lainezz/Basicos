package com.daw.ayuda;

import java.util.ArrayList;

public class CheatSheetClases {
	
	/*
	 * ATRIBUTOS DE CLASE (datos o variables de clase)
	 */
	//Las clases pueden tener atributos. Estos son las "caracteristicas" de la clase.
	private int edad;
	private String nombre;
	private ArrayList<String> empleos;
	//Si ponemos estos atributos privados, estamos aplicando un principio básico de POO, la ocultación de la información
	
	//También podemos tener atributos estáticos. Estos atributos PERTENECEN A LA CLASE y no a los objetos.
	public static int vecesInstanciada = 0;
	
	
	/*
	 * CONSTRUCTORES DE CLASE
	 */
	//Los constructores se utilizan para instanciar la clase, es decir, para crear los diferentes objetos.
	//Hay varios tipos de constructores:
	
	//Constructor por defecto
	public CheatSheetClases() {
		
	}
	
	//Constructor por parametros. En este le indicamos atributos de clase que queremos inicializar.
	public CheatSheetClases(int edad, String nombre) {
		//this se refiere a la variable de clase. Usamos this para poder distinguir entre esa variable de clase y el parámetro que le entra por parámetros
		this.edad = edad;
		this.nombre = nombre;
		this.empleos = new ArrayList<String>();
	}
	
	/*
	 * FUNCIONALIDADES DE CLASE
	 */
	//Podemos tener funcionalidades, es decir, lo que puede hacer nuestra clase.
	
	public void presentar() {
		System.out.println("Soy la clase "+this.getClass().getName());
		System.out.println("Mis atributos son:");
		System.out.println("1. Nombre: "+this.nombre);
		System.out.println("2. Edad: "+this.edad);
		System.out.print("3. Empleos: ");
		for (String empleo : this.empleos) {
			System.out.print(empleo+", ");
		}
	}
	
	/**
	 * Metodo que comprueba si el objeto que ha instanciado la clase es mayor de edad o no.
	 * @return true -> es mayor de edad // false -> es menor de edad
	 */
	public boolean esMayorEdad() {
		if(this.edad>=18) {
			return true;
		}
		return false;
	}
	
	//Si hemos puesto los atributos privados, aplicando la ocultacion de la informacion, debemos tener unos métodos 
	//publicos que puedan acceder a esos atributos privados: Esos son los "getters" y "setters"
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getEmpleos() {
		return empleos;
	}

	public void setEmpleos(ArrayList<String> empleos) {
		this.empleos = empleos;
	}
	
}
