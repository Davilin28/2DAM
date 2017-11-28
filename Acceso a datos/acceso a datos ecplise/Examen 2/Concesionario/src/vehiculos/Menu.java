package vehiculos;

import java.util.Scanner;

public class Menu {
	@SuppressWarnings("resource")
	public static void opciones(Vehiculos[] vehiculo) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("Menu");
			System.out.println("");
			System.out.println("1.- Leer Fichero.");
			System.out.println("2.- A�adir Precio.");
			System.out.println("3.- A�adir Palabra.");
			System.out.println("4.- Imprimir.");
			System.out.println("5.- Vaciar estructura.");

			System.out.println("8.- Salir.");

			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:
				Funciones.leerFichero(vehiculo);
				break;
			case 2:
				Funciones.A�adirPrecio(vehiculo);
				break;
			case 3:
				Funciones.A�adirPalabra(vehiculo);
				break;
			case 4:
				Funciones.imprimirFichero(vehiculo);
				break;
			case 5:
				Funciones.inicializarTabla(vehiculo);
			case 8:
				System.out.println("Salida");
				break;
			default:
				System.out.println("Opcion no es correcta");
				Funciones.espera();
			}
		} while (opcion != 8);
	}
}
