package Ejercicio3;

import Ejercicio3.funciones;

import java.util.Scanner;

public class menu {
	public static void opciones() {
		Scanner teclado = new Scanner(System.in);

		int opcion;

		do {
			// Salida por cosola
			System.out.println("Bienvenidos al menu para asignar opciones para crear un archivo");
			System.out.println("");
			System.out.println("1.- Crear Fichero");
			System.out.println("2.- Mostrar informacion fichero.");
			System.out.println("3.- Mostrar longitud fichero.");
			System.out.println("4.- Comprobar si existe.");
			System.out.println("5.- Borrar fichero.");
			System.out.println("6.- Salir.");

			opcion = teclado.nextInt();

			switch (opcion) {

			case 1: {
				funciones.crearFichero();
				break;
			}

			case 2: {
				funciones.mostrarInfo();
				break;
			}

			case 3: {
				funciones.mostrarLong();
				break;
			}

			case 4: {
				funciones.comprobar();
				break;
			}

			case 5: {
				funciones.borrarFichero();
				break;
			}

			case 6: {
				System.out.println("Salida");
				break;
			}

			default: {
				System.out.println("Opcion no es correcta");
				funciones.espera();
			}
			}
		} while (opcion != 6);
	}
}