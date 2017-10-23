package paquetes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Funciones {

	// Funcion para escribir dentro del fichero.
	public static void escribirFichero(String[] nombres) {
		try {
			// 1.Creamos el fichero y escribimos en el
			File datos = new File("nombres.txt");
			FileWriter ficheroEscritura = new FileWriter(datos);

			// 2. Insertamos los datos dentro del fichero recorriendolo con un for.
			for (int i = 0; i < nombres.length; i++) {
				ficheroEscritura.write(nombres[i]);
			}

			// 3. Cerrar el fichero
			ficheroEscritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Funcion para leer el fichero y sacarlo por pantalla.
	public static void leerFichero(String[] nombres) {
		try {
			// 1.Creamos el fichero y lo leemos

			File datos = new File("nombres.txt");
			FileReader ficheroLectura = new FileReader(datos);
			
			/* En esto es lo que dudo he leido para que sirve en las ayudas del eclipse y sirve para
			encontrar algun carater especial*/
			char[] carater = { ' ' };

			// 2.Leemos los datos uno a uno
			for (int i = 0; i < nombres.length; i++) {
				ficheroLectura.read(carater);
			}

			// 3. Cerramos el fichero
			ficheroLectura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Imprimir los datos
	public static void imprimirFichero(String[] nombres) {
		System.out.println("Contenido de la tabla: ");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Nombre " + i + " : " + nombres[i]);
		}
	}
}