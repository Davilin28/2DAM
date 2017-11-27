package vehiculos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Funciones {
	public static void leerFichero(Vehiculos[] vehiculo) {
		try {
			// 1.Creamos el fichero y lo leemos
			File datos = new File("ficheroModelo.txt");
			FileReader ficheroM = new FileReader(datos);
			BufferedReader leerM = new BufferedReader(ficheroM);

			File datos1 = new File("ficheroPrecio.txt");
			FileReader ficheroP = new FileReader(datos1);
			BufferedReader leerP = new BufferedReader(ficheroP);

			// 2. leer nombres con String, cuando read devuelve un null se ha llegado
			// al final del fichero.

			int i = 0;
			String lineas;
			String lineas1;
			lineas = leerM.readLine();
			lineas1 = leerP.readLine();

			while (lineas != null && lineas1 != null) {
				vehiculo[i].setNombreModelo(lineas);
				lineas = leerM.readLine();
				vehiculo[i].setPrecio(Double.parseDouble(lineas1));
				lineas1 = leerP.readLine();
				i++;
			}

			// 3. Cerramos el fichero
			leerM.close();
			leerP.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void AñadirPrecio(Vehiculos[] vehiculo) {
		
	}

	public static void AñadirPalabra(Vehiculos[] vehiculo) {
		for (int i = 0; i < vehiculo.length; i++) {
			if (vehiculo[i].getPrecio() > 300) {
				vehiculo[i].concatenar(" plus");
			}
		}
	}

	public static void imprimirFichero(Vehiculos[] vehiculo) {
		System.out.println("Contenido de la tabla: ");
		System.out.println("");
		for (int i = 0; i < vehiculo.length; i++)
			System.out.println("Marca: " + vehiculo[i].getNombreModelo() + " Precio: " + vehiculo[i].getPrecio());
		espera();
	}

	public static void inicializarTabla(Vehiculos[] vehiculo) {
		for (int i = 0; i < vehiculo.length; i++) {
			vehiculo[i].setNombreModelo("");
			vehiculo[i].setPrecio(0);
		}
	}

	public static void espera() {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
