package personas;

import java.io.*;

/*

 * Este es el ejercicio3

 * Creado por David Román Rey

 * github: https://github.com/Davilin28

*/

public class Principal {

	public static void escribir(String persona[]) {
		try {
			// 1.Creamos el fichero y escribimos en el
			File datos = new File("nombres.txt");
			FileWriter ficheroEscritura = new FileWriter(datos);
			BufferedWriter ficheroBuffer = new BufferedWriter(ficheroEscritura);

			// 2. Insertamos los datos dentro del fichero recorriendolo con un for.
			for (int i = 0; i < persona.length; i++) {
				ficheroBuffer.write(persona[i]);
				ficheroBuffer.newLine();
			}

			// 3. Cerrar el fichero
			ficheroBuffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void leerFichero(String[] nombres) {
		try {
			// 1.Creamos el fichero y lo leemos
			File datos = new File("nombres.txt");
			FileReader ficheroLectura = new FileReader(datos);
			BufferedReader bufferedRead = new BufferedReader(ficheroLectura);

			// 2. leer nombres con String, cuando read devuelve un null se ha llegado
			// al final del fichero.

			int i = 0;
			String lineas;
			lineas = bufferedRead.readLine();

			while (lineas != null) {
				nombres[i] = lineas;
				i++;
				lineas = bufferedRead.readLine();
			}

			// 3. Cerramos el fichero
			ficheroLectura.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void imprimirFichero(String[] nombres) {
		System.out.println("Contenido de la tabla: ");
		System.out.println("");
		for (int i = 0; i < nombres.length; i++)
			System.out.println("Nombre: " + nombres[i]);
		espera();
	}

	public static void inicializarTabla(String[] nombres) {
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = "";
		}
	}

	public static void espera() {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Persona persona[] = new Persona[5];
		persona[0] = new Persona("Ana", "Rodriguez", 21);
		persona[1] = new Persona("Luis", "Perez", 35);
		persona[2] = new Persona("David", "Garcia", 40);
		persona[3] = new Persona("Jose", "del Bosque", 18);
		persona[4] = new Persona("Rodrigo", "Marquez", 27);

		String[] aux = new String[5];

		for (int i = 0; i < persona.length; i++)
			aux[i] = persona[i].getNombre() + " " + persona[i].getApellidos() + " "
					+ String.valueOf(persona[i].getEdad());
		Menu.opciones(aux);
	}

}
