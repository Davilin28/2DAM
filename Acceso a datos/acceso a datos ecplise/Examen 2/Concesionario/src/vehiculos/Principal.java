package vehiculos;

/*
3.
Los vehiculos de un concesionario se definen por nombre de modelo y precio. Los datos relativos a los mismos se almacenan en dos ficheros con 5 datos cada uno:
	FicheroModelos.txt: Nombres de modelos de vehiculos. Un nombre por linea del fichero.
	FicheroPrecios.txt: Precios de vehiculos. Un precio por linea del fichero.
Siendo la correspondencia entre ambos ficheros por posicion (Para el primer vehiculo: su modelo sera la linea 1 del fichero de modelos y su precio la linea
1 del fichero de precios, y asi sucesivamente).

Se pide:
	Crear una clase Vehiculo que almacene la informacion especificada e incluya los metodos: 
		sumar precio(anadir una cantidad indicada al precio,)
		ampliar(anadir al nombre una palabra indicada).
	Leer los datos existentes de los 5 vehiculos y almacenarlos sobre elementos de la clase creada previamente.
	Anadir 100E al precio de los vehiculos cuyo modelo contenga la letra "Z".
	Anadir la palabra "Plus" a los vehiculos con importe superior a 300E.

*/

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculos vehiculo[] = new Vehiculos[5];
		vehiculo[0] = new Vehiculos("Fiat", 200);
		vehiculo[1] = new Vehiculos("Nizzan", 350);
		vehiculo[2] = new Vehiculos("Ford", 100);
		vehiculo[3] = new Vehiculos("Leon", 250);
		vehiculo[4] = new Vehiculos("Hyundai", 50);

		// Ampliar y sumar precio a dos vehiculos.
		vehiculo[0].ampliar("-260");
		vehiculo[2].sumarPrecio(100);

		Menu.opciones(vehiculo);
	}
}
