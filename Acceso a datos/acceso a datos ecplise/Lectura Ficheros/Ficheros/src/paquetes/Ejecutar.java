package paquetes;

public class Ejecutar {

	public static void main(String[] args) {
		
		String[] nombres = {"Jose","Pepe","Ana"};
		
		Funciones.escribirFichero(nombres);
		Funciones.inicializarTabla(nombres);
		Funciones.leerFichero(nombres);
	}
}