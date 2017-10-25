package paquetes;

import java.io.File;
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
					if (i!=nombres.length-1)
						ficheroEscritura.write(';');
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
			
			// 2. leer el fichero por bloques de 4 variables
			char[] nombre = new char[4];
			int res = 0, contador = 0;
			String cadenaCompleta = "";
			res = ficheroLectura.read(nombre);
			
			// Pendiente de encontrar la opcion de eliminar los datos de la ultima lectura
			while(res !=  -1) {
				cadenaCompleta = cadenaCompleta + String.valueOf(nombre);
				res = ficheroLectura.read(nombre);
				contador++;
			}
			
			// 3. Cerramos el fichero
			ficheroLectura.close();
			imprimirFichero(cadenaCompleta);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Imprimir los datos
	public static void imprimirFichero(String cadenaCompleta) {
		String[] complete = cadenaCompleta.split(";");
		System.out.println("Contenido de la tabla: ");
		for(int i=0;i<complete.length;i++)
			System.out.println("Posicion " + i + " : " + complete[i]);
		}
	
	public static void inicializarTabla(String[] nombres) {
		for (int i = 0; i < nombres.length; i++) {
			nombres[i]="";
		}
	}
}