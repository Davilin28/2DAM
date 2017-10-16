package Ejercicio3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class funciones {
	// Funcion Crear fichero
	public static void crearFichero() {
		Scanner sc = new Scanner(System.in);
		String ruta;
		System.out.print("Indicar el nombre del archivo (sin extension): ");
		ruta = sc.nextLine();
		File fichero = new File(ruta + ".txt");

		try {
			if (fichero.createNewFile() == true) {
				System.out.println("El fichero se ha creado");
			} else {
				System.out.println("El fichero no se ha creado o esta creado");
			}
			espera();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Funcion para ver la info del fichero.
	public static void mostrarInfo() {
		Scanner sc = new Scanner(System.in);
		String ruta;
		System.out.print("Introduzca el nombre del archivo creado: ");
		ruta = sc.nextLine();
		File fichero = new File(ruta + ".txt");

		// Salida por cosola
		System.out.println("Informacion del fichero: ");
		System.out.println("");
		System.out.println(fichero.getName());
		System.out.println(fichero.getAbsolutePath());
		System.out.println(fichero.getPath());
		System.out.println(fichero.length());
		espera();
	}

	// Funcion para mostrar la longitud del archivo.
	public static void mostrarLong() {
		Scanner sc = new Scanner(System.in);
		String ruta;
		System.out.print("Introduzca el nombre del archivo creado: ");
		ruta = sc.nextLine();
		File fichero = new File(ruta + ".txt");

		// Salida por cosola
		System.out.println("Longitud del fichero " + fichero.getName() + " correspondiente: " + fichero.length());
		espera();
	}

	// Funcion para comprobar si existe el archivo.
	public static void comprobar() {
		Scanner sc = new Scanner(System.in);
		String ruta;
		System.out.print("Introduzca el nombre del archivo creado: ");
		ruta = sc.nextLine();
		File fichero = new File(ruta + ".txt");

		// Salida por cosola
		if (fichero.exists() == true) {
			System.out.println("El fichero existe");
		} else {
			System.out.println("El fichero no existe");
		}
		espera();
	}

	// Funcion para borrar el fichero.
	public static void borrarFichero() {
		Scanner sc = new Scanner(System.in);
		String ruta;
		System.out.print("Introduzca el nombre del archivo creado: ");
		ruta = sc.nextLine();
		File fichero = new File(ruta + ".txt");

		// Salida por cosola
		if (fichero.delete()) {
			System.out.println("El fichero se ha borrado correctamente");
		} else {
			System.out.println("El fichero no existe");
		}
		espera();
	}

	// Funcion para tiempo de espera entre opciones
	public static void espera() {
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
