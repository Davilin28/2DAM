package numeros;

import java.io.*;
import java.util.Scanner;

public class Principal {

	public static void escribir(int num) {
		try {

			File datos = new File("numeros.txt");
			FileWriter ficheroEscritura = new FileWriter(datos);
			BufferedWriter ficheroBuffer = new BufferedWriter(ficheroEscritura);

			for (int i = 1; i < num + 1; i++) {
				ficheroBuffer.write(String.valueOf((i * 2)));
				ficheroBuffer.write(";");
			}

			ficheroBuffer.close();

			leerFichero();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void leerFichero() {
		try {
			File datos = new File("numeros.txt");
			FileReader ficheroLectura = new FileReader(datos);
			@SuppressWarnings("resource")
			BufferedReader leerN = new BufferedReader(ficheroLectura);

			String cadenaCompleta = "";
			String lineas;
			lineas = leerN.readLine();

			while (lineas != null) {
				cadenaCompleta += lineas;
				lineas = leerN.readLine();
			}

			imprimirFichero(cadenaCompleta);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void imprimirFichero(String cadenaCompleta) {

		String[] complete = cadenaCompleta.split(";");
		System.out.println("Contenido de la tabla: ");
		System.out.println("");
		for (int i = 0; i < complete.length; i++)
			System.out.println("Numero " + ((int)i +1) + ": " + complete[i]);
	}

	public static void main(String[] args) {

		System.out.println("Introduzca el numero: ");
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();
		int n = opcion;
		escribir(n);
	}
}
