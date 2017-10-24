package paquetes;

public class Ejecutar {

	public static void main(String[] args) {
		
		String [] nombres = {"Jose","Pepe","Ana ","Luis","Pedro el perdedor","Jonso","Adio22"};
		Funciones.escribirFichero(nombres);
		Funciones.inicializarTabla(nombres);
		Funciones.leerFichero(nombres);
		Funciones.imprimirFichero(nombres);
	}

}
