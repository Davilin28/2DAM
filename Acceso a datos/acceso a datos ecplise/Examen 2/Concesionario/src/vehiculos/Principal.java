package vehiculos;

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
